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
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author wsdess
 */
public class Frm_menu extends javax.swing.JFrame {
    //Pruebas
    private int tipo_usuario=0;
    private String nombre="iniciando"; 
    /** Creates new form Frm_menu */
    public Frm_menu() {
        initComponents();
   
        switch(tipo_usuario){
            case 1:
                        //Caso administrador
                        this.setSize(714, 353);
                        this.datahabilitador1.habilitaredison(panel1, this.buttonTask1);
                break;
            case 2:
                        //Caso recepcion
                        this.setSize(500, 353);
                        this.tbn_salir.setLocation(480, 350);
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(false);
                        this.buttonTask3.setVisible(false);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(false);
                        this.buttonTask7.setVisible(false);
                        break;
            case 3:
                        //Caso medico
                        this.setSize(500, 353);
                        this.tbn_salir.setLocation(480, 350);
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(false);
                        this.buttonTask7.setVisible(true);
                        
                break;
            default:
                        this.buttonTask1.setVisible(true);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(true);
                        this.buttonTask7.setVisible(true);
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
        dataSource1 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        buttonTask5 = new org.edisoncor.gui.button.ButtonTask();
        jLabel1 = new javax.swing.JLabel();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask6 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask7 = new org.edisoncor.gui.button.ButtonTask();
        dlbl_nombre = new FuenteDeDatos.DataLabel();
        buttonTask8 = new org.edisoncor.gui.button.ButtonTask();

        dataSource1.setCodigosql("select * from tbl_medicos");
        dataSource1.setDb("sacm");
        dataSource1.setIp("http://localhost/");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setPreferredSize(new java.awt.Dimension(752, 393));

        panelCurves1.setLayout(null);

        buttonTask1.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask1.setText("Empleados");
        buttonTask1.setDescription("Catalogo Empleados");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask1);
        buttonTask1.setBounds(490, 220, 242, 64);

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });
        panelCurves1.add(tbn_salir);
        tbn_salir.setBounds(680, 10, 20, 20);

        clockDigital1.setForeground(new java.awt.Color(0, 102, 102));
        panelCurves1.add(clockDigital1);
        clockDigital1.setBounds(480, 30, 150, 49);

        buttonTask5.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask5.setText("Reportes");
        buttonTask5.setDescription("Catalogo Medicos");
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask5);
        buttonTask5.setBounds(250, 220, 242, 64);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Bienvenido:");
        panelCurves1.add(jLabel1);
        jLabel1.setBounds(30, 20, 141, 29);

        buttonTask2.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask2.setText("Pacientes");
        buttonTask2.setDescription("Catalogo de Pacientes");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask2);
        buttonTask2.setBounds(10, 220, 242, 64);

        buttonTask3.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask3.setText("Expedientes");
        buttonTask3.setDescription("Consulta de expedientes");
        panelCurves1.add(buttonTask3);
        buttonTask3.setBounds(10, 140, 242, 64);

        buttonTask4.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask4.setText("Citas");
        buttonTask4.setDefaultCapable(false);
        buttonTask4.setDescription("Administracion de Citas");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask4);
        buttonTask4.setBounds(250, 140, 242, 64);

        buttonTask6.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask6.setText("Bitacora");
        buttonTask6.setDescription("Consulta de Bitacora");
        buttonTask6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask6ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask6);
        buttonTask6.setBounds(490, 140, 242, 64);

        buttonTask7.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask7.setText("Diagnostico");
        buttonTask7.setDefaultCapable(false);
        buttonTask7.setDescription("Realizar Cita");
        buttonTask7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask7ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask7);
        buttonTask7.setBounds(340, 70, 242, 64);

        dlbl_nombre.setText("Aqui aparecera el nombre del empleado logeado");
        panelCurves1.add(dlbl_nombre);
        dlbl_nombre.setBounds(220, 20, 230, 50);

        buttonTask8.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask8.setText("Agenda");
        buttonTask8.setDefaultCapable(false);
        buttonTask8.setDescription("Agenda del medico");
        buttonTask8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask8ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask8);
        buttonTask8.setBounds(110, 70, 242, 64);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
        Frm_citas cit=new Frm_citas();
        cit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonTask4ActionPerformed

    private void buttonTask7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask7ActionPerformed

    private void buttonTask8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask8ActionPerformed

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
    private org.edisoncor.gui.button.ButtonTask buttonTask7;
    private org.edisoncor.gui.button.ButtonTask buttonTask8;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.Datahabilitador datahabilitador1;
    private FuenteDeDatos.DataLabel dlbl_nombre;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tipo_usuario
     */
    public int getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * @param tipo_usuario the tipo_usuario to set
     */
    public void setTipo_usuario(int tipo_u) {
        this.tipo_usuario = tipo_u;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nom) {
        this.nombre = nom;
    }
}
