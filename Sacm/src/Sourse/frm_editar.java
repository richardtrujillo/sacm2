/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frm_editar.java
 *
 * Created on 29/11/2011, 11:05:59 AM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author wsdess
 */
public class frm_editar extends javax.swing.JFrame {

    /** Creates new form frm_editar */
    public frm_editar() {
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
        this.dataSource1.consulta();
        this.dtxf_nombre.setEnabled(false);
        this.dtxf_nombre1.setEnabled(false); 
        this.buttonSeven3.setEnabled(false);
        this.buttonSeven4.setEnabled(true);
        this.buttonSeven5.setEnabled(false);
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
        dataSource2 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Lbl_catalogo_pacientes = new javax.swing.JLabel();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dataLabel1 = new FuenteDeDatos.DataLabel();
        dataLabel2 = new FuenteDeDatos.DataLabel();
        dtxf_nombre = new FuenteDeDatos.DataTextField();
        dtxf_nombre1 = new FuenteDeDatos.DataTextField();
        btn_primero = new org.edisoncor.gui.button.ButtonSeven();
        btn_anterior = new org.edisoncor.gui.button.ButtonSeven();
        btn_siguiente = new org.edisoncor.gui.button.ButtonSeven();
        btn_ultimo = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        tbn_salir5 = new org.edisoncor.gui.button.ButtonSeven();

        dataSource1.setCodigosql("select * from tbl_medico_paciente");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("");
        dataSource1.setUsuario("root");

        dataSource2.setCodigosql("select * from tbl_medico_paciente");
        dataSource2.setDb("sacm");
        dataSource2.setIp("localhost");
        dataSource2.setPassword("");
        dataSource2.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_catalogo_pacientes.setFont(new java.awt.Font("Tahoma", 1, 24));
        Lbl_catalogo_pacientes.setForeground(new java.awt.Color(0, 57, 85));
        Lbl_catalogo_pacientes.setText("Ingresar nuevo usuario");
        panel1.add(Lbl_catalogo_pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 43));

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Modificar");
        buttonSeven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven4ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 85, -1));

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 81, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("id_asignacion");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 57, 85));
        jLabel7.setText("Id_paciente:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 57, 85));
        jLabel8.setText("id_medico_temporal:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 57, 85));
        jLabel9.setText("id_medico:");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 25));

        dataLabel1.setCampo("id_paciente");
        dataLabel1.setData(dataSource1);
        dataLabel1.setFont(new java.awt.Font("Tahoma", 3, 12));
        panel1.add(dataLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 20));

        dataLabel2.setCampo("id_asignacion");
        dataLabel2.setData(dataSource1);
        dataLabel2.setFont(new java.awt.Font("Tahoma", 3, 12));
        panel1.add(dataLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, 20));

        dtxf_nombre.setCampo("id_empleado_temporal");
        dtxf_nombre.setData(dataSource1);
        dtxf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_nombreKeyTyped(evt);
            }
        });
        panel1.add(dtxf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, -1));

        dtxf_nombre1.setCampo("id_empleado");
        dtxf_nombre1.setData(dataSource1);
        dtxf_nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtxf_nombre1KeyTyped(evt);
            }
        });
        panel1.add(dtxf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 190, -1));

        btn_primero.setBackground(new java.awt.Color(0, 57, 85));
        btn_primero.setText("<<");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });
        panel1.add(btn_primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 40, -1));

        btn_anterior.setBackground(new java.awt.Color(0, 57, 85));
        btn_anterior.setText("<");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });
        panel1.add(btn_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 40, -1));

        btn_siguiente.setBackground(new java.awt.Color(0, 57, 85));
        btn_siguiente.setText(">");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        panel1.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 40, -1));

        btn_ultimo.setBackground(new java.awt.Color(0, 57, 85));
        btn_ultimo.setText(">>");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });
        panel1.add(btn_ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 40, -1));

        buttonSeven5.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven5.setText("Cancelar");
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 85, -1));

        tbn_salir5.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir5.setText("X");
        tbn_salir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir5ActionPerformed(evt);
            }
        });
        panel1.add(tbn_salir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven4ActionPerformed
        this.dtxf_nombre.setEnabled(true);
        this.dtxf_nombre1.setEnabled(true);
        this.buttonSeven3.setEnabled(true);
        this.buttonSeven4.setEnabled(true);
        this.buttonSeven5.setEnabled(true);
}//GEN-LAST:event_buttonSeven4ActionPerformed

    private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        try{
            this.dataSource1.consulta("UPDATE tbl_medico_paciente SET id_empleado = "+this.dtxf_nombre1.getText()+" WHERE id_asignacion = '"+this.dataLabel2.getText()+"';");
            this.dataSource2.consulta("UPDATE tbl_medico_paciente SET id_empleado_temporal = "+this.dtxf_nombre.getText()+" WHERE id_asignacion = '"+this.dataLabel2.getText()+"';");
            JOptionPane.showMessageDialog(this,"Asignacion modificada","Confirmación",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No se pudo modificar","Confirmación",JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
}//GEN-LAST:event_buttonSeven3ActionPerformed

    private void dtxf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_nombreKeyTyped
        
}//GEN-LAST:event_dtxf_nombreKeyTyped

    private void dtxf_nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtxf_nombre1KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_dtxf_nombre1KeyTyped

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        this.dataSource1.primero();
}//GEN-LAST:event_btn_primeroActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dataSource1.anterior();
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        this.dataSource1.siguiente();
}//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        this.dataSource1.ultimo();
}//GEN-LAST:event_btn_ultimoActionPerformed

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_buttonSeven5ActionPerformed

    private void tbn_salir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir5ActionPerformed
        this.dispose();
}//GEN-LAST:event_tbn_salir5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frm_editar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_catalogo_pacientes;
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private FuenteDeDatos.DataLabel dataLabel1;
    private FuenteDeDatos.DataLabel dataLabel2;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataSource dataSource2;
    private FuenteDeDatos.DataTextField dtxf_nombre;
    private FuenteDeDatos.DataTextField dtxf_nombre1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir5;
    // End of variables declaration//GEN-END:variables
}
