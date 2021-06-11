package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "categorieArticle")
public class CategorieArticleModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String description;
    private int isDeleted;

    public CategorieArticleModel(){}

    public CategorieArticleModel(int id, String libelle, String description, int isDeleted) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescription() {
        return description;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return "CategorieArticleModel{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}
