/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_menu.java
 *
 * Created on 20/10/2011, 11:46:30 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;


/**
 *
 * @author wsdess
 */
public class Frm_menu extends javax.swing.JFrame {
    //Pruebas
    int tipo_usuario=1;
    String nombre="iniciando"; 
    /** Creates new form Frm_menu */
    public Frm_menu() {
        initComponents();
   
        
        switch(tipo_usuario){
            case 1:
                        //Caso administrador
                        nombre="Administrador";
                        this.datahabilitador1.habilitaredison(panel1, this.buttonTask1);
                break;
            case 2:
                        //Caso recepcion
                        nombre="Recepcion";
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(false);
                        this.buttonTask3.setVisible(false);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(false);
                        break;
            case 3:
                        //Caso medico
                        nombre="Medico";
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(false);
                break;
            default:
                        this.buttonTask1.setVisible(true);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(true);
                break;
        }
        this.dlbl_nombre.setText(" "+nombre);
        //algoritmo para centrar el formulario
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datahabilitador1 = new FuenteDeDatos.Datahabilitador();
        panel1 = new org.edisoncor.gui.panel.Panel();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask6 = new org.edisoncor.gui.button.ButtonTask();
        dlbl_nombre = new FuenteDeDatos.DataLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonTask5 = new org.edisoncor.gui.button.ButtonTask();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setPreferredSize(new java.awt.Dimension(752, 393));

        buttonTask2.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask2.setText("Pacientes");
        buttonTask2.setDescription("Catalogo de Pacientes");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });

        buttonTask3.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask3.setText("Expedientes");
        buttonTask3.setDescription("Consulta de expedientes");

        buttonTask4.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask4.setText("Citas");
        buttonTask4.setDefaultCapable(false);
        buttonTask4.setDescription("Administracion de Citas");

        buttonTask6.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask6.setText("Bitacora");
        buttonTask6.setDescription("Consulta de Bitacora");
        buttonTask6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask6ActionPerformed(evt);
            }
        });

        dlbl_nombre.setForeground(new java.awt.Color(0, 57, 85));
        dlbl_nombre.setText("Aqui es donde aparece el nombre del empleado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Bienvenido:");

        buttonTask5.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask5.setText("Reportes");
        buttonTask5.setDescription("Catalogo Medicos");
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });

        buttonTask1.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask1.setText("Medicos");
        buttonTask1.setDescription("Catalogo Medicos");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                                    .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(139, 139, 139))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(dlbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTask3, 0, 0, Short.MAX_VALUE))
                            .addGap(69, 69, 69)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonTask1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(buttonTask5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(buttonTask4, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                            .addGap(216, 216, 216)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonTask6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonTask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTask5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTask6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
        Frm_pacientes pac=new Frm_pacientes();
        pac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void buttonTask5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask5ActionPerformed

    private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_log_in log=new Frm_log_in();
        log.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed

    private void buttonTask6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask6ActionPerformed
        Frm_bitacora bit=new Frm_bitacora();
        bit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonTask6ActionPerformed

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        Frm_empleados emp=new Frm_empleados();
        emp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonTask1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask3;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private org.edisoncor.gui.button.ButtonTask buttonTask5;
    private org.edisoncor.gui.button.ButtonTask buttonTask6;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private FuenteDeDatos.Datahabilitador datahabilitador1;
    private FuenteDeDatos.DataLabel dlbl_nombre;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables
}