/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 *
 * @author Joan
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**rootPaneCheckingEnabled
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        userLoginField = new javax.swing.JTextField();
        passwordLoginField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        userRegisterText = new javax.swing.JTextField();
        passwordRegisterText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setLayout(new java.awt.GridBagLayout());

        loginButton.setBackground(new java.awt.Color(102, 0, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Ingresar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(14, 21, 11, 0);
        loginPanel.add(loginButton, gridBagConstraints);

        userLoginField.setForeground(new java.awt.Color(204, 204, 204));
        userLoginField.setText("Usuario");
        userLoginField.setToolTipText("");
        userLoginField.setPreferredSize(new java.awt.Dimension(100, 22));
        userLoginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userLoginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userLoginFieldFocusLost(evt);
            }
        });
        userLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginFieldActionPerformed(evt);
            }
        });
        userLoginField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userLoginFieldKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        loginPanel.add(userLoginField, gridBagConstraints);

        passwordLoginField.setForeground(new java.awt.Color(204, 204, 204));
        passwordLoginField.setText("Contraseña");
        passwordLoginField.setPreferredSize(new java.awt.Dimension(100, 22));
        passwordLoginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordLoginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordLoginFieldFocusLost(evt);
            }
        });
        passwordLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginFieldActionPerformed(evt);
            }
        });
        passwordLoginField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordLoginFieldKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        loginPanel.add(passwordLoginField, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contraseña(1).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        loginPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user(1).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        loginPanel.add(jLabel2, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/11zon_cropped.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 12, 0, 0);
        loginPanel.add(jLabel5, gridBagConstraints);

        getContentPane().add(loginPanel, "card2");

        registerPanel.setBackground(new java.awt.Color(0, 0, 0));
        registerPanel.setLayout(new java.awt.GridBagLayout());

        registerButton.setBackground(new java.awt.Color(102, 0, 0));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        registerPanel.add(registerButton, gridBagConstraints);

        userRegisterText.setForeground(new java.awt.Color(204, 204, 204));
        userRegisterText.setText("Usuario");
        userRegisterText.setPreferredSize(new java.awt.Dimension(100, 24));
        userRegisterText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userRegisterTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userRegisterTextFocusLost(evt);
            }
        });
        userRegisterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegisterTextActionPerformed(evt);
            }
        });
        userRegisterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userRegisterTextKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        registerPanel.add(userRegisterText, gridBagConstraints);

        passwordRegisterText.setForeground(new java.awt.Color(204, 204, 204));
        passwordRegisterText.setText("Contraseña");
        passwordRegisterText.setPreferredSize(new java.awt.Dimension(100, 24));
        passwordRegisterText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordRegisterTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordRegisterTextFocusLost(evt);
            }
        });
        passwordRegisterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegisterTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        registerPanel.add(passwordRegisterText, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contraseña(1).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        registerPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user(1).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        registerPanel.add(jLabel4, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/11zon_cropped.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        registerPanel.add(jLabel6, gridBagConstraints);

        getContentPane().add(registerPanel, "card3");

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginDBController dbc = new LoginDBController();
        String SQL = "SELECT * FROM users WHERE userName = \'"+userLoginField.getText()+"\' AND userPassword = \'"+passwordLoginField.getText()+"\';";
        ArrayList<Map<String, Object>> allUsers = dbc.getQueryResult(SQL);
        if (!allUsers.isEmpty()){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainFrame().setVisible(true);
                }
            });
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña son incorrectos","ERROR",JOptionPane.ERROR_MESSAGE);
            limpiar();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        //Most secure login ever
        LoginDBController controller = new LoginDBController();
        if(!userRegisterText.getText().equals("Usuario") && !passwordRegisterText.getText().equals("Contraseña")){
            User user = new User(userRegisterText.getText(),passwordRegisterText.getText());
            controller.insertUser(user);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainFrame().setVisible(true);
                }
            });
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Los campos no pueden estar vacíos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void userLoginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userLoginFieldFocusGained
    if (userLoginField.getText().isEmpty()) {
    userLoginField.setText("Usuario");
    userLoginField.setForeground(Color.gray);
        
    }
    }//GEN-LAST:event_userLoginFieldFocusGained

    private void userLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginFieldActionPerformed
    passwordLoginField.requestFocus();
    }//GEN-LAST:event_userLoginFieldActionPerformed

    private void userLoginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userLoginFieldFocusLost
