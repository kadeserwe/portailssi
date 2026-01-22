package sn.ssi.togo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_fichdossiertype")
	public class SygFichDossierType  implements java.io.Serializable {
		
  		private Integer ID;  

		private String libellefichierdossiertype,nomfichierdossiertype,publier;
		private SygDossiersTypes Dossiertype_ID;
		
    	public SygFichDossierType() {
    		super();
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
        public Integer getID() {
			return this.ID;
		}
		public void setID(Integer ID) {
			this.ID = ID;
		}

		@Column(name = "libellefichierdossiertype",  length = 50)
		public String getLibellefichierdossiertype() {
			return this.libellefichierdossiertype;
		}

		public void setLibellefichierdossiertype(String libellefichierdossiertype) {
			this.libellefichierdossiertype = libellefichierdossiertype;
		}


		@Column(name = "nomfichierdossiertype",  length = 50)
		public String getNomfichierdossiertype() {
			return this.nomfichierdossiertype;
		}

		public void setNomfichierdossiertype(String nomfichierdossiertype) {
			this.nomfichierdossiertype = nomfichierdossiertype;
		}

		
		@Column(name = "publier",  length = 50)
		public String getPublier() {
			return this.publier;
		}

		public void setPublier(String publier) {
			this.publier = publier;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiertype_id")
		public SygDossiersTypes getDossiertype_ID() {
			return Dossiertype_ID;
		}
		public void setDossiertype_ID(SygDossiersTypes dossiertype_ID) {
			Dossiertype_ID = dossiertype_ID;
		}
	}

