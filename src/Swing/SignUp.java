/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Module.User;
import Service.UserSevice;
import javax.swing.JPasswordField;

/**
 *
 * @author phank
 */
public class SignUp extends javax.swing.JFrame {
    UserSevice userSevice;
    User user;
    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        userSevice = new UserSevice();
        user = new User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenDerbuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HoTenjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhonejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UsernamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FemalejRadioButton = new javax.swing.JRadioButton();
        MalejRadioButton = new javax.swing.JRadioButton();
        SignUpjButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ho và ten");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Phone ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("PassWord");

        jLabel6.setText("Gender'");

        GenDerbuttonGroup.add(FemalejRadioButton);
        FemalejRadioButton.setText("Female");
        FemalejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemalejRadioButtonActionPerformed(evt);
            }
        });

        GenDerbuttonGroup.add(MalejRadioButton);
        MalejRadioButton.setText("Male");
        MalejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalejRadioButtonActionPerformed(evt);
            }
        });

        SignUpjButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SignUpjButton.setText("Sign Up");
        SignUpjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HoTenjTextField)
                            .addComponent(PhonejTextField)
                            .addComponent(UsernamejTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(FemalejRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(MalejRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(SignUpjButton)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(HoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(PhonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UsernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FemalejRadioButton)
                    .addComponent(MalejRadioButton))
                .addGap(18, 18, 18)
                .addComponent(SignUpjButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FemalejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemalejRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemalejRadioButtonActionPerformed

    private void MalejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalejRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MalejRadioButtonActionPerformed

    private void SignUpjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpjButtonActionPerformed
        // TODO add your handling code here:
        user.setName(HoTenjTextField.getText());
        user.setPhone(PhonejTextField.getText());
        user.setUserName(UsernamejTextField.getText());
        user.setPassWord(jPasswordField.getSelectedText());
        String gender ="";
        if(FemalejRadioButton.isSelected())
            gender="Female";
        else
        if(MalejRadioButton.isSelected())
            gender="Male";
        user.setGender(gender);
        userSevice.addUser(user);
        this.dispose();
        new SignIn().setVisible(true);
    }//GEN-LAST:event_SignUpjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemalejRadioButton;
    private javax.swing.ButtonGroup GenDerbuttonGroup;
    private javax.swing.JTextField HoTenjTextField;
    private javax.swing.JRadioButton MalejRadioButton;
    private javax.swing.JTextField PhonejTextField;
    private javax.swing.JButton SignUpjButton;
    private javax.swing.JTextField UsernamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables
}
