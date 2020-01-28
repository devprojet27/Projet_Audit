/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaudit.metier.service;

import java.util.List;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import projetaudit.metier.entity.Poste;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;
import projetaudit.physique.data.jpa.PosteDataService;

/**
 *
 * @author jupiter
 */
public class PosteServiceImpl implements PosteService {

    private final PosteDataService posteDataSrv = PhysiqueDataFactory.getPosteDataService();

    @Override
    public List<Poste> getByFonction(String fonction) throws Exception {
        return this.posteDataSrv.getByFonction(fonction);
    }

    @Override
    public List<Poste> getByActivite(String activite) throws Exception {
        return this.posteDataSrv.getByActivite(activite);
    }

    @Override
    public List<Poste> getByEmplacement(String emplacement) throws Exception {
        return this.posteDataSrv.getByEmplacement(emplacement);
    }

    @Override
    public Poste add(Poste t) throws Exception {
        return this.posteDataSrv.add(t);
    }

    @Override
    public void remove(Poste t) throws Exception {
        this.posteDataSrv.remove(t);
    }

    @Override
    public void update(Poste t) throws Exception {
        this.posteDataSrv.update(t);
    }

    @Override
    public Poste getById(Long l) throws Exception {
        return this.posteDataSrv.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.posteDataSrv.getCount();
    }

    @Override
    public List<Poste> getAll() throws Exception {
        return this.posteDataSrv.getAll();
    }

    @Override
    public List<Poste> getAll(int i, int i1) throws Exception {
        return this.posteDataSrv.getAll(i, i1);
    }

}
