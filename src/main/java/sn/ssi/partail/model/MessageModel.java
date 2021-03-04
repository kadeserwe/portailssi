package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class MessageModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String objet;
    private String description;
    private int isDeleted;
    private UtilisateurModel utilisateur;
    public MessageModel() {
    }
    public MessageModel(int id, String objet,String description, int isDeleted,UtilisateurModel utilisateur) {
        this.id = id;
        this.objet = objet;
        this.description = description;
        this.objet = objet;
        this.isDeleted= isDeleted;
        this.utilisateur=utilisateur;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjett() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public UtilisateurModel getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurModel utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", objet=" + objet + '\'' +
                ", description=" + description + '\'' +
                ",isDeleted=" + isDeleted +
                ", utilisateur=" + utilisateur + '\'' +
                '}';

    }
}
