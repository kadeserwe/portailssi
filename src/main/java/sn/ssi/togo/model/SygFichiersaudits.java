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

@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_fichiersaudits")
public class SygFichiersaudits  implements java.io.Serializable{
	private Long   idfichiersaudits;
	private String libellefichiersaudits;
	private String nomfichierpdf;
	
	public SygFichiersaudits() {
		// TODO Auto-generated constructor stub
	}
	public void SygCritere(Long idfichiersaudits, String libellefichiersaudits,String nomfichierpdf){
		this.idfichiersaudits=idfichiersaudits;
		this.libellefichiersaudits=libellefichiersaudits;
		this.nomfichierpdf=nomfichierpdf;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idfichiersaudits",  length = 10)
	public Long getIdfichiersaudits() {
		return idfichiersaudits;
	}
	public void setIdfichiersaudits(Long idfichiersaudits) {
		this.idfichiersaudits = idfichiersaudits;
	}
	@Column(name = "libellefichiersaudits",  length = 255)
	public String getLibellefichiersaudits() {
		return libellefichiersaudits;
	}
	public void setLibellefichiersaudits(String libellefichiersaudits) {
		this.libellefichiersaudits = libellefichiersaudits;
	}
	@Column(name = "nomfichierpdf",  length = 255)
	public String getNomfichierpdf() {
		return nomfichierpdf;
	}
	public void setNomfichierpdf(String nomfichierpdf) {
		this.nomfichierpdf =nomfichierpdf;
	}
}
