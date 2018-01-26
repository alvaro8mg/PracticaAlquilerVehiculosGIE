/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Programa.Alquiler;

/**
 *
 * @author super
 */
public class Controlador {
    private Modelo modelo = null;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;        
    }
    
    public void notificaCambios(){
        modelo.notificaCambios();
    }
    
    public String GetPrecio() {
        return String.valueOf(modelo.getPrecio());
    }
    
    public void calculaPrecio (int dias, int tipo, int gama, boolean anticipado){
        modelo.calculaPrecio(dias, tipo, gama, anticipado);
    }
    public void guardaAlquiler(String nombre, String NIF, int dias, int tipo, int gama, boolean anticipado) {
        modelo.guardaAlquiler(nombre, NIF, dias, tipo, gama, anticipado);
        modelo.notificaCambios();
    }
    public Alquiler getAlquiler(int n) {
        return modelo.getAlquiler(n);
    }
    public int getCont(){        
        return modelo.getCont();
    }
    public String getAlquileres() {
        return modelo.getAlquileres();
    }
    public boolean guardaFich(String archivo) {
        return modelo.guardaFich(archivo);
    }
    public int cargaFich(String archivo) {
        return modelo.cargaFich(archivo);
    }
    public boolean buscaID(int ID, int dias){
        return modelo.editaDias(ID, dias);
    }
    public boolean borraAlq(int ID){
        return modelo.borraAlq(ID);
    }
}
