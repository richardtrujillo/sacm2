/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_expd.java
 *
 * Created on 3/11/2011, 12:53:23 PM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author wsdess
 */
public class Frm_expd extends javax.swing.JFrame {

    /** Creates new form Frm_expd */
    public Frm_expd() {
        initComponents();
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
        Lbl_expedientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        dataTextField1 = new FuenteDeDatos.DataTextField();
        tbn_salir1 = new org.edisoncor.gui.button.ButtonSeven();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        Lbl_expedientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_expedientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_expedientes.setText("Expedientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Paciente:");

        buttonSeven1.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven1.setText("Buscar");
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });

        dataTextField1.setCampo("id_paciente");
        dataTextField1.setData(dataSource1);

        tbn_salir1.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir1.setText("X");
        tbn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(tbn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
                .addComponent(Lbl_expedientes)
                .addGap(34, 34, 34))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(tbn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dataTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Lbl_expedientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven1ActionPerformed
        
}//GEN-LAST:event_buttonSeven1ActionPerformed

private void tbn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir1ActionPerformed
        Frm_log_in log=new Frm_log_in();
        log.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
        @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));


        return retValue;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_expd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_expedientes;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dataTextField1;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir1;
    // End of variables declaration//GEN-END:variables
}
