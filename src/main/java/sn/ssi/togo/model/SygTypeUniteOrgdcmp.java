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
	@Table(name = "pmb_typeuniteorgdcmp")
	public class SygTypeUniteOrgdcmp  implements Serializable {
		
  		private Long id;
		private String libelle;
		private int niveau;
		private SygTypeUniteOrgdcmp typeuniteorg;
	
		public SygTypeUniteOrgdcmp() {
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


		@Column(name = "niveau")
		public int getNiveau() {
			return niveau;
		}



		public void setNiveau(int niveau) {
			this.niveau = niveau;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "typeuniteorgid")
		public SygTypeUniteOrgdcmp getTypeuniteorg() {
			return typeuniteorg;
		}



		public void setTypeuniteorg(SygTypeUniteOrgdcmp typeuniteorg) {
			this.typeuniteorg = typeuniteorg;
		}


		
		
	}

