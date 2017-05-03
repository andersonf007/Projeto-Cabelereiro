/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.BeansFuncionario;
import ModelBeans.ModelTabela;
import ModelConection.ConexaoBD;
import ModelDao.FuncionarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class FormFuncionario extends javax.swing.JFrame {

    BeansFuncionario mod = new BeansFuncionario();
    FuncionarioDao control = new FuncionarioDao();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public FormFuncionario() {
        initComponents();
        preencherTabela("SELECT * FROM funcionarios ORDER BY nome_funcionario");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormularioCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelFormularioCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFormularioCliente.setLayout(null);

        jLabelNome.setText("Nome:");
        jPanelFormularioCliente.add(jLabelNome);
        jLabelNome.setBounds(10, 50, 40, 20);

        jLabelTelefone.setText("Telefone:");
        jPanelFormularioCliente.add(jLabelTelefone);
        jLabelTelefone.setBounds(360, 40, 60, 30);

        jLabelSexo.setText("Sexo:");
        jPanelFormularioCliente.add(jLabelSexo);
        jLabelSexo.setBounds(10, 100, 30, 20);

        jTextFieldNome.setEnabled(false);
        jPanelFormularioCliente.add(jTextFieldNome);
        jTextFieldNome.setBounds(47, 46, 293, 30);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);
        jPanelFormularioCliente.add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(420, 40, 123, 30);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione", "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);
        jPanelFormularioCliente.add(jComboBoxSexo);
        jComboBoxSexo.setBounds(50, 90, 106, 30);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonNovo);
        jButtonNovo.setBounds(110, 130, 65, 25);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonSalvar);
        jButtonSalvar.setBounds(180, 130, 69, 25);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonCancelar);
        jButtonCancelar.setBounds(260, 130, 85, 25);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonEditar);
        jButtonEditar.setBounds(350, 130, 67, 25);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonExcluir);
        jButtonExcluir.setBounds(430, 130, 73, 25);

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        jPanelFormularioCliente.add(jScrollPane1);
        jScrollPane1.setBounds(0, 217, 630, 210);
        jPanelFormularioCliente.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(150, 170, 178, 27);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelFormularioCliente.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(340, 170, 111, 25);

        jLabelCodigo.setText("Codigo:");
        jPanelFormularioCliente.add(jLabelCodigo);
        jLabelCodigo.setBounds(10, 10, 50, 30);

        jTextFieldCodigo.setEnabled(false);
        jPanelFormularioCliente.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(60, 10, 91, 30);

        getContentPane().add(jPanelFormularioCliente);
        jPanelFormularioCliente.setBounds(0, 39, 630, 440);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(209, 11, 190, 22);

        setSize(new java.awt.Dimension(646, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldNome.setEnabled(true);
      //  jTextFieldEmail.setEnabled(true);
      //  jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
      //  jDateChooserDataNascimento.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTableFuncionario.setEnabled(false);


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

       /* if (!jTextFieldEmail.getText().isEmpty() && !control.validaEmail(jTextFieldEmail.getText())) {
            JOptionPane.showMessageDialog(null, "digite um EMAIL valido");
            jTextFieldEmail.requestFocus();
        } else*/ if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "preencha o NOME para continuar");
            jTextFieldNome.requestFocus();
        }/* else if (control.verificaData((Date) jDateChooserDataNascimento.getDate())) {
            JOptionPane.showMessageDialog(null, "digite uma DATA valido");
            jDateChooserDataNascimento.requestFocus();
        }*/
        if (flag == 1) {
            mod.setNome(jTextFieldNome.getText());
        //    mod.setEmail(jTextFieldEmail.getText());
        //    mod.setCpf(jFormattedTextFieldCPF.getText());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        //    mod.setDataNascimento(jDateChooserDataNascimento.getDate());
            control.salvar(mod);

            jTextFieldNome.setText("");
        //    jTextFieldEmail.setText("");
        //    jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldTelefone.setText("");
            jTextFieldPesquisa.setText("");
            jTextFieldNome.setEnabled(false);
        //   jTextFieldEmail.setEnabled(false);
        //    jFormattedTextFieldCPF.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
            jComboBoxSexo.setEnabled(false);
        //    jDateChooserDataNascimento.setEnabled(false);
            jTextFieldPesquisa.setEnabled(true);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jTableFuncionario.setEnabled(true);
            jButtonNovo.setEnabled(true);
            jButtonPesquisar.setEnabled(true);

            preencherTabela("SELECT * FROM Funcionarios ORDER BY nome_funcionario");
        } else {
            //alterar
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setNome(jTextFieldNome.getText());
        //    mod.setEmail(jTextFieldEmail.getText());
        //    mod.setCpf(jFormattedTextFieldCPF.getText());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        //    mod.setDataNascimento(jDateChooserDataNascimento.getDate());
            control.editar(mod);

            jTextFieldNome.setText("");
        //    jTextFieldEmail.setText("");
        //    jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldTelefone.setText("");
            jTextFieldPesquisa.setText("");
            jTextFieldNome.setEnabled(false);
        //    jTextFieldEmail.setEnabled(false);
        //    jFormattedTextFieldCPF.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
            jComboBoxSexo.setEnabled(false);
        //    jDateChooserDataNascimento.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);

            preencherTabela("SELECT * FROM funcionarios ORDER BY nome_funcionario");
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setText("");
    //    jTextFieldEmail.setText("");
    //    jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldTelefone.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldPesquisa.setText("");

        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTableFuncionario.setEnabled(true);

        jTextFieldNome.setEnabled(!true);
    //    jTextFieldEmail.setEnabled(!true);
    //    jFormattedTextFieldCPF.setEnabled(!true);
        jFormattedTextFieldTelefone.setEnabled(!true);
        jComboBoxSexo.setEnabled(!true);
    //    jDateChooserDataNascimento.setEnabled(!true);
        jTextFieldPesquisa.setEnabled(!false);

        preencherTabela("SELECT * FROM funcionarios ORDER BY cod_funcionario");


    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTableFuncionario.setEnabled(false);

        jTextFieldNome.setEnabled(true);
    //    jTextFieldEmail.setEnabled(true);
    //    jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
    //    jDateChooserDataNascimento.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);

        preencherTabela("SELECT * FROM funcionarios ORDER BY nome_funcionario");

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir ?");

        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            control.excluir(mod);

            jTextFieldCodigo.setText("");
            jTextFieldNome.setText("");
    //        jTextFieldEmail.setText("");
    //        jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldTelefone.setText("");
            jTextFieldPesquisa.setText("");
            jTextFieldNome.setEnabled(false);
    //        jTextFieldEmail.setEnabled(false);
    //        jFormattedTextFieldCPF.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
            jComboBoxSexo.setEnabled(false);
    //        jDateChooserDataNascimento.setEnabled(false);
            jTextFieldPesquisa.setEnabled(true);

            jTableFuncionario.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);

            preencherTabela("SELECT * FROM funcionarios ORDER BY nome_funcionario");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked

        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);

        String nome_funcionario = "" + jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT * FROM funcionarios WHERE nome_funcionario = '" + nome_funcionario + "'");
        try {
            conex.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conex.rs.getInt("cod_funcionario")));
            jTextFieldNome.setText(conex.rs.getString("nome_funcionario"));
    //        jTextFieldEmail.setText(conex.rs.getString("email_funcionario"));
    //        jFormattedTextFieldCPF.setText(conex.rs.getString("cpf_funcionario"));
            jFormattedTextFieldTelefone.setText(conex.rs.getString("telefone_funcionario"));
            jComboBoxSexo.setSelectedItem(conex.rs.getString("sexo_funcionario"));
    //        jDateChooserDataNascimento.setDate(conex.rs.getDate("datanasc_funcionario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel selecionar os dados" + ex);
        }
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);

    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansFuncionario model = control.buscaFuncionario(mod);//vai enviar por parametro para o metodo o que o usuario digitou

        jTextFieldCodigo.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNome());
    //    jTextFieldEmail.setText(model.getEmail());
    //    jFormattedTextFieldCPF.setText(model.getCpf());
        jFormattedTextFieldTelefone.setText(model.getTelefone());
        jComboBoxSexo.setSelectedItem(model.getSexo());
    //    jDateChooserDataNascimento.setDate(model.getDataNascimento());

        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTableFuncionario.setEnabled(true);

        preencherTabela("select * from funcionarios where nome_funcionario like'%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Telefone", "Sexo"};

        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{conex.rs.getInt("cod_funcionario"), conex.rs.getString("nome_funcionario"), conex.rs.getString("telefone_funcionario"), conex.rs.getString("sexo_funcionario")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento (formFuncionario)\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableFuncionario.setModel(modelo);
        jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableFuncionario.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableFuncionario.getColumnModel().getColumn(1).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableFuncionario.getColumnModel().getColumn(2).setResizable(false);
        jTableFuncionario.getColumnModel().getColumn(3).setPreferredWidth(223);
        jTableFuncionario.getColumnModel().getColumn(3).setResizable(false);
        jTableFuncionario.getTableHeader().setReorderingAllowed(false);
        jTableFuncionario.setAutoResizeMode(jTableFuncionario.AUTO_RESIZE_OFF);
        jTableFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelFormularioCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
