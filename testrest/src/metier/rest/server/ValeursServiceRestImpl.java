/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.rest.server;



import java.util.List;
import metier.entity.Valeurs;
import metier.service.ValeursService;
import metier.service.MetierFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 *
 * @author jupiter
 */
@Path("/ValeursService")
@Consumes("application/json")
@Produces("application/json")
public class ValeursServiceRestImpl {
    private final ValeursService valeursService = MetierFactory.getValeursService();
    @POST
    @Path("/")
    public Valeurs add(Valeurs t) throws Exception {
        return valeursService.add(t);
    }
    @DELETE
    @Path("/")
    public void remove(Valeurs t) throws Exception {
        this.valeursService.remove(t);
    }
    @PUT
    @Path("/")
    public void update(Valeurs t) throws Exception {
        this.valeursService.update(t);
    }
    @GET
    @Path("/{id}")
    public Valeurs getById(@PathParam("id") Long id) throws Exception {
        return this.valeursService.getById(id);
                
    }
    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return this.valeursService.getCount();
    }
    @GET
    @Path("/")
    public List<Valeurs> getAll() throws Exception {
        return this.valeursService.getAll();
    }
    @GET
    @Path("/{i}/{i1}")
    public List<Valeurs> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return this.valeursService.getAll(i, i1);
    }
    
}
