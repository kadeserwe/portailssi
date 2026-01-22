package sn.ssi.togo.model;
import java.io.Serializable;
import java.math.BigDecimal;
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
	@Table(name = "pmb_sigfipengagements")
	public class SygSigfipengagements  implements Serializable {
		
  		private Long id;
		private String engobjet;
		private String engligne,engchapitre,engnumero;
		private BigDecimal engmontant;
		private Date engdate;
		private int engexercice;
	
		public SygSigfipengagements() {
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

	

		@Column(name = "engobjet")
		public String getEngobjet() {
			return this.engobjet;
		}

		public void setEngobjet(String engobjet) {
			this.engobjet = engobjet;
		}


		@Column(name = "engligne")
		public String getEngligne() {
			return engligne;
		}
        public void setEngligne(String engligne) {
			this.engligne = engligne;
		}


    	@Column(name = "engexercice")
		public int getEngexercice() {
			return engexercice;
		}
    	public void setEngexercice(int engexercice) {
			this.engexercice = engexercice;
		}


    	@Column(name = "engchapitre")
		public String getEngchapitre() {
			return engchapitre;
		}
    	public void setEngchapitre(String engchapitre) {
			this.engchapitre = engchapitre;
		}


    	@Column(name = "engmontant")
		public BigDecimal getEngmontant() {
			return engmontant;
		}
		public void setEngmontant(BigDecimal engmontant) {
			this.engmontant = engmontant;
		}


		@Column(name = "engnumero")
		public String getEngnumero() {
			return engnumero;
		}
    	public void setEngnumero(String engnumero) {
			this.engnumero = engnumero;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "engdate", length = 7)
		public Date getEngdate() {
			return engdate;
		}
    	public void setEngdate(Date engdate) {
			this.engdate = engdate;
		}


		
	}

