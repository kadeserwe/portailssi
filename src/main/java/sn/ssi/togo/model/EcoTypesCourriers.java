package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "eco_typescourriers")
	public class EcoTypesCourriers  implements java.io.Serializable {
		
  		private Long id;
		private String libelle,code,description;
		private Integer delai;
		


		public EcoTypesCourriers() {
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


	
		

		@Column(name = "code",  length = 50)
		public String getCode() {
			return code;
		}
    	public void setCode(String code) {
			this.code = code;
		}


    	@Column(name = "description",  length = 255)
		public String getDescription() {
			return description;
		}
    	public void setDescription(String description) {
			this.description = description;
		}


    	@Column(name = "delai")
		public Integer getDelai() {
			return delai;
		}

		public void setDelai(Integer delai) {
			this.delai = delai;
		}

		
	}

