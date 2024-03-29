/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_pacientes.java
 *
 * Created on 20/10/2011, 12:19:55 PM
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
public class Frm_pacientes extends javax.swing.JFrame {

    /** Creates new form Frm_pacientes */
    String id=" ";
    int t=0;
    public Frm_pacientes(String id_empleado,int tipo) {
        initComponents();
        id=id_empleado;
        t=tipo;
        //medidas oficiales de los catalogos
        this.setSize(752,393);
        this.panel1.setSize(752,393);
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
        this.dtxf_nombre.setDocument(new DataTextFieldLimit(20));
        this.dtxf_apellido_p.setDocument(new DataTextFieldLimit(20));
        this.dtxf_apellido_m.setDocument(new DataTextFieldLimit(20));
        this.dmtxf_telefono.setDocument(new DataTextFieldLimit(10));
        this.buttonSeven3.setEnabled(false);
        this.buttonSeven4.setEnabled(false);
        desactivar();
        
        if(t==2){
        try{
            System.out.println("id empleado:"+id_empleado);
            this.dataSource1.setCodigosql("select * from tbl_pacientes where id_paciente = any(select id_paciente from tbl_medico_paciente where id_empleado="+id_empleado+" or id_empleado_temporal="+id_empleado+");");
            this.dataSource1.consulta();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Conexion a la base de datos no establecida","Conexion",JOptionPane.ERROR_MESSAGE); 
        }}
        else{
        try{
            System.out.println("id empleado:"+id_empleado);
            this.dataSource1.setCodigosql("select * from tbl_pacientes;");;
            this.dataSource1.consulta();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Conexion a la base de datos no establecida","Conexion",JOptionPane.ERROR_MESSAGE); 
        }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataSource1 = new FuenteDeDatos.DataSource();
        dataSource2 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dtxf_nombre = new FuenteDeDatos.DataTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dtxf_direccion = new FuenteDeDatos.DataTextField();
        dtxf_apellido_m = new FuenteDeDatos.DataTextField();
        dtxf_apellido_p = new FuenteDeDatos.DataTextField();
        dcbx_sexo = new FuenteDeDatos.DataCombobox();
        JTxtFechaPacientes = new FuenteDeDatos.DataMaskedTextField();
        dmtxf_telefono = new FuenteDeDatos.DataMaskedTextField();
        jLabel8 = new javax.swing.JLabel();
        dtx_email = new FuenteDeDatos.DataTextField();
        jLabel9 = new javax.swing.JLabel();
        dtxf_ciudad = new FuenteDeDatos.DataTextField();
        jLblFoto = new javax.swing.JLabel();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        btn_ultimo = new org.edisoncor.gui.button.ButtonSeven();
        btn_siguiente = new org.edisoncor.gui.button.ButtonSeven();
        btn_anterior = new org.edisoncor.gui.button.ButtonSeven();
        btn_primero = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        JDtChFecha = new datechooser.beans.DateChooserCombo();
        lbl_id_pac = new FuenteDeDatos.DataLabel();
        dataCheckBox1 = new FuenteDeDatos.DataCheckBox();
        tbn_salir1 = new org.edisoncor.gui.button.ButtonSeven();
        lbl_id_pc = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        dataSource1.setCodigosql("select * from tbl_pacientes");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        dataSource2.setCodigosql("select * tbl_medico_paciente");
        dataSource2.setDb("sacm");
        dataSource2.setIp("localhost");
        dataSource2.setPassword("");
        dataSource2.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setForeground(new java.awt.Color(0, 57, 85));
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Catalogo de Pacientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Nombre:");

        dtxf_nombre.setCampo("Nombre");
        dtxf_nombre.setData(dataSource1);
        dtxf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_nombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Apellido_P:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 57, 85));
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Apellido_M:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Fecha Nacimiento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 57, 85));
        jLabel6.setText("Sexo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 57, 85));
        jLabel7.setText("Telefono:");

        dtxf_direccion.setCampo("Direccion");
        dtxf_direccion.setData(dataSource1);
        dtxf_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_direccionKeyTyped(evt);
            }
        });

        dtxf_apellido_m.setCampo("Apellido_M");
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

        dcbx_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "M", "F" }));
        dcbx_sexo.setCampo("Sexo");
        dcbx_sexo.setData(dataSource1);

        JTxtFechaPacientes.setCampo("F_nac");
        JTxtFechaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JTxtFechaPacientes.setData(dataSource1);

        dmtxf_telefono.setCampo("Telefono");
        dmtxf_telefono.setData(dataSource1);
        dmtxf_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dmtxf_telefonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 57, 85));
        jLabel8.setText("E-mail:");

        dtx_email.setCampo("Email");
        dtx_email.setData(dataSource1);
        dtx_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtx_emailKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 57, 85));
        jLabel9.setText("Ciudad:");

        dtxf_ciudad.setCampo("Ciudad");
        dtxf_ciudad.setData(dataSource1);
        dtxf_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_ciudadKeyTyped(evt);
            }
        });

        jLblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        btn_primero.setBackground(new java.awt.Color(0, 57, 85));
        btn_primero.setText("<<");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Ingresar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        buttonSeven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven4ActionPerformed(evt);
            }
        });

        JDtChFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaOnCommit(evt);
            }
        });

        lbl_id_pac.setForeground(new java.awt.Color(0, 57, 85));
        lbl_id_pac.setCampo("id_paciente");
        lbl_id_pac.setData(dataSource1);
        lbl_id_pac.setFont(new java.awt.Font("Tahoma", 1, 14));

        dataCheckBox1.setForeground(new java.awt.Color(0, 57, 85));
        dataCheckBox1.setCampo("Estatus");
        dataCheckBox1.setData(dataSource1);
        dataCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 15));

        tbn_salir1.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir1.setText("X");
        tbn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir1ActionPerformed(evt);
            }
        });

        lbl_id_pc.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbl_id_pc.setForeground(new java.awt.Color(0, 57, 85));
        lbl_id_pc.setText("ID_Paciente:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 57, 85));
        jLabel11.setText("Estatus:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(lbl_id_pc)
                                    .addGap(3, 3, 3))
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addComponent(tbn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtxf_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(JTxtFechaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JDtChFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_id_pac, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dcbx_sexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtxf_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dmtxf_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtx_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtxf_ciudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(dataCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(Lbl_catalogo_pacientes)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(tbn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(lbl_id_pc))
                            .addComponent(lbl_id_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dtxf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtxf_apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtxf_apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JDtChFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTxtFechaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(dcbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dtxf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dmtxf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtx_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(dtxf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(dataCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Lbl_catalogo_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        this.dataSource1.siguiente();
}//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dataSource1.anterior();
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        this.dataSource1.primero();
}//GEN-LAST:event_btn_primeroActionPerformed

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
        desactivar();
        this.dtxf_nombre.setEnabled(true);
        this.dtxf_nombre.requestFocus();
        limpiarcampos();
        this.buttonSeven3.setEnabled(true);
        this.buttonSeven2.setEnabled(false);
        this.buttonSeven4.setEnabled(true);
    }//GEN-LAST:event_buttonSeven2ActionPerformed
        //Campo fecha
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

private void tbn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir1ActionPerformed
        Frm_menu log=new Frm_menu(id,t);
        log.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir1ActionPerformed

private void dtxf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_nombreKeyTyped
   
   char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
if(letra==10){ desactivar();
this.dtxf_apellido_p.setEnabled(true);
        this.dtxf_nombre.setEnabled(true);
        this.dtxf_apellido_p.requestFocus();
          evt.consume();
      }
}//GEN-LAST:event_dtxf_nombreKeyTyped

private void dtxf_apellido_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_apellido_pKeyTyped
   
      char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'|| (letra>='a' && letra<='Z') )
      {
          evt.consume();
      }
if(letra==10){ desactivar();
        this.dtxf_apellido_m.setEnabled(true);
        this.dtxf_apellido_p.setEnabled(true);
        this.dtxf_nombre.setEnabled(true); 
        this.dtxf_apellido_m.requestFocus();
          evt.consume();
      }     
}//GEN-LAST:event_dtxf_apellido_pKeyTyped

private void dtxf_apellido_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_apellido_mKeyTyped
   char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
if(letra==10)
      {activar();
this.JTxtFechaPacientes.setEnabled(false);
          evt.consume();}
}//GEN-LAST:event_dtxf_apellido_mKeyTyped

private void dtxf_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_direccionKeyTyped
char letra=  evt.getKeyChar();
if(letra==10)
      {evt.consume();}
      if(letra==10)
      {
    this.dmtxf_telefono.requestFocus();
      }
}//GEN-LAST:event_dtxf_direccionKeyTyped

private void dmtxf_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dmtxf_telefonoKeyTyped
    char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.dtx_email.requestFocus();
      }
}//GEN-LAST:event_dmtxf_telefonoKeyTyped

