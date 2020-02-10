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
import metier.entity.Modele;

/**
 *
 * @author jupiter
 */
public class ModeleDataServiceImpl extends AbstracCrudServiceJPA<Modele> implements ModeleDataService {

    public ModeleDataServiceImpl(String PU) {
        super(PU);
    }

    
    public Modele getByTitre(String titre) throws Exception {
Modele m = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Modele m WHERE m.titre = :ftitre");
            query.setParameter("ftitre", titre);
            m = (Modele) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return  m;    }

    @Override
    public List<Modele> getByType(String type) throws Exception {
Modele m = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Modele m WHERE m.type = :ftype");
            query.setParameter("ftype", type);
            m = (Modele) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Modele>) m;    }

    @Override
    public List<Modele> getByNiveau(int niveau) throws Exception {
Modele m = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Modele m WHERE m.niveau = :fniveau");
            query.setParameter("fniveau", niveau);
            m = (Modele) query.getResultList();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return (List<Modele>) m;
    }

}
