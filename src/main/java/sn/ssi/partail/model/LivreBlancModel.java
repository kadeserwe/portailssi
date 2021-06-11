package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "livreBlanc")
public class LivreBlancModel implements Serializable {
    private static final long serialVersionUID = 1L;



    @Id
    @GeneratedValue
    private  int id;

    private  String libelle;

    private String description;

    private Date dateCreation;

    private  Date datePub;

    @Lob
    private byte[] chaineCaractere;

    private int isDeleted;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = "imageId", allowSetters = true)
    private ImageModel imageId;


    public LivreBlancModel() {
    }

    public LivreBlancModel(int id, String libelle, String description, Date dateCreation, Date datePub,
                           byte[] chaineCaractere, int isDeleted, ImageModel imageId) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        dateCreation = dateCreation;
        this.datePub = datePub;
        this.chaineCaractere = chaineCaractere;
        this.isDeleted = isDeleted;
        this.imageId=imageId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        dateCreation = dateCreation;
    }

    public Date getDatePub() {
        return datePub;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }

    public byte[] getChaineCaractere() {
        return chaineCaractere;
    }

    public void setChaineCaractere(byte[] chaineCaractere) {
        this.chaineCaractere = chaineCaractere;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public ImageModel getImageId() {
        return imageId;
    }

    public void setImageId(ImageModel imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "LivreBlancModel{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", DateCreation=" + dateCreation +
                ", datePub=" + datePub +
                ", chaineCaractere=" + Arrays.toString(chaineCaractere) +
                ", isDeleted=" + isDeleted +
                ", imageId=" + imageId +
                '}';
    }
}
