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
@Table(name = "pmb_taudit")
public class SygTaudit  implements Serializable {
	private Long   idtaudit;
	private String libelleaudit;
	private String statut;
	private Integer gestion;
	private Date datestatut;
	public SygTaudit() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long idtaudit, String libelleaudit,String statut,Integer gestion,Date datestatut){
		this.idtaudit=idtaudit;
		this.libelleaudit=libelleaudit;
		this.statut=statut;
		this.gestion=gestion;
		this.datestatut=datestatut;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtaudit",  length = 10)
	public Long getIdtaudit() {
		return idtaudit;
	}
	public void setIdtaudit(Long idtaudit) {
		this.idtaudit= idtaudit;
	}
	@Column(name = "libelleaudit",  length = 255)
	public String getLibelleaudit() {
		return libelleaudit;
	}
	public void setLibelleaudit(String libelleaudit) {
		this.libelleaudit = libelleaudit;
	}
	@Column(name = "statut",  length = 255)
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut =statut;
	}
	@Column(name = "gestion",  length = 255)
	public Integer getGestion() {
		return gestion;
	}
	public void setGestion(Integer gestion) {
		this.gestion =gestion;
	}
	@Temporal(TemporalType.DATE)
	@Column(name ="datestatut",  length = 10 )
	public Date getDatestatut() {
		return  datestatut;
	}
	public void setDatestatut(Date  datestatut) {
		this. datestatut= datestatut;
	}
}
