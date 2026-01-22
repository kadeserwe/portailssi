package sn.ssi.togo.model;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_sigfipmouvementsannulation")
	public class SygSigfipmouvementsannulation  implements Serializable {
		
  		private Long id,mouvexercice;
		private String mouvchapitre,mouvligne;
		private BigDecimal mouvmontant;
	
		public SygSigfipmouvementsannulation() {
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

	

		@Column(name = "mouvligne")
		public String getMouvligne() {
			return this.mouvligne;
		}

		public void setMouvligne(String mouvligne) {
			this.mouvligne = mouvligne;
		}


		@Column(name = "mouvchapitre")
		public String getMouvchapitre() {
			return mouvchapitre;
		}
        public void setMouvchapitre(String mouvchapitre) {
			this.mouvchapitre = mouvchapitre;
		}


    	@Column(name = "mouvexercice")
		public Long getMouvexercice() {
			return mouvexercice;
		}
    	public void setMouvexercice(Long mouvexercice) {
			this.mouvexercice = mouvexercice;
		}


    	

		@Column(name = "mouvmontant")
		public BigDecimal getMouvmontant() {
			return mouvmontant;
		}
    	public void setMouvmontant(BigDecimal mouvmontant) {
			this.mouvmontant = mouvmontant;
		}


		
		
	}

