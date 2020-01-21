package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Poste implements Serializable{
	private String fonction;
	private String activité;
	private String emplacement;
    @Id
    private Long ID;

    public Poste() {
    }
	

    public Poste(String fonction, String activité, String emplacement ) {
        this.fonction = fonction;
        this.activité = activité;
        this.emplacement = emplacement;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getActivité() {
        return activité;
    }

    public void setActivité(String activité) {
        this.activité = activité;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.fonction);
        hash = 29 * hash + Objects.hashCode(this.activité);
        hash = 29 * hash + Objects.hashCode(this.emplacement);
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
        final Poste other = (Poste) obj;
        if (!Objects.equals(this.fonction, other.fonction)) {
            return false;
        }
        if (!Objects.equals(this.activité, other.activité)) {
            return false;
        }
        if (!Objects.equals(this.emplacement, other.emplacement)) {
            return false;
        }
      
        
        return true;
    }

    @Override
    public String toString() {
        return "Poste{" + "fonction=" + fonction + ", activité=" + activité + ", emplacement=" + emplacement + '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

	
}