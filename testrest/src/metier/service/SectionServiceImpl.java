/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.service;

import java.util.List;
import  physique.data.PhysiqueDataFactory;
import physique.data.SectionDataService;
import lml.persistence.jpa.AbstracCrudServiceJPA;
import metier.entity.Section;
/**
 *
 * @author jupiter
 */
public class SectionServiceImpl  implements SectionService
{
private final SectionDataService sectionDataSrv = PhysiqueDataFactory.getSectionDataService();

    @Override
    public Section getByNom(String nom) throws Exception {
return this.getByNom(nom);}

    @Override
    public Section add(Section t) throws Exception {
     return this.sectionDataSrv.add(t)  ;  }

    @Override
    public void remove(Section t) throws Exception {
this.sectionDataSrv.remove(t);    }

    @Override
    public void update(Section t) throws Exception {
this .sectionDataSrv.update(t);    }

    @Override
    public Section getById(Long l) throws Exception {
    return this.sectionDataSrv.getById(l);    }

    @Override
    public long getCount() throws Exception {
        return this.sectionDataSrv.getCount();    }

    @Override
    public List<Section> getAll() throws Exception {
        return this.sectionDataSrv.getAll();    }

    @Override
    public List<Section> getAll(int i, int i1) throws Exception {
        return this.sectionDataSrv.getAll(i, i1);    }
  
    
}
