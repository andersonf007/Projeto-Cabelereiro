package View;
// adicionado uma tabela agendas no banco de dados apenas e exclusivamente pelo fato de nao referenciar o codigo do funcionario
// e o projeto 2.0 o agendamento nao faz referencia a ele 

import ModelBeans.BeansAgenda;
import ModelBeans.ModelTabela;
import ModelConection.ConexaoBD;
import ModelDao.AgendaDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class FormAgenda extends javax.swing.JFrame {
    String sql_preencher_tabela_do_dia;
    ConexaoBD conex = new ConexaoBD();
    BeansAgenda agenda = new BeansAgenda();
    BeansAgenda agenda2 = new BeansAgenda();
    AgendaDao dao = new AgendaDao();
    
    String datahoje;
    String status;
    String status2;
    int flag = 0;
     
    public FormAgenda() {
        initComponents();
        //preencherFuncionarios();
        
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//mascara da data como esta no banco de dados
        dateFormat.format(d);
        
       datahoje = dateFormat.format(d);
       status = "Aberto";
       status2 = "Fechado";
       sql_preencher_tabela_do_dia ="SELECT cod_agendas,nome_cliente,telefone_cliente,"
               + "data_agendas,horario_agendas,servico_agendas,presenca_agendas FROM agendas"
               + " JOIN clientes ON cod_cliente = codcliente_agendas"
               + " WHERE data_agendas ='"+datahoje+"' AND status_agendas ='"+status+"' ORDER BY horario_agendas";

        
        preencherTabelaAgendaDoDia(sql_preencher_tabela_do_dia);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        buttonGroupPresenca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jDateChooserdata = new com.toedter.calendar.JDateChooser();
        jButtonFinalizarAgendamento = new javax.swing.JButton();
        jButtonCancelarAgendamento = new javax.swing.JButton();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamentoDoDia = new javax.swing.JTable();
        jButtonAlterarAgendamento = new javax.swing.JButton();
        jButtonValidaPresenca = new javax.swing.JButton();
        jtextFieldServico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonNovoAgendamento = new javax.swing.JButton();
        jDateChooserDataDesejada = new com.toedter.calendar.JDateChooser();
        jButtonPesquisaDiaDesejado = new javax.swing.JButton();
        jRadioButtonPresente = new javax.swing.JRadioButton();
        jRadioButtonAusente = new javax.swing.JRadioButton();
        jButtonExcluirAgendamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCliente.setText("Cliente:");
        jPanel1.add(jLabelCliente);
        jLabelCliente.setBounds(12, 42, 41, 15);

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelData.setText("Data:");
        jPanel1.add(jLabelData);
        jLabelData.setBounds(240, 180, 33, 15);

        jLabelHorario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelHorario.setText("Horário:");
        jPanel1.add(jLabelHorario);
        jLabelHorario.setBounds(10, 190, 42, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Serviço:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 230, 43, 15);

        jTextFieldCliente.setEnabled(false);
        jTextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCliente);
        jTextFieldCliente.setBounds(57, 40, 290, 30);

        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.setEnabled(false);
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarCliente);
        jButtonBuscarCliente.setBounds(350, 40, 70, 30);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCliente);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 80, 410, 92);

        jDateChooserdata.setEnabled(false);
        jPanel1.add(jDateChooserdata);
        jDateChooserdata.setBounds(280, 180, 140, 30);

        jButtonFinalizarAgendamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonFinalizarAgendamento.setText("Finalizar agendamento");
        jButtonFinalizarAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonFinalizarAgendamento.setEnabled(false);
        jButtonFinalizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFinalizarAgendamento);
        jButtonFinalizarAgendamento.setBounds(280, 250, 134, 25);

        jButtonCancelarAgendamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCancelarAgendamento.setText("Cancelar agendamento");
        jButtonCancelarAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCancelarAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelarAgendamento);
        jButtonCancelarAgendamento.setBounds(280, 280, 135, 25);

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:30", "7:45", "8:00", "8:15", "8:30", "8:45", "9:00", "9:15", "9:30", "9:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30" }));
        jComboBoxHorario.setEnabled(false);
        jPanel1.add(jComboBoxHorario);
        jComboBoxHorario.setBounds(60, 190, 130, 30);

        jTableAgendamentoDoDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAgendamentoDoDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendamentoDoDiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgendamentoDoDia);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 80, 900, 148);

        jButtonAlterarAgendamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAlterarAgendamento.setText("Alterar agendamento");
        jButtonAlterarAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAlterarAgendamento.setEnabled(false);
        jButtonAlterarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterarAgendamento);
        jButtonAlterarAgendamento.setBounds(280, 310, 135, 25);

        jButtonValidaPresenca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonValidaPresenca.setText("Valida presença");
        jButtonValidaPresenca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonValidaPresenca.setEnabled(false);
        jButtonValidaPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidaPresencaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonValidaPresenca);
        jButtonValidaPresenca.setBounds(430, 340, 135, 25);

        jtextFieldServico.setEnabled(false);
        jPanel1.add(jtextFieldServico);
        jtextFieldServico.setBounds(10, 250, 210, 60);

        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 16, 15, 14);

        jTextFieldCodigo.setEnabled(false);
        jPanel1.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(31, 13, 76, 20);

        jButtonNovoAgendamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovoAgendamento.setText("Novo agendamento");
        jButtonNovoAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoAgendamento);
        jButtonNovoAgendamento.setBounds(280, 220, 135, 25);
        jPanel1.add(jDateChooserDataDesejada);
        jDateChooserDataDesejada.setBounds(770, 40, 150, 30);

        jButtonPesquisaDiaDesejado.setText("Pesquisa");
        jButtonPesquisaDiaDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaDiaDesejadoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisaDiaDesejado);
        jButtonPesquisaDiaDesejado.setBounds(930, 40, 90, 30);

        buttonGroupPresenca.add(jRadioButtonPresente);
        jRadioButtonPresente.setText("Presente");
        jRadioButtonPresente.setEnabled(false);
        jRadioButtonPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPresenteActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonPresente);
        jRadioButtonPresente.setBounds(430, 280, 69, 23);

        buttonGroupPresenca.add(jRadioButtonAusente);
        jRadioButtonAusente.setText("Ausente");
        jRadioButtonAusente.setEnabled(false);
        jPanel1.add(jRadioButtonAusente);
        jRadioButtonAusente.setBounds(430, 310, 93, 23);

        jButtonExcluirAgendamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonExcluirAgendamento.setText("Excluir agendamento");
        jButtonExcluirAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonExcluirAgendamento.setEnabled(false);
        jButtonExcluirAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluirAgendamento);
        jButtonExcluirAgendamento.setBounds(280, 340, 135, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 1340, 390);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agendamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 10, 109, 22);

        setSize(new java.awt.Dimension(1367, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        preencherTabelaCliente("select cod_cliente,nome_cliente,telefone_cliente from clientes where nome_cliente like'%" + jTextFieldCliente.getText()+ "%'");
        jTableCliente.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
         String nome_cliente = "" + jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT * FROM clientes WHERE nome_cliente = '" + nome_cliente + "'");
        try {
            conex.rs.first();
            jTextFieldCliente.setText(conex.rs.getString("nome_cliente"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel selecionar os dados" + ex);
        }
        conex.desconecta();
        
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jButtonFinalizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarAgendamentoActionPerformed

        if (flag == 1) {
            agenda.setNomeCliente(jTextFieldCliente.getText());
        //    agenda.setNomeFuncionario((String) jComboBoxFuncionario.getSelectedItem());
            agenda.setData(jDateChooserdata.getDate());
            agenda.setHorario((String) jComboBoxHorario.getSelectedItem());
            agenda.setServico(jtextFieldServico.getText());
            agenda.setStatus("Aberto");       
            dao.salvar(agenda);

            jTextFieldCliente.setText("");
            jtextFieldServico.setText("");

        //    jComboBoxFuncionario.setEnabled(!true);
            jComboBoxHorario.setEnabled(!true);
            jDateChooserdata.setEnabled(!true);
            jButtonFinalizarAgendamento.setEnabled(!true);
            jButtonCancelarAgendamento.setEnabled(!true);
            jtextFieldServico.setEnabled(!true);
            jTableAgendamentoDoDia.setEnabled(true);
            jTextFieldCliente.setEnabled(false);
            jButtonBuscarCliente.setEnabled(false);
            jButtonNovoAgendamento.setEnabled(true);
            jTableCliente.setEnabled(false);
            jDateChooserDataDesejada.setEnabled(true);
            jButtonPesquisaDiaDesejado.setEnabled(true);

            preencherTabelaAgendaDoDia(sql_preencher_tabela_do_dia);
        } else {
            agenda.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            agenda.setNomeCliente(jTextFieldCliente.getText());
        //    agenda.setNomeFuncionario((String) jComboBoxFuncionario.getSelectedItem());
            agenda.setData(jDateChooserdata.getDate());
            agenda.setHorario((String) jComboBoxHorario.getSelectedItem());
            agenda.setServico(jtextFieldServico.getText());
           
            int codCli = dao.buscarCodCliente(jTextFieldCliente.getText());
            String nomeCliente = jTextFieldCliente.getText();
        //    int codFun = dao.buscarCodFuncionario((String) jComboBoxFuncionario.getSelectedItem());
            //o codFun era passado como parametro
            dao.editar(agenda,codCli);

            jTextFieldCliente.setText("");
            jtextFieldServico.setText("");

        //    jComboBoxFuncionario.setEnabled(!true);
            jComboBoxHorario.setEnabled(!true);
            jDateChooserdata.setEnabled(!true);
            jButtonFinalizarAgendamento.setEnabled(!true);
            jButtonCancelarAgendamento.setEnabled(!true);
            jtextFieldServico.setEnabled(!true);
            jTableAgendamentoDoDia.setEnabled(true);
            jTextFieldCliente.setEnabled(false);
            jButtonBuscarCliente.setEnabled(false);
            jButtonNovoAgendamento.setEnabled(true);              
            jDateChooserDataDesejada.setEnabled(true);
            jButtonPesquisaDiaDesejado.setEnabled(true);

            preencherTabelaAgendaDoDia(sql_preencher_tabela_do_dia);
        }
    }//GEN-LAST:event_jButtonFinalizarAgendamentoActionPerformed

    private void jButtonCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAgendamentoActionPerformed
        jTextFieldCliente.setText("");
        jtextFieldServico.setText("");
        jTextFieldCliente.setEnabled(false);
        jTableAgendamentoDoDia.setEnabled(true);
        jButtonBuscarCliente.setEnabled(false);
    //    jComboBoxFuncionario.setEnabled(false);
        jComboBoxHorario.setEnabled(false);
        jDateChooserdata.setEnabled(false);
        jtextFieldServico.setEnabled(false);
        jButtonAlterarAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.setEnabled(false);
        jButtonValidaPresenca.setEnabled(false);
        jRadioButtonAusente.setEnabled(false);
        jRadioButtonPresente.setEnabled(false);
        jButtonExcluirAgendamento.setEnabled(false);
        jButtonFinalizarAgendamento.setEnabled(false);
        jButtonNovoAgendamento.setEnabled(true);
        jTableCliente.setEnabled(false);
        jDateChooserDataDesejada.setEnabled(true);
        jButtonPesquisaDiaDesejado.setEnabled(true);
        jTableAgendamentoDoDia.getSelectionModel().clearSelection();//limpa a selecao da tabela
        jTableCliente.getSelectionModel().clearSelection();
    }//GEN-LAST:event_jButtonCancelarAgendamentoActionPerformed

    private void jTableAgendamentoDoDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendamentoDoDiaMouseClicked
        String cod_agenda = "" + jTableAgendamentoDoDia.getValueAt(jTableAgendamentoDoDia.getSelectedRow(), 0);
        conex.conexao();
        conex.executaSql("SELECT * FROM agendas A JOIN clientes C ON A.codcliente_agendas = C.cod_cliente "
                + "WHERE A.cod_agendas = '"+cod_agenda+"'");
         try {
            conex.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conex.rs.getInt("cod_agendas")));
            jTextFieldCliente.setText(conex.rs.getString("nome_cliente"));
    //        jComboBoxFuncionario.setSelectedItem(conex.rs.getString("nome_funcionario"));
            jComboBoxHorario.setSelectedItem(conex.rs.getString("horario_agendas"));
            jtextFieldServico.setText(conex.rs.getString("servico_agendas"));
            jDateChooserdata.setDate(conex.rs.getDate("data_agendas"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel selecionar os dados" + ex);
        }
        jButtonAlterarAgendamento.setEnabled(true);
        jButtonValidaPresenca.setEnabled(true); 
        jButtonCancelarAgendamento.setEnabled(true);
        jButtonNovoAgendamento.setEnabled(false);
        jTableCliente.setEnabled(false);    
        jButtonExcluirAgendamento.setEnabled(true);
        jDateChooserDataDesejada.setEnabled(false);
        jButtonPesquisaDiaDesejado.setEnabled(false);
        jButtonValidaPresenca.setEnabled(true);
        jRadioButtonPresente.setEnabled(true);
        jRadioButtonAusente.setEnabled(true);
        
    }//GEN-LAST:event_jTableAgendamentoDoDiaMouseClicked

    private void jButtonAlterarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarAgendamentoActionPerformed
        flag = 2;
        jTextFieldCliente.setEnabled(false);
        jButtonNovoAgendamento.setEnabled(false);
        jButtonValidaPresenca.setEnabled(false);
        jRadioButtonAusente.setEnabled(false);
        jRadioButtonPresente.setEnabled(false);
        jButtonExcluirAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.setEnabled(true);
        jButtonAlterarAgendamento.setEnabled(false);
        jButtonFinalizarAgendamento.setEnabled(true);
        jTableAgendamentoDoDia.setEnabled(false);
        jTableCliente.setEnabled(true);
    //    jComboBoxFuncionario.setEnabled(true);
        jComboBoxHorario.setEnabled(true);
        jDateChooserdata.setEnabled(true);
        jtextFieldServico.setEnabled(true);
        jTextFieldCliente.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarAgendamentoActionPerformed

    private void jButtonNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoAgendamentoActionPerformed
        flag = 1;
    //    jComboBoxFuncionario.setEnabled(true);
        jComboBoxHorario.setEnabled(true);
        jDateChooserdata.setEnabled(true);
        jButtonFinalizarAgendamento.setEnabled(true);
        jButtonCancelarAgendamento.setEnabled(true);
        jtextFieldServico.setEnabled(true);
        jTableCliente.setEnabled(true);
        jTableAgendamentoDoDia.setEnabled(false);
        jTextFieldCliente.setEnabled(true);
        jButtonBuscarCliente.setEnabled(true);
        jButtonNovoAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.setEnabled(true);
        jButtonValidaPresenca.setEnabled(false);
        jButtonAlterarAgendamento.setEnabled(false);
        jDateChooserDataDesejada.setEnabled(false);
        jButtonPesquisaDiaDesejado.setEnabled(false);
        jTableAgendamentoDoDia.getSelectionModel().clearSelection();//limpa a selecao da tabela
    }//GEN-LAST:event_jButtonNovoAgendamentoActionPerformed

    private void jButtonValidaPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidaPresencaActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente validar ?");
        String sql = null;
       
        if(jRadioButtonPresente.isSelected()){
            sql = "UPDATE agendas SET presenca_agendas ='P' WHERE cod_agendas = '"+jTextFieldCodigo.getText()+"'";
        }else if(jRadioButtonAusente.isSelected()){ 
            sql = "UPDATE agendas SET presenca_agendas ='F' WHERE cod_agendas = '"+jTextFieldCodigo.getText()+"'";
        }
        if (resposta == JOptionPane.YES_OPTION) {
            try {
                conex.conexao();
                PreparedStatement pst = conex.con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"validação marcado com sucesso!");
                pst.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"erro na hora de marcar presença\n"+ ex);
            }
            conex.desconecta();
        }else if(resposta == JOptionPane.NO_OPTION){
            jtextFieldServico.setText("");
            jTextFieldCliente.setText("");
        }
        preencherTabelaAgendaDoDia(sql_preencher_tabela_do_dia);
        
        jtextFieldServico.setText("");
        jTextFieldCliente.setText("");
        jButtonNovoAgendamento.setEnabled(true);
        jButtonCancelarAgendamento.setEnabled(false);
        jButtonAlterarAgendamento.setEnabled(false);
        jButtonExcluirAgendamento.setEnabled(false);
        jRadioButtonAusente.setEnabled(false);
        jRadioButtonPresente.setEnabled(false);
        jButtonValidaPresenca.setEnabled(false);
        jDateChooserDataDesejada.setEnabled(true);
        jButtonPesquisaDiaDesejado.setEnabled(true);

    }//GEN-LAST:event_jButtonValidaPresencaActionPerformed

    private void jButtonPesquisaDiaDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaDiaDesejadoActionPerformed
         preencherTabelaAgendaDoDiaDesejado("SELECT cod_agendas,nome_cliente,telefone_cliente,"
               + "data_agendas,horario_agendas,servico_agendas,presenca_agendas FROM agendas"
               + " JOIN clientes ON cod_cliente = codcliente_agendas"
               + " WHERE data_agendas ='"+jDateChooserDataDesejada.getDate()+"' AND status_agendas ='"+status2+"' ORDER BY horario_agendas");
    }//GEN-LAST:event_jButtonPesquisaDiaDesejadoActionPerformed

    private void jTextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteActionPerformed

    private void jRadioButtonPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPresenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPresenteActionPerformed

    private void jButtonExcluirAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAgendamentoActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir ?");

        if (resposta == JOptionPane.YES_OPTION) {
            agenda.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            dao.excluir(agenda);

            jTextFieldCodigo.setText("");
            jTextFieldCliente.setText("");
            jtextFieldServico.setText("");
        //    jComboBoxFuncionario.setEnabled(false);
            jComboBoxHorario.setEnabled(false);
            
            jButtonNovoAgendamento.setEnabled(true);
            jButtonValidaPresenca.setEnabled(false);
            jButtonFinalizarAgendamento.setEnabled(false);
            jButtonAlterarAgendamento.setEnabled(false);
            jButtonCancelarAgendamento.setEnabled(false);
            jButtonBuscarCliente.setEnabled(false);
            jTableCliente.setEnabled(false);
            
            preencherTabelaAgendaDoDia(sql_preencher_tabela_do_dia);
        }
    }//GEN-LAST:event_jButtonExcluirAgendamentoActionPerformed
    /*
    public void preencherFuncionarios(){
        conex.conexao();
        conex.executaSql("SELECT * FROM funcionarios ORDER BY nome_funcionario");
        try{
            conex.rs.first();
            jComboBoxFuncionario.removeAllItems();
            do{
                jComboBoxFuncionario.addItem(conex.rs.getString("nome_funcionario"));
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao preencher funcionarios" + ex);
        }
        conex.desconecta();
    }*/
    
    public void preencherTabelaCliente(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Telefone"};

        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{conex.rs.getInt("cod_cliente"), conex.rs.getString("nome_cliente"), conex.rs.getString("telefone_cliente")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableCliente.setModel(modelo);
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableCliente.getColumnModel().getColumn(0).setResizable(false);
        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(235);
        jTableCliente.getColumnModel().getColumn(1).setResizable(false);
        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableCliente.getColumnModel().getColumn(2).setResizable(false);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.setAutoResizeMode(jTableCliente.AUTO_RESIZE_OFF);
        jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

    public void preencherTabelaAgendaDoDia(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome do cliente", "Telefone","Data", "Horário", "Serviço", "Presença"};

        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("cod_agendas"), conex.rs.getString("nome_cliente"), 
                          conex.rs.getString("telefone_cliente"),
                          conex.rs.getString("data_agendas"), conex.rs.getString("horario_agendas"), 
                          conex.rs.getString("servico_agendas"), conex.rs.getString("presenca_agendas")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não tem agendamento para hoje\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableAgendamentoDoDia.setModel(modelo);
        jTableAgendamentoDoDia.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableAgendamentoDoDia.getColumnModel().getColumn(0).setResizable(false);
        jTableAgendamentoDoDia.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableAgendamentoDoDia.getColumnModel().getColumn(1).setResizable(false);
        jTableAgendamentoDoDia.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableAgendamentoDoDia.getColumnModel().getColumn(2).setResizable(false);        
        jTableAgendamentoDoDia.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAgendamentoDoDia.getColumnModel().getColumn(3).setResizable(false);        
        jTableAgendamentoDoDia.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableAgendamentoDoDia.getColumnModel().getColumn(4).setResizable(false);              
        jTableAgendamentoDoDia.getColumnModel().getColumn(5).setPreferredWidth(185);
        jTableAgendamentoDoDia.getColumnModel().getColumn(5).setResizable(false);  
        jTableAgendamentoDoDia.getColumnModel().getColumn(6).setPreferredWidth(78);
        jTableAgendamentoDoDia.getColumnModel().getColumn(6).setResizable(false);
        jTableAgendamentoDoDia.getTableHeader().setReorderingAllowed(false);
        jTableAgendamentoDoDia.setAutoResizeMode(jTableAgendamentoDoDia.AUTO_RESIZE_OFF);
        jTableAgendamentoDoDia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
     
    public void preencherTabelaAgendaDoDiaDesejado(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome do cliente", "Telefone", "Data", "Horário", "Serviço", "Presença"};

        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{conex.rs.getInt("cod_agendas"), conex.rs.getString("nome_cliente"),
                    conex.rs.getString("telefone_cliente"),conex.rs.getString("data_agendas"),
                    conex.rs.getString("horario_agendas"), conex.rs.getString("servico_agendas"),
                    conex.rs.getString("presenca_agendas")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel preencher a tabela de agenda do dia desejado\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableAgendamentoDoDia.setModel(modelo);
        jTableAgendamentoDoDia.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableAgendamentoDoDia.getColumnModel().getColumn(0).setResizable(false);
        jTableAgendamentoDoDia.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableAgendamentoDoDia.getColumnModel().getColumn(1).setResizable(false);
        jTableAgendamentoDoDia.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableAgendamentoDoDia.getColumnModel().getColumn(2).setResizable(false);        
        jTableAgendamentoDoDia.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAgendamentoDoDia.getColumnModel().getColumn(3).setResizable(false);        
        jTableAgendamentoDoDia.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableAgendamentoDoDia.getColumnModel().getColumn(4).setResizable(false);              
        jTableAgendamentoDoDia.getColumnModel().getColumn(5).setPreferredWidth(185);
        jTableAgendamentoDoDia.getColumnModel().getColumn(5).setResizable(false);
        jTableAgendamentoDoDia.getColumnModel().getColumn(6).setPreferredWidth(75);
        jTableAgendamentoDoDia.getColumnModel().getColumn(6).setResizable(false);
        jTableAgendamentoDoDia.getTableHeader().setReorderingAllowed(false);
        jTableAgendamentoDoDia.setAutoResizeMode(jTableAgendamentoDoDia.AUTO_RESIZE_OFF);
        jTableAgendamentoDoDia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPresenca;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterarAgendamento;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonCancelarAgendamento;
    private javax.swing.JButton jButtonExcluirAgendamento;
    private javax.swing.JButton jButtonFinalizarAgendamento;
    private javax.swing.JButton jButtonNovoAgendamento;
    private javax.swing.JButton jButtonPesquisaDiaDesejado;
    private javax.swing.JButton jButtonValidaPresenca;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private com.toedter.calendar.JDateChooser jDateChooserDataDesejada;
    private com.toedter.calendar.JDateChooser jDateChooserdata;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JList<String> jList2;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAusente;
    private javax.swing.JRadioButton jRadioButtonPresente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAgendamentoDoDia;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jtextFieldServico;
    // End of variables declaration//GEN-END:variables
}
