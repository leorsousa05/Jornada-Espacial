package com.jornadaespacial.jornadaespacial;
import javax.swing.JOptionPane;

public class JornadaEspacial_Interface extends javax.swing.JFrame {
    public JornadaEspacial_Interface() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        cadastrarButton = new javax.swing.JButton();
        iniciarjornadaButton = new javax.swing.JButton();
        esquecerButton = new javax.swing.JButton();
        exibirCheckBox = new javax.swing.JCheckBox();
        tituloLabel = new javax.swing.JLabel();
        fundoLabel = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jornada Espacial");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 950));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(153, 153, 153));
        loginTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginTextField.setText("\"Digite seu nome de usuário\"");
        loginTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        loginTextField.setOpaque(true);
        loginTextField.setSelectionColor(new java.awt.Color(255, 255, 255));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 430, 40));

        senhaPasswordField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        senhaPasswordField.setText("Senha");
        senhaPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 430, 40));

        cadastrarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cadastrarButton.setText("Primeira Jornada?");
        cadastrarButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 190, 30));

        iniciarjornadaButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        iniciarjornadaButton.setText("Iniciar Jornada!");
        iniciarjornadaButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        iniciarjornadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarjornadaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarjornadaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 190, 30));

        esquecerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        esquecerButton.setText("Esqueceu a senha?");
        esquecerButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        esquecerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquecerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(esquecerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 190, 30));

        exibirCheckBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        exibirCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        exibirCheckBox.setText("Exibir senha");
        exibirCheckBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));
        exibirCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exibirCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(exibirCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 110, 20));

        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.png"))); // NOI18N
        getContentPane().add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        fundoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo1.jpg"))); // NOI18N
        fundoLabel.setToolTipText("");
        getContentPane().add(fundoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1020, 1020));

        pack();
    }

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        

    }

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void iniciarjornadaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String login = loginTextField.getText();
            String senha = new String(senhaPasswordField.getPassword());
            var usuario = new Usuario(login, senha);
            var dao = new UsuarioDAO();

            if(dao.existe(usuario)){
                JOptionPane.showMessageDialog(null, "Bem vindo");
            }
            else{
                JOptionPane.showMessageDialog(null, "Par usuário/senha inválido");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
        }
    }

    private void esquecerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void exibirCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exibirCheckBoxActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JornadaEspacial_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JornadaEspacial_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JornadaEspacial_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JornadaEspacial_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JornadaEspacial_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton esquecerButton;
    private javax.swing.JCheckBox exibirCheckBox;
    private javax.swing.JLabel fundoLabel;
    private javax.swing.JButton iniciarjornadaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

}
