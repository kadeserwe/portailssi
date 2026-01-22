package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_typecourrier")
public class SygTypesCourrier  implements Serializable {
	private Long idtypecourrier;
	private String libelletypecourrier;
	private String codetypecourrier;
	private String descriptiontypecourrier;
	private int dureTraitementJour;
	
	public SygTypesCourrier() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idtypecourrier, String libelletypecourrier,String codetypecourrier,String descriptiontypecourrier){
		this.idtypecourrier=idtypecourrier;
		this.libelletypecourrier=libelletypecourrier;
		this.codetypecourrier=codetypecourrier;
		this.descriptiontypecourrier=descriptiontypecourrier;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtypecourrier",  length = 10)
	public Long getIdtypecourrier() {
		return idtypecourrier;
	}
	public void setIdtypecourrier(Long idtypecourrier) {
		this.idtypecourrier= idtypecourrier;
	}
	@Column(name = "libelletypecourrier",  length = 10)
	public String getLibelletypecourrier() {
		return libelletypecourrier;
	}
	public void setLibelletypecourrier(String libelletypecourrier) {
		this.libelletypecourrier = libelletypecourrier;
	}
	@Column(name = "descriptiontypecourrier",  length = 10)
	public String getDescriptiontypecourrier() {
		return descriptiontypecourrier;
	}
	public void setDescriptiontypecourrier(String descriptiontypecourrier) {
		this.descriptiontypecourrier = descriptiontypecourrier;
	}
	@Column(name = "codetypecourrier",  length = 10)
	public String getCodetypecourrier() {
		return codetypecourrier;
	}
	public void setCodetypecourrier(String codetypecourrier) {
		this.codetypecourrier = codetypecourrier;
	}
	
	@Column(name = "duretraitementenjour")
	public int getDureTraitementJour() {
		return dureTraitementJour;
	}
	public void setDureTraitementJour(int dureTraitementJour) {
		this.dureTraitementJour = dureTraitementJour;
	}

	
}
