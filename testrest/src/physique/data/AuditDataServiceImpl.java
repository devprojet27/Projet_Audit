/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import metier.entity.Audit;
import metier.entity.Modele;
import metier.entity.Personne;
import metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public class AuditDataServiceImpl extends AbstracCrudServiceJPA<Audit> implements AuditDataService {

    public AuditDataServiceImpl(String PU) {
        super(PU);
    }


    @Override
    public List<Audit> getByPersonne(Personne personne) throws Exception {
        List<Audit> a = null;
        try {

            this.open();
            Query query = em.createQuery("SELECT a FROM Audit a WHERE a.personne = :fpersonne");
            query.setParameter("fpersonne", personne);
            a = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return a;
    }

    @Override
    public List<Audit> getByDate(Date date) throws Exception {
        List<Audit> a = null;
        try {

            this.open();
            Query query = em.createQuery("SELECT a FROM Audit a WHERE a.date = :fdate");
            query.setParameter("fdate", date);
            a = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return a;
    }

    @Override
    public List<Audit> getByModele(Modele modele) throws Exception {
        Audit f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Audit f WHERE f.modele = :fmodele");
            query.setParameter("fmodele", modele);
            f = (Audit) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Audit>) f;
    }

    public Audit getByTitre(String titre) throws Exception {
        Audit f = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT f FROM Audit f WHERE f.titre = :ftitre");
            query.setParameter("ftitre", titre);
            f = (Audit) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return f;
    }
}
