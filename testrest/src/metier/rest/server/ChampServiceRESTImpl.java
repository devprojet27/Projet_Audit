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
import metier.entity.Champ;
import metier.service.ChampService;
import metier.service.MetierFactory;

/**
 *
 * @author jupiter
 */
@Path("/ChampService")
@Consumes("application/json")
@Produces("application/json")
public class ChampServiceRESTImpl {

    private final ChampService champService = MetierFactory.getChampService();

//    @GET
//    @Path("/getByNom/{nom}")
//    public Champ getByNom(@PathParam("nom") String nom) throws Exception {
//        return champService.getByNom(nom);
//    }

    @POST
    @Path("/")
    public Champ add(Champ t) throws Exception {
        return champService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Champ t) throws Exception {
        champService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Champ t) throws Exception {
        champService.update(t);
    }

    @GET
    @Path("/{id}")
    public Champ getById(@PathParam("id") Long l) throws Exception {
        return champService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return champService.getCount();
    }

    @GET
    @Path("/")
    public List<Champ> getAll() throws Exception {
        return champService.getAll();
    }

    
    @GET
    @Path("/{i}/{i1}")
    public List<Champ> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return this.champService.getAll(i, i1);
    }

}
