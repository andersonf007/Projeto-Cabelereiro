/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import ModelBeans.BeansCliente;
import ModelBeans.BeansUsuario;
import ModelConection.ConexaoBD;
import ModelDao.ClienteDao;
import ModelDao.UsuarioDao;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * REST Web Service
 *
 * @author ander
 */
@Path("webService")
public class webService {

    ConexaoBD conex = new ConexaoBD();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of webService
     */
    public webService() {
    }

    /**
     * Retrieves representation of an instance of ws.webService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "meu primeiro web service";
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("cliente/cadastro")
    public String cadastrarCliente(String json){
      BeansCliente mod = new BeansCliente();
      ClienteDao c = new ClienteDao();
      JSONObject jsonObject;
       
      JSONParser parser = new JSONParser();  
        
        String nome;
        String email;
	String telefone;
	String sexo; 
        
        try {
            jsonObject = (JSONObject) parser.parse(json);
            
            nome = (String) jsonObject.get("nome");
            email = (String) jsonObject.get("email");
            telefone = (String) jsonObject.get("telefone");
            sexo = (String) jsonObject.get("sexo");
            
            mod.setNome(nome);
            mod.setEmail(email);
            mod.setTelefone(telefone);
            mod.setSexo(sexo);
            c.salvar(mod);
            
            Gson g = new Gson();
            return g.toJson(mod);
            
        } catch (ParseException ex) {
            Logger.getLogger(webService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * PUT method for updating or creating an instance of webService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
