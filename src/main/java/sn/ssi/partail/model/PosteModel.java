package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "poste")
public class PosteModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String type;
    private int isDeleted;
    public PosteModel() {
    }
    public PosteModel(int id, String libelle, String type, int isDeleted) {
        this.id = id;
        this.libelle = libelle;
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
        return "PosteModel{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", type=" + type +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
