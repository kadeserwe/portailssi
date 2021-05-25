package sn.ssi.partail.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "evenement")
public class EvenementModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String libelle;
    private String description;
    private byte type;
    private int isDeleted;


    public EvenementModel() {
    }
    public EvenementModel(int id, String libelle, String description, byte type, int isDeleted) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getType() {
        return type;
    }

    public void setTyepe(byte type) {
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
        return "Evenement{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
