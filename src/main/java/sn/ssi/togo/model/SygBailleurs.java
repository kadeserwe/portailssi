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
	@Table(name = "pmbbailleurs")
	public class SygBailleurs  implements java.io.Serializable {
		
  		private Long id;
		private String libelle, type;
		
		
		public SygBailleurs() {
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idbailleurs",  length = 255)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "libbailleurs",  length = 255)
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		@Column(name = "typebailleurs",  length = 255)
		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}

		

	}

