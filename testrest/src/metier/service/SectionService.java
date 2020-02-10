/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.service;

import physique.data.*;
import java.util.List;
import metier.entity.Section;
import lml.persistence.CrudService;


/**
 *
 * @author jupiter
 */
public interface SectionService extends CrudService<Section>{
    public Section getByNom(String nom) throws Exception;
    
}
