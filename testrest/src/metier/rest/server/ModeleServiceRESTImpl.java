/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.rest.server;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import metier.entity.Modele;
import metier.service.MetierFactory;
import metier.service.ModeleService;

/**
 *
 * @author jupiter
 */

@Path("/ModeleService")
@Consumes("application/json")
@Produces("application/json")
public class ModeleServiceRESTImpl {

    private final ModeleService modeleService = MetierFactory.getModeleService();

    @GET
    @Path("/getByTitre/{titre}")
    public Modele getByTitre(@PathParam("titre") String titre) throws Exception { //marche pas
        return modeleService.getByTitre(titre);
    }
        @GET
    @Path("/getByType/{type}")
    public List<Modele> getByType(@PathParam("type") String type) throws Exception {    //marche pas
        return modeleService.getByType(type);
    }

    @GET
    @Path("/getByNiveau/{niveau}")
    public List<Modele> getByNiveau(@PathParam("niveau") int niveau) throws Exception {      //marche pas
        return modeleService.getByNiveau(niveau);
    }

    @POST
    @Path("/")
    public Modele add(Modele t) throws Exception {
        return modeleService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Modele t) throws Exception {
        modeleService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Modele t) throws Exception {
        modeleService.update(t);
    }

     @GET
    @Path("/{id}")
    public Modele getById(@PathParam("id") Long l) throws Exception {
        return this.modeleService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return modeleService.getCount();
    }

    @GET
    @Path("/")
    public List<Modele> getAll() throws Exception {
        return this.modeleService.getAll();
    }

  
    @GET
    @Path("/{i}/{i1}")
    public List<Modele> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return this.modeleService.getAll(i, i1);
    }

}
