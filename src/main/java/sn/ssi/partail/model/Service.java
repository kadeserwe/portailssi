package sn.ssi.partail.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service")
public class Service implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String description;
    private int url;
    private int isDeleted;
    private TypeService typeservice;



    public Service() {
    }
    public Service(int id, String libelle, String description, int url, int isDeleted,TypeService typeservice) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.url = url;
        this.isDeleted= isDeleted;
        this.typeservice =typeservice;
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

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }


    public TypeService getTypeservice() {
        return typeservice;
    }

    @ManyToOne
    @JoinColumn(name = "typeservice_id")
    public void setTypeservice(TypeService typeservice) {
        this.typeservice = typeservice;
    }


    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", url=" + url +
                ",isDeleted=" + isDeleted +
                '}';

    }
}

