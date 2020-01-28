/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.physique.data.jpa;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import projetaudit.metier.entity.Fiche;
import projetaudit.metier.entity.Modele;
import projetaudit.metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public class FicheDataServiceImpl extends AbstracCrudServiceJPA<Fiche> implements FicheDataService{

    public FicheDataServiceImpl(String PU) {
        super(PU);
    }

    @Override
    public List<Fiche> getByPoste(Poste poste) throws Exception {
 Fiche f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Fiche f WHERE f.poste = :fposte");
            query.setParameter("fposte", poste);
            f = (Fiche) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Fiche>) f;     }

    @Override
    public List<Fiche> getByDate(Date date) throws Exception {
 Fiche f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Fiche f WHERE f.date = :fdate");
            query.setParameter("fdate", date);
            f = (Fiche) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Fiche>) f;     }

    @Override
    public List<Fiche> getByModele(Modele modele) throws Exception {
 Fiche f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Fiche f WHERE f.modele = :fmodele");
            query.setParameter("fmodele", modele);
            f = (Fiche) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Fiche>) f;     }

    
    public Fiche getByTitre(String titre) throws Exception {
 Fiche f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Fiche f WHERE f.titre = :ftitre");
            query.setParameter("ftitre", titre);
            f =  (Fiche) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return f; 
    }
    
}
