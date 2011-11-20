/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frm_citas.java
 *
 * Created on 29/10/2011, 12:25:29 PM
 */
package Sourse;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;

/**
 *
 * @author wsdess
 */
public class Frm_citas extends javax.swing.JFrame {

    /** Creates new form Frm_citas */
    public Frm_citas() {
        initComponents();
        //Con este aparece la fecha 
         Calendar cal=Calendar.getInstance(); 
         String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
         this.F_cita.setText(fecha);
        // this.setSize(600,300);
        //this.panel1.setSize(600,300);
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

        dataSource1 = new FuenteDeDatos.DataSource();
        tbn_salir1 = new org.edisoncor.gui.button.ButtonSeven();
        panel1 = new org.edisoncor.gui.panel.Panel();
        btn_siguiente = new org.edisoncor.gui.button.ButtonSeven();
        btn_anterior = new org.edisoncor.gui.button.ButtonSeven();
        btn_ultimo = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        btn_primero = new org.edisoncor.gui.button.ButtonSeven();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSeven6 = new org.edisoncor.gui.button.ButtonSeven();
        dataLabel1 = new FuenteDeDatos.DataLabel();
        dataTextField1 = new FuenteDeDatos.DataTextField();
        JTxtFechaCitas = new FuenteDeDatos.DataTextField();
        tbn_salir = new org.edisoncor.gui.button.ButtonSeven();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        F_cita = new javax.swing.JLabel();
        dataCombobox1 = new FuenteDeDatos.DataCombobox();
        JDtChFecha = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        dataTextField2 = new FuenteDeDatos.DataTextField();
        jLabel6 = new javax.swing.JLabel();

        tbn_salir1.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir1.setText("X");
        tbn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(null);

        btn_siguiente.setBackground(new java.awt.Color(0, 57, 85));
        btn_siguiente.setText(">");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        panel1.add(btn_siguiente);
        btn_siguiente.setBounds(510, 150, 43, 35);

        btn_anterior.setBackground(new java.awt.Color(0, 57, 85));
        btn_anterior.setText("<");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });
        panel1.add(btn_anterior);
        btn_anterior.setBounds(460, 150, 44, 35);

        btn_ultimo.setBackground(new java.awt.Color(0, 57, 85));
        btn_ultimo.setText(">>");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });
        panel1.add(btn_ultimo);
        btn_ultimo.setBounds(560, 150, 62, 35);

        buttonSeven5.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven5.setText("Eliminar");
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven5);
        buttonSeven5.setBounds(410, 230, 94, 35);

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        panel1.add(buttonSeven4);
        buttonSeven4.setBounds(510, 190, 95, 35);

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        panel1.add(buttonSeven3);
        buttonSeven3.setBounds(510, 230, 94, 35);

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Ingresar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven2);
        buttonSeven2.setBounds(410, 190, 94, 35);

        btn_primero.setBackground(new java.awt.Color(0, 57, 85));
        btn_primero.setText("<<");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });
        panel1.add(btn_primero);
        btn_primero.setBounds(390, 150, 60, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Numero de cita:");
        panel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 140, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Paciente:");
        panel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 64, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Descripcion:");
        panel1.add(jLabel4);
        jLabel4.setBounds(10, 230, 90, 17);

        buttonSeven6.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven6.setText("Buscar");
        panel1.add(buttonSeven6);
        buttonSeven6.setBounds(110, 127, 198, 30);

        dataLabel1.setText("Aqui aparece el No.Cita");
        dataLabel1.setCampo("id_cita");
        dataLabel1.setData(dataSource1);
        panel1.add(dataLabel1);
        dataLabel1.setBounds(160, 40, 280, 16);

        dataTextField1.setCampo("id_paciente");
        dataTextField1.setData(dataSource1);
        panel1.add(dataTextField1);
        dataTextField1.setBounds(100, 90, 230, 28);

        JTxtFechaCitas.setCampo("fecha");
        JTxtFechaCitas.setData(dataSource1);
        panel1.add(JTxtFechaCitas);
        JTxtFechaCitas.setBounds(100, 180, 148, 28);

        tbn_salir.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir.setText("X");
        tbn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salirActionPerformed(evt);
            }
        });
        panel1.add(tbn_salir);
        tbn_salir.setBounds(0, 0, 30, 20);

        clockDigital1.setForeground(new java.awt.Color(0, 102, 102));
        panel1.add(clockDigital1);
        clockDigital1.setBounds(490, 40, 107, 49);

        F_cita.setFont(new java.awt.Font("Tahoma", 1, 14));
        F_cita.setForeground(new java.awt.Color(0, 57, 85));
        F_cita.setText("00/00/00");
        panel1.add(F_cita);
        F_cita.setBounds(510, 70, 110, 17);

        dataCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00" }));
        dataCombobox1.setCampo("hora");
        dataCombobox1.setData(dataSource1);
        panel1.add(dataCombobox1);
        dataCombobox1.setBounds(290, 180, 83, 27);

        JDtChFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaOnCommit(evt);
            }
        });
        panel1.add(JDtChFecha);
        JDtChFecha.setBounds(260, 180, 24, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Citas");
        panel1.add(jLabel5);
        jLabel5.setBounds(524, 11, 67, 29);
        panel1.add(dataTextField2);
        dataTextField2.setBounds(100, 230, 230, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 57, 85));
        jLabel6.setText("Fecha:");
        panel1.add(jLabel6);
        jLabel6.setBounds(50, 180, 45, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        this.dataSource1.siguiente();
}//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dataSource1.anterior();
}//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        this.dataSource1.ultimo();
}//GEN-LAST:event_btn_ultimoActionPerformed

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_buttonSeven5ActionPerformed

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed

}//GEN-LAST:event_buttonSeven2ActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        this.dataSource1.primero();
}//GEN-LAST:event_btn_primeroActionPerformed

    private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu men=new Frm_menu();
        men.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salirActionPerformed
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
        JTxtFechaCitas.setText(Dia+"-" + Mes + "-"+ Ano);
}//GEN-LAST:event_JDtChFechaOnCommit

private void tbn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salir1ActionPerformed
        Frm_log_in log=new Frm_log_in();
        log.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir1ActionPerformed

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
                new Frm_citas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel F_cita;
    private datechooser.beans.DateChooserCombo JDtChFecha;
    private FuenteDeDatos.DataTextField JTxtFechaCitas;
    private org.edisoncor.gui.button.ButtonSeven btn_anterior;
    private org.edisoncor.gui.button.ButtonSeven btn_primero;
    private org.edisoncor.gui.button.ButtonSeven btn_siguiente;
    private org.edisoncor.gui.button.ButtonSeven btn_ultimo;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private FuenteDeDatos.DataCombobox dataCombobox1;
    private FuenteDeDatos.DataLabel dataLabel1;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataTextField dataTextField1;
    private FuenteDeDatos.DataTextField dataTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir;
    private org.edisoncor.gui.button.ButtonSeven tbn_salir1;
    // End of variables declaration//GEN-END:variables
}
