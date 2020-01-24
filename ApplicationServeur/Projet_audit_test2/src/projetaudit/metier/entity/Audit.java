package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Audit implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    public Auditeur auditeur;
    @OneToOne
    private Fiche fiche;
    @ManyToOne
    private Valeurs valeurs;
    @OneToOne
    private Agent agent;
   

    public Audit() {
    }

    public Audit(Fiche fiche, Auditeur auditeur,Agent agent,Valeurs valeurs) {
        this.auditeur = auditeur;
        this.fiche = fiche;
        this.valeurs = valeurs;
        this.agent = agent;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Valeurs getValeurs() {
        return valeurs;
    }

    public void setValeurs(Valeurs valeurs) {
        this.valeurs = valeurs;
    }

    public Fiche getFiche() {
        return fiche;
    }

    public void setFiche(Fiche fiche) {
        this.fiche = fiche;
    }

    

    public Auditeur getAuditeur() {
        return auditeur;
    }

    public void setAuditeur(Auditeur auditeur) {
        this.auditeur = auditeur;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.auditeur);
        hash = 17 * hash + Objects.hashCode(this.fiche);
        hash = 17 * hash + Objects.hashCode(this.valeurs);
        hash = 17 * hash + Objects.hashCode(this.agent);
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
        final Audit other = (Audit) obj;
        if (!Objects.equals(this.auditeur, other.auditeur)) {
            return false;
        }
        if (!Objects.equals(this.fiche, other.fiche)) {
            return false;
        }
        if (!Objects.equals(this.valeurs, other.valeurs)) {
            return false;
        }
        if (!Objects.equals(this.agent, other.agent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Audit{" + "auditeur=" + auditeur + ", fiche=" + fiche + ", valeurs=" + valeurs + ", agent=" + agent + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

}
