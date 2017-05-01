/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansFuncionario;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FuncionarioDao {

    ConexaoBD conex = new ConexaoBD();
    BeansFuncionario mod = new BeansFuncionario();

    public void salvar(BeansFuncionario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO funcionarios(nome_funcionario,sexo_funcionario,telefone_funcionario) VALUES(?,?,?)");
            pst.setString(1, mod.getNome());
        //    pst.setString(2, mod.getEmail());
        //    pst.setString(3, mod.getCpf());
        //    pst.setDate(4, new java.sql.Date(mod.getDataNascimento().getTime()));
            pst.setString(2, mod.getSexo());
            pst.setString(3, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel salvar \n" + ex);
        }
        conex.desconecta();
    }

    public BeansFuncionario buscaFuncionario(BeansFuncionario mod) {
        conex.conexao();
        conex.executaSql("select * from funcionarios where nome_funcionario like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_funcionario"));
            mod.setNome(conex.rs.getString("nome_funcionario"));
        //    mod.setEmail(conex.rs.getString("email_funcionario"));
        //    mod.setCpf(conex.rs.getString("cpf_funcionario"));
            mod.setTelefone(conex.rs.getString("telefone_funcionario"));
            mod.setSexo(conex.rs.getString("sexo_funcionario"));
        //    mod.setDataNascimento(conex.rs.getDate("datanasc_funcionario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o funcionario \n" + ex);
        }
        conex.desconecta();
        return mod;
    }

    public void editar(BeansFuncionario mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE funcionarios set nome_funcionario=?, sexo_funcionario=?, telefone_funcionario=? where cod_funcionario=?");
            pst.setString(1, mod.getNome());
        //    pst.setString(2, mod.getEmail());
        //    pst.setString(3, mod.getCpf());
        //    pst.setDate(4, new java.sql.Date(mod.getDataNascimento().getTime()));
            pst.setString(2, mod.getSexo());
            pst.setString(3, mod.getTelefone());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel alterar os dados \n" + ex);
        }

        conex.desconecta();

    }
    public void excluir(BeansFuncionario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareCall("DELETE FROM funcionarios WHERE cod_funcionario=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel excluir os dados \n" + ex);
        }
        
        conex.desconecta();
        
    }
    public boolean validaEmail(String email){
          boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }   
    public boolean verificaData(Date data){
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        boolean verificacao;
        if(data.before(new Date(System.currentTimeMillis()))){
            verificacao = true;
        }else{
            verificacao = false;
        }
        return verificacao;
    }
    
}
