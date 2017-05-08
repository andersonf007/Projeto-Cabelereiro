/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import ModelBeans.BeansUsuario;
import ModelConection.ConexaoBD;
import ModelDao.UsuarioDao;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

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
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("usuario/get")
    public String getUsuario(){
       // conex.conexao();
        UsuarioDao u = new UsuarioDao();
        BeansUsuario mod = new BeansUsuario();
        mod.setCodigo(Integer.parseInt("4"));
        mod.setNome("otavio");
        mod.setTipo("Administrador");
        mod.setUsuario("oti");
        mod.setSenha("123");
        mod.setSenhaConfirmacao("123");
        u.salvar(mod);
        
        Gson g = new Gson();
        return g.toJson(mod);
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
