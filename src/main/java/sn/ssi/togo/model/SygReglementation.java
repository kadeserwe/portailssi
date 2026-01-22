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
	@Table(name = "pmb_reglementation")
	public class SygReglementation  implements Serializable {
		
  		private Long id;
		private String libelle;
		private String nature;
		private String type;
	
		public SygReglementation() {
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


		@Column(name = "nature",  length = 50)
		public String getNature() {
			return nature;
		}



		public void setNature(String nature) {
			this.nature = nature;
		}


		@Column(name = "type",  length = 50)
		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}


		


		
		
	}

