/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import lml.rest.client.ClientRest;
import entity.Fiche;
import entity.Modele;
import entity.Poste;
import java.util.Date;
import java.util.List;

/**
 *
 * @author flori
 */
public class FicheServiceImpl extends ClientRest<Fiche> implements FicheService {

    @Override
    public List<Fiche> getByDate(Date date) throws Exception {
        super.setPath("getByDate/" + date);
        return super.getEntitys();
    }

    @Override
    public List<Fiche> getByPoste(Poste poste) throws Exception {
        super.setPath("getByPoste/" + poste);
        return super.getEntitys();
    }

    @Override
    public List<Fiche> getByModele(Modele modele) throws Exception {
        super.setPath("getByModele" + modele);
        return super.getEntitys();
    }

    @Override
    public Fiche getByTitre(String titre) throws Exception {
        super.setPath("getByTitre" + titre);
        return super.getEntity();
    }

    @Override
    public Fiche add(Fiche t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(Fiche t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(Fiche t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public Fiche getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<Fiche> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<Fiche> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

}
