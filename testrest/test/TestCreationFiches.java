
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import metier.entity.Agent;
import metier.entity.Audit;
import metier.entity.Auditeur;
import metier.entity.Champ;
import metier.entity.Modele;
import metier.entity.Poste;
import metier.entity.Section;
import metier.entity.Valeurs;
import metier.service.AuditService;
import metier.service.ChampService;
import metier.service.MetierFactory;
import metier.service.ModeleService;
import metier.service.PersonneService;
import metier.service.PosteService;
import metier.service.SectionService;
import metier.service.ValeursService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jupiter
 */
public class TestCreationFiches {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        AuditService auditSrv = MetierFactory.getAuditService();
        ChampService champSrv = MetierFactory.getChampService();
        ModeleService modeleSrv = MetierFactory.getModeleService();
        PersonneService personneSrv = MetierFactory.getPersonneService();
        PosteService posteSrv = MetierFactory.getPosteService();
        SectionService sectionSrv = MetierFactory.getSectionService();
        ValeursService valeursSrv = MetierFactory.getValeursService();

//////////// CREATION D'UN MODELE ///////////////////////////////////////////////////////////////////////////////////////////
        List<Champ> champs1 = new ArrayList<>();

        Champ champ1_1 = new Champ("1.1. Les standards sont-ils à jour et complets ?");
        champs1.add(champ1_1);
        Champ champ1_2 = new Champ("Quel est le niveau ILU du collaborateur ?");
        champs1.add(champ1_2);
        Champ champ1_3 = new Champ("Vérifier que les docs sont à jour.");
        champs1.add(champ1_3);

        for (Champ c : champs1) {
            champSrv.add(c);
        }

        Section section1 = new Section("1) Préparation de l'observation", champs1);

        List<Champ> champs2 = new ArrayList<>();

        Champ champ2_1 = new Champ("Y'a t-il des risques securité ?");
        champs2.add(champ2_1);
        Champ champ2_2 = new Champ("Le poste est-il conforme à l'état 5s ?");
        champs2.add(champ2_2);
        Champ champ2_3 = new Champ("L'opérateur travaille conformément ?");
        champs2.add(champ2_3);

        for (Champ c : champs2) {
            champSrv.add(c);
        }

        Section section2 = new Section("2) Observation du respect des standards", champs2);

        List<Section> sections = new ArrayList<>();
        sections.add(section1);
        sections.add(section2);

        for (Section s : sections) {
            sectionSrv.add(s);
        }

        Modele modele = new Modele("Grille d'observation de poste", sections, 1);
        modeleSrv.add(modele);

/////////////// FIN DE LA CREATION DU MODELE ///////////////////////////////////////////////////////////////////////////////
        Poste poste = new Poste("employé", "soudeur", "batiment");
        posteSrv.add(poste);

        Agent agent = new Agent("DESIR", "Kévin", "kevin", "kevin", poste);
        personneSrv.add(agent);

        Poste posteAuditeur = new Poste("auditeur", "auditeur", "usine");
        posteSrv.add(posteAuditeur);

        Auditeur auditeur = new Auditeur("DESCHAMPS", "Florian", "florian", "florian");
        personneSrv.add(auditeur);

        List<Valeurs> valeurs = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            Valeurs v;
            if (i <= 2) {
                v = new Valeurs("5", champs1.get(i));
            } else {
                v = new Valeurs("10", champs2.get(i - 3));
            }
            valeurs.add(v);
            valeursSrv.add(v);
        }

        Audit audit = new Audit(agent, auditeur, Date.from(Instant.now()), modele, "Grille d'observation de poste", valeurs);
        auditSrv.add(audit);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
