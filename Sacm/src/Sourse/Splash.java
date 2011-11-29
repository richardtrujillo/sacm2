package Sourse;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;

public class Splash extends javax.swing.JFrame implements ActionListener{
    private Timer timer;
    Frm_log_in main;
    int i=0;
    
    public Splash()
    {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/SACM_SPLASH.png")); setIconImage(icon);
    
        timer = new Timer(100,new ActionListener()
        {
            public void actionPerformed(ActionEvent o)
            {
                //contador
                i+=1;
                //al progresbar se le pasa como parametro el contador
                pBar.setValue(i);
                //cuando llega a 100 pone un stop
                cek();
            }
        });
        timer.start();
    }
    //metodo para hacer que haga un stop antes de llegar a 100
    public void cek(){
        if(pBar.getPercentComplete()==1.0){
            timer.stop();            
            main = new Frm_log_in();
            main.show();
            //main.login();
            this.dispose();
        }        
    }       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new org.edisoncor.gui.panel.Panel();

        setTitle("CARGANDO...");
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pBar.setForeground(new java.awt.Color(102, 189, 255));
        pBar.setDoubleBuffered(true);
        pBar.setStringPainted(true);
        getContentPane().add(pBar);
        pBar.setBounds(0, 290, 410, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SACM_SPLASH.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 290);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 153));
        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 410, 310);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-410)/2, (screenSize.height-310)/2, 410, 310);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            Splash a;
            public void run() {
                a = new Splash();
                a.setVisible(true);
            }
        });
    }
  


    public void actionPerformed(ActionEvent e) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pBar;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
