
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xyz
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
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
        tfdbname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdauthor = new javax.swing.JTextField();
        tfdbno = new javax.swing.JTextField();
        tfddate = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tfbno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("C:\\Users\\xyz\\Desktop\\index.jpg").getImage());
        setPreferredSize(new java.awt.Dimension(590, 410));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel1.setText("BOOK NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 170, 129, 29);
        getContentPane().add(tfdbname);
        tfdbname.setBounds(270, 160, 260, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER BOOK NUMBER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 324, 40);

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel3.setText("AUTHOR NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 130, 20);

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel4.setText("BOOK NO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 270, 100, 20);

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel5.setText("PUBLISHED DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 314, 190, 20);
        getContentPane().add(tfdauthor);
        tfdauthor.setBounds(270, 210, 133, 30);
        getContentPane().add(tfdbno);
        tfdbno.setBounds(270, 260, 130, 30);
        getContentPane().add(tfddate);
        tfddate.setBounds(270, 310, 130, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 137, 620, 9);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("BOOK NO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 70, 130, 20);
        getContentPane().add(tfbno);
        tfbno.setBounds(270, 70, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 110, 100, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 260, 80, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(450, 310, 70, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 210, 80, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libw.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -10, 590, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int a = Integer.parseInt(tfbno.getText());
         String query = "Select* from data where book_no = '"+a+"';";
               try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root" , "1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()){
                String n = rs.getString("book_no");
                String n1 = rs.getString("book_name");
                String n2 = rs.getString("author");
                String n3 = rs.getString("published_date");

                tfdbno.setText(n);
                tfdbname.setText(n1);
                tfdauthor.setText(n2);
                tfddate.setText(n3);
            }
            else{
                            JOptionPane.showMessageDialog(this , "check the book number you have entered");

            }           
        }catch (Exception e){
            JOptionPane.showMessageDialog(this , e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
        FRAM_2 obj1 = new FRAM_2();
obj1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
tfbno.setText("");
tfdbname.setText("");   
tfdauthor.setText("");   
tfdbno.setText("");   
tfddate.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfbno;
    private javax.swing.JTextField tfdauthor;
    private javax.swing.JTextField tfdbname;
    private javax.swing.JTextField tfdbno;
    private javax.swing.JTextField tfddate;
    // End of variables declaration//GEN-END:variables
}