private void dtxf_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_ciudadKeyTyped
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
          
      }
}//GEN-LAST:event_dtxf_ciudadKeyTyped

private void dtx_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtx_emailKeyTyped
char letra=  evt.getKeyChar();
if(letra==10)
      {
          evt.consume();
      }
      if(letra==10)
      {
    this.dtxf_ciudad.requestFocus();
    }
}//GEN-LAST:event_dtx_emailKeyTyped

private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        this.btn_anterior.setEnabled(false);
        this.btn_primero.setEnabled(false);
        this.btn_ultimo.setEnabled(false);
        this.btn_siguiente.setEnabled(false);
        boolean selected = this.dataCheckBox1.isSelected();
        int status=0;
        if(selected==true)status=1;
        else status=0;
        try{
            this.dataSource1.consulta("insert into tbl_pacientes (nombre,apellido_p,apellido_m,f_nac,sexo,direccion,telefono,email,ciudad,estatus) values('"+this.dtxf_nombre.getText()+"','"+this.dtxf_apellido_p.getText()+"','"+this.dtxf_apellido_m.getText()+"','"+this.JTxtFechaPacientes.getText()+"','"+this.dcbx_sexo.getSelectedItem()+"','"+this.dtxf_direccion.getText()+"',"+Integer.parseInt(this.dmtxf_telefono.getText())+",'"+this.dtx_email.getText()+"','"+this.dtxf_ciudad.getText()+"',"+status+");");
            JOptionPane.showMessageDialog(this,"Paciente agregado correctamente","Validacion Campos",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No se pudo agregar al paciente","Confirmación",JOptionPane.ERROR_MESSAGE); 
        } 
        try{
            this.dataSource2.setCodigosql("select max(id_paciente) from tbl_pacientes");
            this.dataSource2.consulta();            
            this.dataSource2.consulta("insert into tbl_medico_paciente(id_asignacion,id_paciente,id_empleado,id_empleado_temporal) values('"+(this.dataSource2.rs.getInt(1)+"-"+id)+"',"+this.dataSource2.rs.getInt(1)+","+id+","+id+");");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No se pudo agregar la dependencia medico-paciente","Confirmación",JOptionPane.ERROR_MESSAGE);
        }
         desactivar();
         this.btn_anterior.setEnabled(true);
         this.btn_primero.setEnabled(true);
         this.btn_ultimo.setEnabled(true);
         this.btn_siguiente.setEnabled(true);
         this.dtxf_nombre.setEnabled(false);
         this.buttonSeven3.setEnabled(false);
         this.buttonSeven4.setEnabled(false);
         this.buttonSeven2.setEnabled(true);
         this.dataSource2.consultaSN("select * from tbl_pacientes");
}//GEN-LAST:event_buttonSeven3ActionPerformed

