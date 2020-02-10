/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.service;
import lml.persistence.CrudService;
import metier.entity.Champ;
/**
 *
 * @author jupiter
 */
public interface ChampService extends CrudService<Champ> {
   
    public Champ getByNom(String nom) throws Exception;
    
}
