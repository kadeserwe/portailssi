package sn.ssi.partail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service")
public class ServiceModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String description;
    private int url;
    private int isDeleted;
    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = "typeservice", allowSetters = true)
    private TypeServiceModel typeservice;



    public ServiceModel() {
    }
    public ServiceModel(int id, String libelle, String description, int url, int isDeleted, TypeServiceModel typeservice) {
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


    public TypeServiceModel getTypeservice() {
        return typeservice;
    }

    public void setTypeservice(TypeServiceModel typeservice) {
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

