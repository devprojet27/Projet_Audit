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
import metier.entity.Personne;
import metier.entity.Poste;
import metier.service.MetierFactory;
import metier.service.PersonneService;
import metier.service.PosteService;

/**
 *
 * @author jupiter
 */
@Path("/PersonneService")
@Consumes("application/json")
@Produces("application/json")
public class PersonneServiceRESTImpl {

    private final PersonneService personneService = MetierFactory.getPersonneService();

    @GET
    @Path("/getByLogin/{login}")
    public Personne getByLogin(@PathParam("login") String login) throws Exception {
        return personneService.getByLogin(login);
    }

    @GET
    @Path("/getByNom/{nom}")
    public List<Personne> getByNom(@PathParam("nom") String nom) throws Exception {
        return this.personneService.getByNom(nom);

    }

    @GET
    @Path("/getByPoste/{idPoste}")
    public List<Personne> getByPoste(@PathParam("idPoste") long idPoste) throws Exception {
        Poste poste = MetierFactory.getPosteService().getById(idPoste);
        return this.personneService.getByPoste(poste);
    }

    @POST
    @Path("/")
    public Personne add(Personne t) throws Exception {
        return personneService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Personne t) throws Exception {
        personneService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Personne t) throws Exception {
        personneService.update(t);
    }

     @GET
    @Path("/{id}")
    public Personne getById(@PathParam("id") Long l) throws Exception {
        return this.personneService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return personneService.getCount();
    }

    @GET
    @Path("/")
    public List<Personne> getAll() throws Exception {
        return this.personneService.getAll();
    }

   
    @GET
    @Path("/{i}/{i1}")
    public List<Personne> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return this.personneService.getAll(i, i1);
    }

}
