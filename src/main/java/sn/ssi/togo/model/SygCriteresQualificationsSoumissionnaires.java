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
	@Table(name = "pmb_criteresoumissions")
	public class SygCriteresQualificationsSoumissionnaires  implements java.io.Serializable {
		
  		private Long id;
		private SygPlisouvertures plis;
		private SygDossierssouscriteres critere;
		private SygDossiers dossier;
		private int conforme;
		private String libelle,libellelot;
		private SygLots lot;
			
		
    	public SygCriteresQualificationsSoumissionnaires() {
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
    	@JoinColumn(name = "pli_id")
    	public SygPlisouvertures getPlis() {
			return plis;
		}
    	public void setPlis(SygPlisouvertures plis) {
			this.plis = plis;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "critere")
    	public SygDossierssouscriteres getCritere() {
			return critere;
		}
    	public void setCritere(SygDossierssouscriteres critere) {
			this.critere = critere;
		}


    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	@Column(name = "conforme",length=3)
    	public int getConforme() {
			return conforme;
		}
 		public void setConforme(int conforme) {
			this.conforme = conforme;
		}


 		@Column(name = "libelle",length=255)
		public String getLibelle() {
			return libelle;
		}
    	public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


    	@Column(name = "libellelot",length=255)
		public String getLibellelot() {
			return libellelot;
		}
    	public void setLibellelot(String libellelot) {
			this.libellelot = libellelot;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "lot")
		public SygLots getLot() {
			return lot;
		}
    	public void setLot(SygLots lot) {
			this.lot = lot;
		}

    	
 		
	}

