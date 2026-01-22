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
	@Table(name = "pmb_audit")
	public class SygAudit  implements java.io.Serializable {
		
  		private Long idaudit;
		private String libelleaudit,statut;
		private Date datestatut;
		private Integer gestion;
		private Integer nombreautorite;
		private Integer nombreprestataire;
		//private SysState state;
		
    	public SygAudit() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idaudit")
        public Long getIdaudit() {
			return this.idaudit;
		}
		public void setIdaudit(Long id) {
			this.idaudit = id;
		}

		@Column(name = "libelleaudit")
		public String getLibelleaudit() {
			return libelleaudit;
		}

		public void setLibelleaudit(String libelleaudit) {
			this.libelleaudit = libelleaudit;
		}
		
		
		@Column(name = "statut")
		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}
		
		@Temporal(TemporalType.DATE)
		@Column(name ="datestatut",  length = 10 )
		public Date getDatestatut() {
			return datestatut;
		}


		public void setDatestatut(Date datestatut) {
			this.datestatut = datestatut;
		}
		
		@Column(name = "gestion")
		public Integer getGestion() {
			return gestion;
		}
		public void getGestion(Integer gestion) {
			this.gestion = gestion;
		}
		public void setGestion(Integer gestion) {
			this.gestion = gestion;
		}

		
//		@ManyToOne(fetch = FetchType.EAGER)
//	 	@JoinColumn(name = "sta_code")
//		public SysState getState() {
//			return state;
//		}
//    	public void setState(SysState state) {
//			this.state = state;
//		}
    	@Column(name = "nombreautorite")
		public Integer getNombreautorite() {
			return nombreautorite;
		}

		public void setNombreautorite(Integer nombreautorite) {
			this.nombreautorite = nombreautorite;
		}
		@Column(name = "nombreprestataire")
		public Integer getNombreprestataire() {
			return nombreprestataire;
		}

		public void setNombreprestataire(Integer nombreprestataire) {
			this.nombreprestataire = nombreprestataire;
		}
		
		
		
	}
