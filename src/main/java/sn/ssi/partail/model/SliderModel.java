package sn.ssi.partail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "slider")
public class SliderModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private  int id;
    private int ordrePassage;
    private int intervalle;
    private String nomSlider;
    private int isDeleted;
    public SliderModel() {
    }
    public SliderModel(int id, int ordrePassage, int intervalle, String nomSlider, int isDeleted) {
        this.id = id;
        this.ordrePassage = ordrePassage;
        this.intervalle = intervalle;
        this.nomSlider = nomSlider;
        this.isDeleted= isDeleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdrePassage() {
        return ordrePassage;
    }

    public void setOrdrePassage(int ordrePassage) {
        this.ordrePassage = ordrePassage;
    }

    public int getIntervalle() {
        return intervalle;
    }

    public void setIntervalle(int intervalle) {
        this.intervalle = intervalle;
    }

    public String getNomSlider() {
        return nomSlider;
    }

    public void setNomSlider(String nomSlider) {
        this.nomSlider = nomSlider;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }



    @Override
    public String toString() {
        return "Slider{" +
                "id=" + id +
                ", ordrePassage='" + ordrePassage + '\'' +
                ", intervalle='" + intervalle + '\'' +
                ", nomSlider=" + nomSlider +
                ",isDeleted=" + isDeleted +
                '}';

    }
}
