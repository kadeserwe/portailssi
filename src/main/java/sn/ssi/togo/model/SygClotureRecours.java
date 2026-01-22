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
@Table(name = "pmb_cloture_recours")
public class SygClotureRecours implements Serializable {

    private Long  Id;
    private Date Datecloture;
    private String Commentaire;
    private String Issuerecoursgracieux;

  
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",  length = 10)
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		
    @Temporal(TemporalType.DATE)
    @Column(name = "datecloture", length = 10)
	public Date getDatecloture() {
		return Datecloture;
	}

	public void setDatecloture(Date datecloture) {
		Datecloture = datecloture;
	}
	
	@Column(name = "commentaire",  length = 50)
	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	
	@Column(name = "issuerecoursgracieux",  length = 50)
	public String getIssuerecoursgracieux() {
		return Issuerecoursgracieux;
	}

	public void setIssuerecoursgracieux(String issuerecoursgracieux) {
		Issuerecoursgracieux = issuerecoursgracieux;
	}



}
