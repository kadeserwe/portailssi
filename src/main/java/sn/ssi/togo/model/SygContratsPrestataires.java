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
	@Table(name = "pmb_contractsprestataires")
	public class SygContratsPrestataires  implements java.io.Serializable {
		
  		private Long idcontract;
		private String numcontract;
		private Date datedebutcontract,datefincontract,datesignature;
		private SygAudit audit;
		private SygPrestataire prestataire;
		private Integer nombreautorite=0;
		
		
    	public SygContratsPrestataires() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idcontract")
        public Long getIdcontract() {
			return this.idcontract;
		}
		public void setIdcontract(Long idcontract) {
			this.idcontract = idcontract;
		}

		@Column(name = "numcontract")
		public String getNumcontract() {
			return numcontract;
		}
		public void setNumcontract(String numcontract) {
			this.numcontract = numcontract;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datedebutcontract",  length = 10 )
		public Date getDatedebutcontract() {
			return datedebutcontract;
		}
		public void setDatedebutcontract(Date datedebutcontract) {
			this.datedebutcontract = datedebutcontract;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datefincontract",  length = 10 )
		public Date getDatefincontract() {
			return datefincontract;
		}
		public void setDatefincontract(Date datefincontract) {
			this.datefincontract = datefincontract;
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "idaudit")
	    public SygAudit getAudit() {
			return audit;
		}
		public void setAudit(SygAudit audit) {
			this.audit = audit;
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "idprestataire")
	    public SygPrestataire getPrestataire() {
			return prestataire;
		}
		public void setPrestataire(SygPrestataire prestataire) {
			this.prestataire= prestataire;
		}

		@Temporal(TemporalType.DATE)
		@Column(name ="datesignaturecontrat",  length = 10 )
		public Date getDatesignature() {
			return datesignature;
		}

		public void setDatesignature(Date datesignature) {
			this.datesignature = datesignature;
		}

		@Column(name ="nbreautorite",  length = 10 )
		public Integer getNombreautorite() {
			return nombreautorite;
		}
    	public void setNombreautorite(Integer nombreautorite) {
			this.nombreautorite = nombreautorite;
		}
		
		
		

	}
