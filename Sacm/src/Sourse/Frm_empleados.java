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
import javax.swing.JOptionPane;

/**
 *
 * @author wsdess
 */
public class Frm_empleados extends javax.swing.JFrame {

    /** Creates new form Frm_empleados */
    String id="";
    int t=0;
    public Frm_empleados(String id_u,String id_m,int tip) {
        initComponents();
        id=id_m;
        t=tip;
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
        if(id_u==null){
            try{
            this.dataSource1.consulta();
            this.dataSource1.primero();
        }catch(Exception e){
            System.out.println("No me conecte por "+e);
        }
                    this.JDtChFechaDel.setEnabled(false);
                    this.JTxtFecha.setEnabled(false);
                    this.dtxf_id_usuario.setEnabled(false);
                    this.dtxf_apellido_m.setEnabled(false);
                    this.dtxf_apellido_p.setEnabled(false);
                    this.dtxf_nombre.setEnabled(false);
                    this.buttonSeven3.setEnabled(false);
                    this.buttonSeven4.setEnabled(false);
        }else{
                    this.JDtChFechaDel.setEnabled(false);
                    this.JTxtFecha.setEnabled(false);
                    this.dtxf_id_usuario.setEnabled(false);
                    this.dtxf_apellido_m.setEnabled(false);
                    this.dtxf_apellido_p.setEnabled(false);
                    this.dtxf_nombre.setEnabled(true);
                    this.buttonSeven2.setEnabled(false);
                    this.buttonSeven6.setEnabled(false);
        }
    }

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
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        dtxf_nombre = new FuenteDeDatos.DataTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtxf_apellido_m = new FuenteDeDatos.DataTextField();
        dtxf_apellido_p = new FuenteDeDatos.DataTextField();
        buttonSeven6 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel3 = new javax.swing.JLabel();
        JTxtFecha = new FuenteDeDatos.DataTextField();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dtxf_id_usuario = new FuenteDeDatos.DataTextField();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        dataLabel1 = new FuenteDeDatos.DataLabel();

        dataSource1.setCodigosql("select * from empleados");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
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

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        buttonSeven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven4ActionPerformed(evt);
            }
        });

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Ingresar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });

        dtxf_nombre.setCampo("Nombre");
        dtxf_nombre.setData(dataSource1);
        dtxf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_nombreKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Apellido_P:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Apellido_M:");

        dtxf_apellido_m.setCampo("Apellido_M");
        dtxf_apellido_m.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dtxf_apellido_m.setData(dataSource1);
        dtxf_apellido_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_apellido_mKeyTyped(evt);
            }
        });

        dtxf_apellido_p.setCampo("Apellido_P");
        dtxf_apellido_p.setData(dataSource1);
        dtxf_apellido_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_apellido_pKeyTyped(evt);
            }
        });

        buttonSeven6.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven6.setText("Permisos");
        buttonSeven6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 57, 85));
        jLabel3.setText("Feha de Nacimiento:");

        JTxtFecha.setCampo("f_nac");
        JTxtFecha.setData(dataSource1);
        JTxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtFechaActionPerformed(evt);
            }
        });

        JDtChFechaDel.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaDelOnCommit(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 57, 85));
        jLabel6.setText("Id_empleado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 57, 85));
        jLabel7.setText("Id_Usuario:");

        dtxf_id_usuario.setCampo("id_usuario");
        dtxf_id_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dtxf_id_usuario.setData(dataSource1);

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });

        dataLabel1.setCampo("id_empleado");
        dataLabel1.setData(dataSource1);
        dataLabel1.setFont(new java.awt.Font("Tahoma", 3, 12));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(745, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(dtxf_id_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(JTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(dtxf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_catalogo_pacientes)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_catalogo_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtxf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dtxf_id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSeven6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Image newimg = img.getScaledInstance(146,176,java.awt.Image.SCALE_SMOOTH);
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

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
        Frm_add_empleado em2=new Frm_add_empleado(id,t);
        em2.setVisible(true);
        this.dispose();
}//GEN-LAST:event_buttonSeven2ActionPerformed

    private void buttonSeven6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven6ActionPerformed
        Frm_permisos per=new Frm_permisos(id,t);
        per.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSeven6ActionPerformed

    //Campo fecha 
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
        JTxtFecha.setText(Ano+"-" + Mes + "-"+ Dia); 
}//GEN-LAST:event_JDtChFechaDelOnCommit

private void JTxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtFechaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_JTxtFechaActionPerformed

private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu menu=new Frm_menu(id,t);
        menu.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed

private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        this.btn_anterior.setEnabled(false);
        this.btn_primero.setEnabled(false);
        this.btn_ultimo.setEnabled(false);
        this.btn_siguiente.setEnabled(false);
        this.dataLabel1.setText("");
        try{
            this.dataSource1.consulta("insert into empleados (nombre,apellido_p,apellido_m,f_nac,id_usuario,foto) values('"+this.dtxf_nombre.getText()+"','"+this.dtxf_apellido_p.getText()+"','"+this.dtxf_apellido_m.getText()+"','"+this.JTxtFecha.getText()+"','"+this.dtxf_id_usuario.getText()+"',null)");
            JOptionPane.showMessageDialog(this,"Empleado Agregado Correctamente","Confirmación",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,"No se pudo agregar al Empleado","Confirmación",JOptionPane.ERROR_MESSAGE);
        }
            this.JDtChFechaDel.setEnabled(false);
            this.JTxtFecha.setEnabled(false);
            this.dtxf_id_usuario.setEnabled(false);
            this.dtxf_apellido_m.setEnabled(false);
            this.dtxf_apellido_p.setEnabled(false);
            this.dtxf_nombre.setEnabled(false);
            this.buttonSeven2.setEnabled(false);
            this.buttonSeven6.setEnabled(false);
            
            this.dtxf_nombre.setText("");
            this.dtxf_apellido_p.setText("");
            this.dtxf_apellido_m.setText("");
            this.JTxtFecha.setText("");
            this.dtxf_id_usuario.setText("");
            this.btn_anterior.setEnabled(true);
            this.btn_primero.setEnabled(true);
            this.btn_ultimo.setEnabled(true);
            this.btn_siguiente.setEnabled(true);
            this.dataSource1.consulta();
        
}//GEN-LAST:event_buttonSeven3ActionPerformed

