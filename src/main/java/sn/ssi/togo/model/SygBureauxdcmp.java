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
	@Table(name = "syg_bureauxdcmp")
	public class SygBureauxdcmp  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private SygTypeUniteOrgdcmp division;
		private SygBureauxdcmp uniteorg;
		
    	public SygBureauxdcmp() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
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
    	@JoinColumn(name = "division")
     	public SygTypeUniteOrgdcmp getDivision() {
			return division;
		}
    	public void setDivision(SygTypeUniteOrgdcmp division) {
			this.division = division;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "uniteorgid")
		public SygBureauxdcmp getUniteorg() {
			return uniteorg;
		}



		public void setUniteorg(SygBureauxdcmp uniteorg) {
			this.uniteorg = uniteorg;
		}





        
    	
    	
	}

