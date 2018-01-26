/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import GUI.Controlador;
import GUI.Modelo;
import GUI.VistaGeneral;

/**
 *
 * @author super
 */
public class Fachada {
    public void inicializar(Modelo modelo) {
        Controlador controlador = new Controlador(modelo);
        VistaGeneral vista = new VistaGeneral(controlador);
        modelo.addObserver(vista);
        
    }
}
