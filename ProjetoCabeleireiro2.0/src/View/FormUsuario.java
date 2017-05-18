
package View;

import ModelBeans.BeansCliente;
import ModelBeans.BeansUsuario;
import ModelBeans.ModelTabela;
import ModelConection.ConexaoBD;
import ModelDao.UsuarioDao;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import org.json.simple.JSONObject;

/**
 *
 * @author ander
 */
public class FormUsuario extends javax.swing.JFrame {
    
    BeansUsuario mod = new BeansUsuario();
    UsuarioDao dao = new UsuarioDao();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public FormUsuario() {
        initComponents();
        preencherTabela("SELECT * FROM usuarios ORDER BY nome_usuario");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuário = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton6.setText("jButton6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel3.setText("Senha:");

        jLabel4.setText("Usuário:");

        jTextFieldUsuário.setEnabled(false);

        jLabel5.setText("Confirmar Senha:");

        jPasswordFieldConfirmarSenha.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        jLabel6.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Funcionario" }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        jLabel7.setText("ID:");

        jTextFieldCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(522, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldUsuário.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldBuscar.setText("");       
        
        jTextFieldNome.setEnabled(true);
        jTextFieldUsuário.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jTextFieldBuscar.setEnabled(false);
        jTextFieldBuscar.setText("");
        
        jButtonBuscar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTableUsuarios.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (flag == 1) {
            String nome = jTextFieldNome.getText();
            String usuario = jTextFieldUsuário.getText();
            String senha = jPasswordFieldSenha.getText();
            String senhaConfirmacao = jPasswordFieldConfirmarSenha.getText();
            String tipo = (String) jComboBoxTipo.getSelectedItem();

            //Cria um Objeto JSON
            JSONObject jsonObject = new JSONObject();

            //Armazena dados em um Objeto JSON
            jsonObject.put("nome", nome);
            jsonObject.put("usuario", usuario);
            jsonObject.put("senha", senha);
            jsonObject.put("senhaConfirmacao", senhaConfirmacao);
            jsonObject.put("tipo", tipo);

            Gson gson = new Gson();
            String Json = gson.toJson(jsonObject);

            URL url;
            try {
                url = new URL("http://localhost:8084/web-service/webresources/webService/usuario/cadastro");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");

                OutputStream os = connection.getOutputStream();
                os.write(Json.getBytes("UTF-8"));
                os.flush();

                int code = connection.getResponseCode();
                System.out.println(code + " - " + Json);

                os.close();
                connection.disconnect();

            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(null, "erro de URLException conexao ao rest ( salvar usuario)\n" + ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "erro de IOException conexao ao rest ( salvar usuario) \n" + ex);
            }
            
            jTextFieldNome.setText("");
            jTextFieldUsuário.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldUsuário.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jPasswordFieldConfirmarSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldBuscar.setEnabled(true);
            
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonBuscar.setEnabled(true);
            jTableUsuarios.setEnabled(true);
            
            preencherTabela("SELECT * FROM usuarios ORDER BY nome_usuario");
            
        } else {
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setUsuario(jTextFieldUsuário.getText());
            mod.setSenha(jPasswordFieldSenha.getText());
            mod.setSenhaConfirmacao(jPasswordFieldConfirmarSenha.getText());
            mod.setTipo((String) jComboBoxTipo.getSelectedItem());
            dao.editar(mod);
            
            jTextFieldNome.setText("");
            jTextFieldUsuário.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldUsuário.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jPasswordFieldConfirmarSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldBuscar.setEnabled(true);
            
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonBuscar.setEnabled(true);
            jTableUsuarios.setEnabled(true);
            
            preencherTabela("SELECT * FROM usuarios ORDER BY nome_usuario");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        
        jTextFieldNome.setEnabled(true);
        jTextFieldUsuário.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jTextFieldBuscar.setEnabled(false);
        jTextFieldBuscar.setText("");
        
        jButtonBuscar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTableUsuarios.setEnabled(false);
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        mod.setPesquisa(jTextFieldBuscar.getText());
        BeansUsuario model = dao.buscaUsuario(mod);//vai enviar por parametro para o metodo o que o usuario digitou

        jTextFieldCodigo.setText(String.valueOf(model.getCodigo()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldUsuário.setText(model.getUsuario());
        jPasswordFieldSenha.setText(model.getSenha());
        jPasswordFieldConfirmarSenha.setText(model.getSenhaConfirmacao());
        jComboBoxTipo.setSelectedItem(model.getTipo());
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTableUsuarios.setEnabled(true);
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldUsuário.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldBuscar.setText("");
        
        jButtonNovo.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldUsuário.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jTableUsuarios.setEnabled(true);
        
        jTextFieldBuscar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
          int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir ?");

        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            dao.excluir(mod);

            jTextFieldCodigo.setText("");
            jTextFieldNome.setText("");
            jTextFieldUsuário.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldBuscar.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldUsuário.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jPasswordFieldConfirmarSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldBuscar.setEnabled(true);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonBuscar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            
            preencherTabela("SELECT * FROM usuarios ORDER BY nome_usuario");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
          String nome_usuario = "" + jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '" + nome_usuario + "'");
        try {
            conex.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conex.rs.getInt("cod_usuario")));
            jTextFieldNome.setText(conex.rs.getString("nome_usuario"));
            jTextFieldUsuário.setText(conex.rs.getString("usuario_usuario"));
            jPasswordFieldSenha.setText(conex.rs.getString("senha_usuario"));
            jPasswordFieldConfirmarSenha.setText(conex.rs.getString("senhaconfirmacao_usuario"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("tipo_usuario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel selecionar os dados\n" + ex);
        }
        conex.desconecta();
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableUsuariosMouseClicked
    
    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Usuario", "Tipo"};
        
        conex.conexao();
        conex.executaSql(sql);
        
        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{conex.rs.getInt("cod_usuario"), conex.rs.getString("nome_usuario"), conex.rs.getString("usuario_usuario"), conex.rs.getString("tipo_usuario")});
                
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento (formUsuario)\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);
        
        jTableUsuarios.setModel(modelo);
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF);
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldUsuário;
    // End of variables declaration//GEN-END:variables
}
