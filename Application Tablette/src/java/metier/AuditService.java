/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import entity.Agent;
import entity.Audit;
import entity.Auditeur;
import java.util.List;
import lml.persistence.CrudService;

/**
 *
 * @author flori
 */
public interface AuditService extends CrudService<Audit> {

    public List<Audit> getByAuditeur(Auditeur auditeur) throws Exception;

    public List<Audit> getByAgent(Agent agent) throws Exception;
}
