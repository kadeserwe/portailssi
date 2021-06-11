package sn.ssi.partail.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "footer")
public class FooterModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private String text;
    private int isDeleted;

    public FooterModel() {
    }
    public FooterModel(int id, String text, int isDeleted) {
        this.id = id;
        this.text = text;
        this.isDeleted= isDeleted;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }


    @Override
    public String toString() {
        return "Footer{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
