package tracking;

import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class ForgetPWAdmin extends javax.swing.JFrame {
    
    Conn conn = new Conn();
    
    private String ans1,ans2;
    public ForgetPWAdmin() {
        initComponents();
//        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_AdminReset = new javax.swing.JTextField();
        txt_ADResetSQ1 = new javax.swing.JTextField();
        txt_AdminResetCPW = new javax.swing.JTextField();
        txt_AdminResetAns1 = new javax.swing.JTextField();
        txt_ADResetSQ2 = new javax.swing.JTextField();
        txt_AdminResetAns2 = new javax.swing.JTextField();
        txt_AdminResetNewPW1 = new javax.swing.JTextField();
        btnAdminResetSave = new javax.swing.JButton();
        btnAdminResetClear = new javax.swing.JButton();
        btnAdminResetSearch = new javax.swing.JButton();
        btnAdminResetResetPW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracking/logo2.png"))); // NOI18N

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        Head.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        Head.setForeground(new java.awt.Color(255, 255, 255));
        Head.setText("Administrative System");

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_maximize.png"))); // NOI18N
        max.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Minimize.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Head))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(max)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(min)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit)
                    .addComponent(max)
                    .addComponent(min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Head)
                        .addGap(44, 44, 44))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Admin UserName");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Answer 02");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Security Question 01");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Answer 01");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Security Question 02");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("New Password");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Confirm Password");

        txt_AdminReset.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_AdminReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdminResetActionPerformed(evt);
            }
        });

        txt_ADResetSQ1.setEditable(false);
        txt_ADResetSQ1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_ADResetSQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ADResetSQ1ActionPerformed(evt);
            }
        });

        txt_AdminResetCPW.setEditable(false);
        txt_AdminResetCPW.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_AdminResetCPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdminResetCPWActionPerformed(evt);
            }
        });

        txt_AdminResetAns1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_AdminResetAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdminResetAns1ActionPerformed(evt);
            }
        });

        txt_ADResetSQ2.setEditable(false);
        txt_ADResetSQ2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_ADResetSQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ADResetSQ2ActionPerformed(evt);
            }
        });

        txt_AdminResetAns2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_AdminResetAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdminResetAns2ActionPerformed(evt);
            }
        });

        txt_AdminResetNewPW1.setEditable(false);
        txt_AdminResetNewPW1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        txt_AdminResetNewPW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AdminResetNewPW1ActionPerformed(evt);
            }
        });

        btnAdminResetSave.setText("Save");
        btnAdminResetSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminResetSaveActionPerformed(evt);
            }
        });

        btnAdminResetClear.setText("Clear");
        btnAdminResetClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminResetClearActionPerformed(evt);
            }
        });

        btnAdminResetSearch.setText("Search");
        btnAdminResetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminResetSearchActionPerformed(evt);
            }
        });

        btnAdminResetResetPW.setText("Check");
        btnAdminResetResetPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminResetResetPWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_AdminResetAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ADResetSQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ADResetSQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AdminResetAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAdminResetSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminResetClear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_AdminResetCPW, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminResetSearch))
                        .addComponent(txt_AdminReset, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminResetResetPW))
                        .addComponent(txt_AdminResetNewPW1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAdminResetSearch))
                .addGap(8, 8, 8)
                .addComponent(txt_AdminReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addComponent(txt_ADResetSQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_AdminResetAns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txt_ADResetSQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_AdminResetAns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminResetResetPW)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_AdminResetNewPW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_AdminResetCPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminResetSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminResetClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_AdminResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdminResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdminResetActionPerformed

    private void txt_ADResetSQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ADResetSQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ADResetSQ1ActionPerformed

    private void txt_AdminResetCPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdminResetCPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdminResetCPWActionPerformed

    private void txt_AdminResetAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdminResetAns1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdminResetAns1ActionPerformed

    private void txt_ADResetSQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ADResetSQ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ADResetSQ2ActionPerformed

    private void txt_AdminResetAns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdminResetAns2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdminResetAns2ActionPerformed

    private void txt_AdminResetNewPW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AdminResetNewPW1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AdminResetNewPW1ActionPerformed

    private void btnAdminResetClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminResetClearActionPerformed
       txt_AdminReset.setText("");
       txt_ADResetSQ1.setText("");
       txt_AdminResetAns1.setText("");
       txt_ADResetSQ2.setText("");
       txt_AdminResetAns2.setText("");
       txt_AdminResetNewPW1.setText("");
       txt_AdminResetCPW.setText("");
       txt_AdminResetCPW.setEditable(false);
       txt_AdminResetNewPW1.setEditable(false);
       txt_AdminReset.setEditable(true);
    }//GEN-LAST:event_btnAdminResetClearActionPerformed

    private void btnAdminResetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminResetSearchActionPerformed
        try {
            conn.start_conn("SELECT `AdUName`,`AdQ1`, LOWER(`AdAns1`), `AdQ2`, LOWER(`AdAns2`) FROM `admin` WHERE `AdUName`= '"+txt_AdminReset.getText()+"';");
            if (conn.rs.next()) {
                txt_AdminReset.setEditable(false);
                txt_ADResetSQ1.setText(conn.rs.getString("AdQ1"));
                txt_ADResetSQ2.setText(conn.rs.getString("AdQ2"));
                ans1=conn.rs.getString("LOWER(`AdAns1`)");
                ans2=conn.rs.getString("LOWER(`AdAns2`)"); 
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect Username");
            }
        } catch (Exception e) {
             java.util.logging.Logger.getLogger(ForgetPWAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnAdminResetSearchActionPerformed

    private void btnAdminResetResetPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminResetResetPWActionPerformed
        if (txt_AdminResetAns1.getText().toLowerCase().equals(ans1)&&txt_AdminResetAns2.getText().toLowerCase().equals(ans2)) {
            txt_AdminResetNewPW1.setEditable(true);
            txt_AdminResetCPW.setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "Incorrect answers");
        }
    }//GEN-LAST:event_btnAdminResetResetPWActionPerformed

    private void btnAdminResetSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminResetSaveActionPerformed
        if (txt_AdminResetNewPW1.getText().equals(txt_AdminResetCPW.getText())) {
            conn.start_conn2("UPDATE `admin` SET `Adpassword`='"+txt_AdminResetNewPW1.getText()+"' WHERE `AdUName` ='"+txt_AdminReset.getText()+"'");
            conn.end_conn2();
            JOptionPane.showMessageDialog(this, "Password Updated");
            conn.adminaction(txt_AdminReset.getText(),"Password Update","");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Password missmatch");
        }
    }//GEN-LAST:event_btnAdminResetSaveActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

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
            java.util.logging.Logger.getLogger(ForgetPWAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPWAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPWAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPWAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPWAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Head;
    private javax.swing.JButton btnAdminResetClear;
    private javax.swing.JButton btnAdminResetResetPW;
    private javax.swing.JButton btnAdminResetSave;
    private javax.swing.JButton btnAdminResetSearch;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    private javax.swing.JTextField txt_ADResetSQ1;
    private javax.swing.JTextField txt_ADResetSQ2;
    private javax.swing.JTextField txt_AdminReset;
    private javax.swing.JTextField txt_AdminResetAns1;
    private javax.swing.JTextField txt_AdminResetAns2;
    private javax.swing.JTextField txt_AdminResetCPW;
    private javax.swing.JTextField txt_AdminResetNewPW1;
    // End of variables declaration//GEN-END:variables
}
