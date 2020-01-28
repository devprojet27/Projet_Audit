/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.metier.service;

import java.util.Date;
import projetaudit.metier.entity.Audit;
import projetaudit.metier.entity.Personne;
import projetaudit.metier.entity.Poste;
import lml.persistence.CrudService;
import java.util.List;

/**
 *
 * @author jupiter
 */
public interface AuditService extends CrudService<Audit>{
    
    public List<Audit> getByPoste(Poste poste) throws Exception;
    public List<Audit> getByPersonne (Personne personne) throws Exception;
    public List<Audit> getByDate (Date date) throws Exception;
    
}
