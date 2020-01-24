package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Valeurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    private String valeur;

    public Valeurs() {
    }

    public Valeurs(String valeur) {
        this.valeur = valeur;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.valeur);

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
        final Valeurs other = (Valeurs) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.valeur, other.valeur)) {
            return false;

        }
        return true;
    }

    @Override
    public String toString() {
        return "Valeurs{" + "id=" + id + ", valeur=" + valeur + '}';
    }

}
