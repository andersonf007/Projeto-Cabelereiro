/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import ModelBeans.BeansCliente;
import ModelBeans.BeansFuncionario;
import ModelBeans.BeansUsuario;
import ModelConection.ConexaoBD;
import ModelDao.ClienteDao;
import ModelDao.FuncionarioDao;
import ModelDao.UsuarioDao;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
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
    
    /*--------------------CLIENTE---------------------*/
    @POST
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
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cliente/listarTodos")
    public List<BeansCliente> listarCliente(){return null;}
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("cliente/recuperarUnico")
    public String recuperarCliente(@PathParam("nome") String json){return null;}
    
    /*-------------------FUNCIONARIO------------------*/
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("funcionario/cadastro")
    public String cadastrarFuncionario(String json){
        
      BeansFuncionario mod = new BeansFuncionario();
      FuncionarioDao f = new FuncionarioDao();
      JSONObject jsonObject;
       
      JSONParser parser = new JSONParser();  
        
        String nome;
       	String telefone;
	String sexo; 
        
        try {
            jsonObject = (JSONObject) parser.parse(json);
            
            nome = (String) jsonObject.get("nome");
            telefone = (String) jsonObject.get("telefone");
            sexo = (String) jsonObject.get("sexo");
            
            mod.setNome(nome);
            mod.setTelefone(telefone);
            mod.setSexo(sexo);
            f.salvar(mod);
            
            Gson g = new Gson();
            return g.toJson(mod);
            
        } catch (ParseException ex) {
            Logger.getLogger(webService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /*-------------------USUARIO----------------------*/
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("usuario/cadastro")
    public String cadastrarUsuario(String json){
        
      BeansUsuario mod = new BeansUsuario();
      UsuarioDao u = new UsuarioDao();
      JSONObject jsonObject;
       
      JSONParser parser = new JSONParser();  
        
        String nome;
       	String usuario;
	String senha;         
       	String senhaConfirmacao;
	String tipo; 
        
        try {
            jsonObject = (JSONObject) parser.parse(json);
            
            nome = (String) jsonObject.get("nome");
            usuario = (String) jsonObject.get("usuario");
            senha = (String) jsonObject.get("senha");
            senhaConfirmacao = (String) jsonObject.get("senhaConfirmacao");
            tipo = (String) jsonObject.get("tipo");
            
            mod.setNome(nome);
            mod.setUsuario(usuario);
            mod.setSenha(senha);
            mod.setSenhaConfirmacao(senhaConfirmacao);
            mod.setTipo(tipo);
            u.salvar(mod);
            
            Gson g = new Gson();
            return g.toJson(mod);
            
        } catch (ParseException ex) {
            Logger.getLogger(webService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Consumes(MediaType.TEXT_PLAIN)
    @Path("usuario/recuperarUnico")
    public String recuperarUsuario(@QueryParam("nome") String json){
        
      BeansUsuario mod = new BeansUsuario();
      UsuarioDao u = new UsuarioDao();
   
      String nome;
           
            mod.setPesquisa(json);           
            mod = u.buscaUsuario(mod);
            
            Gson g = new Gson();
            String d = g.toJson(mod);
            return g.toJson(mod);
          
    }
        
    
    /*---------------------AGENDA------------------------*/
}
