package sn.ssi.togo.model;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_montant_dao")
public class SygMontantdao  implements java.io.Serializable{
	private Long id;
	private BigDecimal montantminimum,montantmaximum,montantdao;
	
	public SygMontantdao() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long id){
		this.id=id;
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	@Column(name = "montantminimum",  length = 10)
	public BigDecimal getMontantminimum() {
		return montantminimum;
	}
	public void setMontantminimum(BigDecimal montantminimum) {
		this.montantminimum = montantminimum;
	}

	@Column(name = "montantmaximum",  length = 10)
	public BigDecimal getMontantmaximum() {
		return montantmaximum;
	}
	public void setMontantmaximum(BigDecimal montantmaximum) {
		this.montantmaximum = montantmaximum;
	}

	
	@Column(name = "montantdao",  length = 10)
	public BigDecimal getMontantdao() {
		return montantdao;
	}
	public void setMontantdao(BigDecimal montantdao) {
		this.montantdao = montantdao;
	}
	


}
