/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetaudit.physique.data.jpa;

/**
 *
 * @author jupiter
 */
public class PhysiqueDataFactory {

    public static PersonneDataService personneDataService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private PhysiqueDataFactory(){
        
    }
    public static AuditDataService auditDataService = null;
    
    public static AuditDataService getAuditDataService(){
        if(auditDataService == null){
            auditDataService= new AuditDataServiceImpl("Projet_audit_test2PU");
            
        }
        return auditDataService;
    }
    
    public static ChampDataService champDataService = null;
    
    public static ChampDataService getChampDataService(){
        if(champDataService == null){
            champDataService= new ChampDataServiceImpl("Projet_audit_test2PU");
            
        }
        return champDataService;
    }
    
    public static FicheDataService ficheDataService = null;
    
    public static FicheDataService getFicheDataService(){
        if(ficheDataService == null){
            ficheDataService= new FicheDataServiceImpl("Projet_audit_test2PU");
            
        }
        return ficheDataService;
    }
    public static ModeleDataService modeleDataService = null;
    
    public static ModeleDataService getModeleDataService(){
        if(modeleDataService == null){
            modeleDataService= new ModeleDataServiceImpl("Projet_audit_test2PU");
            
        }
        return modeleDataService;
    }
    public static PersonneDataService personneDataService = null;
    
    public static PersonneDataService getPersonneDataService(){
        if(personneDataService == null){
            personneDataService= new PersonneDataServiceImpl("Projet_audit_test2PU");
            
        }
        return personneDataService;
    }
    public static PosteDataService posteDataService = null;
    
    public static PosteDataService getPosteDataService(){
        if(posteDataService == null){
            posteDataService= new PosteDataServiceImpl("Projet_audit_test2PU");
            
        }
        return posteDataService;
    }
    public static SectionDataService sectionDataService = null;
    
    public static SectionDataService getSectionDataService(){
        if(sectionDataService == null){
            sectionDataService= new SectionDataServiceImpl("Projet_audit_test2PU");
            
        }
        return sectionDataService;
    }
    
       public static ValeursDataService valeursDataService = null;
    
    public static ValeursDataService getValeursDataService(){
        if(valeursDataService == null){
            valeursDataService= new ValeursDataServiceImpl("Projet_audit_test2PU");
            
        }
        return valeursDataService;
    }
}
