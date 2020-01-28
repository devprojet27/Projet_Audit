package projetaudit.metier.entity;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "disc", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Personne")
public class Personne implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    @OneToOne
    private Poste poste;

    public Personne() {
    }

    public Personne(String nom, String prenom, String login, String password, Poste poste) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.poste = poste;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
 private String codeMD5(String msg) throws NoSuchAlgorithmException {
        String code = "";
        byte[] b;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            b = md.digest(msg.getBytes());
            for (int i = 0; i < b.length; i++) {
                int x = b[i];

                if (x < 0) {
                    x += 256;
                }

                String s = String.format("%02x", x);
                code += s;
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }

        return code;
    }

    public boolean isValid(String pswrd) throws NoSuchAlgorithmException {
        return this.password.equals(this.codeMD5(pswrd));
    }
    public String getPassword() {
        return password;
    }

     public void setPassword(String pswrd) throws NoSuchAlgorithmException {
        this.password = this.codeMD5(pswrd);
    }

    public void setEncodedMdp(String pswrd) throws NoSuchAlgorithmException {
        this.password = pswrd;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.prenom);
        hash = 59 * hash + Objects.hashCode(this.login);
        hash = 59 * hash + Objects.hashCode(this.password);
        hash = 59 * hash + Objects.hashCode(this.poste);
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
        final Personne other = (Personne) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.poste, other.poste)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password + ", poste=" + poste + '}';
    }

}
