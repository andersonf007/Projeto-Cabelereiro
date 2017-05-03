/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansAgenda;
import ModelConection.ConexaoBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class AgendaDao {
    
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexCliente = new ConexaoBD();
    ConexaoBD conexFuncionario = new ConexaoBD();
    
    int codCli;
    int codFun;
    
    public void salvar(BeansAgenda agenda){
        buscarCliente(agenda.getNomeCliente());
//        buscarFuncionario(agenda.getNomeFuncionario());
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO agenda(codCliente_agendas,horario_agendas,data_agendas,servico_agendas,status_agendas) VALUES(?,?,?,?,?)");
       pst.setInt(1, codCli);
       pst.setString(2, agenda.getHorario());
       //pst.setInt(3, codFun);
       pst.setDate(3, new java.sql.Date(agenda.getData().getTime()));
       pst.setString(4, agenda.getServico());
       pst.setString(5, agenda.getStatus());
       pst.execute();
            JOptionPane.showMessageDialog(null, "agendamento marcado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar agendamento (agendaDao)" + ex);
        }
        
        conex.desconecta();
    }
    
    public void buscarCliente(String nomeCliente){
        conexCliente.conexao();
        conexCliente.executaSql("SELECT * FROM clientes WHERE nome_cliente = '" + nomeCliente + "'");
        try {
            conexCliente.rs.first();
            codCli = conexCliente.rs.getInt("cod_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o cliente (agendaDao) " + ex);
        }
    }
    
    public int buscarCodCliente(String nomeCliente){
        conexCliente.conexao();
        conexCliente.executaSql("SELECT * FROM clientes WHERE nome_cliente = '" + nomeCliente + "'");
        try {
            conexCliente.rs.first();
            codCli = conexCliente.rs.getInt("cod_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o cliente (agendaDao)" + ex);
        }
        return codCli;
    }
 /*   
    public void buscarFuncionario(String nomeFuncionario){
        conexFuncionario.conexao();
        conexFuncionario.executaSql("SELECT * FROM funcionarios WHERE nome_funcionario = '" + nomeFuncionario + "'");
        try {
            conexFuncionario.rs.first();
            codFun = conexFuncionario.rs.getInt("cod_funcionario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o funcionario " + ex);
        }
    }*/
  
    public int buscarCodFuncionario(String nomeFuncionario){
        conexFuncionario.conexao();
        conexFuncionario.executaSql("SELECT * FROM funcionarios WHERE nome_funcionario = '" + nomeFuncionario + "'");
        try {
            conexFuncionario.rs.first();
            codFun = conexFuncionario.rs.getInt("cod_funcionario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o funcionario (agendaDao)" + ex);
        }
        return codFun;
    }
    // aqui tinha o int codFuncionario sendo passado como parametro
    public void editar(BeansAgenda mod, int codCliente) {
        conex.conexao();
        
        String sql = "UPDATE agenda SET horario_agendas=?, data_agendas=?, servico_agendas=?"
                    + "WHERE cod_agendas=? ";
      /*  "UPDATE agenda A set C.nome_cliente=?, F.nome_funcionario=?, A.horario_agenda=?, "
                   + "A.data_agenda=?, A.servico_agenda=? JOIN clientes C ON C.cod_cliente = A.codcliente_agenda"
                   + " JOIN funcionarios F ON F.cod_funcionario = A.codfuncionario_agenda"
                   + " where cod_agenda=? and codcliente_agenda = '"+codCliente+"' and codfuncionario_agenda = '"+codFuncionario+"'"
        */try {
           PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setString(1, mod.getHorario());
            pst.setDate(2, new java.sql.Date(mod.getData().getTime()));
            pst.setString(3, mod.getServico());
        //    pst.setInt(4, codFuncionario );
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("ModelDao.AgendaDao.editar()\n" + ex);
            JOptionPane.showMessageDialog(null, "nao foi possivel alterar os dados  agendaDao \n" + ex);
        }
        conex.desconecta();
     }
     
    public void excluir(BeansAgenda mod){
        conex.conexao();
       //  System.out.println(mod.getCodigo());
        try {
            PreparedStatement pst = conex.con.prepareCall("DELETE FROM agenda WHERE cod_agendas=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel excluir os dados \n" + ex);
        }
        
        conex.desconecta();
        
    }
     
}
