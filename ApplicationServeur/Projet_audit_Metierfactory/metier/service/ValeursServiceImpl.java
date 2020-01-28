/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.metier.service;
import java.util.List;
import projetaudit.metier.entity.Valeurs;
import projetaudit.physique.data.jpa.ValeursDataService;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class ValeursServiceImpl implements ValeursService{

       private final ValeursDataService valeurDataService = PhysiqueDataFactory.getValeursDataService();

    @Override
    public Valeurs add(Valeurs t) throws Exception {
return this.valeurDataService.add(t);    }

    @Override
    public void remove(Valeurs t) throws Exception {
this.valeurDataService.remove(t);    }

    @Override
    public void update(Valeurs t) throws Exception {
this.valeurDataService.update(t);    }

    @Override
    public Valeurs getById(Long l) throws Exception {
return this.valeurDataService.getById(l);    }

    @Override
    public long getCount() throws Exception {
return this.valeurDataService.getCount();    }

    @Override
    public List<Valeurs> getAll() throws Exception {
return this.valeurDataService.getAll();    }

    @Override
    public List<Valeurs> getAll(int i, int i1) throws Exception {
return this.valeurDataService.getAll(i, i1);    }
       
    
}
