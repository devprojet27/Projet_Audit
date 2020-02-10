/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

/**
 *
 * @author jupiter
 */
public class PhysiqueDataFactory {

    private PhysiqueDataFactory() {
    }

    private static AuditDataService auditDataService = null;

    public static AuditDataService getAuditDataService() {
        if (auditDataService == null) {
            auditDataService = new AuditDataServiceImpl("testrestPU");
        }
        return auditDataService;
    }

    private static ChampDataService champDataService = null;

    public static ChampDataService getChampDataService() {
        if (champDataService == null) {
            champDataService = new ChampDataServiceImpl("testrestPU");
        }
        return champDataService;
    }

    private static ModeleDataService modeleDataService = null;

    public static ModeleDataService getModeleDataService() {
        if (modeleDataService == null) {
            modeleDataService = new ModeleDataServiceImpl("testrestPU");

        }
        return modeleDataService;
    }

    private static PersonneDataService personneDataService = null;

    public static PersonneDataService getPersonneDataService() {
        if (personneDataService == null) {
            personneDataService = new PersonneDataServiceImpl("testrestPU");
        }
        return personneDataService;
    }

    private static PosteDataService posteDataService = null;

    public static PosteDataService getPosteDataService() {
        if (posteDataService == null) {
            posteDataService = new PosteDataServiceImpl("testrestPU");
        }
        return posteDataService;
    }

    private static SectionDataService sectionDataService = null;

    public static SectionDataService getSectionDataService() {
        if (sectionDataService == null) {
            sectionDataService = new SectionDataServiceImpl("testrestPU");
        }
        return sectionDataService;
    }

    private static ValeursDataService valeursDataService = null;

    public static ValeursDataService getValeursDataService() {
        if (valeursDataService == null) {
            valeursDataService = new ValeursDataServiceImpl("testrestPU");
        }
        return valeursDataService;
    }
}
