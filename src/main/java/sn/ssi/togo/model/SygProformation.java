package sn.ssi.togo.model;
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
	@Table(name = "syg_proformation")
	public class SygProformation  implements java.io.Serializable {
		
  		private Long id;
		private String forRef, forLibelle, forCible, forCommentaire, forLieu;
		private String forLieuR;
		private Date forDateDebut,forDateFin;
		private Date forDateDebutR,forDateFinR;
		private Long budg,effectif;
//		private SygAutoriteContractante autorite;
		private SygCurssusetModules cursusm;
		private SygCurssus cursus;
		private SygFormateur formateur;
		
		
		private SygFormateur formateurR;
		private SygCoordonateur coordonnateur;
		private SygCoordonateur coordonaterR;
		private SygLogisticien logisticien;
		private SygLogisticien logisticienR;
	//	private SygGroupeFormation groupe;
//		private SygTypeAutoriteContractante typeautorite;
//		private String mois;
		private SygMois mois;
		private SygAnnee anne;
		private int publie;
		
    	public SygProformation() {
		}

    


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "forref")
		public String getForRef() {
			return forRef;
		}

		public void setForRef(String forRef) {
			this.forRef = forRef;
		}

		@Column(name = "forlibelle")
		public String getForLibelle() {
			return forLibelle;
		}

		public void setForLibelle(String forLibelle) {
			this.forLibelle = forLibelle;
		}

		@Column(name = "forcible")
		public String getForCible() {
			return forCible;
		}

		public void setForCible(String forCible) {
			this.forCible = forCible;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="fordatedebut",  length = 10 )
		public Date getForDateDebut() {
			return forDateDebut;
		}


		public void setForDateDebut(Date forDateDebut) {
			this.forDateDebut = forDateDebut;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="fordatefin",  length = 10 )
		public Date getForDateFin() {
			return forDateFin;
		}
		
		public void setForDateFin(Date forDateFin) {
			this.forDateFin = forDateFin;
		}
		@Column(name = "forlieu")
		public String getForLieu() {
			return forLieu;
		}
		@Column(name = "forcommentaire")
		public String getForCommentaire() {
			return forCommentaire;
		}
		public void setForCommentaire(String forCommentaire) {
			this.forCommentaire = forCommentaire;
		}
		public void setForLieu(String forLieu) {
			this.forLieu = forLieu;
		}
		

//		@ManyToOne(fetch = FetchType.EAGER)
//    	@JoinColumn(name = "autorite_id_type")
//		public SygTypeAutoriteContractante getTypeautorite() {
//			return typeautorite;
//		}
//
//		public void setTypeautorite(SygTypeAutoriteContractante typeautorite) {
//			this.typeautorite = typeautorite;
//		}
//
//		@ManyToOne(fetch = FetchType.EAGER)
//    	@JoinColumn(name = "autorite_id")
//		public SygAutoriteContractante getAutorite() {
//			return autorite;
//		}
//
//		public void setAutorite(SygAutoriteContractante autorite) {
//			this.autorite = autorite;
	//	}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "modulecursus")
		public SygCurssusetModules getCursusm() {
			return cursusm;
		}

		public void setCursusm(SygCurssusetModules cursusm) {
			this.cursusm = cursusm;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "cursus")
		public SygCurssus getCursus() {
			return cursus;
		}

		public void setCursus(SygCurssus cursus) {
			this.cursus = cursus;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "formateur")
		public SygFormateur getFormateur() {
			return formateur;
		}

		public void setFormateur(SygFormateur formateur) {
			this.formateur = formateur;
		}
		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "mois_id")
		public SygMois getMois() {
			return mois;
		}
		public void setMois(SygMois mois) {
			this.mois = mois;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "annee_id")
		public SygAnnee getAnne() {
			return anne;
		}
		public void setAnne(SygAnnee anne) {
			this.anne = anne;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "coordonnateur_id")
		public SygCoordonateur getCoordonnateur() {
			return coordonnateur;
		}

		public void setCoordonnateur(SygCoordonateur coordonnateur) {
			this.coordonnateur = coordonnateur;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "logisticien_id")
		public SygLogisticien getLogisticien() {
			return logisticien;
		}

		public void setLogisticien(SygLogisticien logisticien) {
			this.logisticien = logisticien;
		}

		
//		@ManyToOne(fetch = FetchType.EAGER)
//    	@JoinColumn(name = "groupe_id")
//		public SygGroupeFormation getGroupe() {
//			return groupe;
//		}
//
//		public void setGroupe(SygGroupeFormation groupe) {
//			this.groupe = groupe;
//		}


		@Column(name = "effectif", length = 11)
		public Long getEffectif() {
			return effectif;
		}

		public void setEffectif(Long effectif) {
			this.effectif = effectif;
		}

		@Column(name = "budget")
		public Long getBudg() {
			return budg;
		}

		public void setBudg(Long budg) {
			this.budg = budg;
		}


		@Column(name = "lieu_reel")
		public String getForLieuR() {
			return forLieuR;
		}

		public void setForLieuR(String forLieuR) {
			this.forLieuR = forLieuR;
		}

	
		@Temporal(TemporalType.DATE)
		@Column(name ="datefin_reel",  length = 10 )
		public Date getForDateDebutR() {
			return forDateDebutR;
		}
		public void setForDateDebutR(Date forDateDebutR) {
			this.forDateDebutR = forDateDebutR;
		}

		@Temporal(TemporalType.DATE)
		@Column(name ="datedebu_reel",  length = 10 )
		public Date getForDateFinR() {
			return forDateFinR;
		}
		public void setForDateFinR(Date forDateFinR) {
			this.forDateFinR = forDateFinR;
		}

	
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "formateur_reel_id")
		public SygFormateur getFormateurR() {
			return formateurR;
		}
		public void setFormateurR(SygFormateur formateurR) {
			this.formateurR = formateurR;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "coordonnateur_reel_id")
		public SygCoordonateur getCoordonaterR() {
			return coordonaterR;
		}
		public void setCoordonaterR(SygCoordonateur coordonaterR) {
			this.coordonaterR = coordonaterR;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "logiticien_reel_id")
		public SygLogisticien getLogisticienR() {
			return logisticienR;
		}
		public void setLogisticienR(SygLogisticien logisticienR) {
			this.logisticienR = logisticienR;
		}



		@Column(name = "publie")
		public int getPublie() {
			return publie;
		}
    	public void setPublie(int publie) {
			this.publie = publie;
		}

		
		
		
	}
