package sn.ssi.togo.model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import sn.ssi.grh.be.entity.GrhCondition;

	
@SuppressWarnings("serial")
@Entity
@Table(name = "syg_typeelementarbre")
public class SygTypeElementArbre  implements Serializable {
		
  		private Long id;
		private String libelle;
		private String description;
		private int niveau;
		private Set<SygNoeudClassement> sygNoeudClassements = new HashSet<SygNoeudClassement>(0);
		
	
		

		public SygTypeElementArbre(){
		
		}
		
		public SygTypeElementArbre(final Long id, final String libelle, final String description, final int niveau){
			this.id = id;
			this.libelle = libelle;
			this.description = description;
			this.niveau = niveau;
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

		@Column(name = "description",  length = 255)
		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}


		@Column(name = "niveau",  length = 255)
		public int getNiveau() {
			return this.niveau;
		}
		public void setNiveau(int niveau) {
			this.niveau = niveau;
		}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "sygTypeElement", cascade = { CascadeType.ALL })
		public Set<SygNoeudClassement> getSygNoeudClassements() {
			return this.sygNoeudClassements;
		}

		public void setSygNoeudClassements(Set<SygNoeudClassement> sygNoeudClassements) {
			this.sygNoeudClassements = sygNoeudClassements;
		}

		
	}

