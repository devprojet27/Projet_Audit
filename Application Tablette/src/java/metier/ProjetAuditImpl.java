/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author flori
 */
public class ProjetAuditImpl implements ProjetAudit, Observer {

    public ProjetAuditImpl() throws Exception {

    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
