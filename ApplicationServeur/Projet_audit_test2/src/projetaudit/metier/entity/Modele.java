package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import projetaudit.metier.entity.Section;

@Entity

public class Modele implements Serializable  {
        @Id
	private long id;
        
	private String type;
        
    @ManyToOne
        private Champ champ;
        private int niveau;
        private Section section;

    public Modele() {
    }

    public Modele(String type, Section section, Champ champ, int niveau) {
        this.type = type;
        this.section = section;
        this.champ = champ;
        this.niveau = niveau;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Champ getChamp() {
        return champ;
    }

    public void setChamp(Champ champ) {
        this.champ = champ;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.section);
        hash = 37 * hash + Objects.hashCode(this.champ);
        hash = 37 * hash + this.niveau;
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
        final Modele other = (Modele) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.niveau != other.niveau) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.section, other.section)) {
            return false;
        }
        if (!Objects.equals(this.champ, other.champ)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele{" + "id=" + id + ", type=" + type + ", section=" + section + ", champ=" + champ + ", niveau=" + niveau + '}';
    }
        
}