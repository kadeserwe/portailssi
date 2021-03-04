package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
public class UtilisateurModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String prenom;
    private String nom;
    private String  email;
    private String profil;
    private String login;
    private String  password;
    private Long numeroCarte;
    private int isDeleted;




    public UtilisateurModel() {
    }

    public UtilisateurModel(int id, String prenom, String nom, String email, String profil, String login, String password, Long numeroCarte, int isDeleted) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.profil = profil;
        this.login = login;
        this.password = password;
        this.numeroCarte = numeroCarte;
        this.isDeleted = isDeleted;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordt(String password) {
        this.password = password;
    }

    public Long getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(Long numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }


    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email=" + email +
                ", profil='" + profil + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", numeroCarte='" + numeroCarte + '\'' +
                ",isDeleted=" + isDeleted +
                '}';

    }
}

