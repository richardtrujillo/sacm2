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
public final class Frm_menu extends javax.swing.JFrame {
    //Pruebas
    private int tipo_usuario=3;
    /** Creates new form Frm_menu */
    public Frm_menu(final String nombre,int tipo) {
        initComponents();
        //dataSource1.consulta();
        switch(tipo){
            case 1:
                        //Caso Jefe clinico
                        this.setSize(760, 360);
                        this.datahabilitador1.habilitaredison(panel1, this.buttonTask1);
                break;
            case 2:
                        //Caso Recepcion
                        this.setSize(350, 360);
                        this.tbn_salir.setLocation(200, 250);
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(false);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(false);
                        this.buttonTask6.setVisible(false);
                        this.buttonTask7.setVisible(false);
                        this.buttonTask8.setVisible(true);
                        break;
            case 3:
                        //Caso Medico
                        this.setSize(660, 360);
                        this.tbn_salir.setLocation(480, 350);
                        this.buttonTask1.setVisible(false);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(false);
                        this.buttonTask6.setVisible(false);
                        this.buttonTask7.setVisible(true);
                        this.buttonTask8.setVisible(true);
                        
                break;
            default:
                        this.buttonTask1.setVisible(true);
                        this.buttonTask2.setVisible(true);
                        this.buttonTask3.setVisible(true);
                        this.buttonTask4.setVisible(true);
                        this.buttonTask5.setVisible(true);
                        this.buttonTask6.setVisible(true);
                        this.buttonTask7.setVisible(true);
                        this.buttonTask8.setVisible(true);
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

        buttonTask1.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask1.setText("Empleados");
        buttonTask1.setDescription("Catalogo Empleados");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask1);
        buttonTask1.setBounds(490, 220, 210, 64);

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });

        clockDigital1.setForeground(new java.awt.Color(0, 51, 51));
        clockDigital1.setFont(new java.awt.Font("Tahoma", 1, 14));

        buttonTask5.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask5.setText("Reportes");
        buttonTask5.setDescription("Catalogo Medicos");
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Bienvenido:");

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
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });

        buttonTask6.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask6.setText("Bitacora");
        buttonTask6.setDescription("Consulta de Bitacora");
        buttonTask6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask6ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonTask6);
        buttonTask6.setBounds(490, 140, 210, 64);

        buttonTask7.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask7.setText("Diagnostico");
        buttonTask7.setDefaultCapable(false);
        buttonTask7.setDescription("Realizar Cita");
        buttonTask7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask7ActionPerformed(evt);
            }
        });

        dlbl_nombre.setText("Aqui aparecera el nombre del empleado logeado");

        buttonTask8.setForeground(new java.awt.Color(0, 57, 85));
        buttonTask8.setText("Agenda");
        buttonTask8.setDefaultCapable(false);
        buttonTask8.setDescription("Agenda del medico");
        buttonTask8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCurves1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel1))
                .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                            .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonTask4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonTask8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonTask2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonTask3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonTask5, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(buttonTask7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonTask6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelCurves1Layout.createSequentialGroup()
                            .addComponent(dlbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(dlbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTask7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCurves1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(buttonTask6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonTask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCurves1Layout.createSequentialGroup()
                                .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonTask8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTask5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
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
        System.out.println("Aqui tiene que ir a mostrar el Frm_empleados");
        Frm_empleados Em=new Frm_empleados();
        Em.setVisible(true);
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
                new Frm_menu("",0).setVisible(true);
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
}
