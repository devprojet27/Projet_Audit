/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import metier.entity.Personne;
import metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public class PersonneDataServiceImpl extends AbstracCrudServiceJPA<Personne> implements PersonneDataService {

    public PersonneDataServiceImpl(String PU) {
        super(PU);
    }

    @Override
    public Personne getByLogin(String login) throws Exception {
        Personne p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Personne p WHERE p.login = :flogin");
            query.setParameter("flogin", login);
            p = (Personne) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return p;
    }

    @Override
    public List<Personne> getByDisc(String disc) throws Exception {
        List<Personne> p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Personne p WHERE p.disc = :fdisc");
            query.setParameter("fdisc", disc);
            p = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return p;
    }

    @Override
    public List<Personne> getByPoste(Poste poste) throws Exception {
        List<Personne> p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Personne p WHERE p.id = :fposte");
            query.setParameter("fposte", poste);
            p = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return p;
    }

    @Override
    public List<Personne> getByNom(String nom) throws Exception {
        List<Personne> p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Personne p WHERE p.nom = :fnom");
            query.setParameter("fnom", nom);
            p = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return p;
    }

}
