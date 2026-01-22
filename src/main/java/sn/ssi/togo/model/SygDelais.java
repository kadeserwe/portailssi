package sn.ssi.togo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_delais")
	public class SygDelais  implements java.io.Serializable {
		
  		private Long id;
		private String libelle,code,unite,commentaire;
		private int valeur;
		private Date datedebutvalidite,datefinvalidite,date;
	
		


		public SygDelais() {
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


		@Temporal(TemporalType.DATE)
    	@Column(name = "debutvalidite", length = 7)
		public Date getDatedebutvalidite() {
			return datedebutvalidite;
		}



		public void setDatedebutvalidite(Date datedebutvalidite) {
			this.datedebutvalidite = datedebutvalidite;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "finvalidite", length = 7)
		public Date getDatefinvalidite() {
			return datefinvalidite;
		}

		public void setDatefinvalidite(Date datefinvalidite) {
			this.datefinvalidite = datefinvalidite;
		}
		

		@Column(name = "code",  length = 255)
		public String getCode() {
			return code;
		}
    	public void setCode(String code) {
			this.code = code;
		}



    	@Column(name = "commentaire",  length = 255)
		public String getCommentaire() {
			return commentaire;
		}
    	public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}


    	@Column(name = "valeur",  length = 50)
		public int getValeur() {
			return valeur;
		}

		public void setValeur(int valeur) {
			this.valeur = valeur;
		}


		@Column(name = "unite",  length = 50)
		public String getUnite() {
			return unite;
		}
    	public void setUnite(String unite) {
			this.unite = unite;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
    	public Date getDate() {
			return date;
		}
    	public void setDate(Date date) {
			this.date = date;
		}


		
    	
		
		
	}

