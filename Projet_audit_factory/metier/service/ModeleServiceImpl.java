/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaudit.metier.service;

import java.util.List;
import projetaudit.metier.entity.Modele;
import projetaudit.physique.data.jpa.PhysiqueDataFactory;
import projetaudit.physique.data.jpa.ModeleDataService;


/**
 *
 * @author jupiter
 */
public class ModeleServiceImpl  implements ModeleService {

     private final ModeleDataService modeleDataSrv = PhysiqueDataFactory.getModeleDataService();
    @Override
    public Modele getByTitre(String titre) throws Exception {
        return this.modeleDataSrv.getByTitre(titre);
   }

    @Override
    public List<Modele> getByType(String type) throws Exception {
return this.modeleDataSrv.getByType(type);
    }

    @Override
    public List<Modele> getByNiveau(int niveau) throws Exception {
return this.modeleDataSrv.getByNiveau(niveau);   }

    @Override
    public Modele add(Modele t) throws Exception {
return this.modeleDataSrv.add(t);    }

    @Override
    public void remove(Modele t) throws Exception {
this.modeleDataSrv.remove(t);    }

    @Override
    public void update(Modele t) throws Exception {
 this.modeleDataSrv.update(t);    }

    @Override
    public Modele getById(Long l) throws Exception {
return this.modeleDataSrv.getById(l);    }

    @Override
    public long getCount() throws Exception {
return this.modeleDataSrv.getCount();
    }

    @Override
    public List<Modele> getAll() throws Exception {
return this.modeleDataSrv.getAll();
    }

    @Override
    public List<Modele> getAll(int i, int i1) throws Exception {
return this.modeleDataSrv.getAll(i, i1);    }



}
