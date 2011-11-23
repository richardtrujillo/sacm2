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
        dataTextField3 = new FuenteDeDatos.DataTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dataTextField4 = new FuenteDeDatos.DataTextField();
        jLabel12 = new javax.swing.JLabel();
        dataTextField2 = new FuenteDeDatos.DataTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        JDtChFecha = new datechooser.beans.DateChooserCombo();
        JTxtFechaPacientes = new FuenteDeDatos.DataMaskedTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_expedientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_expedientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_expedientes.setText("Expedientes");
        panel1.add(Lbl_expedientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 43));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Paciente:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 88, -1, -1));

        buttonSeven1.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven1.setText("Buscar");
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 114, 132, 30));

        dataTextField1.setCampo("id_paciente");
        dataTextField1.setData(dataSource1);
        panel1.add(dataTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 88, 207, -1));

        tbn_salir1.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir1.setText("X");
        tbn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir1ActionPerformed(evt);
            }
        });
        panel1.add(tbn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));
        panel1.add(dataTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 200, 203, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 57, 85));
        jLabel13.setText("Descripcion:");
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 57, 85));
        jLabel11.setText("ID_Paciente:");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 162, -1, -1));
        panel1.add(dataTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 238, 203, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 57, 85));
        jLabel12.setText("Medicacion:");
        panel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 238, -1, -1));
        panel1.add(dataTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 162, 203, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SACM_SPLASH.png"))); // NOI18N
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Ingresar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 90, -1));

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        panel1.add(buttonSeven3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 100, -1));

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        panel1.add(buttonSeven4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 93, -1));

        JDtChFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaOnCommit(evt);
            }
        });
        panel1.add(JDtChFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 276, 29, 25));

        JTxtFechaPacientes.setCampo("F_nac");
        JTxtFechaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel1.add(JTxtFechaPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 276, 160, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Fecha Nacimiento:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, -1, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
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

private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed

}//GEN-LAST:event_buttonSeven2ActionPerformed

private void JDtChFechaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaOnCommit
        
        String []datos=JDtChFecha.getText().split("/");

        String Dia, Mes, Ano;
        //El campo DATE en la base de datos solo admite en ese orden
        Ano="";
        Mes="";
        Dia="";

        Ano=datos[0];
        Mes=datos[1];
        Dia=datos[2];
        //Caja de texto donde va la fecha extraida
        JTxtFechaPacientes.setText(Dia+"-" + Mes + "-"+ Ano); 
}//GEN-LAST:event_JDtChFechaOnCommit

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
    private datechooser.beans.DateChooserCombo JDtChFecha;
    private FuenteDeDatos.DataMaskedTextField JTxtFechaPacientes;
    private javax.swing.JLabel Lbl_expedientes;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dataTextField1;
    private FuenteDeDatos.DataTextField dataTextField2;
    private FuenteDeDatos.DataTextField dataTextField3;
    private FuenteDeDatos.DataTextField dataTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir1;
    // End of variables declaration//GEN-END:variables
}
