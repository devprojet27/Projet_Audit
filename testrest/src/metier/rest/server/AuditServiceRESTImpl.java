/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.rest.server;

import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import metier.entity.Audit;
import metier.entity.Personne;
import metier.service.AuditService;
import metier.service.MetierFactory;

/**
 *
 * @author jupiter
 */
@Path("/AuditService")
@Consumes("application/json")
@Produces("application/json")
public class AuditServiceRESTImpl {

    private final AuditService auditService = MetierFactory.getAuditService();

    @GET
    @Path("/getByPersonne/{idPersonne}")
    public List<Audit> getByPersonne(@PathParam("idPersonne") long idPersonne) throws Exception {
        Personne personne = MetierFactory.getPersonneService().getById(idPersonne);
        return auditService.getByPersonne(personne);
    }

    @GET
    @Path("/getByDate/{date}")
    public List<Audit> getByDate(@PathParam("date") Date date) throws Exception {
        return auditService.getByDate(date);
    }

    @POST
    @Path("/")
    public Audit add(Audit t) throws Exception {
        return auditService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Audit t) throws Exception {
        auditService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Audit t) throws Exception {
        auditService.update(t);
    }

    @GET
    @Path("/{id}")
    public Audit getById(@PathParam("id") long l) throws Exception {
        return this.auditService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return auditService.getCount();
    }

    @GET
    @Path("/")
    public List<Audit> getAll() throws Exception {
        return this.auditService.getAll();
    }

  
    @GET
    @Path("/{i}/{i1}")
    public List<Audit> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return this.auditService.getAll(i, i1);

    }
}
