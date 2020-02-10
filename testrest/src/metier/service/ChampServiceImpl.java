/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;



import java.util.List;
import physique.data.ChampDataService;
import metier.entity.Champ;
import physique.data.PhysiqueDataFactory;

/**
 *
 * @author jupiter
 */
public class ChampServiceImpl  implements ChampService {

        private final ChampDataService champDataSrv = PhysiqueDataFactory.getChampDataService();
    @Override
    public Champ getByNom(String nom) throws Exception {
        return this.champDataSrv.getByNom(nom);
        }

    @Override
    public Champ add(Champ t) throws Exception {
        return this.champDataSrv.add(t);
    }

    @Override
    public void remove(Champ t) throws Exception {
        this.champDataSrv.remove(t);
    }

    @Override
    public void update(Champ t) throws Exception {
        this.champDataSrv.update(t);    }

    @Override
    public Champ getById(Long l) throws Exception {
return this.champDataSrv.getById(l);   }

    @Override
    public long getCount() throws Exception {
return this.champDataSrv.getCount();    }

    @Override
    public List<Champ> getAll() throws Exception {
return this.champDataSrv.getAll();    }

    @Override
    public List<Champ> getAll(int i, int i1) throws Exception {
return this.champDataSrv.getAll(i, i1);    }

   
}
