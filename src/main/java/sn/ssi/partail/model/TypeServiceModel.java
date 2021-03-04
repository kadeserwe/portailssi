package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "typeService")
public class TypeServiceModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;



    private int isDeleted;
    public TypeServiceModel() {
    }
    public TypeServiceModel(int id, String libelle, int isDeleted) {
        this.id = id;
        this.libelle = libelle;
        this.id =  isDeleted;
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
    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }



    @Override
    public String toString() {
        return "typeService{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ",isDeleted=" + isDeleted +
                '}';

    }
}

