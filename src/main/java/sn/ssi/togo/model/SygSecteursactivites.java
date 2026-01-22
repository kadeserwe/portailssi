package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_secteuractivites")
	public class SygSecteursactivites  implements Serializable {
		
  		private String code;
		private String libelle,description;
		private SygSecteursactivites secteur;

	



		public SygSecteursactivites() {
		}

	

		@Id
		@Column(name = "code", nullable = false)
        public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
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



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "secteur")
    	public SygSecteursactivites getSecteur() {
			return secteur;
		}

		public void setSecteur(SygSecteursactivites secteur) {
			this.secteur = secteur;
		}
        
    	
    	
	}

