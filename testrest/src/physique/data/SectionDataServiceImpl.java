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
import metier.entity.Section;
/**
 *
 * @author jupiter
 */
public class SectionDataServiceImpl extends AbstracCrudServiceJPA<Section> implements SectionDataService
{

    public SectionDataServiceImpl(String PU) {
        super(PU);
    }

    
    @Override
    public Section getByNom(String nom) throws Exception {
Section s = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT s FROM Section s WHERE s.nom = :fnom");
            query.setParameter("fnom", nom);
            s = (Section) query.getSingleResult();
        } catch (NoResultException ex) {
            // do nothing
        } finally {
            this.close();
        }
        return s;    }
    
}
