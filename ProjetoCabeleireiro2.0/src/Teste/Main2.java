/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author ander
 */
public class Main2 {
    
     public static void main(String[] args) {
     
     String nome ="funcionario";
            String telefone = "telefone";
            String sexo = (String) "masculino";

            //Cria um Objeto JSON
            JSONObject jsonObject = new JSONObject();

            //Armazena dados em um Objeto JSON
            jsonObject.put("nome", nome);
            jsonObject.put("telefone", telefone);
            jsonObject.put("sexo", sexo);

            Gson gson = new Gson();
            String Json = gson.toJson(jsonObject);

            URL url;
            try {
                url = new URL("http://localhost:8084/web-service/webresources/webService/funcionario/cadastro");

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
                JOptionPane.showMessageDialog(null, "erro de URLException conexao ao rest ( salvar funcionario)\n" + ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "erro de IOException conexao ao rest ( salvar funcionario) \n" + ex);
            }

     
     }
}
