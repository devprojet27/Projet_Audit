/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import lml.rest.client.ClientRest;
import metier.entity.Auditeur;
import metier.entity.Audit;

import metier.entity.Personne;
import metier.entity.Poste;

//import metier.sort.ComparatorByDisc;
//import lml.snir.controleacces.metier.sort.Sort;
//import metier.entity.Fiche;
/**
 *
 * @author flori
 */
public class PersonneServiceImpl extends ClientRest<Personne> implements PersonneService {

    public PersonneServiceImpl() {
        super.init("PersonneService", new RestServerLocalConfiguration());
        //List<Class> classes = new ArrayList<>();
        //List<Class> classes = new ArrayList<>();
        //classes.add(Administrateur.class);
        //super.polymorphicInit(classes);
    }

    @Override
    public Personne add(Personne t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(Personne t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(Personne t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public Personne getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<Personne> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<Personne> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

    @Override
    public List<Personne> getByAuditeur(Auditeur auditeur) throws Exception {
        super.setPath("getByAuditeur/" + auditeur);
        return super.getEntitys();
    }

    @Override
    public List<Personne> getByNom(String nom) throws Exception {
        super.setPath("getByNom/" + nom);
        return super.getEntitys();
    }

    @Override
    public Personne getByLogin(String login) throws Exception {
        super.setPath("getByLogin/" + login);
        return super.getEntity();
    }

    @Override
    public List<Personne> getByPoste(Poste poste) throws Exception {
        super.setPath("getByPoste/" + poste);
        return super.getEntitys();

    }

    @Override
    public List<Personne> getByAudit(Audit audit) throws Exception {
        super.setPath("getByAudit/" + audit);
        return super.getEntitys();
    }
}

/*@Override
 public Personne[] sort() throws Exception {
 Personne[] personnes = this.getAll().toArray(new Personne[0]);
 //Arrays.sort(personnes);
 //Comparat cmp = new ComparatorByAge();
 sort trieuse = MetierFactory.getSortService();
 trieuse.sort(personnes, cmp);
 return personnes;
 }*/
/*@Override
 public Personne getByFiche(Fiche fiche) throws Exception {
 super.setPath("getByFiche/" + fiche);
 return super.getEntity();
 }*/
