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
	@Table(name = "pmb_auditsprestac")
	public class SygAuditsPrestataires  implements java.io.Serializable {
		
  		private Long idpaac;
		private String nomfichierobs,nomfichierrapfin,nomfichierrapprov;
		private Date datedebutprevu,datedebutreel,datefinprevu,datefinreel,daterapportprov,dateenvoirapprov,daterecepoberservation,daterapportfinal,datepublicrapfin;
    	private SygAutoriteContractante autorite;
		private  SygAudit audit;
		//private SygPrestatairesAudits prestataire;
		//private SygCourrierAudits CourrierAudits;
		private SygContratsPrestataires contprest;
		private String nomfichier2obs;
		
    	public SygAuditsPrestataires() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idpaac")
        public Long getIdpaac() {
			return this.idpaac;
		}
		public void setIdpaac(Long idpaac) {
			this.idpaac = idpaac;
		}

		@Column(name = "nomfichierobs")
		public String getNomfichierobs() {
			return nomfichierobs;
		}

		public void setNomfichierobs(String nomfichierobs) {
			this.nomfichierobs = nomfichierobs;
		}

		@Column(name = "nomfichierrapfin")
		public String getNomfichierrapfin() {
			return nomfichierrapfin;
		}

		public void setNomfichierrapfin(String nomfichierrapfin) {
			this.nomfichierrapfin = nomfichierrapfin;
		}

		@Column(name = "nomfichierrapprov")
		public String getNomfichierrapprov() {
			return nomfichierrapprov;
		}

		public void setNomfichierrapprov(String nomfichierrapprov) {
			this.nomfichierrapprov = nomfichierrapprov;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datedebutprevu",  length = 10 )
		public Date getDatedebutprevu() {
			return datedebutprevu;
		}
		public void setDatedebutprevu(Date datedebutprevu) {
			this.datedebutprevu = datedebutprevu;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datedebutreel",  length = 10 )
		public Date getDatedebutreel() {
			return datedebutreel;
		}
		
		public void setDatedebutreel(Date datedebutreel) {
			this.datedebutreel= datedebutreel;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datefinprevu",  length = 10 )
		public Date getDatefinprevu() {
			return datefinprevu;
		}
		
		public void setDatefinprevu(Date datefinprevu) {
			this.datefinprevu= datefinprevu;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datefinreel",  length = 10 )
		public Date getDatefinreel() {
			return datefinreel;
		}
		
		public void setDatefinreel(Date datefinreel) {
			this.datefinreel= datefinreel;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="daterapportprov",  length = 10 )
		public Date getDaterapportprov() {
			return daterapportprov;
		}
		
		public void setDaterapportprov(Date daterapportprov) {
			this.daterapportprov=daterapportprov;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="dateenvoirapprov",  length = 10 )
		public Date getDateenvoirapprov() {
			return dateenvoirapprov;
		}
		
		public void setDateenvoirapprov(Date dateenvoirapprov) {
			this.dateenvoirapprov= dateenvoirapprov;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="daterecepoberservation",  length = 10 )
		public Date getDaterecepoberservation() {
			return daterecepoberservation;
		}
		
		public void setDaterecepoberservation(Date daterecepoberservation) {
			this.daterecepoberservation= daterecepoberservation;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="daterapportfinal",  length = 10 )
		public Date getDaterapportfinal() {
			return daterapportfinal;
		}
		
		public void setDaterapportfinal(Date daterapportfinal) {
			this.daterapportfinal= daterapportfinal;
		}
		
		@Temporal(TemporalType.DATE)
		@Column(name ="datepublicrapfin",  length = 10 )
		public Date getDatepublicrapfin() {
			return datepublicrapfin;
		}
		
		public void setDatepublicrapfin(Date datepublicrapfin) {
			this.datepublicrapfin= datepublicrapfin;
		}
		@ManyToOne(fetch = FetchType.LAZY)
	 	@JoinColumn(name = "autoriteid")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}

		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "audit")
		public SygAudit getAudit() {
			return audit;
		}

		public void setAudit(SygAudit audit) {
			this.audit = audit;
		}
//		@ManyToOne(fetch = FetchType.EAGER)
//	 	@JoinColumn(name = "prestataire")
//		public SygPrestatairesAudits getPrestataire() {
//			return prestataire;
//		}
//
//		public void setPrestataire(SygPrestatairesAudits prestataire) {
//			this.prestataire = prestataire;
//		}
//		@ManyToOne(fetch = FetchType.EAGER)
//	 	@JoinColumn(name = "courrieraudits")
//		public SygCourrierAudits getCourrierAudits() {
//			return CourrierAudits;
//		}
//
//		public void setCourrierAudits(SygCourrierAudits courrierAudits) {
//			CourrierAudits = courrierAudits;
//		}
		
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "contratsprestataires")
		public SygContratsPrestataires getContprest() {
			return contprest;
		}

		public void setContprest(SygContratsPrestataires contprest) {
			this.contprest = contprest;
		}

		@Column(name = "nomfichier2obs")
		public String getNomfichier2obs() {
			return nomfichier2obs;
		}

		public void setNomfichier2obs(String nomfichier2obs) {
			this.nomfichier2obs = nomfichier2obs;
		}
		
		
	}
