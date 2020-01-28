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
import projetaudit.metier.entity.Audit;
import projetaudit.metier.entity.Poste;
import projetaudit.metier.entity.Personne;
      

/**
 *
 * @author jupiter
 */
public class AuditDataServiceImpl extends AbstracCrudServiceJPA<Audit> implements AuditDataService{

    public AuditDataServiceImpl(String PU){
        super(PU);
    }
    @Override
    public List<Audit> getByPoste(Poste poste) throws Exception {
        List<Audit> a =null;
        try {
            
            this.open();
            Query query = em.createQuery("SELECT a FROM Audit a WHERE a.poste = :fposte");
            query.setParameter("fposte", poste);
            a = query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return a;    }

    @Override
    public List<Audit> getByPersonne(Personne personne) throws Exception {
        List<Audit> a =null;
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
        return a;      }

    @Override
    public List<Audit> getByDate(Date date) throws Exception {
List<Audit> a =null;
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
        return a;      }
    
}
