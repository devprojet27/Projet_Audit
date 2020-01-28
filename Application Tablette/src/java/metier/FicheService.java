/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.entity.Fiche;
import metier.entity.Modele;
import metier.entity.Poste;
import java.util.Date;
import java.util.List;
import lml.persistence.CrudService;

/**
 *
 * @author flori
 */
public interface FicheService extends CrudService<Fiche> {

    public List<Fiche> getByDate(Date date) throws Exception;

    public List<Fiche> getByPoste(Poste poste) throws Exception;

    public List<Fiche> getByModele(Modele modele) throws Exception;

    public Fiche getByTitre(String titre) throws Exception;
}
