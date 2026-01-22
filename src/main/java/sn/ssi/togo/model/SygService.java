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
import java.io.Serializable;

@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_service")
	public class SygService  implements Serializable {
		
  		private Long id;
		private String libelle,description,codification;
		private SygTypeService type;
		private SygAutoriteContractante autorite;



	



		public SygService() {
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

	

		@Column(name = "libelleservice",  length = 255)
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		@Column(name = "descriptionservice",  length = 255)
		public String getDescription() {
			return description;
		}
    	public void setDescription(String description) {
			this.description = description;
		}



    	@Column(name = "codification",  length = 255)
		public String getCodification() {
			return codification;
		}
    	public void setCodification(String codification) {
			this.codification = codification;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typeservice_id")
		public SygTypeService getType() {
			return type;
		}
	    public void setType(SygTypeService type) {
			this.type = type;
		}

	    
		
	    @ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
    	public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}
	}

