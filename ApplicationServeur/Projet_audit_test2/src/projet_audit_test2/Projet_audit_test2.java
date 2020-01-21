/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_audit_test2;
import java.time.Instant;
import java.util.Date;
import projetaudit.metier.entity.Administrateur;
import projetaudit.metier.entity.Agent;
import projetaudit.metier.entity.Personne;
import projetaudit.metier.entity.Poste;
import projetaudit.metier.entity.Auditeur;
import projetaudit.metier.entity.Audit;
import projetaudit.metier.entity.Champ;
import projetaudit.metier.entity.Fiche;
import projetaudit.metier.entity.Modele;
import projetaudit.metier.entity.Section;
import projetaudit.metier.entity.Valeurs;
/**
 *
 * @author abyss
 */
public class Projet_audit_test2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Poste pos =new  Poste("employé", "Bureautique", "bat 4");
        System.out.println(pos.toString());
        Personne p = new Personne("roguez", "Théo", "Abyss", "123", pos);
         System.out.println(p.toString());   
        Administrateur a =new Administrateur("Deschamps"," Florian", "Utox", "123", pos);
        System.out.println(a.toString());
        Agent ag = new Agent("Désir", "Kévin", "Késin", "123", pos);
        System.out.println(ag.toString());
        Auditeur au = new Auditeur("Morin", "Hugo ","hug", "123", pos);
        System.out.println(au.toString());
        Champ champ = new Champ("Conseils");
         Section section = new Section("Commentaires",champ);
         System.out.println(section.toString());
        Modele mod = new Modele("Sécurité", section, champ, 0);
        System.out.println(mod.toString());
        Valeurs val = new Valeurs("Très bien");
        Fiche fiche = new Fiche(Date.from(Instant.now()), pos, mod);
        System.out.println(fiche.toString());
        Auditeur auditeur = new Auditeur("Flambard", "Alan", "Marabout", "123", pos);
        System.out.println(auditeur.toString());
        Audit audit = new Audit(fiche, auditeur, ag, val);
        System.out.println(audit.toString());
          
        
       
    }
    
}
