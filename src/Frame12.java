
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MY HP
 */
public class Frame12 extends javax.swing.JFrame {

    /**
     * Creates new form Frame12
     */
    public Frame12() {
        initComponents();
          setLocation(400,80);
        getContentPane().setBackground(Color.orange);
        setSize(766, 620);    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setText("Triangle Solver");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 369, 90);

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 30, 82, 43);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("Side A");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 110, 57, 39);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setText("Side C");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 110, 57, 39);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel6.setText("Side B");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 110, 57, 39);

        t1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t1);
        t1.setBounds(390, 160, 90, 44);

        t2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t2);
        t2.setBounds(500, 160, 90, 44);

        t3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t3);
        t3.setBounds(620, 160, 90, 44);

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t5);
        t5.setBounds(470, 240, 250, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 240, 50, 40);

        t6.setEditable(false);
        t6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t6);
        t6.setBounds(470, 310, 250, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel7.setText("Area");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 310, 50, 40);

        t7.setEditable(false);
        t7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(t7);
        t7.setBounds(470, 370, 250, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel8.setText("Perimeter");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 370, 100, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 450, 120, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 450, 120, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\java programing\\triangle1.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 110, 320, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame7 f7=new Frame7();
        f7.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String s1= t1.getText();
       String s2= t2.getText();
       String s3= t3.getText();
       double a =Double.parseDouble(s1);
       double b =Double.parseDouble(s2);
       double c =Double.parseDouble(s3);
     
       
    try{
       if (a != b & b!=c & c !=a)
       {
       
           double s =(a + b + c)/2;
           double area1= (s*(s-a)*(s-b)*(s-c));
          double area=Math.sqrt(area1);
           t6.setText(area+"");
           double perimeter =a +b+c;
           t7.setText(perimeter +"");
           t5.setText(" Scalene Triangle");
       }
        if(a ==b  & b ==c )
       {
           double area=(1.73*a*b)/4;
           t6.setText(area+"");
           double perimeter=a +b+c;
           t7.setText(perimeter+"");
           t5.setText(" Equilateral Triangle");
       }
        if (a==c  & a!=b & c!=b)
       {
           double cal = (4*a*a)-(b*b); 
               double cal1=Math.sqrt(cal);
               double cal2=(b*cal1)/4;
               t6.setText(cal2+"");
               double peri=(2*a)+b;
               t7.setText(peri+"");
               t5.setText(" Isosceles triangle ");
               
       }
       // if (a<c &b<c)
            if (a*a+b*b==c *c)
        {
            double area =(a*b)/2;
            double peri=a+b+c;
               t6.setText(area+"");
               t7.setText(peri+"");
               t5.setText("Right Angle Triangle");
        }
         else
           {
              //   JOptionPane.showMessageDialog(null, "  Oops....Triangle Not found .");
                     t5.setText("Triangle not found ");
           }    
       
    } catch(Exception ee)
    {
         JOptionPane.showMessageDialog(null, " Please check your value " );
    }
     
       
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame12().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}