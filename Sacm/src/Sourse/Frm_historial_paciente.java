/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_historial_paciente.java
 *
 * Created on 25/11/2011, 08:39:05 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wsdess
 */
public class Frm_historial_paciente extends javax.swing.JFrame {

     String id="";
    int t=0;
    DefaultTableModel modelo = new DefaultTableModel();
    public Frm_historial_paciente(String id_m,int tip){
        id=id_m;
        t=tip;
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
        jTable1.setModel(modelo);
        this.dataSource1.setCodigosql("select id_paciente,fecha,descripcion,medicacion from tbl_expedientes natural join tbl_pacientes where id_paciente = any("+
        "select id_paciente from tbl_medico_paciente where id_empleado="+"(select id_empleado from empleados where id_usuario='"+this.id+"'));");
        try{
            this.dataSource1.consulta();
            System.out.println(""+this.dataSource1.consulta()+"_nos lanza_"+this.dataSource1.consulta().getRow()+"_registros");
        }
        catch(Exception e){
            System.out.println("no se pudo realizar la consulta");
        }
        modelo.addColumn("id_paciente");
        modelo.addColumn("fecha");
        modelo.addColumn("descripcion");
        modelo.addColumn("medicacion");
        try {
        do
        {      
               Object [] fila = new Object[4];
               for (int i=0;i<4;i++)
               fila[i] =this.dataSource1.rs.getObject(i+1);
               modelo.addRow(fila);    
        }while (this.dataSource1.rs.next());
        }catch (SQLException ex) {
                System.out.println("no se porque no llene la tabla");
        }
        jTable1.setModel(modelo); 
        this.Lbl_catalogo_pacientes.setText("historial completo del paciente: ");
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataSource1 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        tbn_salir5 = new org.edisoncor.gui.button.ButtonSeven();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        dataSource1.setCodigosql("select * from tbl_expedientes");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("3mbl3ma");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        tbn_salir5.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir5.setText("X");
        tbn_salir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir5ActionPerformed(evt);
            }
        });

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Aqui aparece el id del paciente");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(tbn_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(Lbl_catalogo_pacientes)
                        .addGap(23, 23, 23))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_catalogo_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbn_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_salir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir5ActionPerformed
        Frm_menu menu=new Frm_menu(id,t);
        menu.setVisible(true);
        this.dispose(); 
}//GEN-LAST:event_tbn_salir5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_historial_paciente(null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private FuenteDeDatos.DataSource dataSource1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir5;
    // End of variables declaration//GEN-END:variables
}
