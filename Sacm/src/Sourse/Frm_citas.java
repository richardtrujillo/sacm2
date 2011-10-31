/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_citas.java
 *
 * Created on 29/10/2011, 12:25:29 PM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author wsdess
 */
public class Frm_citas extends javax.swing.JFrame {

    /** Creates new form Frm_citas */
    public Frm_citas() {
        initComponents();
       // this.setSize(600,300);
        //this.panel1.setSize(600,300);
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

        dataSource1 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        btn_siguiente = new org.edisoncor.gui.button.ButtonSeven();
        btn_anterior = new org.edisoncor.gui.button.ButtonSeven();
        btn_ultimo = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        btn_primero = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSeven6 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven7 = new org.edisoncor.gui.button.ButtonSeven();
        dataLabel1 = new FuenteDeDatos.DataLabel();
        dataTextField1 = new FuenteDeDatos.DataTextField();
        dataTextField2 = new FuenteDeDatos.DataTextField();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jLabel3 = new javax.swing.JLabel();
        dataCombobox1 = new FuenteDeDatos.DataCombobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        btn_siguiente.setBackground(new java.awt.Color(0, 57, 85));
        btn_siguiente.setText(">");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_anterior.setBackground(new java.awt.Color(0, 57, 85));
        btn_anterior.setText("<");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_ultimo.setBackground(new java.awt.Color(0, 57, 85));
        btn_ultimo.setText(">>");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        buttonSeven5.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven5.setText("Eliminar");
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Ingresar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });

        btn_primero.setBackground(new java.awt.Color(0, 57, 85));
        btn_primero.setText("<<");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Numero de cita:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Fecha:");

        buttonSeven6.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven6.setText("Buscar");

        buttonSeven7.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven7.setText("Calendario");
        buttonSeven7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven7ActionPerformed(evt);
            }
        });

        dataLabel1.setText("Aqui aparece el No.Cita");
        dataLabel1.setCampo("id_cita");
        dataLabel1.setData(dataSource1);

        dataTextField1.setCampo("id_paciente");
        dataTextField1.setData(dataSource1);

        dataTextField2.setCampo("fecha");
        dataTextField2.setData(dataSource1);

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });

        clockDigital1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 57, 85));
        jLabel3.setText("Fecha del dia");

        dataCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00" }));
        dataCombobox1.setCampo("hora");
        dataCombobox1.setData(dataSource1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(dataLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(buttonSeven6, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(buttonSeven7, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(dataTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dataCombobox1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addGap(88, 88, 88)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonSeven5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonSeven3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(buttonSeven4, 0, 0, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dataTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dataTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonSeven7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        this.dataSource1.siguiente();
}//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dataSource1.anterior();
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        this.dataSource1.ultimo();
}//GEN-LAST:event_btn_ultimoActionPerformed

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_buttonSeven5ActionPerformed

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed

}//GEN-LAST:event_buttonSeven2ActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        this.dataSource1.primero();
}//GEN-LAST:event_btn_primeroActionPerformed

    private void buttonSeven7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSeven7ActionPerformed

    private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu men=new Frm_menu();
        men.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_citas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven7;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private FuenteDeDatos.DataCombobox dataCombobox1;
    private FuenteDeDatos.DataLabel dataLabel1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dataTextField1;
    private FuenteDeDatos.DataTextField dataTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables
}