private void dtxf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_nombreKeyTyped
char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
if(letra==10)
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.dtxf_nombre.setEnabled(true);
          this.dtxf_apellido_p.setEnabled(true);
          this.dtxf_apellido_m.setEnabled(false);
          this.dtxf_id_usuario.setEnabled(false);
          this.JDtChFechaDel.setEnabled(false);
          this.JTxtFecha.setEnabled(false);
          this.dtxf_apellido_p.requestFocus();
      }
}//GEN-LAST:event_dtxf_nombreKeyTyped

private void dtxf_apellido_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_apellido_pKeyTyped
char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
if(letra==10)
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.dtxf_nombre.setEnabled(true);
          this.dtxf_apellido_p.setEnabled(true);
          this.dtxf_apellido_m.setEnabled(true);
          this.dtxf_id_usuario.setEnabled(false);
          this.JDtChFechaDel.setEnabled(false);
          this.JTxtFecha.setEnabled(false);
          this.dtxf_apellido_m.requestFocus();
      }
}//GEN-LAST:event_dtxf_apellido_pKeyTyped

private void dtxf_apellido_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_apellido_mKeyTyped
char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
if(letra==10)
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.dtxf_nombre.setEnabled(true);
          this.dtxf_apellido_p.setEnabled(true);
          this.dtxf_apellido_m.setEnabled(true);
          this.dtxf_id_usuario.setEnabled(true);
          this.JDtChFechaDel.setEnabled(true);
          this.JTxtFecha.setEnabled(false);
          this.JTxtFecha.requestFocus();
      }
}//GEN-LAST:event_dtxf_apellido_mKeyTyped

private void buttonSeven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven4ActionPerformed
                    this.JDtChFechaDel.setEnabled(false);
                    this.JTxtFecha.setEnabled(false);
                    this.dtxf_id_usuario.setEnabled(false);
                    this.dtxf_apellido_m.setEnabled(false);
                    this.dtxf_apellido_p.setEnabled(false);
                    this.dtxf_nombre.setEnabled(false);
                    this.buttonSeven3.setEnabled(false);
                    this.buttonSeven4.setEnabled(false);
                    this.buttonSeven2.setEnabled(true);
                    this.buttonSeven6.setEnabled(true);
                    this.dataSource1.consulta();
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
                new Frm_empleados(null,null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo JDtChFechaDel;
    private FuenteDeDatos.DataTextField JTxtFecha;
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private FuenteDeDatos.DataLabel dataLabel1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dtxf_apellido_m;
    private FuenteDeDatos.DataTextField dtxf_apellido_p;
    private FuenteDeDatos.DataTextField dtxf_id_usuario;
    private FuenteDeDatos.DataTextField dtxf_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblFoto;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    // End of variables declaration//GEN-END:variables
}
