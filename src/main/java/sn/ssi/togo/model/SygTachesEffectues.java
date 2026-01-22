package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_tacheseffectues")
	public class SygTachesEffectues  implements Serializable {
		
  		private Long id;
		private Long dossier;
		private int allotissement,garantie,pieceadministrative,criterequalification,devise,financement,registreretrait,registredepot,
		lotssoumis,commissionspassation,representantssoumis,servicestechniques,observateurs,garantiesoum,piecessoumis,lectureoffres,
		commissiontecniques,documents,examengarantie,examenexhaustivite,examensignatureoffre,examenconformite,verificationcritere,attributionprovisoire,
		termereference,depotcandidature,preselection,notification,commissionspassationpi,representantssoumispi,notestechniques,offresfinancieres,prixevalues,
		registredepotpi;
		
		
    


		public SygTachesEffectues() {
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		@Column(name = "dossier")
		public Long getDossier() {
			return dossier;
		}
    	public void setDossier(Long dossier) {
			this.dossier = dossier;
		}

    	@Column(name = "allotissement",length=1)
    	public int getAllotissement() {
			return allotissement;
		}
    	public void setAllotissement(int allotissement) {
			this.allotissement = allotissement;
		}

    	@Column(name = "criterequalification",length=1)
		public int getCriterequalification() {
			return criterequalification;
		}
        public void setCriterequalification(int criterequalification) {
			this.criterequalification = criterequalification;
		}

        @Column(name = "commissionspassation",length=1)
		public int getCommissionspassation() {
			return commissionspassation;
		}
    	public void setCommissionspassation(int commissionspassation) {
			this.commissionspassation = commissionspassation;
		}


    	@Column(name = "commissiontecniques",length=1)
		public int getCommissiontecniques() {
			return commissiontecniques;
		}
    	public void setCommissiontecniques(int commissiontecniques) {
			this.commissiontecniques = commissiontecniques;
		}

    	@Column(name = "garantie",length=1)
		public int getGarantie() {
			return garantie;
		}
    	public void setGarantie(int garantie) {
			this.garantie = garantie;
		}

    	@Column(name = "devise",length=1)
		public int getDevise() {
			return devise;
		}
    	public void setDevise(int devise) {
			this.devise = devise;
		}


    	@Column(name = "financement",length=1)
		public int getFinancement() {
			return financement;
		}
    	public void setFinancement(int financement) {
			this.financement = financement;
		}

    	@Column(name = "garantiesoum",length=1)
		public int getGarantiesoum() {
			return garantiesoum;
		}
    	public void setGarantiesoum(int garantiesoum) {
			this.garantiesoum = garantiesoum;
		}


    	@Column(name = "lectureoffres",length=1)
		public int getLectureoffres() {
			return lectureoffres;
		}
    	public void setLectureoffres(int lectureoffres) {
			this.lectureoffres = lectureoffres;
		}
    	
    	
    	@Column(name = "pieceadministrative",length=1)
    	public int getPieceadministrative() {
			return pieceadministrative;
		}
    	public void setPieceadministrative(int pieceadministrative) {
			this.pieceadministrative = pieceadministrative;
		}

    	@Column(name = "registreretrait",length=1)
		public int getRegistreretrait() {
			return registreretrait;
		}
    	public void setRegistreretrait(int registreretrait) {
			this.registreretrait = registreretrait;
		}
		
		@Column(name = "registredepot",length=1)
    	public int getRegistredepot() {
			return registredepot;
		}
    	public void setRegistredepot(int registredepot) {
			this.registredepot = registredepot;
		}


    	@Column(name = "lotssoumis",length=1)
		public int getLotssoumis() {
			return lotssoumis;
		}
    	public void setLotssoumis(int lotssoumis) {
			this.lotssoumis = lotssoumis;
		}

    	@Column(name = "representantssoumis",length=1)
		public int getRepresentantssoumis() {
			return representantssoumis;
		}
    	public void setRepresentantssoumis(int representantssoumis) {
			this.representantssoumis = representantssoumis;
		}

    	@Column(name = "servicestechniques",length=1)
		public int getServicestechniques() {
			return servicestechniques;
		}
    	public void setServicestechniques(int servicestechniques) {
			this.servicestechniques = servicestechniques;
		}


    	@Column(name = "observateurs",length=1)
		public int getObservateurs() {
			return observateurs;
		}
    	public void setObservateurs(int observateurs) {
			this.observateurs = observateurs;
		}


    	@Column(name = "piecessoumis",length=1)
		public int getPiecessoumis() {
			return piecessoumis;
		}
    	public void setPiecessoumis(int piecessoumis) {
			this.piecessoumis = piecessoumis;
		}

    	@Column(name = "documents",length=1)
		public int getDocuments() {
			return documents;
		}
		public void setDocuments(int documents) {
			this.documents = documents;
		}

		@Column(name = "examengarantie",length=1)
		public int getExamengarantie() {
			return examengarantie;
		}
    	public void setExamengarantie(int examengarantie) {
			this.examengarantie = examengarantie;
		}

    	@Column(name = "examenexhaustivite",length=1)
		public int getExamenexhaustivite() {
			return examenexhaustivite;
		}
    	public void setExamenexhaustivite(int examenexhaustivite) {
			this.examenexhaustivite = examenexhaustivite;
		}

    	@Column(name = "examensignatureoffre",length=1)
		public int getExamensignatureoffre() {
			return examensignatureoffre;
		}
    	public void setExamensignatureoffre(int examensignatureoffre) {
			this.examensignatureoffre = examensignatureoffre;
		}

    	@Column(name = "examenconformite",length=1)
    	public int getExamenconformite() {
			return examenconformite;
		}
    	public void setExamenconformite(int examenconformite) {
			this.examenconformite = examenconformite;
		}

    	@Column(name = "verificationcritere",length=1)
		public int getVerificationcritere() {
			return verificationcritere;
		}
    	public void setVerificationcritere(int verificationcritere) {
			this.verificationcritere = verificationcritere;
		}


    	@Column(name = "attributionprovisoire",length=1)
		public int getAttributionprovisoire() {
			return attributionprovisoire;
		}
 		public void setAttributionprovisoire(int attributionprovisoire) {
			this.attributionprovisoire = attributionprovisoire;
		}

 		@Column(name = "termereference",length=1)
		public int getTermereference() {
			return termereference;
		}
    	public void setTermereference(int termereference) {
			this.termereference = termereference;
		}

    	@Column(name = "depotcandidature",length=1)
		public int getDepotcandidature() {
			return depotcandidature;
		}
 		public void setDepotcandidature(int depotcandidature) {
			this.depotcandidature = depotcandidature;
		}

 		@Column(name = "preselection",length=1)
		public int getPreselection() {
			return preselection;
		}
    	public void setPreselection(int preselection) {
			this.preselection = preselection;
		}

    	@Column(name = "notification",length=1)
		public int getNotification() {
			return notification;
		}
    	public void setNotification(int notification) {
			this.notification = notification;
		}


    	@Column(name = "commissionspassationpi",length=1)
		public int getCommissionspassationpi() {
			return commissionspassationpi;
		}
 		public void setCommissionspassationpi(int commissionspassationpi) {
			this.commissionspassationpi = commissionspassationpi;
		}

 		@Column(name = "representantssoumispi",length=1)
		public int getRepresentantssoumispi() {
			return representantssoumispi;
		}
    	public void setRepresentantssoumispi(int representantssoumispi) {
			this.representantssoumispi = representantssoumispi;
		}


    	@Column(name = "notestechniques",length=1)
		public int getNotestechniques() {
			return notestechniques;
		}
    	public void setNotestechniques(int notestechniques) {
			this.notestechniques = notestechniques;
		}


    	@Column(name = "offresfinancieres",length=1)
		public int getOffresfinancieres() {
			return offresfinancieres;
		}
    	public void setOffresfinancieres(int offresfinancieres) {
			this.offresfinancieres = offresfinancieres;
		}

    	@Column(name = "prixevalues",length=1)
		public int getPrixevalues() {
			return prixevalues;
		}
    	public void setPrixevalues(int prixevalues) {
			this.prixevalues = prixevalues;
		}

		
    	@Column(name = "registredepotpi",length=1)
		public int getRegistredepotpi() {
			return registredepotpi;
		}
    	public void setRegistredepotpi(int registredepotpi) {
			this.registredepotpi = registredepotpi;
		}

 		
	}

