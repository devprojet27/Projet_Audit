/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;

/**
 *
 * @author jupiter
 */
public class MetierFactory {

    private static final AuditService auditService = new AuditServiceImpl();

    public static AuditService getAuditService() {
        return auditService;
    }

    private static final ChampService champService = new ChampServiceImpl();

    public static ChampService getChampService() {
        return champService;
    }
    private static final PersonneService personneService = new PersonneServiceImpl();

    public static PersonneService getPersonneService() {
        return personneService;
    }

    private static final PosteService posteService = new PosteServiceImpl();

    public static PosteService getPosteService() {
        return posteService;
    }

    private static final SectionService sectionService = new SectionServiceImpl();

    public static SectionService getSectionService() {
        return sectionService;

    }
    private static final ValeursService valeurService = new ValeursServiceImpl();

    public static ValeursService getValeursService() {
        return valeurService;
    }
    private static final ModeleService modeleService = new ModeleServiceImpl();

    public static ModeleService getModeleService() {
        return modeleService;
    }

    private MetierFactory() {
    }
}
