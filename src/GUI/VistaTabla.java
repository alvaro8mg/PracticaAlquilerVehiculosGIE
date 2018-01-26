    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author super
 */
public class VistaTabla extends JFrame {

    //Constructor que iniciliza los demás componentes
    public VistaTabla(Controlador controlador) {
        //Titulo de la ventana
        setTitle("Lista");
        //array bidimencional de objetos con los datos de la tabla
        Object[][] data =new Object[controlador.getCont()][8];
        
        for(int fil = 0; fil < controlador.getCont(); fil++){
        String tip="", gam="";        
        
        switch(controlador.getAlquiler(fil).getTipo()) {
            case 0: tip = "Urbano"; break;
            case 1: tip = "Utilitario"; break;
            case 2: tip = "Compacto"; break;
            case 3: tip = "Berlina"; break;
            case 4: tip = "Monovolumen o furgón 7 plazas";
        }
        switch(controlador.getAlquiler(fil).getGama()) {
            case 0: gam = "Baja"; break;
            case 1: gam = "Media"; break;
            case 2: gam = "De lujo";
        }
            data[fil][0]= controlador.getAlquiler(fil).getId();
            data[fil][1]= controlador.getAlquiler(fil).getNombre();
            data[fil][2]= controlador.getAlquiler(fil).getNIF();
            data[fil][3]= tip;
            data[fil][4]= gam;
            data[fil][5]= controlador.getAlquiler(fil).getMatricula();
            data[fil][6]= controlador.getAlquiler(fil).getDias();  
            data[fil][7]= controlador.getAlquiler(fil).getPrecio() + "€";            
        }
        
        //array de String's con los títulos de las columnas
        String[] columnNames = {"ID", "Nombre", "NIF", 
        "Tipo", "Gama", "Matrícula", "Días", "Precio"};

        //se crea la Tabla
        final JTable table = new JTable(data, columnNames);
        
        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(550, 300));
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
    }

    public void play(Controlador controlador) {
        VistaTabla frame = new VistaTabla(controlador);
        frame.pack();
        frame.setVisible(true);
    }
}
