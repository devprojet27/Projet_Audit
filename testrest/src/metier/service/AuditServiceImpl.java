/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;

import java.util.Date;
import java.util.List;
import metier.entity.Audit;
import metier.entity.Modele;
import metier.entity.Personne;
import physique.data.AuditDataService;
import physique.data.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class AuditServiceImpl implements AuditService {

    private final AuditDataService auditDataSrv = PhysiqueDataFactory.getAuditDataService();

    

        public List<Audit> getByPersonne(Personne personne) throws Exception {
        return this.auditDataSrv.getByPersonne(personne);
    }

        public List<Audit> getByDate(Date date) throws Exception {
        return this.auditDataSrv.getByDate(date);
    }

        public Audit add(Audit t) throws Exception {
        return this.auditDataSrv.add(t);
    }

        public void remove(Audit t) throws Exception {
        this.remove(t);
    }

        public void update(Audit t) throws Exception {
        this.auditDataSrv.update(t);
    }

        public Audit getById(Long l) throws Exception {
        return this.auditDataSrv.getById(l);
    }

        public long getCount() throws Exception {
        return this.auditDataSrv.getCount();
    }

        public List<Audit> getAll() throws Exception {
        return this.auditDataSrv.getAll();
    }

        public List<Audit> getAll(int i, int i1) throws Exception {
        return this.auditDataSrv.getAll(i, i1);
    }

        public List<Audit> getByModele(Modele modele) throws Exception {
        return this.auditDataSrv.getByModele(modele);
    }

        public Audit getByTitre(String titre) throws Exception {
        return this.auditDataSrv.getByTitre(titre);
    }

}
