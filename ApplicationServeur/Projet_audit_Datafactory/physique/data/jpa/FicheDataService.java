/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.physique.data.jpa;
import java.util.Date;
import java.util.List;
import lml.persistence.CrudService;
import projetaudit.metier.entity.Fiche;
import projetaudit.metier.entity.Modele;
import projetaudit.metier.entity.Poste;

/**
 *
 * @author jupiter
 */
public interface FicheDataService extends CrudService<Fiche>{
    
    public List<Fiche> getByPoste(Poste poste) throws Exception;
    public List<Fiche> getByDate(Date date) throws Exception;
    public List<Fiche> getByModele(Modele modele) throws Exception;
    public Fiche getByTitre(String titre) throws Exception;
    
}
