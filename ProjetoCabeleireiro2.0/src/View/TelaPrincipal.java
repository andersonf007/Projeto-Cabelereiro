package View;

import ModelConection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    FormUsuario telaUsu = new FormUsuario();
    FormCliente telaCli = new FormCliente();
    FormFuncionario telaFun = new FormFuncionario();
    FormAgenda telaAge = new FormAgenda();
    ConexaoBD conecta = new ConexaoBD();

    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternalFrameBemVindo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadClientes = new javax.swing.JButton();
        jButtonCadFuncionarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jButtonCadUsuario = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastroClientes = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarios = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuarios = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternalFrameBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrameBemVindo.setLayout(null);

        jLabel2.setText("Cadastros:");
        jPanelInternalFrameBemVindo.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 20);

        jButtonCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-business-users-icon-32431.png"))); // NOI18N
        jButtonCadClientes.setToolTipText("Clientes");
        jButtonCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClientesActionPerformed(evt);
            }
        });
        jPanelInternalFrameBemVindo.add(jButtonCadClientes);
        jButtonCadClientes.setBounds(10, 40, 110, 110);

        jButtonCadFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-business-users-icon-32431.png"))); // NOI18N
        jButtonCadFuncionarios.setToolTipText("Funcionarios");
        jButtonCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadFuncionariosActionPerformed(evt);
            }
        });
        jPanelInternalFrameBemVindo.add(jButtonCadFuncionarios);
        jButtonCadFuncionarios.setBounds(140, 40, 110, 110);

        jLabel3.setText("Agenda:");
        jPanelInternalFrameBemVindo.add(jLabel3);
        jLabel3.setBounds(10, 170, 60, 14);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setText("jButton1");
        jButtonAgenda.setToolTipText("Agenda");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanelInternalFrameBemVindo.add(jButtonAgenda);
        jButtonAgenda.setBounds(10, 190, 110, 110);

        jButtonCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-business-users-icon-32431.png"))); // NOI18N
        jButtonCadUsuario.setToolTipText("Usuários");
        jButtonCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadUsuarioActionPerformed(evt);
            }
        });
        jPanelInternalFrameBemVindo.add(jButtonCadUsuario);
        jButtonCadUsuario.setBounds(270, 40, 110, 110);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/internalframe.png"))); // NOI18N
        jPanelInternalFrameBemVindo.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 700, 320);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternalFrameBemVindo);
        jPanelInternalFrameBemVindo.setBounds(0, 40, 700, 320);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 270, 22);

        jButtonSairBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        jButtonSairBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonSairBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonSairBemVindo);
        jButtonSairBemVindo.setBounds(640, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 110, 720, 390);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 510, 50, 17);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Nome do usuario");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 510, 120, 14);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 720, 540);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadastroClientes.setText("Clientes");
        jMenuItemCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroClientes);

        jMenuItemCadastroFuncionarios.setText("Funcionarios");
        jMenuItemCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroFuncionarios);

        jMenuItemCadastroUsuarios.setText("Usuários");
        jMenuItemCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroUsuarios);

        jMenuBar1.add(jMenuCadastros);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Tela Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(732, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonSairBemVindoActionPerformed

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);

    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

    private void jMenuItemCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClientesActionPerformed

        try {
            String UsuarioMaster = jLabelUsuario.getText();
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if(UsuarioMaster.equals("master")){
                telaCli = new FormCliente();
                telaCli.setVisible(true);
                telaCli.setResizable(false);//nao permite a tela ser redimecionada
            }else if (conecta.rs.getString("tipo_usuario").equals("Administrador") || conecta.rs.getString("tipo_usuario").equals("Funcionario")) {
                telaCli = new FormCliente();
                telaCli.setVisible(true);
                telaCli.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadastroClientesActionPerformed

    private void jButtonCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClientesActionPerformed

        try {
            String UsuarioMaster = jLabelUsuario.getText();

            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();

            if (UsuarioMaster.equals("master")) {
                telaCli = new FormCliente();
                telaCli.setVisible(true);
                telaCli.setResizable(false);//nao permite a tela ser redimecionada

            } else if (conecta.rs.getString("tipo_usuario").equals("Administrador") || conecta.rs.getString("tipo_usuario").equals("Funcionario")) {
                telaCli = new FormCliente();
                telaCli.setVisible(true);
                telaCli.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }

    }//GEN-LAST:event_jButtonCadClientesActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jButtonCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFuncionariosActionPerformed
        try {
            
             String UsuarioMaster = jLabelUsuario.getText();
             
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            
            if(UsuarioMaster.equals("master")){
                telaFun = new FormFuncionario();
                telaFun.setVisible(true);
                telaFun.setResizable(false);//nao permite a tela ser redimecionada
            }else if (conecta.rs.getString("tipo_usuario").equals("Administrador")) {
                telaFun = new FormFuncionario();
                telaFun.setVisible(true);
                telaFun.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jButtonCadFuncionariosActionPerformed

    private void jMenuItemCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuariosActionPerformed
        try {
            String UsuarioMaster = jLabelUsuario.getText();
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if(UsuarioMaster.equals("master")){
                telaUsu = new FormUsuario();
                telaUsu.setVisible(true);
                telaUsu.setResizable(false);//nao permite a tela ser redimecionada
            }else if (conecta.rs.getString("tipo_usuario").equals("Administrador")) {
                telaUsu = new FormUsuario();
                telaUsu.setVisible(true);
                telaUsu.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadastroUsuariosActionPerformed

    private void jButtonCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadUsuarioActionPerformed

        try {
            String UsuarioMaster = jLabelUsuario.getText();
            
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if(UsuarioMaster.equals("master")){
                telaUsu = new FormUsuario();
                telaUsu.setVisible(true);
                telaUsu.setResizable(false);//nao permite a tela ser redimecionada
            }else if (conecta.rs.getString("tipo_usuario").equals("Administrador")) {
                telaUsu = new FormUsuario();
                telaUsu.setVisible(true);
                telaUsu.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jButtonCadUsuarioActionPerformed

    private void jMenuItemCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionariosActionPerformed
        try {
            String UsuarioMaster = jLabelUsuario.getText();
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if(UsuarioMaster.equals("master")){
                telaFun = new FormFuncionario();
                telaFun.setVisible(true);
                telaFun.setResizable(false);//nao permite a tela ser redimecionada
            }else if(conecta.rs.getString("tipo_usuario").equals("Administrador")) {
                telaFun = new FormFuncionario();
                telaFun.setVisible(true);
                telaFun.setResizable(false);//nao permite a tela ser redimecionada
            } else {

                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadastroFuncionariosActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        try {
            
            String UsuarioMaster = jLabelUsuario.getText();
            
            conecta.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            
            if(UsuarioMaster.equals("master")){
                telaAge = new FormAgenda();
                telaAge.setVisible(true);
                telaAge.setResizable(false);//nao permite a tela ser redimecionada
            }else if (conecta.rs.getString("tipo_usuario").equals("Administrador") || conecta.rs.getString("tipo_usuario").equals("Funcionario")) {
                telaAge = new FormAgenda();
                telaAge.setVisible(true);
                telaAge.setResizable(false);//nao permite a tela ser redimecionada
            } else {
                JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "voce nao tem permissao para essa funcionalidade\n" + ex);
        }
    }//GEN-LAST:event_jButtonAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadClientes;
    private javax.swing.JButton jButtonCadFuncionarios;
    private javax.swing.JButton jButtonCadUsuario;
    private javax.swing.JButton jButtonSairBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemCadastroClientes;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadastroUsuarios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternalFrameBemVindo;
    // End of variables declaration//GEN-END:variables
}
