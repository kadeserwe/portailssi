package sn.ssi.togo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sygdossiergrilleanalyse")
public class SygDossierGrilleAnalyse implements Serializable{

    private long id;
    private int statut = 0;
    private String commentaire;
    private SygGrillesAnalyses grillesAnalyse;
    private SygDossierCourrier dossierCourrier;



    @Column(name="commentaire",  length=500)
    public String getCommentaire() {
	return commentaire;
    }


    public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable= false, unique= true , length=11)
    public long getId() {
	return id;
    }


    public void setId(long id) {
	this.id = id;
    }


    @Column(name="statut",  length=11)
    public int getStatut() {
	return statut;
    }


    public void setStatut(int statut) {
	this.statut = statut;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grilleana")
    public SygGrillesAnalyses getGrillesAnalyse() {
	return grillesAnalyse;
    }


    public void setGrillesAnalyse(SygGrillesAnalyses grillesAnalyse) {
	this.grillesAnalyse = grillesAnalyse;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier")
    public SygDossierCourrier getDossierCourrier() {
	return dossierCourrier;
    }


    public void setDossierCourrier(SygDossierCourrier dossierCourrier) {
	this.dossierCourrier = dossierCourrier;
    }


    public SygDossierGrilleAnalyse() {
	// TODO Auto-generated constructor stub
    }

}
