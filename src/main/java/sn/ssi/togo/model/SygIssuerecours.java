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
@Table(name = "pmb_issuerecours")
public class SygIssuerecours implements Serializable {

    private Long  issID;
    private String issLibelle;
   
    @Id
  	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "issid",  length = 10)
  	public Long getIssID() {
  		return issID;
  	}
  	public void setIssID(Long issID) {
  		this.issID = issID;
  	}
	@Column(name = "isslibelle",  length = 50)
	public String getIssLibelle() {
		return issLibelle;
	}
	public void setIssLibelle(String issLibelle) {
		this.issLibelle = issLibelle;
	}
  


}
