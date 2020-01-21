package projetaudit.metier.entity;

import java.util.Objects;

public class Section {
	private String nom;
        private Champ champ;

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
        return "Section{" + "nom=" + nom +" "+champ+ '}';
    }
  
}