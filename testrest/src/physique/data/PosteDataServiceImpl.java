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
import metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public class PosteDataServiceImpl extends AbstracCrudServiceJPA<Poste> implements PosteDataService{

    public PosteDataServiceImpl(String PU) {
        super(PU);
    }

    @Override
    public List<Poste> getByFonction(String fonction) throws Exception {
Poste p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Poste p WHERE p.fonction = :ffonction");
            query.setParameter("ffonction", fonction);
            p = (Poste) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Poste>) p;     }

    @Override
    public List<Poste> getByActivite(String activite) throws Exception {
Poste p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Poste p WHERE p.activité = :factivite");
            query.setParameter("factivite", activite);
            p = (Poste) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Poste>) p;     }

    @Override
    public List<Poste> getByEmplacement(String emplacement) throws Exception {
 Poste p = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Poste p WHERE p.emplacement = :femplacement");
            query.setParameter("femplacement", emplacement);
            p = (Poste) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Poste>) p;    }
    
}
