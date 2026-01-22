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


@Entity
@Table(name = "ea_courriers")
public class EaCourriers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Date datesaisie;
	private Date datereception;
	private Date datecourrier;
	private String referencecourrier;
	private String origine;
	private String autres;
	private String courrierenreference;
	private String objet;
	private String velectroniq;
	private SygProformation formation;

	 public EaCourriers() {
		super();
	}

	public EaCourriers(Integer id, Date datesaisie, Date datereception,
			Date datecourrier, String referencecourrier, String origine,
			String autres, String courrierenreference, SygProformation formation) {
		super();
		this.Id = id;
		this.datesaisie = datesaisie;
		this.datereception = datereception;
		this.datecourrier = datecourrier;
		this.referencecourrier = referencecourrier;
		this.origine = origine;
		this.autres = autres;
		this.courrierenreference = courrierenreference;
		this.formation = formation;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datesaisie" )
	public Date getDatesaisie() {
		return datesaisie;
	}

	public void setDatesaisie(Date datesaisie) {
		this.datesaisie = datesaisie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datereception")
	public Date getDatereception() {
		return datereception;
	}

	public void setDatereception(Date datereception) {
		this.datereception = datereception;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datecourrier")
	public Date getDatecourrier() {
		return datecourrier;
	}

	public void setDatecourrier(Date datecourrier) {
		this.datecourrier = datecourrier;
	}

	@Column(name = "referencecourrier", length = 50)
	public String getReferencecourrier() {
		return referencecourrier;
	}

	public void setReferencecourrier(String referencecourrier) {
		this.referencecourrier = referencecourrier;
	}

	@Column(name = "origine", length = 50)
	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	@Column(name = "autres", length = 255)
	public String getAutres() {
		return autres;
	}

	public void setAutres(String autres) {
		this.autres = autres;
	}

	@Column(name = "courrierenreference", length = 255)
	public String getCourrierenreference() {
		return courrierenreference;
	}

	public void setCourrierenreference(String courrierenreference) {
		this.courrierenreference = courrierenreference;
	}

	@Column(name = "objet", length = 255)
	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "formation", nullable = false)
	public SygProformation getFormation() {
		return formation;
	}

	public void setFormation(SygProformation formation) {
		this.formation = formation;
	}

	@Column(name = "courrier_electroniq")
	public String getVelectroniq() {
		return velectroniq;
	}

	public void setVelectroniq(String velectroniq) {
		this.velectroniq = velectroniq;
	}
	

}
