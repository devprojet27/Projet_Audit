/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package physique.data;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import metier.entity.Valeurs;

/**
 *
 * @author jupiter
 */
public class ValeursDataServiceImpl extends AbstracCrudServiceJPA<Valeurs> implements ValeursDataService{

    public ValeursDataServiceImpl(String PU) {
        super(PU);
    }
    
}
