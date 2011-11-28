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
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wsdess
 */
public class Frm_citas extends javax.swing.JFrame {

    /** Creates new form Frm_citas */
    String id="";
    int t=0;
    String id_a="";
    public Frm_citas(String id_m,int tip) {
        initComponents();
        id=id_m;
        t=tip;
        this.JTxtFechaCitas.setEnabled(false);
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
        this.buttonSeven3.setEnabled(false);
        this.buttonSeven4.setEnabled(false);
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
        tbn_salir1 = new org.edisoncor.gui.button.ButtonSeven();
        dataSource2 = new FuenteDeDatos.DataSource();
        panel1 = new org.edisoncor.gui.panel.Panel();
        buttonSeven5 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven4 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
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
        dataLabel2 = new FuenteDeDatos.DataLabel();

        dataSource1.setCodigosql("select * from tbl_citas");
        dataSource1.setDb("sacm");
        dataSource1.setIp("localhost");
        dataSource1.setPassword("3mbl3ma");
        dataSource1.setUsuario("root");

        tbn_salir1.setBackground(new java.awt.Color(255, 0, 0));
        tbn_salir1.setText("X");
        tbn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salir1ActionPerformed(evt);
            }
        });

        dataSource2.setCodigosql("select * from tbl_citas");
        dataSource2.setDb("sacm");
        dataSource2.setIp("localhost");
        dataSource2.setPassword("3mbl3ma");
        dataSource2.setUsuario("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        setUndecorated(true);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        panel1.setLayout(null);

        buttonSeven5.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven5.setText("Eliminar");
        buttonSeven5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven5ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven5);
        buttonSeven5.setBounds(510, 230, 94, 35);

        buttonSeven4.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven4.setText("Cancelar");
        panel1.add(buttonSeven4);
        buttonSeven4.setBounds(510, 150, 95, 35);

        buttonSeven3.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven3.setText("Guardar");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven3);
        buttonSeven3.setBounds(510, 190, 94, 35);

        buttonSeven2.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven2.setText("Citar");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven2);
        buttonSeven2.setBounds(510, 110, 94, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel1.setForeground(new java.awt.Color(0, 57, 85));
        jLabel1.setText("Numero de cita:");
        panel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 140, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 57, 85));
        jLabel2.setText("Paciente:");
        panel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 63, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 57, 85));
        jLabel4.setText("Descripcion:");
        panel1.add(jLabel4);
        jLabel4.setBounds(10, 230, 90, 17);

        buttonSeven6.setBackground(new java.awt.Color(0, 57, 85));
        buttonSeven6.setText("Buscar");
        buttonSeven6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven6ActionPerformed(evt);
            }
        });
        panel1.add(buttonSeven6);
        buttonSeven6.setBounds(140, 120, 160, 30);

        dataLabel1.setText("Aqui aparece el No.Cita");
        dataLabel1.setCampo("id_cita");
        dataLabel1.setData(dataSource1);
        panel1.add(dataLabel1);
        dataLabel1.setBounds(160, 40, 280, 14);

        dataTextField1.setCampo("");
        dataTextField1.setData(dataSource1);
        dataTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTextField1ActionPerformed(evt);
            }
        });
        dataTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dataTextField1KeyTyped(evt);
            }
        });
        panel1.add(dataTextField1);
        dataTextField1.setBounds(100, 90, 230, 20);

        JTxtFechaCitas.setCampo("fecha");
        JTxtFechaCitas.setData(dataSource2);
        panel1.add(JTxtFechaCitas);
        JTxtFechaCitas.setBounds(100, 180, 148, 20);

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
        dataCombobox1.setData(dataSource2);
        panel1.add(dataCombobox1);
        dataCombobox1.setBounds(290, 180, 83, 20);

        JDtChFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaOnCommit(evt);
            }
        });
        panel1.add(JDtChFecha);
        JDtChFecha.setBounds(260, 180, 24, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel5.setForeground(new java.awt.Color(0, 57, 85));
        jLabel5.setText("Citas");
        panel1.add(jLabel5);
        jLabel5.setBounds(524, 11, 67, 29);

        dataTextField2.setCampo("descripcion");
        dataTextField2.setData(dataSource2);
        panel1.add(dataTextField2);
        dataTextField2.setBounds(100, 230, 230, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 57, 85));
        jLabel6.setText("Fecha:");
        panel1.add(jLabel6);
        jLabel6.setBounds(50, 180, 45, 17);

        dataLabel2.setForeground(new java.awt.Color(0, 57, 85));
        dataLabel2.setCampo("id_paciente");
        dataLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        panel1.add(dataLabel2);
        dataLabel2.setBounds(270, 120, 60, 30);

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

    private void buttonSeven5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_buttonSeven5ActionPerformed
        
    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
       this.buttonSeven2.setEnabled(false);
       this.buttonSeven3.setEnabled(true);
       this.buttonSeven4.setEnabled(true);
       this.buttonSeven5.setEnabled(false);  
}//GEN-LAST:event_buttonSeven2ActionPerformed

    private void tbn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salirActionPerformed
        Frm_menu men=new Frm_menu("",0);
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
        Frm_menu men=new Frm_menu(id,t);
        men.setVisible(true);
        this.dispose();
}//GEN-LAST:event_tbn_salir1ActionPerformed

private void dataTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTextField1ActionPerformed

    
}//GEN-LAST:event_dataTextField1ActionPerformed

private void dataTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTextField1KeyTyped
char letra=  evt.getKeyChar();
if(letra>='0' && letra<='9'||letra>='a' && letra<='Z' )
      {
          evt.consume();
      }
}//GEN-LAST:event_dataTextField1KeyTyped

private void buttonSeven6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven6ActionPerformed
        try{ 
            this.dataSource1.setCodigosql("select id_asignacion from tbl_medico_paciente where id_paciente="+Integer.parseInt(this.dataTextField1.getText())+";");
            this.dataSource1.consulta();
            id_a=this.dataSource1.rs.getString(1);
        } catch (Exception ex) {
            System.out.println("no pude hacer la consulta");
        }try{
            this.dataSource2.setCodigosql("select * tbl_citas where id_asignacion='"+id_a+"';");
            this.dataSource2.consulta();
            System.out.println(""+this.dataSource2.consulta().getRow());
        }catch(Exception e){
            System.out.println("algo paso");
        }
            
        
        this.buttonSeven2.setEnabled(true);
        this.buttonSeven3.setEnabled(false);
        this.buttonSeven4.setEnabled(false);
        this.buttonSeven5.setEnabled(true);
}//GEN-LAST:event_buttonSeven6ActionPerformed

private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
      try{
          this.dataSource1.consulta("insert into tbl_citas values('"+this.JTxtFechaCitas.getText()+"','"+(this.dataCombobox1.getSelectedItem()+":00")+"','"+this.dataTextField2.getText()+"','"+id_a+"');");
      }catch(Exception e){
          System.out.println("No pude registrar la cita");
      }
}//GEN-LAST:event_buttonSeven3ActionPerformed

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

            @Override
            public void run() {
                new Frm_citas(null,0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel F_cita;
    private datechooser.beans.DateChooserCombo JDtChFecha;
    private FuenteDeDatos.DataTextField JTxtFechaCitas;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven4;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven5;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven6;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private FuenteDeDatos.DataCombobox dataCombobox1;
    private FuenteDeDatos.DataLabel dataLabel1;
    private FuenteDeDatos.DataLabel dataLabel2;
    private FuenteDeDatos.DataSource dataSource1;
    private FuenteDeDatos.DataSource dataSource2;
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
