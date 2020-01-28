package projetaudit.metier.entity;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Administrateur")
public class Administrateur extends Personne implements Serializable {

    private static final long serialVersionUID = 1L;
   


    public Administrateur() {
        super("", "", "", "", null);
    }

    

    public Administrateur(String nom, String prenom, String login, String password, Poste poste) {
        super(nom, prenom, login, password, poste);
    }

    


  

}