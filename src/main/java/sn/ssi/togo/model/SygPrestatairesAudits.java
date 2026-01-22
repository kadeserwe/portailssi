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
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_prestatairesaudits")
	public class SygPrestatairesAudits  implements java.io.Serializable {
		
  		private Long idpaac;
	 	private  SygAudit audit;
		private SygPrestataire prestataire;
		private SygContratsPrestataires contprest;
	
		
    	public SygPrestatairesAudits() {
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

		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "idaudit")
		public SygAudit getAudit() {
			return audit;
		}

		public void setAudit(SygAudit audit) {
			this.audit = audit;
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "contratsprestataires")
		public SygContratsPrestataires getContprest() {
			return contprest;
		}

		public void setContprest(SygContratsPrestataires contprest) {
			this.contprest = contprest;
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "idprestataire")
		public SygPrestataire getPrestataire() {
			return prestataire;
		}

		public void setPrestataire(SygPrestataire prestataire) {
			this.prestataire = prestataire;
		}
	}
