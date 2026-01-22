package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "eco_modetraitement")
	public class EcoModeTraitement  implements java.io.Serializable {
		
		private Long id;
		private String libelle,description, icone;
		


		public EcoModeTraitement() {
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



    	@Column(name = "description",  length = 255)
		public String getDescription() {
			return description;
		}
    	public void setDescription(String description) {
			this.description = description;
		}


    	@Column(name = "icone", length=50)
		public String getIcone() {
			return icone;
		}

		public void setIcone(String icone) {
			this.icone = icone;
		}

		
	}

