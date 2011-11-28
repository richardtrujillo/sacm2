/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_agregar_emp.java
 *
 * Created on 17/11/2011, 11:16:18 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author wsdess
 */
public class Frm_agregar_emp extends javax.swing.JFrame {

    String id="";
    int t=0;
    public Frm_agregar_emp(String id_m,int tip) {
        id=id_m;
        t=tip;
        System.out.println("Mostrare el frame");
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
        System.out.println("me centre con respecto ala pantalla");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataSource1 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel5 = new javax.swing.JLabel();
        dcbx_tipo_ = new FuenteDeDatos.DataCombobox();
        jLabel7 = new javax.swing.JLabel();
        dtxf_id_usuario = new FuenteDeDatos.DataTextField();
        jLabel8 = new javax.swing.JLabel();
        jpssf_contraseña = new javax.swing.JPasswordField();
        dataCheckBox1 = new FuenteDeDatos.DataCheckBox();

        dataSource1.setCodigosql("select * from tbl_usuarios");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("3mbl3ma");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(null);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Ingresar nuevo usuario");
        panel1.add(Lbl_catalogo_pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 43));

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        buttonSeven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven4ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 85, -1));

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 81, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Tipo de empleado:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        dcbx_tipo_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Administrador", "Recepcionista", "Medico" }));
        dcbx_tipo_.setCampo("");
        dcbx_tipo_.setData(dataSource1);
        panel1.add(dcbx_tipo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 87, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 57, 85));
        jLabel7.setText("Id_Usuario:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 130, -1, -1));

        dtxf_id_usuario.setCampo("");
        dtxf_id_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dtxf_id_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_id_usuarioKeyTyped(evt);
            }
        });
        panel1.add(dtxf_id_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 130, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 57, 85));
        jLabel8.setText("Contraseña:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 177, -1, 25));
        panel1.add(jpssf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 182, 230, -1));

        dataCheckBox1.setForeground(new java.awt.Color(0, 57, 85));
        dataCheckBox1.setText("Estatus");
        dataCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 15));
        panel1.add(dataCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 220, 109, -1));

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 630, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void dtxf_id_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_id_usuarioKeyTyped
char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
}//GEN-LAST:event_dtxf_id_usuarioKeyTyped

private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        String us=this.dtxf_id_usuario.getText();
        Frm_empleados Em=new Frm_empleados(us,id,t);
        Em.setVisible(true);
        this.dispose();
}//GEN-LAST:event_buttonSeven3ActionPerformed

private void buttonSeven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven4ActionPerformed
        Frm_empleados Em=new Frm_empleados("",id,t);
        Em.setVisible(true);
        this.dispose();
}//GEN-LAST:event_buttonSeven4ActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));


        return retValue;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Frm_agregar_emp(null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private FuenteDeDatos.DataCheckBox dataCheckBox1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataCombobox dcbx_tipo_;
    private FuenteDeDatos.DataTextField dtxf_id_usuario;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jpssf_contraseña;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
