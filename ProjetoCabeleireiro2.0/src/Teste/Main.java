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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/*

java.net.ConnectException: Connection refused: connect

Essa exceção normalmente ocorre quando não há serviço de escuta no IP / porta que você está tentando se conectar. No entanto, um número de coisas poderia estar causando o erro:

Você está tentando se conectar à porta / IP incorreta.
Você não iniciou o servidor.
Seu servidor não está ouvindo conexões.
Seu servidor tem muitas conexões pendentes esperando para ser aceito.
Um firewall está bloqueando sua conexão antes que ela atinja seu servidor.
 */
/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {//criei um pacote novo para tentar executar o web service ( testar) 

        String nome = "rodrigo";
        String usuario = "masterr";
        String senha = "2";
        String senhaConfirmacao = "2";
        String tipo = "Funcionario";

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
            connection.setRequestMethod("PUT");
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

    }

}
