/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_reportes.java
 *
 * Created on 23-nov-2011, 18:24:54
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author DavidPeinado
 */
public class Frm_reportes extends javax.swing.JFrame {
     DefaultTableModel modelo = new DefaultTableModel();

    /** Creates new form Frm_reportes */
    public Frm_reportes() {
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
         try{
            this.dataSource1.consulta();
            System.out.println(""+this.dataSource1.consulta().getRow());
        }catch(Exception e){
           System.out.println("no me conecte");
           
        }
         try {
         if(this.dataSource1.consulta().getRow()==0){
         
         }else{
    
            modelo.addColumn("id_paciente");
            modelo.addColumn("Fecha");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Medicacion");
            modelo.addColumn("F_nac");
       
         do
        {                
               Object [] fila = new Object[5];
               for (int i=0;i<5;i++)
               fila[i] =this.dataSource1.rs.getObject(i+1); 
               modelo.addRow(fila);  
        }while (this.dataSource1.rs.next());
        
        
        jTable1.setModel(modelo); 
    }
         }catch (SQLException ex) {
                System.out.println("no se porque no llene la tabla");
        }
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
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt = new org.edisoncor.gui.button.ButtonSeven();
        jLabel2 = new javax.swing.JLabel();
        JTxtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        dataSource1.setCodigosql("select * from vw_reportes;");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Reportes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bt.setBackground(new java.awt.Color(0, 57, 85));
        bt.setText("Buscar");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Buscar por fecha:");

        JTxtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtBuscarKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Año-Mes-Dia");

        org.jdesktop.layout.GroupLayout panel1Layout = new org.jdesktop.layout.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1Layout.createSequentialGroup()
                .add(tbn_salir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 575, Short.MAX_VALUE)
                .add(jLabel1)
                .add(32, 32, 32))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .add(bt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(JTxtBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(panel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel3)))
                .add(168, 168, 168))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1Layout.createSequentialGroup()
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tbn_salir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(panel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel1)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(JTxtBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(bt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu menu=new Frm_menu(null,0);
        menu.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed

private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
this.JTxtBuscar.setEnabled(true);
this.JTxtBuscar.requestFocus();
        
}//GEN-LAST:event_btActionPerformed

private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
}//GEN-LAST:event_JTxtBuscarKeyTyped

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
            java.util.logging.Logger.getLogger(Frm_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_reportes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtBuscar;
    private org.edisoncor.gui.button.ButtonSeven bt;
    private FuenteDeDatos.DataSource dataSource1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables
 public javax.swing.JTextField getJTxtBuscar() 
    {
        if (JTxtBuscar.getText() != "")
        {
            //JTxtBuscar.
            JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter()
            {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e)
                {
                    final TableRowSorter<TableModel> sorter =new TableRowSorter<TableModel>(jTable1.getModel());
                    jTable1.setRowSorter(sorter);
                    String Fecha = JTxtBuscar.getText();
                    if (Fecha.length() == 0)
                    {
                       sorter.setRowFilter(null);
                    }
                    else
                    {
                        try
                        {
                            sorter.setRowFilter(RowFilter.regexFilter("^" + Fecha, 1));
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog( null, "NO EXISTEN DATOS QUE COINCIDAN\nCON LAS PALABRAS ESCRITAS", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                   }
                }
            });
       }
        return JTxtBuscar;
    }

    public void setJTxtBuscar(javax.swing.JTextField JTxtBuscar)
    {
        this.JTxtBuscar = JTxtBuscar;
    }
}

