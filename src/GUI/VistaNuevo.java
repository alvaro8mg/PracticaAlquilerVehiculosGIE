/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class VistaNuevo extends javax.swing.JFrame {

    private Controlador controlador = null;

    /**
     * Creates new form vISTA
     */
    public VistaNuevo() {
        initComponents();
    }

    //Constructor que iniciliza los demás componentes
    public VistaNuevo(Controlador controlador) {
        this();
        this.controlador = controlador;
        setVisible(true);
        //No permitir modificar tamaño ventana
        this.setResizable(false);
        this.setTitle("Nuevo alquiler");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCli = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelCar = new javax.swing.JLabel();
        jLabelND = new javax.swing.JLabel();
        jTextNIF = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLabelNIF = new javax.swing.JLabel();
        ButtonSave = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        jTextDias = new javax.swing.JTextField();
        ComboTipo = new javax.swing.JComboBox();
        jLabelTip = new javax.swing.JLabel();
        ComboGama = new javax.swing.JComboBox();
        ButtonCalcul = new javax.swing.JButton();
        jLabelPrecio = new javax.swing.JLabel();
        jCheckAnticipado = new javax.swing.JCheckBox();
        jLabelEuro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCli.setText("Cliente");

        jLabelName.setText("Nombre y apellidos:");

        jLabelCar.setText("Coche");

        jLabelND.setText("Nº de días");

        jLabelNIF.setText("NIF");

        ButtonSave.setText("Guardar");
        ButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancelar");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        jTextDias.setText("3");
        jTextDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiasActionPerformed(evt);
            }
        });

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTip.setText("Tipo");

        ComboGama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonCalcul.setText("Calcular precio");
        ButtonCalcul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculActionPerformed(evt);
            }
        });

        jLabelPrecio.setText("0.0");

        jCheckAnticipado.setText("Reserva anticipada(rebaja del 10%)");

        jLabelEuro.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelND)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboTipo, 0, 133, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNIF)
                                .addGap(18, 18, 18)
                                .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboGama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCli)
                            .addComponent(jLabelCar)
                            .addComponent(jCheckAnticipado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonCalcul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEuro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNIF)
                    .addComponent(jTextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabelCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelND)
                    .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip)
                    .addComponent(ComboGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckAnticipado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCalcul)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelEuro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSave)
                    .addComponent(ButtonCancel))
                .addContainerGap())
        );

        //Maximo de caracteres
        jTextNIF.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e)

            {if (jTextNIF.getText().length()== 9)

                e.consume();
            }

            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });
        //Solo permitir escribir numeros
        jTextDias.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        //Maximo de caracteres
        jTextDias.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e)

            {if (jTextDias.getText().length()== 3)

                e.consume();
            }

            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });
        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Urbano", "Utilitario", "Compacto", "Berlina", "Monovolumen-Furgon 7pl" }));
        ComboGama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gama baja", "Gama media", "Gama de lujo" }));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCalculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculActionPerformed
        // TODO add your handling code here:
        
        controlador.calculaPrecio(Integer.parseInt(jTextDias.getText()), ComboTipo.getSelectedIndex(), ComboGama.getSelectedIndex(), jCheckAnticipado.isSelected());
        this.jLabelPrecio.setText(controlador.GetPrecio());
    }//GEN-LAST:event_ButtonCalculActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        // TODO add your handling code here:
        controlador.guardaAlquiler(jTextNombre.getText(), jTextNIF.getText(), Integer.parseInt(jTextDias.getText()), ComboTipo.getSelectedIndex(), ComboGama.getSelectedIndex(), jCheckAnticipado.isSelected());
        JOptionPane.showMessageDialog(null, "Alquiler añadido.\n" + controlador.getAlquiler(controlador.getCont() -1));
        dispose();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void jTextDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcul;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox ComboGama;
    private javax.swing.JComboBox ComboTipo;
    private javax.swing.JCheckBox jCheckAnticipado;
    private javax.swing.JLabel jLabelCar;
    private javax.swing.JLabel jLabelCli;
    private javax.swing.JLabel jLabelEuro;
    private javax.swing.JLabel jLabelND;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTip;
    private javax.swing.JTextField jTextDias;
    private javax.swing.JTextField jTextNIF;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}