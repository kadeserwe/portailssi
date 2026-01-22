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
	@Table(name = "pmb_marchefournisseurs")
	public class SygDossiersFournisseurs  implements java.io.Serializable {
		
  		private Long id;
	    private SygFournisseur fournisseur;
		private SygAppelsOffres appel;
		
	
     	public SygDossiersFournisseurs() {
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

	
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "fournisseurs_id")
        public SygFournisseur getFournisseur() {
			return fournisseur;
		}
    	public void setFournisseur(SygFournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "appelsoffres_id")
		public SygAppelsOffres getAppel() {
			return appel;
		}
    	public void setAppel(SygAppelsOffres appel) {
			this.appel = appel;
		}

	}

