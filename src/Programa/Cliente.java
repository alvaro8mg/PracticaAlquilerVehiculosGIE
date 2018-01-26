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
public class Cliente {
    private String nombre, NIF;

    public Cliente() {
        nombre = "";
        NIF = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void set(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }
    
}
