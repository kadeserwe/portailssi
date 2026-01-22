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
@Table(name = "syg_relances_realisations")
public class SygRelancesRealisations  implements Serializable {
	
	private Long id;
	private SygRealisations realisation;
	private Date date,daterelance;
	private Long ecart;
	private SygRelancesActivitesRealisations relance;

	public SygRelancesRealisations() {
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



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "realisation")
	public SygRealisations getRealisation() {
		return realisation;
	}
	public void setRealisation(SygRealisations realisation) {
		this.realisation = realisation;
	}



	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 7)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
 	@Column(name = "ecart",  length = 50)
	public Long getEcart() {
		return ecart;
	}
	public void setEcart(Long ecart) {
		this.ecart = ecart;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "daterelance", length = 7)
	public Date getDaterelance() {
		return daterelance;
	}
	public void setDaterelance(Date daterelance) {
		this.daterelance = daterelance;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relance")
	public SygRelancesActivitesRealisations getRelance() {
		return relance;
	}
	public void setRelance(SygRelancesActivitesRealisations relance) {
		this.relance = relance;
	}
 	
 }

