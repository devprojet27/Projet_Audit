/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import entity.Agent;
import entity.Audit;
import entity.Auditeur;
import lml.rest.client.ClientRest;
import java.util.List;

/**
 *
 * @author flori
 */
public class AuditServiceImpl extends ClientRest<Audit> implements AuditService {

    @Override
    public List<Audit> getByAuditeur(Auditeur auditeur) throws Exception {
        super.setPath("getByAuditeur/" + auditeur);
        return super.getEntitys();
    }

    @Override
    public List<Audit> getByAgent(Agent agent) throws Exception {
        super.setPath("getbyAgent/" + agent);
        return super.getEntitys();
    }

    @Override
    public Audit add(Audit t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(Audit t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(Audit t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public Audit getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();

    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<Audit> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<Audit> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

}
