/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Util {
        
    public static String getdataAtual(){//metodo para pegar a data atual
     
        String datahoje;
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//mascara da data como esta no banco de dados
        dateFormat.format(d);
        datahoje = dateFormat.format(d);
        
        return datahoje;
    }
    
    public void checa_e_atualiza_registros(){//altera a coluna de status para fechado se a data for anterior a data atual
       ConexaoBD conex = new ConexaoBD();
        
        try{
            conex.conexao();
            String sql = "UPDATE agenda SET status_agendas=? WHERE data_agendas < ?";
            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setString(1, "Fechado");
            pst.setDate(2, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));            
            pst.executeUpdate(); 
            pst.close();      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "nao foi possivel alterar o status no banco de dados (Util)\n" + e);
        }       
    conex.desconecta();
    }   
}
