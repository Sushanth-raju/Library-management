/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xyz
 */ import javax.swing.JOptionPane;
public class FRAM_2 extends javax.swing.JFrame {

    /**
     * Creates new form FRAM_2
     */
    public FRAM_2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        radsearch = new javax.swing.JRadioButton();
        add = new javax.swing.JRadioButton();
        delete = new javax.swing.JRadioButton();
        update = new javax.swing.JRadioButton();
        fine = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(547, 300));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHOOSE AN OPTION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 180, 30);

        radsearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radsearch);
        radsearch.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        radsearch.setForeground(new java.awt.Color(255, 255, 255));
        radsearch.setText("SEARCH");
        radsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radsearchActionPerformed(evt);
            }
        });
        getContentPane().add(radsearch);
        radsearch.setBounds(40, 60, 90, 23);

        add.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(add);
        add.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD RECORD");
        getContentPane().add(add);
        add.setBounds(40, 90, 130, 23);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(delete);
        delete.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE  RECORD");
        getContentPane().add(delete);
        delete.setBounds(40, 120, 150, 23);

        update.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(update);
        update.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE RECORD");
        getContentPane().add(update);
        update.setBounds(40, 150, 190, 23);

        fine.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(fine);
        fine.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        fine.setForeground(new java.awt.Color(255, 255, 255));
        fine.setText("CHECK FINE");
        fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineActionPerformed(evt);
            }
        });
        getContentPane().add(fine);
        fine.setBounds(40, 180, 150, 23);

        jButton7.setBackground(new java.awt.Color(255, 204, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("PROCEED");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(380, 100, 100, 60);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(120, 230, 73, 23);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(260, 230, 60, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 550, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
if(radsearch.isSelected()== false && add.isSelected()== false && delete.isSelected()== false && update.isSelected()== false && fine.isSelected()== false )
JOptionPane.showMessageDialog(null, " Please make a Selection.");
else{
  if(radsearch.isSelected()== true)      {
      search s1 = new search();
        s1.setVisible(true);
        this.dispose();
        }
  if(add.isSelected() == true)
  {addframe a1 = new addframe();
  a1.setVisible(true);
  this.dispose();
  }
  if(delete.isSelected()== true)
  { Deleteframe d1 = new Deleteframe();
  d1.setVisible(true);
  this.dispose();
  }
  if(update.isSelected()== true)
  {this.dispose();
      Updateframe u = new Updateframe();
  u.setVisible(true);
  }
   if(fine.isSelected()== true)
  {this.dispose();
      CheckFine s1 = new CheckFine();
  s1.setVisible(true);
      
  
        }}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void radsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radsearchActionPerformed
       
     
  
    }//GEN-LAST:event_radsearchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     welcome_page w = new welcome_page();
     w.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

    private void fineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineActionPerformed
   
    }//GEN-LAST:event_fineActionPerformed

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
            java.util.logging.Logger.getLogger(FRAM_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRAM_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRAM_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRAM_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRAM_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton fine;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radsearch;
    private javax.swing.JRadioButton update;
    // End of variables declaration//GEN-END:variables
}
