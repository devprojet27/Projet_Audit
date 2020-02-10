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
import metier.entity.Section;
import metier.service.MetierFactory;
import metier.service.SectionService;

/**
 *
 * @author jupiter
 */
@Path("/SectionService")
@Consumes("application/json")
@Produces("application/json")
public class SectionServiceRESTImpl {

    private final SectionService sectionService = MetierFactory.getSectionService();

    @GET
    @Path("/getByNom{nom}")
    public Section getByNom(@PathParam("nom") String nom) throws Exception {
        return sectionService.getByNom(nom);
    }

    @POST
    @Path("/")
    public Section add(Section t) throws Exception {
        return sectionService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Section t) throws Exception {
        sectionService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Section t) throws Exception {
        sectionService.update(t);
    }

   @GET
    @Path("/{id}")
    public Section getById(@PathParam("id") Long l) throws Exception {
        return sectionService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return sectionService.getCount();
    }

    @GET
    @Path("/")
    public List<Section> getAll() throws Exception {
        return sectionService.getAll();
    }

   
    @GET
    @Path("/{i}/{i1}")
    public List<Section> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return sectionService.getAll(i, i1);
    }

}
