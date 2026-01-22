package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_decisiondenonciation")
public class SygTypeDecisionDenonciation  implements Serializable {
	private Long idtypedecision;
	private String libelletypedecision;

	public SygTypeDecisionDenonciation() {
		// TODO Auto-generated constructor stub
	}
	public void SygCritere(Long idpays, String libelle,String codepays){
		this.idtypedecision=idtypedecision;
		this.libelletypedecision=libelletypedecision;
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtypedecision",  length = 10)
	public Long getIdtypedecision() {
		return idtypedecision;
	}
	public void setIdtypedecision(Long idtypedecision) {
		this.idtypedecision =idtypedecision;
	}
	
	@Column(name = "libelletypedecision",  length = 255)
	public String getLibelletypedecision() {
		return libelletypedecision;
	}
	public void setLibelletypedecision(String libelletypedecision) {
		this.libelletypedecision =libelletypedecision;
	}
}
