package Programa;

import GUI.Modelo;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Aplicacion {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        //Se crea el arrayList para gestionar los alquileres
        ArrayList <Alquiler> alquileres = new ArrayList<>();
        
        //Crear el modelo para la GUI pasando el arrayList para poder usarlo desde
        //la GUI e inicializar la fachada para abrir la vista
        Modelo modelo = new Modelo(alquileres);
        fachada.inicializar(modelo);        
    }
}
