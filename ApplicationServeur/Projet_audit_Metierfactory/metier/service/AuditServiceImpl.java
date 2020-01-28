/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.metier.service;
import java.util.Date;
import java.util.List;
import projetaudit.metier.entity.Audit;
import projetaudit.metier.entity.Poste;
import projetaudit.metier.entity.Personne;
import projetaudit.physique.data.jpa.AuditDataService;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;
      

/**
 *
 * @author jupiter
 */
public class AuditServiceImpl implements AuditService{

    private final AuditDataService auditDataSrv = PhysiqueDataFactory.getAuditDataService();
    @Override
    public List<Audit> getByPoste(Poste poste) throws Exception {
        return this.auditDataSrv.getByPoste(poste);
    }

    @Override
    public List<Audit> getByPersonne(Personne personne) throws Exception {
        return this.auditDataSrv.getByPersonne(personne);    }

    @Override
    public List<Audit> getByDate(Date date) throws Exception {
return this.auditDataSrv.getByDate(date);    }

    @Override
    public Audit add(Audit t) throws Exception {
return this.auditDataSrv.add(t);
    }

    @Override
    public void remove(Audit t) throws Exception {
         this.remove(t);
    }

    @Override
    public void update(Audit t) throws Exception {
        this.auditDataSrv.update(t);
    }

    @Override
    public Audit getById(Long l) throws Exception {
return this.auditDataSrv.getById(l);
    }
    

    @Override
    public long getCount() throws Exception {
return  this.auditDataSrv.getCount();
    }

    @Override
    public List<Audit> getAll() throws Exception {
        return this.auditDataSrv.getAll();    }

    @Override
    public List<Audit> getAll(int i, int i1) throws Exception {
        return this.auditDataSrv.getAll(i, i1);}

  
  
    
}
