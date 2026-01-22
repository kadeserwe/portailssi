package sn.ssi.togo.model;

import sn.ssi.togo.model.SygAutoriteContractante;
import sn.ssi.togo.model.SygDossiers;

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
	@Table(name = "pmb_avisattributions")
	public class SygAvisAttribution  implements java.io.Serializable {
		
  		private Long id;
		private String attriObjet,attriType,attritexte,attriRef,attrifichier,attriRaisonsocial;
		
		private SygDossiers dossier;
		private SygAutoriteContractante autorite;
		private int attriPub;
		private Date attriDate,attridatepublication;
		
    	public SygAvisAttribution() {
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

	

		@Column(name = "attritype",  length = 255)
		public String getAttriType() {
			return this.attriType;
		}

		public void setAttriType(String attriType) {
			this.attriType = attriType;
		}


		

		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "iddossier")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


    	@Column(name = "attriobjet")
		public String getAttriObjet() {
			return attriObjet;
		}
    	public void setAttriObjet(String attriObjet) {
			this.attriObjet = attriObjet;
		}


    	@Column(name = "attritexte")
		public String getAttritexte() {
			return attritexte;
		}
    	public void setAttritexte(String attritexte) {
			this.attritexte = attritexte;
		}


    	@Column(name = "attriref")
		public String getAttriRef() {
			return attriRef;
		}
    	public void setAttriRef(String attriRef) {
			this.attriRef = attriRef;
		}


    	@Column(name = "attripub")
		public int getAttriPub() {
			return attriPub;
		}
    	public void setAttriPub(int attriPub) {
			this.attriPub = attriPub;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "attridate", length = 7)
		public Date getAttriDate() {
			return attriDate;
		}
    	public void setAttriDate(Date attriDate) {
			this.attriDate = attriDate;
		}


    	@Column(name = "attrifichier", length = 255)
    	public String getAttrifichier() {
			return attrifichier;
		}
    	public void setAttrifichier(String attrifichier) {
			this.attrifichier = attrifichier;
		}


    	@Column(name = "attriraisonsocial", length = 255)
		public String getAttriRaisonsocial() {
			return attriRaisonsocial;
		}
		public void setAttriRaisonsocial(String attriRaisonsocial) {
			this.attriRaisonsocial = attriRaisonsocial;
		}
    	
    	
		@Temporal(TemporalType.DATE)
    	@Column(name = "attridatepub", length = 7)
		public Date getAttridatepublication() {
			return attridatepublication;
		}
    	public void setAttridatepublication(Date attridatepublication) {
			this.attridatepublication = attridatepublication;
		}

	}

