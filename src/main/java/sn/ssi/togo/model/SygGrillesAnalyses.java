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
@Table(name = "pmb_grillesanalyses")
public class SygGrillesAnalyses  implements java.io.Serializable{
	private Long idgrillesanalyses;
	private SygCritereAnalyse analyses;
	private SygTypesDossiers dossiers;

	
	public SygGrillesAnalyses() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idgrillesanalyses,SygCritereAnalyse analyse,SygTypesDossiers dossiers){
	
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idgrillesanalyses",  length = 10)
	public Long getIdgrillesanalyses() {
		return idgrillesanalyses;
	}
	public void setIdgrillesanalyses(Long idgrillesanalyses) {
		this.idgrillesanalyses = idgrillesanalyses;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "idcritereanalyse")
	public SygCritereAnalyse getAnalyse() {
		return analyses;
	}
	public void setAnalyse(SygCritereAnalyse analyse) {
		this.analyses = analyse;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "id")
	public SygTypesDossiers getDossiers() {
		return dossiers;
	}
	public void setDossiers(SygTypesDossiers dossiers) {
		this.dossiers = dossiers;
	}
	

}
