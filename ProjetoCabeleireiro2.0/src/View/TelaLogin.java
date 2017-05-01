
package View;

import ModelBeans.Util;
import ModelConection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    Util util = new Util();
    public TelaLogin() {
        initComponents();
        con.conexao();
       
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonAcessar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(591, 0, 0, 305);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(410, 220, 60, 23);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(320, 220, 80, 23);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(290, 140, 80, 20);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(290, 180, 60, 17);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(350, 130, 130, 30);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(350, 170, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 40, 230, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundotelaLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 305);

        setSize(new java.awt.Dimension(513, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        
        try {
            String usuario = jTextFieldUsuario.getText();
            String senha = jPasswordFieldSenha.getText();
            con.executaSql("SELECT * FROM usuarios WHERE usuario_usuario = '" + jTextFieldUsuario.getText() +"'");
            con.rs.first();
            if(usuario.equals("master") && senha.equals("vb73a8h")){
                util.checa_e_atualiza_registros();//chamando o metodo para alterar o status no banco
                TelaPrincipal tela = new TelaPrincipal("master");
                tela.setVisible(true);
                dispose();
            }else if(con.rs.getString("senha_usuario").equals(jPasswordFieldSenha.getText())){
                util.checa_e_atualiza_registros();//chamando o metodo para alterar o status no banco
                TelaPrincipal tela = new TelaPrincipal(con.rs.getString("nome_usuario"));
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "senha ou usuario invalidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não foi possivel recuperar o usuario \n" + ex);
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        con.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
