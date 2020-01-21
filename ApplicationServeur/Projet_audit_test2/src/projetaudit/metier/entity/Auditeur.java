package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Auditeur")
public class Auditeur extends Personne implements Serializable{

    @OneToOne
    public Audit audit;

    public Auditeur() {
    }

    public Auditeur(String nom, String prenom, String login, String password, Poste poste) {
        super(nom, prenom, login, password, poste);
       
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.audit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auditeur other = (Auditeur) obj;
        return true;
    }

}
