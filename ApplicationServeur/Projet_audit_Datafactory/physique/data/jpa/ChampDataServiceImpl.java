/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaudit.physique.data.jpa;


import javax.persistence.Query;
import javax.persistence.NoResultException;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import projetaudit.metier.entity.Champ;

/**
 *
 * @author jupiter
 */
public class ChampDataServiceImpl extends AbstracCrudServiceJPA<Champ> implements ChampDataService {

    public ChampDataServiceImpl(String PU) {
        super(PU);
    }

    
    public Champ getByNom(String nom) throws Exception {
        Champ c = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT c FROM Champ c WHERE c.nom = :fnom");
            query.setParameter("fnom", nom);
            c = (Champ) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return  c;
    }

}
