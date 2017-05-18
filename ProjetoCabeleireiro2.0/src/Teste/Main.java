/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {//criei um pacote novo para tentar executar o web service ( testar) 

        String nome = "rodrigo";
        String usuario;
                String senha;
                String senhaConfirmacao;
                        String tipo;
            URL url;
        try {
            url = new URL("http://localhost:8084/web-service/webresources/webService/usuario/recuperarUnico?nome="+nome);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
          
            int code = connection.getResponseCode();
            System.out.println(code);

            InputStream os2 = connection.getInputStream();
            BufferedReader br =  new BufferedReader(new InputStreamReader(os2));
            
            String a;
            StringBuilder b = new StringBuilder();
            while ((a  = br.readLine()) != null){
             //a += br.readLine();
             b.append(a);
            }
            System.out.println(b.toString());
            connection.disconnect();
            
             JSONObject jsonObject;
       
             JSONParser parser = new JSONParser();  
      
            jsonObject = (JSONObject) parser.parse(b.toString());
            
            nome = (String) jsonObject.get("nome");
            usuario = (String) jsonObject.get("usuario");
            senha = (String) jsonObject.get("senha");
            senhaConfirmacao = (String) jsonObject.get("senhaConfirmacao");
            tipo = (String) jsonObject.get("tipo");
            
            System.out.println(senha);

        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "erro de URLException conexao ao rest ( recuperar usuario)\n" + ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro de IOException conexao ao rest ( Recuperar usuario) \n" + ex);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
