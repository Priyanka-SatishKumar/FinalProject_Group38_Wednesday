/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.login;

import database.Person_Manager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Enterprise;
import ui.manager.UI_Manager;

/**
 *
 * @author KAILASH
 */
public class LoginPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPageJPanel
     */
    public LoginPageJPanel() {
        initComponents();
        updateVisibilityOFF();
        populateEnterpriseCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbEnterprises = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblpwd = new javax.swing.JLabel();
        txtPswd = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        btnForgotPswd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblDisplayEnterprise = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblLogin1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(137, 87, 55));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/working.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 120, 150));

        jLabel2.setBackground(new java.awt.Color(243, 233, 220));
        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 233, 220));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 187, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 233, 220));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Your Enterprise");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 220, -1));

        cmbEnterprises.setBackground(new java.awt.Color(243, 230, 230));
        cmbEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterprisesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEnterprises, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, -1));

        btnLogin.setBackground(new java.awt.Color(179, 179, 179));
        btnLogin.setForeground(new java.awt.Color(210, 180, 140));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-25.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 30, 30));

        lblLogin.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(243, 233, 220));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("New Registration:");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 190, -1));

        lblpwd.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(243, 233, 220));
        lblpwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpwd.setText("Password");
        jPanel1.add(lblpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, -1));

        txtPswd.setText("jPasswordField1");
        txtPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPswdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 190, -1));

        lblUsername.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(243, 233, 220));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 80, -1));

        btnForgotPswd.setBackground(new java.awt.Color(179, 179, 179));
        btnForgotPswd.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnForgotPswd.setForeground(new java.awt.Color(243, 233, 220));
        btnForgotPswd.setText("Forgot Password?");
        btnForgotPswd.setBorder(null);
        btnForgotPswd.setBorderPainted(false);
        btnForgotPswd.setContentAreaFilled(false);
        btnForgotPswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnForgotPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 70, 20));

        jButton1.setBackground(new java.awt.Color(243, 230, 230));
        jButton1.setText("Select Enterprise");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 130, -1));

        lblWelcome.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(243, 233, 220));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome to");
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 90, -1));

        lblDisplayEnterprise.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        lblDisplayEnterprise.setForeground(new java.awt.Color(243, 233, 220));
        lblDisplayEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(lblDisplayEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 190, 20));

        jButton2.setForeground(new java.awt.Color(210, 180, 140));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/online-registration-3.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, -1, -1));

        lblLogin1.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(243, 233, 220));
        lblLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin1.setText("Login:");
        jPanel1.add(lblLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        char[] password = txtPswd.getPassword();
        String userType = (String) cmbEnterprises.getSelectedItem();

//        System.out.println(userType);
        try {
            ResultSet rs = Person_Manager.verifyUser(username, password,userType);
            if (rs.next()) {
                String verifiedUsername = rs.getString("username");
                int verifiedCompanyId = rs.getInt("company_id");
                String loginRole = rs.getString("person_role");

//                System.out.println(""+verifiedUsername);
//                System.out.println(""+verifiedCompanyId);
//                System.out.println(""+verifiedUsername);
                switch(loginRole) {
                    case "MANUFACTURE_ADMIN":
                        UI_Manager.AddManuAdminPanel(verifiedUsername, verifiedCompanyId); 
                      break;
                    case "PHARMACY_ADMIN":
                        UI_Manager.AddpharmacyAdminPanel(verifiedUsername, verifiedCompanyId);    
                      break;
                    case "DISTRIBUTOR_ADMIN":
                        UI_Manager.AddDistributorManagerPanel(verifiedUsername, verifiedCompanyId);    
                      break;
                    case "TRANSPORT_ADMIN":
                        UI_Manager.AddTransportAdminPanel(username);
                    default:
                }
            } 
                } catch(Exception e) {
                 JOptionPane.showMessageDialog(this, e);
                }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPswdActionPerformed

    private void cmbEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterprisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterprisesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        updateVisibilityON();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UI_Manager.AddCompanyRegPanel((String) cmbEnterprises.getSelectedItem());
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPswd;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbEnterprises;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDisplayEnterprise;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
    public void populateEnterpriseCombo(){
        cmbEnterprises.removeAllItems();
        
//        cmbEnterprises.addItem("Pharmacy Enterprise");
//        cmbEnterprises.addItem("Manufacturer Enterprise");
//        cmbEnterprises.addItem("Transportation Enterprise");
//        cmbEnterprises.addItem("Distributor Enterprise");
        cmbEnterprises.addItem("MANUFACTURE_ADMIN");
        cmbEnterprises.addItem("DISTRIBUTOR_ADMIN");
        cmbEnterprises.addItem("PHARMACY_ADMIN");
        cmbEnterprises.addItem("PHARMACY_STORE_MANAGER");
        cmbEnterprises.addItem("TRANSPORT_ADMIN");
     
    }
    
    public void updateVisibilityON()
    {
        lblWelcome.setVisible(true);
        lblDisplayEnterprise.setVisible(true);
        lblDisplayEnterprise.setText((String) cmbEnterprises.getSelectedItem());
        txtUsername.setVisible(true);
        txtPswd.setVisible(true);
        lblUsername.setVisible(true);
        lblpwd.setVisible(true);
        lblLogin.setVisible(true);
        btnLogin.setVisible(true);
        btnForgotPswd.setVisible(true);
        lblLogin1.setVisible(true);
        jButton2.setVisible(true);
    }
    
    public void updateVisibilityOFF()
    {
        jButton2.setVisible(false);
        lblDisplayEnterprise.setVisible(false);
        lblWelcome.setVisible(false);
        txtUsername.setVisible(false);
        txtPswd.setVisible(false);
        lblUsername.setVisible(false);
        lblpwd.setVisible(false);
        lblLogin.setVisible(false);
        btnLogin.setVisible(false);
        btnForgotPswd.setVisible(false);
        lblLogin1.setVisible(false);
    }
}
