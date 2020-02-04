/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.entity.Modele;
import java.util.List;
import lml.persistence.CrudService;

/**
 *
 * @author flori
 */
public interface ModeleService extends CrudService<Modele> {

    public List<Modele> getByType(String type) throws Exception;

    public List<Modele> getByNiveau(int niveau) throws Exception;

    public Modele getByTitre(String titre) throws Exception;
}