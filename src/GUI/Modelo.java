/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Alquiler;
import Almacenamiento.FachadaAlmacen;
import java.util.ArrayList;
import java.util.Observable;


/**
 *
 * @author super
 */
public class Modelo extends Observable{

    
    ArrayList <Alquiler> alquileres = new ArrayList<>();
    //Variables para usar en las funciones
    float precio;
    FachadaAlmacen fachAlm = new FachadaAlmacen();
    
    public Modelo(ArrayList <Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    public void calculaPrecio (int dias, int tip, int gam, boolean anticipado) {
        
        float tipo = 1, gama = 1, anticip = 1;
        
        switch(tip) {
            case 0: tipo = (float) 0.7; break;
            case 1: tipo = (float) 0.85; break;
            case 2: tipo = (float) 1; break;
            case 3: tipo = (float) 1.25; break;
            case 4: tipo = (float) 1.5;
        }
        switch(gam) {
            case 0: gama = (float) 0.8; break;
            case 1: gama = (float) 1; break;
            case 2: gama = (float) 1.4;
        }
        
        if (anticipado == true) anticip = (float)0.9;
        
        precio=  30 * dias * tipo * gama * anticip;
    }
    
    public float getPrecio() {
        return this.precio;
    }
    
    public void guardaAlquiler(String nombre, String NIF, int dias, int tipo, int gama, boolean anticipado) {
        calculaPrecio(dias, tipo, gama, anticipado);
        Alquiler alqTemp = new Alquiler(nombre,NIF, dias, tipo, gama, precio, anticipado);
        alquileres.add(alqTemp);        
    }
    
    public Alquiler getAlquiler(int n) {
        return alquileres.get(n);
    }
    
    public int getCont(){
        return alquileres.size();
    }
    
    public String getAlquileres() {
       String alquilere = "";
        for (int i= 0; i< alquileres.size(); i++){
            alquilere = alquilere + alquileres.get(alquileres.size()-1).toString();
        }
        return alquilere;
    }
    
    public boolean guardaFich(String archivo) {
        return fachAlm.guardaFich(archivo, alquileres);
    }
    
    public int cargaFich(String archivo){        
        return fachAlm.cargaFich(alquileres, archivo);
    }
    
    public boolean editaDias(int ID, int dias){
        //Comprobar Id repetido
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getId() == ID) {
                alquiler.setDias(dias);
                this.calculaPrecio(dias, alquiler.getTipo(), alquiler.getGama(), alquiler.getAnticipado());
                alquiler.setPrecio(precio);
                //Salir de la lectura
                System.out.println("Encontrado y editado " + alquiler);
                return true;
            }       
        }
        return false;
    }
    
    public boolean borraAlq(int ID){
        //Eliminar todo si ID=0
        if (ID == 0){
            alquileres.clear();
            System.out.println("Todos los alquileres han sido eliminados");
            return true;
        }
        //Buscar Id
        for (int c = 0; c < alquileres.size(); c++) {
            if (alquileres.get(c).getId() == ID) {
                alquileres.remove(c);
                //Salir de la lectura   
                System.out.println("Alquiler eliminado");
                return true;
            }       
        }
        //Devuelve el numero del arraylist o -1 si no lo encuentra
        return false;
    }
    
    public void notificaCambios(){
        this.setChanged();
        this.notifyObservers();
    }
}
