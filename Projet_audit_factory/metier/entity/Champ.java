package projetaudit.metier.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Champ implements Serializable{
	
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String nom;
    public Champ() {
    }

    public Champ(String nom) {
        this.nom = nom;
      
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }




    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nom);
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
        final Champ other = (Champ) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            
        return true;
    }
            return false;
    }
        

    @Override
    public String toString() {
        return "Champ{" + "nom=" + nom +'}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}