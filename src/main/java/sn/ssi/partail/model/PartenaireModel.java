package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "partenaire")
public class PartenaireModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String logo;
    private String type;
    private int isDeleted;
    public PartenaireModel() {
    }
    public PartenaireModel(int id, String libelle, String logo, String type, int isDeleted) {
        this.id = id;
        this.libelle = libelle;
        this.logo = logo;
        this.type = type;
        this.isDeleted= isDeleted;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }



    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", logo='" + logo + '\'' +
                ", type=" + type +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
