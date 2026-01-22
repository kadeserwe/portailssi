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
	@Table(name = "pmb_decisionslocaux")
	public class SygContentieux  implements java.io.Serializable {
		
  		private Long id;
//		private String nom ;
//		private String prenom ;
		private String raisonSocial ;//Nom ou raison sociale
		private Long bp;//boite postal
		private String telephone ;
		private String fax ;
		private String email ;
		private String objet ;
		private String motifs ;
		private Date daterecours ;//Date r�ception courrier
		private Date datecourrier;//Date courrier
		private Date heure;
		//private SygDecision decision;
		private SygAutoriteContractante autoritecontractante;
		private SygAppelsOffres appeloffre;
		
		//private SysState state;
		private Date dateStatut;
		private String traitement;
		
		private String recvDecision;// decision Recevabilite 
		private Long recvNumero;//numero Recevabilite
		private Date recvDate; //date Recevabilite 
		private String recvFichier;//fichier  Recevabilite 
		private String recvCommentaire;// Commentaire Recevabilite 
		
		
		private String refcourrier ;
		private String numero;//N� enregistrement
		private String adresse;
		//Champ decision attaqu�e
		private Long numerodecision;
		private Date datedecision;
		
		//Champ rapport 
		private Date daterapport;
		private String Fichierrapport;
	
		
		public SygContentieux() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "dlocid",  length = 10)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "dlocnumero",  length = 255)
		
		
		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		
//		@Column(name = "dlocnom",  length = 255)
//		public String getNom() {
//			return nom;
//		}
//
//		public void setNom(String nom) {
//			this.nom = nom;
//		}
//
//		@Column(name = "dlocprenom",  length = 255)
//		public String getPrenom() {
//			return prenom;
//		}
//
//		public void setPrenom(String prenom) {
//			this.prenom = prenom;
//		}


		@Column(name = "dlocnomraisonsocial",  length = 255)
		public String getRaisonSocial() {
			return raisonSocial;
		}

		public void setRaisonSocial(String raisonSocial) {
			this.raisonSocial = raisonSocial;
		}


		@Column(name = "dlocbp")
			public Long getBp() {
			return bp;
		}

		public void setBp(Long bp) {
			this.bp = bp;
		}
		

		@Column(name = "dloctelephone",  length = 50)
		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}


		@Column(name = "dlocfax",  length = 50)
		public String getFax() {
			return fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}


		@Column(name = "dlocemail",  length = 50)
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		@Column(name = "dlocobjet",  length = 255)
		public String getObjet() {
			return objet;
		}

		public void setObjet(String objet) {
			this.objet = objet;
		}


		@Column(name = "dlocmotifs",  length = 255)
		public String getMotifs() {
			return motifs;
		}

		public void setMotifs(String motifs) {
			this.motifs = motifs;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "dlocdaterecours", length = 7)
		public Date getDaterecours() {
			return daterecours;
		}



		public void setDaterecours(Date daterecours) {
			this.daterecours = daterecours;
		}


		@Temporal(TemporalType.TIME)
		@Column(name = "dlocheure", length = 7)
		public Date getHeure() {
			return heure;
		}

		public void setHeure(Date heure) {
			this.heure = heure;
		}

		
//		@ManyToOne(fetch = FetchType.EAGER)
//		@JoinColumn(name = "decisionid")
//		public SygDecision getDecision() {
//			return decision;
//		}
//
//		public void setDecision(SygDecision decision) {
//			this.decision = decision;
//		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "aut_autid")
		public SygAutoriteContractante getAutoritecontractante() {
			return autoritecontractante;
		}

		public void setAutoritecontractante(SygAutoriteContractante autoritecontractante) {
			this.autoritecontractante = autoritecontractante;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "appeloffreid")
		public SygAppelsOffres getAppeloffre() {
			return appeloffre;
		}


		public void setAppeloffre(SygAppelsOffres appeloffre) {
			this.appeloffre = appeloffre;
		}

//
//		@ManyToOne(fetch = FetchType.EAGER)
//		@JoinColumn(name = "statcode")
//		public SysState getState() {
//			return state;
//		}
//
//
//
//		public void setState(SysState state) {
//			this.state = state;
//		}
//

//		@Temporal(TemporalType.DATE)
//		@Column(name = "dlocdatestatut", length = 7)
//		public Date getDateStatut() {
//			return dateStatut;
//		}
//


		public void setDateStatut(Date dateStatut) {
			this.dateStatut = dateStatut;
		}


		@Column(name = "dloctraitement", length = 8)
		public String getTraitement() {
			return traitement;
		}



		public void setTraitement(String traitement) {
			this.traitement = traitement;
		}


		@Column(name = "recvdecision", length = 50)
		public String getRecvDecision() {
			return recvDecision;
		}

		public void setRecvDecision(String recvDecision) {
			this.recvDecision = recvDecision;
		}
		
		@Column(name = "recvnumero")
		public Long getRecvNumero() {
			return recvNumero;
		}

		public void setRecvNumero(Long recvNumero) {
			this.recvNumero = recvNumero;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "recvdate", length = 7)
		public Date getRecvDate() {
			return recvDate;
		}

		public void setRecvDate(Date recvDate) {
			this.recvDate = recvDate;
		}


		@Column(name = "recvfichier")
		public String getRecvFichier() {
			return recvFichier;
		}

		public void setRecvFichier(String recvFichier) {
			this.recvFichier = recvFichier;
		}


		@Column(name = "recvcommentaire", length = 255)
		public String getRecvCommentaire() {
			return recvCommentaire;
		}

		public void setRecvCommentaire(String recvCommentaire) {
			this.recvCommentaire = recvCommentaire;
		}


		@Column(name = "dlocreferencecourrier", length = 255)
		public String getRefcourrier() {
			return refcourrier;
		}



		public void setRefcourrier(String refcourrier) {
			this.refcourrier = refcourrier;
		}


		@Column(name = "dlocnumerodecision")
		public Long getNumerodecision() {
			return numerodecision;
		}



		public void setNumerodecision(Long numerodecision) {
			this.numerodecision = numerodecision;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "dlocdatedecision", length = 7)
		public Date getDatedecision() {
			return datedecision;
		}



		public void setDatedecision(Date datedecision) {
			this.datedecision = datedecision;
		}


		@Column(name = "dlocadresse", length = 255)
		public String getAdresse() {
			return adresse;
		}



		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "dlocdatecourrier", length = 7)
		public Date getDatecourrier() {
			return datecourrier;
		}



		public void setDatecourrier(Date datecourrier) {
			this.datecourrier = datecourrier;
		}


		//Champ Rapport 
		@Temporal(TemporalType.DATE)
		@Column(name = "dlocdaterapport", length = 7)
		public Date getDaterapport() {
			return daterapport;
		}



		public void setDaterapport(Date daterapport) {
			this.daterapport = daterapport;
		}


		@Column(name = "dlocfichierrapport")
		public String getFichierrapport() {
			return Fichierrapport;
		}



		public void setFichierrapport(String fichierrapport) {
			Fichierrapport = fichierrapport;
		}


		
		

		
	}

