package sn.ssi.togo.model;
import java.io.Serializable;
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
	@Table(name = "syg_tachesafaire")
	public class SygTachesafaire  implements Serializable {
		
  		private Long id;
		private String libelle,traitepar;
		private SygTypesTaches type;
		private Utilisateur users;
		private Date date,dateauplutard,dateevaluation;
		private int fait;
		
		
    	public SygTachesafaire() {
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
		
    	@Column(name = "traitepar",  length = 255)
    	public String getTraitepar() {
			return traitepar;
		}
    	public void setTraitepar(String traitepar) {
			this.traitepar = traitepar;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
		public Date getDate() {
			return date;
		}
    	public void setDate(Date date) {
			this.date = date;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateauplutard", length = 7)
		public Date getDateauplutard() {
			return dateauplutard;
		}
    	public void setDateauplutard(Date dateauplutard) {
			this.dateauplutard = dateauplutard;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateevaluation", length = 7)
		public Date getDateevaluation() {
			return dateevaluation;
		}
    	public void setDateevaluation(Date dateevaluation) {
			this.dateevaluation = dateevaluation;
		}



		


		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "type")
    	public SygTypesTaches getType() {
			return type;
		}
    	public void setType(SygTypesTaches type) {
			this.type = type;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "users")
		public Utilisateur getUsers() {
			return users;
		}
    	public void setUsers(Utilisateur users) {
			this.users = users;
		}


    	@Column(name = "fait", length = 1)
		public int getFait() {
			return fait;
		}
        public void setFait(int fait) {
			this.fait = fait;
		}

    	

	}

