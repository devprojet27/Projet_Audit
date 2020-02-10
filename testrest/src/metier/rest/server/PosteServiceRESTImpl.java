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
import metier.entity.Poste;
import metier.service.MetierFactory;
import metier.service.PosteService;

/**
 * /**
 *
 * @author jupiter
 */
@Path("/PosteService")
@Consumes("application/json")
@Produces("application/json")
public class PosteServiceRESTImpl {

    private final PosteService posteService = MetierFactory.getPosteService();

    @GET
    @Path("/getByFonction/{fonction}")
    public List<Poste> getByFonction(@PathParam("fonction") String fonction) throws Exception {
        return posteService.getByFonction(fonction);
    }

    @GET
    @Path("/getByActivite/{activite}")
    public List<Poste> getByActivite(@PathParam("activite") String activite) throws Exception {
        return posteService.getByActivite(activite);
    }

    @GET
    @Path("/getByEmplacement/{emplacement}")
    public List<Poste> getByEmplacement(@PathParam("emplacement") String emplacement) throws Exception {
        return posteService.getByEmplacement(emplacement);
    }

    @POST
    @Path("/")
    public Poste add(Poste t) throws Exception {
        return posteService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Poste t) throws Exception {
        posteService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Poste t) throws Exception {
        posteService.update(t);
    }

    @GET
    @Path("/{id}")
    public Poste getById(@PathParam("id") Long l) throws Exception {
        return posteService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return posteService.getCount();
    }

    @GET
    @Path("/")
    public List<Poste> getAll() throws Exception {
        return posteService.getAll();
    }

   
    @GET
    @Path("/{i}/{i1}")
    public List<Poste> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return posteService.getAll(i, i1);
    }

}
