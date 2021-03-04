package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "image")
public class ImageModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String nom;
    private String chaineCaractere;
    private int isDeleted;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value= "footer",  allowSetters = true)
    private FooterModel footer;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value= "slider",  allowSetters = true)
    private SliderModel slider;



    public ImageModel() {
    }
    public ImageModel(int id, String nom, String chaineCaractere, int isDeleted, FooterModel footer, SliderModel slider) {
        this.id = id;
        this.nom = nom;
        this.chaineCaractere = chaineCaractere;
        this.isDeleted= isDeleted;
        this.footer = footer;
        this.slider = slider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getChaineCaractere() {
        return chaineCaractere;
    }

    public void setChaineCaractere(String chaineCaractere) {
        this.chaineCaractere = chaineCaractere;
    }


    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }


    public FooterModel getFooter() {
        return footer;
    }


    public void setFooter(FooterModel footer) {
        this.footer = footer;
    }

    public SliderModel getSlider() {
        return slider;
    }


    public void setSlider(SliderModel slider) {
        this.slider = slider;
    }



    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", chaineCaractere='" + chaineCaractere + '\'' +
                ",isDeleted=" + isDeleted +
                ",footer=" + footer +
                ",slider= "+ slider +
                '}';

    }
}

