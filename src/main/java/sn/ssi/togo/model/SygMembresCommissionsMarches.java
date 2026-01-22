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
	@Table(name = "pmb_membrescommissionmarche")
	public class SygMembresCommissionsMarches  implements java.io.Serializable {
		
  		private Long id,membre;
		private String nom, prenom, fonction, tel, email, gestion,statut,typemembre,arrete,fichierarrete,photo,type,origine;
		private int etapePI,flagpresident,actif,position,reconduit;
		
		private SygAutoriteContractante autorite;
		private Date datearrete;
		
    	public SygMembresCommissionsMarches() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "nom")
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Column(name = "prenom")
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		@Column(name = "fonction")
		public String getFonction() {
			return fonction;
		}

		public void setFonction(String fonction) {
			this.fonction = fonction;
		}

		@Column(name = "telephone")
		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		@Column(name = "email")
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Column(name = "etapepi")
		public int getEtapePI() {
			return etapePI;
		}
		public void setEtapePI(int etapePI) {
			this.etapePI = etapePI;
		}

		
		@Column(name = "gestion")
		public String getGestion() {
			return gestion;
		}

		public void setGestion(String gestion) {
			this.gestion = gestion;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}

		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

		
		@Column(name = "flagpresident",length=1)
		public int getFlagpresident() {
			return flagpresident;
		}

		public void setFlagpresident(int flagpresident) {
			this.flagpresident = flagpresident;
		}

		
		@Column(name = "actif",length=11)
		public int getActif() {
			return actif;
		}

		public void setActif(int actif) {
			this.actif = actif;
		}

		
		@Column(name = "statut",length=30)
		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public String getTypemembre() {
			return typemembre;
		}

		public void setTypemembre(String typemembre) {
			this.typemembre = typemembre;
		}

		
		@Column(name = "arrete",length=50)
		public String getArrete() {
			return arrete;
		}
    	public void setArrete(String arrete) {
			this.arrete = arrete;
		}

		
		@Column(name = "fichierarrete",length=255)
		public String getFichierarrete() {
			return fichierarrete;
		}
    	public void setFichierarrete(String fichierarrete) {
			this.fichierarrete = fichierarrete;
		}

		
    	@Column(name = "photo",length=255)
    	public String getPhoto() {
			return photo;
		}
    	public void setPhoto(String photo) {
			this.photo = photo;
		}
    	@Column(name = "type",length=255)
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		@Column(name = "origine",length=10)
		public String getOrigine() {
			return origine;
		}

		public void setOrigine(String origine) {
			this.origine = origine;
		}

		
		@Temporal(TemporalType.DATE)
    	@Column(name = "datemembre", length = 7)
		public Date getDatearrete() {
			return datearrete;
		}
    	public void setDatearrete(Date datearrete) {
			this.datearrete = datearrete;
		}

		
    	@Column(name = "position",length=3)
    	public int getPosition() {
			return position;
		}
    	public void setPosition(int position) {
			this.position = position;
		}

		
    	@Column(name = "membre")
    	public Long getMembre() {
			return membre;
		}
     	public void setMembre(Long membre) {
			this.membre = membre;
		}

     	
     	@Column(name = "reconduit",length=3)
		public int getReconduit() {
			return reconduit;
		}
        public void setReconduit(int reconduit) {
			this.reconduit = reconduit;
		}
    	
    	
    	
		
	}
