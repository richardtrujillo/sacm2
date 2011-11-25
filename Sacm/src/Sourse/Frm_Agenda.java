/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_Agenda.java
 *
 * Created on 23/11/2011, 11:35:36 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author wsdess
 */
public class Frm_Agenda extends javax.swing.JFrame {

    /** Creates new form Frm_Agenda */
    public Frm_Agenda() {
        initComponents();
        this.jtxf_busqueda.setEnabled(false);
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
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bit = new FuenteDeDatos.DataTable();
        jtxf_busqueda = new javax.swing.JTextField();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        tbn_salir5 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();

        dataSource1.setCodigosql("select * from tbl_empleados");
        dataSource1.setDb("sacm");
        dataSource1.setIp("http://localhost/");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Agenda medico:");

        tbl_bit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Id_paciente", "Nombre", "Apellido_p", "Apellido_m"
            }
        ));
        jScrollPane1.setViewportView(tbl_bit);

        buttonSeven1.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven1.setText("Buscar");
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });

        tbn_salir5.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir5.setText("X");
        tbn_salir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Buscar por fecha:");

        JDtChFechaDel.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaDelOnCommit(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Lbl_catalogo_pacientes)
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel1))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jtxf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)))
                    .addComponent(tbn_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbl_catalogo_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbn_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jtxf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tbn_salir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir5ActionPerformed
        Frm_menu men=new Frm_menu(null,0);
        men.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir5ActionPerformed

private void JDtChFechaDelOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaDelOnCommit
        
         String []datos=JDtChFechaDel.getText().split("/");

        String Dia, Mes, Ano;
//El campo DATE en la base de datos solo admite en ese orden
        Ano="";
        Mes="";
        Dia="";

        Dia=datos[0];
        Mes=datos[1];
        Ano=datos[2];
//Caja de texto donde va la fecha extraida
        jtxf_busqueda.setText(Ano+"-" + Mes + "-"+ Dia); 
}//GEN-LAST:event_JDtChFechaDelOnCommit

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_Agenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo JDtChFechaDel;
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private FuenteDeDatos.DataSource dataSource1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxf_busqueda;
    private org.edisoncor.gui.panel.Panel panel1;
    private FuenteDeDatos.DataTable tbl_bit;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir5;
    // End of variables declaration//GEN-END:variables
}