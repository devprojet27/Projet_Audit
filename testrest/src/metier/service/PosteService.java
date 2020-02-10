/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.service;

import physique.data.PosteDataService;
import java.util.List;
import metier.entity.Poste;
import lml.persistence.CrudService;
/**
 *
 * @author jupiter
 */
public interface PosteService extends CrudService<Poste> {

    public List<Poste> getByFonction(String fonction) throws Exception;
    public List<Poste> getByActivite(String activite) throws Exception;
    public List<Poste> getByEmplacement(String emplacement) throws Exception;
    
    
}
