/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansUsuario;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class UsuarioDao {
    
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();

    public void salvar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO usuarios(nome_usuario,usuario_usuario,senha_usuario,senhaconfirmacao_usuario,tipo_usuario) VALUES(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getSenhaConfirmacao());
            pst.setString(5, mod.getTipo());          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel salvar \n" + ex);
        }
        conex.desconecta();
    }

    public BeansUsuario buscaUsuario(BeansUsuario mod) {
        conex.conexao();
        conex.executaSql("select * from usuarios where nome_usuario like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_usuario"));
            mod.setNome(conex.rs.getString("nome_usuario"));
            mod.setUsuario(conex.rs.getString("usuario_usuario"));
            mod.setSenha(conex.rs.getString("senha_usuario"));
            mod.setSenhaConfirmacao(conex.rs.getString("senhaconfirmacao_usuario"));
            mod.setTipo(conex.rs.getString("tipo_usuario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar o usuario \n" + ex);
        }
        conex.desconecta();
        return mod;
    }

    public void editar(BeansUsuario mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE usuarios set nome_usuario=?,usuario_usuario=?,senha_usuario=?,senhaConfirmacao_usuario=?,tipo_usuario=? where cod_usuario=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getSenhaConfirmacao());
            pst.setString(5, mod.getTipo());
            pst.setInt(6, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel alterar os dados \n" + ex);
        }

        conex.desconecta();

    }
    public void excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareCall("DELETE FROM usuarios WHERE cod_usuario=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel excluir os dados \n" + ex);
        }
        
        conex.desconecta();
        
    }
    
}
