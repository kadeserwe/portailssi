package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Article")
public class ArticleModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String titre;
    private String auteur;
    private  String description;
    private Date dateHeure;
    private String statut;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = "imageId", allowSetters = true)
    private ImageModel imageId;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = "categorieArticle", allowSetters = true)
    private CategorieArticleModel categorieArticle;
    private int isDeleted;


    public ArticleModel(){

    };

    public ArticleModel(int id, String titre, String auteur, String description, Date dateHeure, String statut,int isDeleted, ImageModel imageId, CategorieArticleModel categorieArticle) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.dateHeure = dateHeure;
        this.statut = statut;
        this.isDeleted = isDeleted;
        this.imageId = imageId;
        this.categorieArticle= categorieArticle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
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

    public CategorieArticleModel getCategorieArticle() {
        return categorieArticle;
    }

    public void setCategorieArticle(CategorieArticleModel categorieArticle) {
        this.categorieArticle = categorieArticle;
    }


    @Override
    public String toString() {
        return "ArticleModel{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", description='" + description + '\'' +
                ", dateHeure=" + dateHeure +
                ", statut='" + statut + '\'' +
                ",isDeleted=" + isDeleted +
                '}';
    }
}
