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
public class Coche {
    private int tipo, gama;
    private String matricula;

    public Coche() {

        //Generar matricula aleatoria
        char[] elems = {'0','1','2','3','4','5','6','7','8','9'};
        char[] conjunto = new char[4];
        String pass;
        for(int i=0;i<4;i++){   
            int el = (int)(Math.random()*10);
            conjunto[i] = (char)elems[el];
        }
        
        matricula = "GBF" + String.valueOf(conjunto);
    }

    public int getTipo() {
        return tipo;
    }

    public int getGama() {
        return gama;
    }

    public String getMatricula() {
        return matricula;
    }

    public void set(int gama, int tipo) {
        this.gama = gama;
        this.tipo = tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
