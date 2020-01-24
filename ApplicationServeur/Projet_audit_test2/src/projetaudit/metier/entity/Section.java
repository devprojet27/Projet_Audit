package projetaudit.metier.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Section {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String nom;
    private Champ champ;

    public Section() {
    }

    public Section(String nom, Champ champ) {
        this.nom = nom;
        this.champ = champ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Champ getChamp() {
        return champ;
    }

    public void setChamp(Champ champ) {
        this.champ = champ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nom);
        hash = 17 * hash + Objects.hashCode(this.champ);
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
        final Section other = (Section) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.champ, other.champ)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Section{" + "nom=" + nom + " " + champ + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
