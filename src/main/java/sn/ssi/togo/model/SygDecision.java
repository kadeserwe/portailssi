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
	@Table(name = "pmb_decision")
	public class SygDecision  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private SygTypeDecision typedecision;
	
		public SygDecision() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 10)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

		@Column(name = "libelle",  length = 255)
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "typedecisionid")
		public SygTypeDecision getTypedecision() {
			return typedecision;
		}


		public void setTypedecision(SygTypeDecision typedecision) {
			this.typedecision = typedecision;
		}

		
		
	}

