/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;

import Programa.Alquiler;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author super
 */
public class Ficheros {
    public static boolean guardaFich(String archivo, ArrayList <Alquiler> alquileres){
        
        FileWriter fichero;
        BufferedWriter escritor;
        String FichAlquileres ="";
        
        for (Alquiler alquiler : alquileres) {
            FichAlquileres = FichAlquileres + alquiler.getId() + ";" +
                alquiler.getNombre() +";" + alquiler.getNIF() + ";" + 
                alquiler.getTipo() + ";" + alquiler.getGama()  + ";" + 
                alquiler.getMatricula() + ";" + alquiler.getDias() + ";" + 
                alquiler.getPrecio() + ";" + alquiler.getAnticipado() + "\r\n";
        }
        
        try {
            //Creacion variables para la escritura
            fichero = new FileWriter(archivo);
            escritor = new BufferedWriter(fichero);

        
            escritor.write(FichAlquileres);
            //Cerrar archivo;
            escritor.close();
        }
        
        //Avisar de error en la escritura
        catch (Exception e) {
            return false;
        }
        return true;
    
    }
        
    //Lee de un archivo
    public static String LeeString(FileReader fichero, BufferedReader lector,
            int caracter, char caracDato, String dato, char fin) {  
        
        try {
            //Leer el siguiente carácter
            caracter = lector.read();
            //Comprobar si ha terminado el fichero
            if (caracter == -1) {
                return "-1";
            }

            //Convertir el carácter leído a char
            caracDato = ((char)caracter);

            //Recorrer hasta ';' que indica el fin del salario
            while (caracDato != fin && caracter != -1) {
                dato = dato + caracDato;
                //Leer el siguiente carácter
                caracter = lector.read();
                //Convertir el carácter leído a char
                caracDato = ((char)caracter);
            }
            return dato;
        }
        catch(Exception e) {
            return "Error";
        }
    }
    public static int cargaFich(ArrayList <Alquiler> alquileres, String archivo){
        
        try {
            //Creacion variables para la lectura
            FileReader fichero = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fichero);
            //Variables para pasar los datos leidos
            int caracter = 0;
            char caracDato =' ';
            String dato ="";
            
            //Se recorre el fichero hasta encontrar el carácter -1
            //que marca el final del fichero
            while(caracter != -1) {
                Alquiler alqTemp = new Alquiler(0, "", "", 0, 1, 1, 0, true);
                
                //Establecer ID
                alqTemp.setId(Integer.parseInt(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';')));
                
                
                //Comprobar Id repetido
                for (Alquiler alquiler : alquileres) {
                    if (alquiler.getId() == alqTemp.getId()) {
                        //Salir de la lectura
                        System.out.println("Ya hay un alquiler con el ID " + alqTemp.getId()
                                + " se parará la lectura");
                        //Cerrar archivo;
                        lector.close();
                        return 2;
                    }       
                }
                //Salir en el caso de que haya terminado el fichero
                if (alqTemp.getId() == -1) {
                    //Cerrar archivo;
                    lector.close();
                    break;
                }
                
                //Establecer nombre
                alqTemp.setNombre(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';'));
                
                //Establecer NIF
                alqTemp.setNIF(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';'));
                
                //Establecer tipo
                alqTemp.setTipo(Integer.parseInt(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';'))); 
                
                //Establecer gama
                alqTemp.setGama(Integer.parseInt(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';')));
                
                //Establecer matricula
                alqTemp.setMatricula(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';'));
                
                //Establecer dia
                alqTemp.setDias(Integer.parseInt(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';')));
                
                //Establecer precio
                alqTemp.setPrecio(Float.valueOf(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato,';')));
                
                //Salir en el caso de que haya terminado el fichero
                if (alqTemp.getPrecio() == -1) {
                    //Cerrar archivo;
                    lector.close();
                    break;
                }
                //Establecer anticipado
                alqTemp.setAnticipado(Boolean.valueOf(Ficheros.LeeString(fichero, lector, caracter, caracDato, dato, '\r')));
               
                //Añadir el empleado temporal a la lista
                alquileres.add(alqTemp);
                System.out.println("Se ha copiado: \n" + alqTemp);
                
                //Avanzar lectura de salto de linea
                lector.read();
            }
        }
        
        //Avisar de error en la lectura del fichero
        catch (NumberFormatException | IOException e) {
            return 0;
        }
        
        return 1;
    
    }
}
