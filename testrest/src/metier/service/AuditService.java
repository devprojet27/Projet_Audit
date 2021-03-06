/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;

import java.util.Date;
import java.util.List;
import lml.persistence.CrudService;
import metier.entity.Audit;
import metier.entity.Modele;
import metier.entity.Personne;

/**
 *
 * @author jupiter
 */
public interface AuditService extends CrudService<Audit> {

    public List<Audit> getByPersonne(Personne personne) throws Exception;

    public List<Audit> getByDate(Date date) throws Exception;

    public List<Audit> getByModele(Modele modele) throws Exception;

    public Audit getByTitre(String titre) throws Exception;
}
