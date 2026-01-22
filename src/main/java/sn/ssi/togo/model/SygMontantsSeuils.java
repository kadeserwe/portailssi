package sn.ssi.togo.model;
import java.math.BigDecimal;

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
	@Table(name = "pmb_montantsseuils")
	public class SygMontantsSeuils  implements java.io.Serializable {
		
  		private Long id;
		private String examen,modeengagement,type;
		private SygTypeAutoriteContractante typeautorite;
		private SygTypesmarches typemarche;
		private SygModepassation modepassation;
		private BigDecimal montantinferieur,montantsuperieur;
		
    	public SygMontantsSeuils() {
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

		
		@Column(name = "examen",  length = 40)
		public String getExamen() {
			return examen;
		}

		public void setExamen(String examen) {
			this.examen = examen;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typeautorite")
		public SygTypeAutoriteContractante getTypeautorite() {
			return typeautorite;
		}

		public void setTypeautorite(SygTypeAutoriteContractante typeautorite) {
			this.typeautorite = typeautorite;
		}

		@Column(name = "modeengagement")
		public String getModeengagement() {
			return modeengagement;
		}
		public void setModeengagement(String modeengagement) {
			this.modeengagement = modeengagement;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typemarche")
		public SygTypesmarches getTypemarche() {
			return typemarche;
		}
		public void setTypemarche(SygTypesmarches typemarche) {
			this.typemarche = typemarche;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "modepassation")
		public SygModepassation getModepassation() {
			return modepassation;
		}
    	public void setModepassation(SygModepassation modepassation) {
			this.modepassation = modepassation;
		}

    	@Column(name = "montantinferieur")
		public BigDecimal getMontantinferieur() {
			return montantinferieur;
		}
    	public void setMontantinferieur(BigDecimal montantinferieur) {
			this.montantinferieur = montantinferieur;
		}

    	
    	@Column(name = "montantsuperieur")
		public BigDecimal getMontantsuperieur() {
			return montantsuperieur;
		}
		public void setMontantsuperieur(BigDecimal montantsuperieur) {
			this.montantsuperieur = montantsuperieur;
		}

		
		@Column(name = "type")
		public String getType() {
			return type;
		}
    	public void setType(String type) {
			this.type = type;
		}

	
		
	}
