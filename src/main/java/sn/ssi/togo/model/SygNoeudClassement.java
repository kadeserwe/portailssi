package sn.ssi.togo.model;
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

//import sn.ssi.grh.be.entity.GrhConcours;



@SuppressWarnings("serial")
@Entity
@Table(name = "syg_noeud_classement")
public class SygNoeudClassement implements java.io.Serializable {
		
  		private Long id;
		private String libelleNoeud;
		private SygTypeElementArbre sygTypeElement;
		private SygNoeudClassement parent;
		private Set<SygNoeudClassement> sygNoeudClassements = new HashSet<SygNoeudClassement>(0);
		private Set<SygArchivesContenu> sygArchivesContenu = new HashSet<SygArchivesContenu>(0);
	
	
		public SygNoeudClassement() {
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

	

		@Column(name = "libellenoeud",  length = 255)
		public String getLibelleNoeud() {
			return this.libelleNoeud;
		}

		public void setLibelleNoeud(String libelleNoeud) {
			this.libelleNoeud = libelleNoeud;
		}
		

		
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "typeelement_code")
		public SygTypeElementArbre getSygTypeElement() {
			return sygTypeElement;
		}

		public void setSygTypeElement(SygTypeElementArbre sygTypeElement) {
			this.sygTypeElement = sygTypeElement;
		}

		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "noeudclassement_code", nullable = true)
		public SygNoeudClassement getParent() {
			return parent;
		}

		public void setParent(SygNoeudClassement parent) {
			this.parent = parent;
		}
		
				
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = { CascadeType.ALL })
		public Set<SygNoeudClassement> getSygNoeudClassements() {
			return this.sygNoeudClassements;
		}

		public void setSygNoeudClassements(Set<SygNoeudClassement> sygNoeudClassements) {
			this.sygNoeudClassements = sygNoeudClassements;
		}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "conteneur", cascade = { CascadeType.ALL })
		public Set<SygArchivesContenu> getSygArchivesContenu() {
			return this.sygArchivesContenu;
		}

		public void setSygArchivesContenu(Set<SygArchivesContenu> sygArchivesContenu) {
			this.sygArchivesContenu = sygArchivesContenu;
		}

		
	}
