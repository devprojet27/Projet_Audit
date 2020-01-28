/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.physique.data.jpa;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import projetaudit.metier.entity.Valeurs;

/**
 *
 * @author jupiter
 */
public class ValeursDataServiceImpl extends AbstracCrudServiceJPA<Valeurs> implements ValeursDataService{

    public ValeursDataServiceImpl(String PU) {
        super(PU);
    }
    
}