if (userLoginField.getText().isEmpty()) {
    userLoginField.setText("Usuario");
    userLoginField.setForeground(Color.GRAY);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginFieldFocusLost

    private void passwordLoginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordLoginFieldFocusGained
    if (passwordLoginField.getText().equals("Contraseña")) {
    passwordLoginField.setText("");
    passwordLoginField.setForeground(Color.black);     
    }
    }//GEN-LAST:event_passwordLoginFieldFocusGained

    private void passwordLoginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordLoginFieldFocusLost
        if (passwordLoginField.getText().isEmpty()) {
    passwordLoginField.setText("Contraseña");
    passwordLoginField.setForeground(Color.GRAY);
}
    }//GEN-LAST:event_passwordLoginFieldFocusLost

    private void userLoginFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userLoginFieldKeyPressed
    if (userLoginField.getText().equals("Usuario")) {
    userLoginField.setText("");
    userLoginField.setForeground(Color.BLACK);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginFieldKeyPressed

    private void passwordLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginFieldActionPerformed
     LoginDBController dbc = new LoginDBController();
        String SQL = "SELECT * FROM users WHERE userName = \'"+userLoginField.getText()+"\' AND userPassword = \'"+passwordLoginField.getText()+"\';";
        ArrayList<Map<String, Object>> allUsers = dbc.getQueryResult(SQL);
        if (!allUsers.isEmpty()){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainFrame().setVisible(true);
                }
            });
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña son incorrectos","ERROR",JOptionPane.ERROR_MESSAGE);
            limpiar();
        }
    }//GEN-LAST:event_passwordLoginFieldActionPerformed

    private void userRegisterTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userRegisterTextKeyPressed
     if (userRegisterText.getText().equals("Usuario")) {
    userRegisterText.setText("");
    userRegisterText.setForeground(Color.BLACK);
     }
    }//GEN-LAST:event_userRegisterTextKeyPressed

    private void userRegisterTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userRegisterTextFocusGained
    if (userRegisterText.getText().isEmpty()) {
    userRegisterText.setText("Usuario");
    userRegisterText.setForeground(Color.gray);
    }
    }//GEN-LAST:event_userRegisterTextFocusGained

    private void userRegisterTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userRegisterTextFocusLost
    if (userRegisterText.getText().isEmpty()) {
    userRegisterText.setText("Usuario");
    userRegisterText.setForeground(Color.GRAY);
}
    }//GEN-LAST:event_userRegisterTextFocusLost

    private void passwordRegisterTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegisterTextFocusGained
    if (passwordRegisterText.getText().equals("Contraseña")) {
    passwordRegisterText.setText("");
    passwordRegisterText.setForeground(Color.black);     
    }
    }//GEN-LAST:event_passwordRegisterTextFocusGained

    private void passwordRegisterTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegisterTextFocusLost
    if (passwordRegisterText.getText().isEmpty()) {
    passwordRegisterText.setText("Contraseña");
    passwordRegisterText.setForeground(Color.GRAY);
}
    }//GEN-LAST:event_passwordRegisterTextFocusLost

    private void userRegisterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegisterTextActionPerformed
    passwordRegisterText.requestFocus();
    }//GEN-LAST:event_userRegisterTextActionPerformed

    private void passwordRegisterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegisterTextActionPerformed
      LoginDBController controller = new LoginDBController();
        if(!userRegisterText.getText().equals("Usuario") && !passwordRegisterText.getText().equals("Contraseña")){
            User user = new User(userRegisterText.getText(),passwordRegisterText.getText());
            controller.insertUser(user);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainFrame().setVisible(true);
                }
            });
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Los campos no pueden estar vacíos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_passwordRegisterTextActionPerformed

    private void passwordLoginFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordLoginFieldKeyPressed
if (passwordRegisterText.getText().equals("Contraseña")) {
    passwordRegisterText.setText("");
    passwordRegisterText.setForeground(Color.BLACK);
}        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLoginFieldKeyPressed

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public JPanel getRegisterPanel() {
        return registerPanel;
    }

    private void limpiar(){
        userLoginField.setText("");
        passwordLoginField.setText("");
        userLoginField.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                new LoginFrame().setVisible(true);
            }
        });
        
        //Why tf am i putting so much code in a fk frame
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField passwordLoginField;
    private javax.swing.JTextField passwordRegisterText;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField userLoginField;
    private javax.swing.JTextField userRegisterText;
    // End of variables declaration//GEN-END:variables
}
