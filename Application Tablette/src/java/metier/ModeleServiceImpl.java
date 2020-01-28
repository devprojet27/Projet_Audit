/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.entity.Modele;
import java.util.List;
import lml.rest.client.ClientRest;

/**
 *
 * @author flori
 */
public class ModeleServiceImpl extends ClientRest<Modele> implements ModeleService {

    @Override
    public List<Modele> getByType(String type) throws Exception {
        super.setPath("getByType/" + type);
        return super.getEntitys();
    }

    @Override
    public List<Modele> getByNiveau(int niveau) throws Exception {
        super.setPath("getByNiveau/" + niveau);
        return super.getEntitys();
    }

    @Override
    public Modele getByTitre(String titre) throws Exception {
        super.setPath("getByTitre/" + titre);
        return super.getEntity();
    }

    @Override
    public Modele add(Modele t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(Modele t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(Modele t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public Modele getById(Long l) throws Exception {
        super.setPath("getById/" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<Modele> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<Modele> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

}
