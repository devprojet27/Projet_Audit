/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package physique.data;
import metier.entity.Section;
import lml.persistence.CrudService;


/**
 *
 * @author jupiter
 */
public interface SectionDataService extends CrudService<Section>{
    public Section getByNom(String nom) throws Exception;
    
}
