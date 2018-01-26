/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author super
 */
public class Alquiler {
    private Cliente cliente = new Cliente();
    private Coche coche = new Coche();
    private int id, dias;
    private boolean anticipado;
    private float precio;

    //Constructores
    public Alquiler(String nombre, String NIF, int dias, int tipo, int gama, float precio, boolean anticipado) {
        cliente.set(nombre, NIF);
        this.dias = dias;
        coche.set(gama, tipo);
        this.precio = precio;
        this.anticipado = anticipado;
        //El id se genera automaticamente entre 1 y 200
        id = (int)(Math.random()*200+1);
    }
    public Alquiler(int id, String nombre, String NIF, int dias, int tipo, int gama, float precio, boolean anticipado) {
        cliente.set(nombre, NIF);
        this.dias = dias;
        coche.set(gama, tipo);
        this.precio = precio;
        this.anticipado = anticipado;
        this.id = id;
    }

    public String getNIF() {
        return cliente.getNIF();
    }

    public String getNombre() {
        return cliente.getNombre();
    }

    public int getDias() {
        return dias;
    }

    public int getTipo() {
        return coche.getTipo();
    }

    public int getGama() {
        return coche.getGama();
    }

    public String getMatricula() {
        return coche.getMatricula();
    }

    public float getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public boolean getAnticipado() {
        return anticipado;
    }

    public void setNIF(String NIF) {
        cliente.setNIF(NIF);
    }

    public void setNombre(String Nombre) {
        cliente.setNombre(Nombre);
    }

    public void setTipo(int tipo) {
        coche.setTipo(tipo);
    }

    public void setGama(int gama) {
        coche.setGama(gama);
    }

    public void setMatricula(String matricula) {
        coche.setMatricula(matricula);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setAnticipado(boolean anticipado) {
        this.anticipado = anticipado;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
    @Override
    public String toString() {
        String tip="", gam="";
        
        
        switch(coche.getTipo()) {
            case 0: tip = "Urbano"; break;
            case 1: tip = "Utilitario"; break;
            case 2: tip = "Compacto"; break;
            case 3: tip = "Berlina"; break;
            case 4: tip = "Monovolumen o furgón 7 plazas";
        }
        switch(coche.getGama()) {
            case 0: gam = "baja"; break;
            case 1: gam = "media"; break;
            case 2: gam = "de lujo";
        }
        return "Alquiler con ID: " + id + ".\nCliente: " + cliente.getNombre() + ", NIF: " + cliente.getNIF() + "\n"
                + "Coche: " + tip  + ", gama " + gam + ", matricula: " + coche.getMatricula() +"\nDías de alquiler: " + dias + ".\nPrecio final= " + precio + '€';
    }
}
