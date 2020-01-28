/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaudit.metier.service;

import java.util.List;
import projetaudit.metier.entity.Personne;
import projetaudit.metier.entity.Poste;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;
import projetaudit.physique.data.jpa.PersonneDataService;

/**
 *
 * @author jupiter
 */
public class PersonneServiceImpl implements PersonneService {

    private final PersonneDataService personneDataSrv = PhysiqueDataFactory.getPersonneDataService();

    @Override
    public Personne getByLogin(String login) throws Exception {
        return this.personneDataSrv.getByLogin(login);
    }

    @Override
    public List<Personne> getByNom(String nom) throws Exception {
        return this.personneDataSrv.getByNom(nom);
    }

    @Override
    public List<Personne> getByPoste(Poste poste) throws Exception {
        return this.personneDataSrv.getByPoste(poste);
    }

    @Override
    public Personne add(Personne t) throws Exception {
        return this.personneDataSrv.add(t);
    }

    @Override
    public void remove(Personne t) throws Exception {
        this.personneDataSrv.add(t);
    }

    @Override
    public void update(Personne t) throws Exception {
        this.personneDataSrv.update(t);
    }

    @Override
    public Personne getById(Long l) throws Exception {
    return this.personneDataSrv.getById(l);
    }
    
    @Override
    public long getCount() throws Exception {
return this.personneDataSrv.getCount();    }

    @Override
    public List<Personne> getAll() throws Exception {
return this.personneDataSrv.getAll();    }

    @Override
    public List<Personne> getAll(int i, int i1) throws Exception {
return this.getAll(i, i1);    }

}
