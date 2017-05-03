package ModelDao;

import ModelBeans.BeansAgenda;
import ModelBeans.BeansCliente;
import ModelConection.ConexaoBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ClienteDao {

    ConexaoBD conex = new ConexaoBD();
    BeansCliente mod = new BeansCliente();
    BeansAgenda modA = new BeansAgenda();

    public void salvar(BeansCliente mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO clientes(nome_cliente,email_cliente,sexo_cliente,telefone_cliente) VALUES(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
        //    pst.setString(3, mod.getCpf());
        //    pst.setDate(4, new java.sql.Date(mod.getDataNascimento().getTime()));
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel salvar \n" + ex);
        }
        conex.desconecta();
    }

    public BeansCliente buscaCliente(BeansCliente mod) {
        conex.conexao();
        conex.executaSql("select * from clientes where nome_cliente like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodido(conex.rs.getInt("cod_cliente"));
            mod.setNome(conex.rs.getString("nome_cliente"));
            mod.setEmail(conex.rs.getString("email_cliente"));
        //    mod.setCpf(conex.rs.getString("cpf_cliente"));
            mod.setTelefone(conex.rs.getString("telefone_cliente"));
            mod.setSexo(conex.rs.getString("sexo_cliente"));
        //    mod.setDataNascimento(conex.rs.getDate("datanasc_cliente"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o cliente \n" + ex);
        }
        conex.desconecta();
        return mod;
    }

    public void editar(BeansCliente mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE clientes set nome_cliente=?, email_cliente=?, sexo_cliente=?, telefone_cliente=? where cod_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
        //    pst.setString(3, mod.getCpf());
        //    pst.setDate(4, new java.sql.Date(mod.getDataNascimento().getTime()));
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getTelefone());
            pst.setInt(5, mod.getCodido());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel alterar os dados \n" + ex);
        }

        conex.desconecta();

    }
    
    public void excluir(BeansCliente mod, BeansAgenda mod2){
        conex.conexao();
        
        try {
            PreparedStatement pst2 = conex.con.prepareCall("DELETE FROM agenda WHERE codcliente_agendas=?");
            pst2.setInt(1, mod2.getCodigo());
            pst2.execute();
            JOptionPane.showMessageDialog(null, "Dados a agenda deletados com sucesso!!!");

            PreparedStatement pst = conex.con.prepareCall("DELETE FROM clientes WHERE cod_cliente=?");
            pst.setInt(1, mod.getCodido());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel excluir os dados (clienteDao) \n" + ex);
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
