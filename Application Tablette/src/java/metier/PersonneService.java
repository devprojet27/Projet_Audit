/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;

import lml.persistence.CrudService;

import entity.Personne;
import entity.Administrateur;
import entity.Auditeur;
import entity.Fiche;

/**
 *
 * @author florian
 */
public interface PersonneService extends CrudService<Personne> {

    public Administrateur getByLogin(String login) throws Exception;

    public List<Personne> getByNom(String nom) throws Exception;

    public Personne getByFiche(Fiche fiche) throws Exception;

    public List<Personne> getByAuditeur(Auditeur auditeur) throws Exception;

   // public Personne[] sort() throws Exception;
}
