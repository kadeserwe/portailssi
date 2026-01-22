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
	@Table(name = "pmb_arretesmembrescommissionmarche")
	public class SygArretesMembresCommissionsMarches  implements java.io.Serializable {
		
  		private Long id;
		private String gestion,reference,fichier,referencemembre,fichiermembre;
		private SygAutoriteContractante autorite;
		private Date date,datemembre;
		
    	public SygArretesMembresCommissionsMarches() {
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

	
		
		@Column(name = "gestion")
		public String getGestion() {
			return gestion;
		}

		public void setGestion(String gestion) {
			this.gestion = gestion;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}

		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

	
    	
    	@Column(name = "reference",length=255)
		public String getReference() {
			return reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}

		
		@Column(name = "fichier",length=255)
		public String getFichier() {
			return fichier;
		}
    	public void setFichier(String fichier) {
			this.fichier = fichier;
		}

		
    	
    	@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
    	public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		
		@Column(name = "referencemembre",length=255)
		public String getReferencemembre() {
			return referencemembre;
		}
    	public void setReferencemembre(String referencemembre) {
			this.referencemembre = referencemembre;
		}

    	@Column(name = "fichiermembre",length=255)
		public String getFichiermembre() {
			return fichiermembre;
		}
    	public void setFichiermembre(String fichiermembre) {
			this.fichiermembre = fichiermembre;
		}

		
    	@Temporal(TemporalType.DATE)
    	@Column(name = "datemembre", length = 7)
		public Date getDatemembre() {
			return datemembre;
		}
    	public void setDatemembre(Date datemembre) {
			this.datemembre = datemembre;
		}

		

		
	}
