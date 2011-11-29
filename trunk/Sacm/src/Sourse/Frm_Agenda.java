
/*
 * Frm_Agenda.java
 *
 * Created on 23/11/2011, 11:35:36 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author wsdess
 */
public class Frm_Agenda extends javax.swing.JFrame {
    String id="";
    int t=0;
    DefaultTableModel modelo = new DefaultTableModel();   
    public Frm_Agenda(String id_m,int tip) {
        id=id_m;
        t=tip;
        int r2=0;
        initComponents();
        this.JTxtBuscar.setEnabled(false);
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
            r2=this.dataSource1.consultaSN("select * from vw_agenda_medico where id_empleado="+this.id+";").getRow();
        }catch(Exception e){
           System.out.println("no me conecte");
        }
        int r;
       
        try {
         if(r2==0){
             System.out.println("no tiene campos");
         }else{    
            modelo.addColumn("nombre");
            modelo.addColumn("fecha");
            modelo.addColumn("hora");
            modelo.addColumn("descripcion");
            modelo.addColumn("id_empleado");
        do
        {                
               Object [] fila = new Object[5];
               for (int i=0;i<5;i++)
               fila[i] =this.dataSource1.rs.getObject(i+1); 
               modelo.addRow(fila);
        }while (this.dataSource1.rs.next());}
        }catch (SQLException ex) {
                System.out.println("no se porque no llene la tabla");
        }
        jTable1.setModel(modelo); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataSource1 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        tbn_salir5 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JTxtBuscar = new javax.swing.JTextField();
        bt = new org.edisoncor.gui.button.ButtonSeven();
        jLabel2 = new javax.swing.JLabel();

        dataSource1.setCodigosql("select * from vw_agenda_medico");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(null);

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Agenda medico:");
        panel1.add(Lbl_catalogo_pacientes);
        Lbl_catalogo_pacientes.setBounds(554, 20, 192, 43);

        tbn_salir5.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir5.setText("X");
        tbn_salir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir5ActionPerformed(evt);
            }
        });
        panel1.add(tbn_salir5);
        tbn_salir5.setBounds(0, 0, 30, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Buscar por fecha:");
        panel1.add(jLabel1);
        jLabel1.setBounds(40, 150, 121, 17);

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

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(207, 71, 601, 343);

        JTxtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtBuscarKeyTyped(evt);
            }
        });
        panel1.add(JTxtBuscar);
        JTxtBuscar.setBounds(30, 180, 130, 21);

        bt.setBackground(new java.awt.Color(0, 57, 85));
        bt.setText("Buscar");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        panel1.add(bt);
        bt.setBounds(41, 97, 116, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Año-Mes-Dia");
        panel1.add(jLabel2);
        jLabel2.setBounds(50, 200, 88, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
}//GEN-LAST:event_JTxtBuscarKeyTyped

private void tbn_salir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir5ActionPerformed

        Frm_menu men=new Frm_menu(id,t);
        men.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir5ActionPerformed

private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
this.JTxtBuscar.setEnabled(true);
this.JTxtBuscar.requestFocus();
        
}//GEN-LAST:event_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Frm_Agenda(null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtBuscar;
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven bt;
    private FuenteDeDatos.DataSource dataSource1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir5;
    // End of variables declaration//GEN-END:variables
   


    public javax.swing.JTextField getJTxtBuscar() 
    {
        if (JTxtBuscar.getText().equals(""))
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
                            sorter.setRowFilter(RowFilter.regexFilter("^" + Fecha, 0));
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

