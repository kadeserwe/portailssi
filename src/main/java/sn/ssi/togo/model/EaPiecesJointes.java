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
@Table(name = "ea_piecesjointes")
public class EaPiecesJointes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String libelle;
	private String nomfichier;
	private String format;
	private String taille;
	private Date datemiseenligne;
	private String fichier;
	private Boolean rapport;
	private SygProformation formation;

	public EaPiecesJointes() {
		super();
	}

	public EaPiecesJointes(Integer id, String libelle, String nomfichier,
			String format, String taille, Date datemiseenligne, String fichier,
			Boolean rapport, SygProformation formation) {
		super();
		Id = id;
		this.libelle = libelle;
		this.nomfichier = nomfichier;
		this.format = format;
		this.taille = taille;
		this.datemiseenligne = datemiseenligne;
		this.fichier = fichier;
		this.rapport = rapport;
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

	@Column(name = "libelle", length = 255)
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "nomfichier", length = 255)
	public String getNomfichier() {
		return nomfichier;
	}

	public void setNomfichier(String nomfichier) {
		this.nomfichier = nomfichier;
	}

	@Column(name = "format", length = 10)
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Column(name = "taille", length = 10)
	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datemiseenligne")
	public Date getDatemiseenligne() {
		return datemiseenligne;
	}

	public void setDatemiseenligne(Date datemiseenligne) {
		this.datemiseenligne = datemiseenligne;
	}

	@Column(name = "fichier")
	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	@Column(name = "rapport")
	public Boolean getRapport() {
		return rapport;
	}

	public void setRapport(Boolean rapport) {
		this.rapport = rapport;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "formation", nullable = false)
	public SygProformation getFormation() {
		return formation;
	}

	public void setFormation(SygProformation formation) {
		this.formation = formation;
	}

}
