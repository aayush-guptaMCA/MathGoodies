
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MY HP
 */
public class Frame13 extends javax.swing.JFrame {

    /**
     * Creates new form Frame13
     */
    public Frame13() {
        initComponents();
        setLocation(350,80);
        getContentPane().setBackground(Color.cyan);
        setSize(933,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setText("Rhombus Solver");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(66, 14, 398, 85);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(802, 48, 82, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\java programing\\rhombus.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 131, 474, 272);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("Diagonal p");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 130, 99, 39);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("Side s");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 130, 57, 39);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setText("Diagonal q");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(800, 130, 105, 39);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 270, 100, 40);

        t1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t1);
        t1.setBounds(520, 190, 97, 50);

        t2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t2);
        t2.setBounds(660, 190, 99, 50);

        t3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t3);
        t3.setBounds(800, 190, 100, 50);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 270, 120, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Parimeter");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 400, 80, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Area");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 340, 60, 40);

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t5);
        t5.setBounds(650, 400, 220, 40);

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t4);
        t4.setBounds(650, 340, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame7 f7=new Frame7();
        f7.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String s= t1.getText();
       double b=Double.parseDouble(s);
       String s1= t2.getText();
       double b1=Double.parseDouble(s1);
       String s2= t3.getText();
       double b2=Double.parseDouble(s2);
       double area,perimeter;
       area=(b1*b2)/2;
       perimeter =4*b;
       t4.setText(area+"");
       t5.setText(perimeter+"");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}