package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Fiche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    @OneToOne
    public Poste poste;
    @OneToOne
    public Modele modele;

    private String titre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Fiche() {
    }

    public Fiche(Date date, Poste poste, Modele modele) {
        this.date = date;
        this.poste = poste;
        this.modele = modele;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.date);
        hash = 59 * hash + Objects.hashCode(this.poste);
        hash = 59 * hash + Objects.hashCode(this.modele);
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
        final Fiche other = (Fiche) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.poste, other.poste)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fiche{" + "id=" + id + ", date=" + date + ", poste=" + poste + ", modele=" + modele + ", titre=" + titre + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
