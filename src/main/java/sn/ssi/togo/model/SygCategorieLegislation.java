package sn.ssi.togo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_categorielegislations")
	public class SygCategorieLegislation  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private String description;
		private Long niveau;
	
		
		public SygCategorieLegislation() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idlegislation")
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

		@Column(name = "liblegislation")
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		@Column(name = "descriptioncategorielegislation")
		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public void setNiveau(Long niveau) {
			this.niveau = niveau;
		}


		@Column(name = "niveau_legislation")
		public Long getNiveau() {
			return niveau;
		}


		
		

		
		
		
	}

