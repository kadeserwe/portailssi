//package sn.ssi.togo.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "pmbBanque")
//public class Banque implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    private  String libelle ;
//    private String sigle;
//    public Banque(){}
//    public Banque(Long id, String libelle, String sigle) {
//        this.id = id;
//        this.libelle = libelle;
//        this.sigle = sigle;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLibelle() {
//        return libelle;
//    }
//
//    public void setLibelle(String libelle) {
//        this.libelle = libelle;
//    }
//
//    public String getSigle() {
//        return sigle;
//    }
//
//    public void setSigle(String sigle) {
//        this.sigle = sigle;
//    }
//
//    @Override
//    public String toString() {
//        return "Banque{" +
//                "id=" + id +
//                ", libelle='" + libelle + '\'' +
//                ", sigle='" + sigle + '\'' +
//                '}';
//    }
//}
