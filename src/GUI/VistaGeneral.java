/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class VistaGeneral extends javax.swing.JFrame implements Observer{

    private Controlador controlador = null;

    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
        initComponents();
        this.setTitle("Alquiler de coches");
        this.setResizable(false);
    }

    //Constructor que iniciliza los demás componentes
    public VistaGeneral(Controlador controlador) {
        this();
        this.controlador = controlador;
        setVisible(true);
        //No permitir modificar tamaño ventana y centrarla
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //Creamos un primer alquiler para que el programa tenga algo al iniciar
        controlador.guardaAlquiler("Alvaro", "18624866F", 5, 2, 2, false);
        //Actualizamos numero de alquileres
        this.update(null, this);
        this.setTitle("Alquiler de coches");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButtonNew = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jButtonShow = new javax.swing.JButton();
        jLabelCont = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jLabelFich = new javax.swing.JLabel();
        jButtonDias = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CarLogo.png"))); // NOI18N

        jButtonNew.setText("Nuevo alquiler");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonClose.setText("Cerrar aplicacion");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonShow.setText("Ver alquileres");
        jButtonShow.setMaximumSize(new java.awt.Dimension(119, 23));
        jButtonShow.setMinimumSize(new java.awt.Dimension(119, 23));
        jButtonShow.setPreferredSize(new java.awt.Dimension(119, 23));
        jButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowActionPerformed(evt);
            }
        });

        jLabelCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont.setText("Nº de alquileres actuales: 0");

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Cargar");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jLabelFich.setText("Ficheros:");

        jButtonDias.setText("Editar días");
        jButtonDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiasActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Eliminar alquiler");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButtonNew))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jButtonLoad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelFich)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShow, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jButtonDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDelete))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLoad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCont)
                .addGap(19, 19, 19)
                .addComponent(jButtonClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        //Salir de la aplicación
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        //Se abre la ventana de añadir alquiler
        VistaNuevo nuevo = new VistaNuevo(controlador);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowActionPerformed
        // TODO add your handling code here:
        //Se abre la ventana con la tabla de alquileres
        VistaTabla tabla = new VistaTabla(controlador);
        tabla.play(controlador);
    }//GEN-LAST:event_jButtonShowActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        //Pedimos el nombre del fichero
        String archivo = JOptionPane.showInputDialog(null, "Escriba el nombre del"
                + " fichero para guardar (mejor si acaba en .txt)");
        
        //Guardamos el fichero y comprobamos si se ha guardado bien
        if (controlador.guardaFich(archivo) == true) {
            JOptionPane.showMessageDialog(null, "Los alquileres han sido "
                    + "guardados en " + archivo);
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(),"Error al guardar ",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // TODO add your handling code here:
        //entero para ver resultado de cargar
        int result;
        //Pedimos el nombre del fichero
        String archivo = JOptionPane.showInputDialog(null, "Escriba el nombre del"
                + " fichero para cargar");
        try {
            //Cargamos el fichero y comprobamos
            result = controlador.cargaFich(archivo);
            if ( result == 1) {
                JOptionPane.showMessageDialog(null, "Los alquileres han sido "
                        + "cargados de " + archivo);
                controlador.notificaCambios();
            }
            else { if(result == 0) {
                JOptionPane.showMessageDialog(new JFrame(),"Error al cargar ",
                        "Error",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(new JFrame(),"Error ID repetido ",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error al cargar ",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiasActionPerformed
        // TODO add your handling code here:
        int ID, dias;
        //Pedimos el Id del alquiler y dias nuevos
        try {
            ID = Integer.valueOf(JOptionPane.showInputDialog(null, "Escriba el ID del"
                + " alquiler para editar sus días"));
            
            dias = Integer.valueOf(JOptionPane.showInputDialog(null, "Escriba el"
                    + " numero de días que desea poner"));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error, escriba un número correcto",
                "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Actualizar alquiler si el Id y los días son correctos
        if (ID >= 1 && ID <= 200) {
            if (controlador.buscaID(ID, dias) == true) {
                JOptionPane.showMessageDialog(null, "Alquiler actualizado");
            }
            else {
            JOptionPane.showMessageDialog(new JFrame(),"Error, ID no encontrado",
                "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(),"Error, el ID es de 1-200",
                "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDiasActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int ID;
        //Pedimos el Id del alquiler
        try {
            ID = Integer.valueOf(JOptionPane.showInputDialog(null, "Escriba el ID del"
                + " alquiler para eliminar, 0 para eliminar todo"));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error, escriba un número correcto",
                "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Borrar alquiler si el Id es correcto
        if (ID >= 0 && ID <= 200) {
            if (controlador.borraAlq(ID) == true) {
                JOptionPane.showMessageDialog(null, "Alquiler eliminado");
                controlador.notificaCambios();
            }
            else {
                System.out.println(ID);
            JOptionPane.showMessageDialog(new JFrame(),"Error, ID no encontrado",
                "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(),"Error, el ID es de 1-200",
                "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDias;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonShow;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCont;
    private javax.swing.JLabel jLabelFich;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        jLabelCont.setText("Nº de alquileres actuales: " + controlador.getCont());
    }
}
