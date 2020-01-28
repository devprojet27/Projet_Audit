/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.entity.Agent;
import metier.entity.Audit;
import metier.entity.Auditeur;
import metier.entity.Poste;
import java.util.Date;
import java.util.List;
import lml.persistence.CrudService;

/**
 *
 * @author flori
 */
public interface AuditService extends CrudService<Audit> {

    public List<Audit> getByAuditeur(Auditeur auditeur) throws Exception;

    public List<Audit> getByAgent(Agent agent) throws Exception;

    public List<Audit> getByDate(Date date) throws Exception;

    public List<Audit> getByPoste(Poste poste) throws Exception;
}
