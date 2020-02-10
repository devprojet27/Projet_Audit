/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package physique.data;
import java.util.List;
import metier.entity.Personne;
import lml.persistence.CrudService;
import metier.entity.Poste;


/**
 *
 * @author jupiter
 */

public interface PersonneDataService extends CrudService<Personne>{
    
    public Personne getByLogin (String login) throws Exception;
    public List<Personne> getByNom (String nom) throws Exception;
    public List<Personne> getByPoste (Poste poste) throws Exception;
    public List<Personne> getByDisc(String disc) throws Exception;
    
}