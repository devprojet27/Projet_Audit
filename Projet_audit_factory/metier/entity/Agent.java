package projetaudit.metier.entity;

import java.util.Objects;
import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author abyss
 */
@Entity
@DiscriminatorValue("Agent")
public class Agent extends Personne implements Serializable {

     private static final long serialVersionUID = 1L;
    @ManyToOne
    public Audit audit;

    public Agent() {
        super("", "", "", "", null);
    }

    public Agent(String nom, String prenom, String login, String password, Poste poste) {
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
        hash = 67 * hash + Objects.hashCode(this.audit);
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
        final Agent other = (Agent) obj;
        return Objects.equals(this.audit, other.audit);
    }

}
