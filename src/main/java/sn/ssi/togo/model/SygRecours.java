package sn.ssi.togo.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_recours")
public class SygRecours  implements Serializable {
	private Long id;
	private String Refrecours,ObjetRecours,nomSoumissionnaire,CommentBlock,refAoffre,fichier;
	private SygDossiers dossier;
	private SygAutoriteContractante autorite;	
	private SygAppelsOffres appel;
	private Date DateRecous,dateCourrier,DateBlockdos,DateBlockdosopen,DateBlock,Datereception,Dateexpiration;
	private int Valider;
	private Date Datecloture;
    private String Commentaire;
    private String Issuerecoursgracieux;


	
	public SygRecours() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}



	@Column(name = "refrecours",length=50)
	public String getRefrecours() {
		return Refrecours;
	}
	public void setRefrecours(String refrecours) {
		Refrecours = refrecours;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "appelsoffres_id")
	public SygAppelsOffres getAppel() {
		return appel;
	}
	public void setAppel(SygAppelsOffres appel) {
		this.appel = appel;
	}


	@Column(name = "objetrecours",length=255)
	public String getObjetRecours() {
		return ObjetRecours;
	}
	public void setObjetRecours(String objetRecours) {
		ObjetRecours = objetRecours;
	}

	@Column(name = "nomsoumissionnaire",length=255)
	public String getNomSoumissionnaire() {
		return nomSoumissionnaire;
	}
	public void setNomSoumissionnaire(String nomSoumissionnaire) {
		this.nomSoumissionnaire = nomSoumissionnaire;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "daterecous", length = 7)
	public Date getDateRecous() {
		return DateRecous;
	}
	public void setDateRecous(Date dateRecous) {
		DateRecous = dateRecous;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datecourrier", length = 7)
	public Date getDateCourrier() {
		return dateCourrier;
	}
	public void setDateCourrier(Date dateCourrier) {
		this.dateCourrier = dateCourrier;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateblockdos", length = 7)
	public Date getDateBlockdos() {
		return DateBlockdos;
	}
	public void setDateBlockdos(Date dateBlockdos) {
		DateBlockdos = dateBlockdos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateblockdosopen", length = 7)
	public Date getDateBlockdosopen() {
		return DateBlockdosopen;
	}
	public void setDateBlockdosopen(Date dateBlockdosopen) {
		DateBlockdosopen = dateBlockdosopen;
	}

	@Column(name = "commentblock")
	public String getCommentBlock() {
		return CommentBlock;
	}
	public void setCommentBlock(String commentBlock) {
		CommentBlock = commentBlock;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "dateblock", length = 7)
	public Date getDateBlock() {
		return DateBlock;
	}
    public void setDateBlock(Date dateBlock) {
		DateBlock = dateBlock;
	}
    @Column(name = "valider")
    public int getValider() {
		return Valider;
	}
	public void setValider(int valider) {
		Valider = valider;
	}
	 @Column(name = "refaoffre",length=50)
	public String getRefAoffre() {
		return refAoffre;
	}
	public void setRefAoffre(String refAoffre) {
		this.refAoffre = refAoffre;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "datereception", length = 7)
	public Date getDatereception() {
		return Datereception;
	}
	public void setDatereception(Date datereception) {
		Datereception = datereception;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "dateexpiration", length = 7)
	public Date getDateexpiration() {
		return Dateexpiration;
	}
	public void setDateexpiration(Date dateexpiration) {
		Dateexpiration = dateexpiration;
	}

	@Column(name = "fichier",length=50)
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	@Column(name = "issuerecoursgracieux",  length = 50)
	public String getIssuerecoursgracieux() {
		return Issuerecoursgracieux;
	}
	public void setIssuerecoursgracieux(String issuerecoursgracieux) {
		Issuerecoursgracieux = issuerecoursgracieux;
	}
	@Column(name = "commentaire",  length = 50)
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	@Temporal(TemporalType.DATE)
    @Column(name = "datecloture", length = 10)
	public Date getDatecloture() {
		return Datecloture;
	}
	public void setDatecloture(Date datecloture) {
		Datecloture = datecloture;
	}
	
	 
	
	
}