private void buttonSeven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven4ActionPerformed
    limpiarcampos();
    desactivar();
    this.dataSource1.consulta();
    this.buttonSeven3.setEnabled(false);
    this.buttonSeven4.setEnabled(false);
}//GEN-LAST:event_buttonSeven4ActionPerformed
    public void limpiarcampos(){
        this.lbl_id_pac.setText(" ");
        this.dcbx_sexo.setSelectedIndex(0);
        this.JTxtFechaPacientes.setText(" ");
        this.dmtxf_telefono.setText(" ");
        this.dtx_email.setText(" ");
        this.dtxf_apellido_m.setText(" ");
        this.dtxf_apellido_p.setText(" ");
        this.dtxf_ciudad.setText(" ");
        this.dtxf_direccion.setText(" ");
        this.dtxf_nombre.setText(" ");
    }
    public void activar(){
         this.dcbx_sexo.setEnabled(true);
        this.JTxtFechaPacientes.setEnabled(true);
        this.dmtxf_telefono.setEnabled(true);
        this.dtx_email.setEnabled(true);
        this.dtxf_apellido_m.setEnabled(true);
        this.dtxf_apellido_p.setEnabled(true);
        this.dtxf_ciudad.setEnabled(true);
        this.dtxf_direccion.setEnabled(true);
        this.dtxf_nombre.setEnabled(true);
        this.JDtChFecha.setEnabled(true);
        this.JDtChFecha.requestFocus();
    }
    public void desactivar(){
        this.dcbx_sexo.setEnabled(false);
        this.JTxtFechaPacientes.setEnabled(false);
        this.dmtxf_telefono.setEnabled(false);
        this.dtx_email.setEnabled(false);
        this.dtxf_apellido_m.setEnabled(false);
        this.dtxf_apellido_p.setEnabled(false);
        this.dtxf_ciudad.setEnabled(false);
        this.dtxf_direccion.setEnabled(false);
        this.dtxf_nombre.setEnabled(false);
        this.JDtChFecha.setEnabled(false);
        this.dtxf_apellido_m.requestFocus();
    }
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
                new Frm_pacientes(null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo JDtChFecha;
    private FuenteDeDatos.DataMaskedTextField JTxtFechaPacientes;
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private FuenteDeDatos.DataCheckBox dataCheckBox1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataSource dataSource2;
    private FuenteDeDatos.DataCombobox dcbx_sexo;
    private FuenteDeDatos.DataMaskedTextField dmtxf_telefono;
    private FuenteDeDatos.DataTextField dtx_email;
    private FuenteDeDatos.DataTextField dtxf_apellido_m;
    private FuenteDeDatos.DataTextField dtxf_apellido_p;
    private FuenteDeDatos.DataTextField dtxf_ciudad;
    private FuenteDeDatos.DataTextField dtxf_direccion;
    private FuenteDeDatos.DataTextField dtxf_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblFoto;
    private FuenteDeDatos.DataLabel lbl_id_pac;
    private javax.swing.JLabel lbl_id_pc;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir1;
    // End of variables declaration//GEN-END:variables
}
