/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package upil;

/**
 *
 * @author Achapasya2109
 */
public class AdminMasuk extends javax.swing.JFrame {
//nuoiDEINCOewmqciqwmc
    /**
     * Creates new form Admin
     */
    public AdminMasuk() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        IsiNamaPengguna = new javax.swing.JTextField();
        IsiKataSandi = new javax.swing.JTextField();
        NamaPengguna = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 248, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 16, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Masuk Ke UPIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 92, -1, -1));

        jToggleButton1.setText("Masuk");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 317, 125, -1));

        jToggleButton2.setText("Buat Akun");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 317, 132, -1));

        IsiNamaPengguna.setBackground(new java.awt.Color(250, 248, 240));
        IsiNamaPengguna.setForeground(new java.awt.Color(250, 248, 240));
        IsiNamaPengguna.setText("     Nama Pengguna");
        IsiNamaPengguna.setCaretColor(new java.awt.Color(164, 172, 178));
        IsiNamaPengguna.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        IsiNamaPengguna.setEnabled(false);
        IsiNamaPengguna.setSelectionColor(new java.awt.Color(250, 248, 240));
        IsiNamaPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiNamaPenggunaActionPerformed(evt);
            }
        });
        getContentPane().add(IsiNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 320, 50));

        IsiKataSandi.setBackground(new java.awt.Color(250, 248, 240));
        IsiKataSandi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        IsiKataSandi.setText("     Kata Sandi");
        IsiKataSandi.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        IsiKataSandi.setEnabled(false);
        IsiKataSandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiKataSandiActionPerformed(evt);
            }
        });
        getContentPane().add(IsiKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 320, 50));

        NamaPengguna.setDisabledTextColor(new java.awt.Color(250, 248, 240));
        NamaPengguna.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NamaPenggunaPropertyChange(evt);
            }
        });
        NamaPengguna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NamaPenggunaKeyTyped(evt);
            }
        });
        getContentPane().add(NamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 320, 50));

        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PassKeyTyped(evt);
            }
        });
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 320, 50));

        jPanel1.setBackground(new java.awt.Color(250, 248, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        BuatAkun ba = new BuatAkun();
        ba.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        TampilanAdmin ta = new TampilanAdmin();
        ta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void IsiKataSandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiKataSandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsiKataSandiActionPerformed

    private void IsiNamaPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiNamaPenggunaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_IsiNamaPenggunaActionPerformed

    private void NamaPenggunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaPenggunaKeyTyped
        // TODO add your handling code here:
        if ("".equals(NamaPengguna.getText())) 
        {
            IsiNamaPengguna.setVisible(true);
            IsiNamaPengguna.setEnabled(false);
        }else
            IsiNamaPengguna.setVisible(false);
            IsiNamaPengguna.setEnabled(false);
        
    }//GEN-LAST:event_NamaPenggunaKeyTyped

    private void PassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyTyped
        // TODO add your handling code here:
        if ("".equals(Pass.getText())) 
        {
            IsiKataSandi.setVisible(true);
            IsiKataSandi.setEnabled(false);
        }else
            IsiKataSandi.setVisible(false);
            IsiKataSandi.setEnabled(false);
    }//GEN-LAST:event_PassKeyTyped

    private void NamaPenggunaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NamaPenggunaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPenggunaPropertyChange

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
            java.util.logging.Logger.getLogger(AdminMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IsiKataSandi;
    private javax.swing.JTextField IsiNamaPengguna;
    private javax.swing.JTextField NamaPengguna;
    private javax.swing.JPasswordField Pass;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
