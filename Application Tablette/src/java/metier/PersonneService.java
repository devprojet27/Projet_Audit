/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;

import lml.persistence.CrudService;

import metier.entity.Personne;
import metier.entity.Administrateur;
import metier.entity.Audit;
import metier.entity.Auditeur;
//import metier.entity.Fiche;
import metier.entity.Poste;

/**
 *
 * @author florian
 */
public interface PersonneService extends CrudService<Personne> {

    public Personne getByLogin(String login) throws Exception;

    public List<Personne> getByNom(String nom) throws Exception;

    public List<Personne> getByAudit(Audit audit) throws Exception;

    public List<Personne> getByAuditeur(Auditeur auditeur) throws Exception;

    public List<Personne> getByPoste(Poste poste) throws Exception;

    //public Personne[] sort() throws Exception;
}
