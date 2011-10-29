/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_empleados.java
 *
 * Created on 26/10/2011, 11:54:54 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author wsdess
 */
public class Frm_empleados extends javax.swing.JFrame {

    /** Creates new form Frm_empleados */
    public Frm_empleados() {
        initComponents();
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
        //this.dataSource1.consulta();
        this.dtxf_apellido_m.setEnabled(false);
        this.dtxf_apellido_p.setEnabled(false);
        this.dtxf_nombre.setEnabled(false);
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
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        btn_ultimo = new org.edisoncor.gui.button.ButtonSeven();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        jLblFoto = new javax.swing.JLabel();
        btn_primero = new org.edisoncor.gui.button.ButtonSeven();
        btn_siguiente = new org.edisoncor.gui.button.ButtonSeven();
        btn_anterior = new org.edisoncor.gui.button.ButtonSeven();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        dtxf_nombre = new FuenteDeDatos.DataTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtxf_apellido_m = new FuenteDeDatos.DataTextField();
        dtxf_apellido_p = new FuenteDeDatos.DataTextField();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven6 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel5 = new javax.swing.JLabel();
        dataCombobox1 = new FuenteDeDatos.DataCombobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        buttonSeven1.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven1.setText("...");
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });

        btn_ultimo.setBackground(new java.awt.Color(0, 57, 85));
        btn_ultimo.setText(">>");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Catalogo de Empleados");

        jLblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_primero.setBackground(new java.awt.Color(0, 57, 85));
        btn_primero.setText("<<");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });

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

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
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

        dtxf_nombre.setCampo("Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Apellido_P:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Apellido_M:");

        dtxf_apellido_m.setCampo("Nombre");

        dtxf_apellido_p.setCampo("Nombre");

        buttonSeven5.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven5.setText("Eliminar");
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });

        buttonSeven6.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven6.setText("Permisos");
        buttonSeven6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Tipo de empleado");

        dataCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Administrador", "Recepcionista", "Medico" }));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtxf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCombobox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(87, 87, 87)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Lbl_catalogo_pacientes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(28, 28, 28)
                .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(buttonSeven5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Lbl_catalogo_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel1)
                            .addComponent(dtxf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel2)
                            .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel4)
                            .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dataCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        JFileChooser dlg = new JFileChooser();
        //Abre la ventana de dialogo
        int option = dlg.showOpenDialog(this);
        //Si hace click en el boton abrir del dialogo
        if(option==JFileChooser.APPROVE_OPTION) {
            //Obtiene nombre del archivo seleccionado
            String file = dlg.getSelectedFile().getPath();
            jLblFoto.setIcon(new ImageIcon(file));
            //Modificando la imagen
            ImageIcon icon = new ImageIcon(file);
            //Se extrae la imagen del icono
            Image img = icon.getImage();
            //Se modifica su tamaño
            Image newimg = img.getScaledInstance(140,170,java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            //Se coloca el nuevo icono modificado
            jLblFoto.setIcon(newIcon);
            //Se cambia el tamaño de la etiqueta
            jLblFoto.setSize(256,256);
        }
}//GEN-LAST:event_buttonSeven1ActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        this.dataSource1.ultimo();
}//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        this.dataSource1.primero();
}//GEN-LAST:event_btn_primeroActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        this.dataSource1.siguiente();
}//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dataSource1.anterior();
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu menu=new Frm_menu();
        menu.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
        this.dtxf_apellido_m.setEnabled(true);
        this.dtxf_apellido_p.setEnabled(true);
        this.dtxf_nombre.setEnabled(true);
}//GEN-LAST:event_buttonSeven2ActionPerformed

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSeven5ActionPerformed

    private void buttonSeven6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSeven6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frm_empleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private FuenteDeDatos.DataCombobox dataCombobox1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dtxf_apellido_m;
    private FuenteDeDatos.DataTextField dtxf_apellido_p;
    private FuenteDeDatos.DataTextField dtxf_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblFoto;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables
}
