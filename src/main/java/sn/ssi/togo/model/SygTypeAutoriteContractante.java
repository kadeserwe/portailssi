package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_typeautoritecontractante")
	public class SygTypeAutoriteContractante  implements Serializable {
		
        /**
		 * 
		 */
		
		private Long id;
		private String libelle,code,description,chapitre;
		private int ordre;
		
		

		


		public SygTypeAutoriteContractante() {
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


		@Column(name = "code",  length = 10)
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


        @Column(name = "ordre",  length = 15)
        public int getOrdre() {
			return ordre;
		}
        public void setOrdre(int ordre) {
			this.ordre = ordre;
		}


        @Column(name = "chapitre",  length = 10)
		public String getChapitre() {
			return chapitre;
		}
    	public void setChapitre(String chapitre) {
			this.chapitre = chapitre;
		}


    

        
	}

