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
@Table(name = "syg_relances")
public class SygRelancesActivitesRealisations  implements Serializable {
	
	private Long id;
	private String reference,objet;
	private SygPlansdepassation plan;
	private Date date;
    private SygAutoriteContractante autorite;
    




	public SygRelancesActivitesRealisations() {
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



	@Column(name = "reference",  length = 100)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plan")
	public SygPlansdepassation getPlan() {
		return plan;
	}
	public void setPlan(SygPlansdepassation plan) {
		this.plan = plan;
	}





 	@Column(name = "objet",  length = 255)
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 7)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autorite")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
 	
}

