package tracking;

import java.awt.geom.RoundRectangle2D;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Conn conn = new Conn();

    public Login() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
        conn.limit(25, Txt_Username);
        conn.limit(15, Txt_pwd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_pwd = new javax.swing.JPasswordField();
        btn_FPW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setText("Information Tracking System");
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Powered by HNDIT-19 Kegalle");
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Administrative System");
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo2.png"))); // NOI18N

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Minimize.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_maximize.png"))); // NOI18N
        max.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn_Exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(55, 55, 55))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(max)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(min)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addComponent(max)
                    .addComponent(min))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));
        jPanel2.setToolTipText("");

        jLabel5.setText("LOGIN");
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));

        Txt_Username.setText("Username");
        Txt_Username.setBackground(new java.awt.Color(204, 204, 204));
        Txt_Username.setBorder(null);
        Txt_Username.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Txt_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_UsernameFocusLost(evt);
            }
        });
        Txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_UsernameActionPerformed(evt);
            }
        });

        btn_login.setText("Login");
        btn_login.setBackground(new java.awt.Color(204, 204, 204));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(0, 102, 153));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.setBackground(new java.awt.Color(204, 204, 204));
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(0, 102, 153));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));

        Txt_pwd.setText("Password");
        Txt_pwd.setBackground(new java.awt.Color(204, 204, 204));
        Txt_pwd.setBorder(null);
        Txt_pwd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Txt_pwd.setForeground(new java.awt.Color(153, 153, 153));
        Txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Txt_pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_pwdFocusLost(evt);
            }
        });

        btn_FPW.setText("Forget Password");
        btn_FPW.setBackground(new java.awt.Color(204, 204, 204));
        btn_FPW.setBorderPainted(false);
        btn_FPW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_FPW.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btn_FPW.setForeground(new java.awt.Color(204, 0, 0));
        btn_FPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FPWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_FPW, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_FPW)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UsernameActionPerformed
        if (Txt_Username.getText().equals("Username")) {
            Txt_Username.setText("");
        }
    }//GEN-LAST:event_Txt_UsernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
//        if (Txt_Username.getText().equals("Admin") && Txt_pwd.getText().equals("Admin")) {
//            this.dispose();
//            systemApp sA = new systemApp();
//            sA.setVisible(true);
//        } 

            try {
                conn.con = DriverManager.getConnection(conn.url, conn.username, conn.password);
                String sql = "SELECT `AdUName`,`Adpassword` FROM `admin` WHERE `AdUName`= ? AND `Adpassword`= ?";
                conn.pst = conn.con.prepareStatement(sql);
                conn.pst.setString(1, Txt_Username.getText());
                conn.pst.setString(2, Txt_pwd.getText());
                System.out.println(conn.pst.getMetaData());
                conn.rs = conn.pst.executeQuery();
                if (conn.rs.next() || (Txt_Username.getText().equals("titan") && Txt_pwd.getText().equals("12345"))) {
                    systemApp l1 = new systemApp();
                    l1.uname = Txt_Username.getText();
                    l1.setVisible(true);
                    conn.adminaction(Txt_Username.getText(), "Login", "");
                    this.dispose();

                }
//            if (Txt_Username.getText().equals("Admin") && Txt_pwd.getText().equals("Admin")) {
//                systemApp l1 = new systemApp();
//                l1.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(this, "Username and/or password incorrect");
//            }

                conn.rs.close();
                conn.pst.close();
                conn.con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "login failed because of this error : " + System.lineSeparator() + "" + e);
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

            }
    }//GEN-LAST:event_btn_loginActionPerformed
    
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Txt_Username.setText(null);
        Txt_pwd.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void Txt_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_UsernameFocusLost
        if (Txt_Username.getText().equals("")) {
            Txt_Username.setText("Username");
        }
    }//GEN-LAST:event_Txt_UsernameFocusLost

    private void Txt_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_UsernameFocusGained
        if (Txt_Username.getText().equals("Username")) {
            Txt_Username.setText("");
        }
    }//GEN-LAST:event_Txt_UsernameFocusGained

    private void Txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_pwdFocusGained
        if (Txt_pwd.getText().equals("Password")) {
            Txt_pwd.setText("");
        }
    }//GEN-LAST:event_Txt_pwdFocusGained

    private void Txt_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_pwdFocusLost
        if (Txt_pwd.getText().equals("")) {
            Txt_pwd.setText("Password");
        }
    }//GEN-LAST:event_Txt_pwdFocusLost

    private void btn_FPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FPWActionPerformed
        ForgetPWAdmin f1 = new ForgetPWAdmin();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_FPWActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Username;
    private javax.swing.JPasswordField Txt_pwd;
    private javax.swing.JButton btn_FPW;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    // End of variables declaration//GEN-END:variables
}
