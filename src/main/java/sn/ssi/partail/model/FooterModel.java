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

    @Version
    private  int version;
    public FooterModel() {
    }
    public FooterModel(int id, String text, int isDeleted, int version) {
        this.id = id;
        this.text = text;
        this.isDeleted= isDeleted;
        this.version=version;

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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
