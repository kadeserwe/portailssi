package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "canditature")
public class CandidatureModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String prenom;
    private String nom;
    private String  email;
    private Long telephone;
    private Byte  cv;
    private Byte  lettreMot;
    private Date dateDepo;
    private int isDeleted;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = "poste", allowSetters = true)
    private PosteModel poste;



    public CandidatureModel() {
    }

    public CandidatureModel(int id, String prenom, String nom, String email, Long telephone, Byte cv, Byte lettreMot, Date dateDepo, int isDeleted, PosteModel poste) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.cv = cv;
        this.lettreMot = lettreMot;
        this.dateDepo = dateDepo;
        this.isDeleted = isDeleted;
        this.poste = poste;
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

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Byte getCv() {
        return cv;
    }

    public void setCv(Byte cv) {
        this.cv = cv;
    }

    public Byte getLettreMot() {
        return lettreMot;
    }

    public void setLettreMot(Byte lettreMot) {
        this.lettreMot = lettreMot;
    }

    public Date getDateDepo() {
        return dateDepo;
    }

    public void setDateDepo(Date dateDepo) {
        this.dateDepo = dateDepo;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public PosteModel getPoste() {
        return poste;
    }

    public void setPoste(PosteModel poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Candidature{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email=" + email +
                ", telephone='" + telephone + '\'' +
                ", cv='" + cv + '\'' +
                ", lettreMot='" + lettreMot + '\'' +
                ", dateDepo='" + dateDepo + '\'' +
                ",isDeleted=" + isDeleted +
                '}';

    }
}

