/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;

import Programa.Alquiler;
import java.util.ArrayList;

/**
 *
 * @author super
 */
public class FachadaAlmacen {
    public boolean guardaFich(String archivo, ArrayList <Alquiler> alquileres){
        return Ficheros.guardaFich(archivo, alquileres);
    }
    
    public int cargaFich(ArrayList <Alquiler> alquileres, String archivo) {        
        return Ficheros.cargaFich(alquileres, archivo);
    }
}
