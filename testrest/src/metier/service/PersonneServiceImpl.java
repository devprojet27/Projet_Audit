/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;

import java.util.List;
import metier.entity.Personne;
import metier.entity.Poste;
import physique.data.PhysiqueDataFactory;
import physique.data.PersonneDataService;

/**
 *
 * @author jupiter
 */
public class PersonneServiceImpl implements PersonneService {

    private final PersonneDataService personneDataSrv = PhysiqueDataFactory.getPersonneDataService();

        public Personne getByLogin(String login) throws Exception {
        return this.personneDataSrv.getByLogin(login);
    }

        public List<Personne> getByNom(String nom) throws Exception {
        return this.personneDataSrv.getByNom(nom);
    }

        public List<Personne> getByPoste(Poste poste) throws Exception {
        return this.personneDataSrv.getByPoste(poste);
    }

        public Personne add(Personne t) throws Exception {
        return this.personneDataSrv.add(t);
    }

        public void remove(Personne t) throws Exception {
        this.personneDataSrv.add(t);
    }

        public void update(Personne t) throws Exception {
        this.personneDataSrv.update(t);
    }

        public Personne getById(Long l) throws Exception {
    return this.personneDataSrv.getById(l);
    }
    
        public long getCount() throws Exception {
return this.personneDataSrv.getCount();    }

        public List<Personne> getAll() throws Exception {
return this.personneDataSrv.getAll();    }

        public List<Personne> getAll(int i, int i1) throws Exception {
return this.getAll(i, i1);    }

}
