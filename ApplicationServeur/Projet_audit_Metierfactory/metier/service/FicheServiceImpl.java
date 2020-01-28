/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.metier.service;

import projetaudit.physique.data.jpa.*;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import projetaudit.physique.data.jpa.FicheDataService;
import projetaudit.metier.entity.Fiche;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;
import projetaudit.metier.entity.Modele;
import projetaudit.metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public class FicheServiceImpl implements FicheService{

    private final FicheDataService ficheDataSrv = PhysiqueDataFactory.getFicheDataService();
    @Override
    public List<Fiche> getByPoste(Poste poste) throws Exception {
return this.ficheDataSrv.getByPoste(poste);
    }

    @Override
    public List<Fiche> getByDate(Date date) throws Exception {
return this.ficheDataSrv.getByDate(date);
    }

    @Override
    public List<Fiche> getByModele(Modele modele) throws Exception {
return this.ficheDataSrv.getByModele(modele);   }

    @Override
    public Fiche getByTitre(String titre) throws Exception {
return this.ficheDataSrv.getByTitre(titre);    }

    @Override
    public Fiche add(Fiche t) throws Exception {
return this.ficheDataSrv.add(t);
    }

    @Override
    public void remove(Fiche t) throws Exception {
this.ficheDataSrv.remove(t);
    }

    @Override
    public void update(Fiche t) throws Exception {
    this.ficheDataSrv.update(t);    }

    @Override
    public Fiche getById(Long l) throws Exception {
return this.ficheDataSrv.getById(l);    }

    @Override
    public long getCount() throws Exception {
return this.ficheDataSrv.getCount();    }

    @Override
    public List<Fiche> getAll() throws Exception {
return this.getAll();
    }

    @Override
    public List<Fiche> getAll(int i, int i1) throws Exception {
return this.ficheDataSrv.getAll(i, i1);
    }

   
    
}
