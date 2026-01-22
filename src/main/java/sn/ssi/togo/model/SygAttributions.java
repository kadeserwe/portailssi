package sn.ssi.togo.model;

import java.math.BigDecimal;
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
	@Table(name = "pmb_attributions")
	public class SygAttributions  implements java.io.Serializable {
		
  		private Long id;
  		private SygDossiers dossier;
  		private SygPlisouvertures plis;
  		private String ReferencePlandePassation,ReferenceAvisGeneral,AttributaireProvisoire,Commentaire,commentairedefinitif,nomFichierDef,attriType;
  		private BigDecimal MontantMarche,montantdefinitif;
  		private int MoisExecution,SemaineExecution,JoursExecution;
  		private Date DatePublicationProvisoire,DatePublicationDefinitive,dateattribution;
  		private SygLots lot;
		
    	public SygAttributions() {
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

	

		@Column(name = "referenceplandepassation",  length = 255)
		public String getReferencePlandePassation() {
			return this.ReferencePlandePassation;
		}

		public void setReferencePlandePassation(String ReferencePlandePassation) {
			this.ReferencePlandePassation = ReferencePlandePassation;
		}


		@Column(name = "referenceavisgeneral",  length = 50)
    	public String getReferenceAvisGeneral() {
			return ReferenceAvisGeneral;
		}
    	public void setReferenceAvisGeneral(String ReferenceAvisGeneral) {
			this.ReferenceAvisGeneral = ReferenceAvisGeneral;
		}


    	@Column(name = "attributaireprovisoire",  length = 255)
    	public String getAttributaireProvisoire() {
			return AttributaireProvisoire;
		}
        public void setAttributaireProvisoire(String AttributaireProvisoire) {
			this.AttributaireProvisoire = AttributaireProvisoire;
		}


        @Column(name = "commentaire",  length = 255)
     	public String getCommentaire() {
			return Commentaire;
		}
        public void setCommentaire(String Commentaire) {
			this.Commentaire = Commentaire;
		}


        @Column(name = "commentairedefinitif",  length = 255)
		public String getCommentairedefinitif() {
			return commentairedefinitif;
		}
    	public void setCommentairedefinitif(String commentairedefinitif) {
			this.commentairedefinitif = commentairedefinitif;
		}

		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "pliouverture_id")
    	public SygPlisouvertures getPlis() {
			return plis;
		}
    	public void setPlis(SygPlisouvertures plis) {
			this.plis = plis;
		}


    	@Column(name = "nomfichierdef",  length = 255)
		public String getNomFichierDef() {
			return nomFichierDef;
		}
    	public void setNomFichierDef(String nomFichierDef) {
			this.nomFichierDef = nomFichierDef;
		}


    	@Column(name = "montantmarche",  length = 255)
		public BigDecimal getMontantMarche() {
			return MontantMarche;
		}
    	public void setMontantMarche(BigDecimal montantMarche) {
			MontantMarche = montantMarche;
		}


    	@Column(name = "montantdefinitif",  length = 255)
		public BigDecimal getMontantdefinitif() {
			return montantdefinitif;
		}
    	public void setMontantdefinitif(BigDecimal montantdefinitif) {
			this.montantdefinitif = montantdefinitif;
		}


    	@Column(name = "moisexecution",  length = 10)
		public int getMoisExecution() {
			return MoisExecution;
		}
    	public void setMoisExecution(int moisExecution) {
			MoisExecution = moisExecution;
		}


    	@Column(name = "semaineexecution",  length = 10)
		public int getSemaineExecution() {
			return SemaineExecution;
		}
    	public void setSemaineExecution(int semaineExecution) {
			SemaineExecution = semaineExecution;
		}


    	@Column(name = "joursexecution",  length = 10)
		public int getJoursExecution() {
			return JoursExecution;
		}
    	public void setJoursExecution(int joursExecution) {
			JoursExecution = joursExecution;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datepublicationprovisoire", length = 7)
		public Date getDatePublicationProvisoire() {
			return DatePublicationProvisoire;
		}
    	public void setDatePublicationProvisoire(Date datePublicationProvisoire) {
			DatePublicationProvisoire = datePublicationProvisoire;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datepublicationdefinitive", length = 7)
		public Date getDatePublicationDefinitive() {
			return DatePublicationDefinitive;
		}
		public void setDatePublicationDefinitive(Date datePublicationDefinitive) {
			DatePublicationDefinitive = datePublicationDefinitive;
		}


		
		@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "lot_id")
		public SygLots getLot() {
			return lot;
		}
    	public void setLot(SygLots lot) {
			this.lot = lot;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateattribution", length = 7)
		public Date getDateattribution() {
			return dateattribution;
		}
    	public void setDateattribution(Date dateattribution) {
			this.dateattribution = dateattribution;
		}
        
    	
    	@Column(name = "attritype",  length = 20)
		public String getAttriType() {
			return this.attriType;
		}

		public void setAttriType(String attriType) {
			this.attriType = attriType;
		}

    	
	}

