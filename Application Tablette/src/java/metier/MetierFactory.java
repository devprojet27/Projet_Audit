/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.sort.InsertionOptimisedSort;
import metier.sort.Sort;

/**
 *
 * @author flori
 */
public class MetierFactory {

    private static final AuditService auditService = new AuditServiceImpl();

    public static AuditService getAuditService() {
        return auditService;
    }
    private static final PersonneService personneService = new PersonneServiceImpl();

    public static PersonneService getPersonneService() {
        return personneService;
    }
    private static final FicheService ficheService = new FicheServiceImpl();

    public static FicheService getFicheService() {
        return ficheService;
    }
    private static final Sort sortSrv = new InsertionOptimisedSort();

    public static Sort getSortService() {
        return sortSrv;
    }

    private MetierFactory() {
    }
}
