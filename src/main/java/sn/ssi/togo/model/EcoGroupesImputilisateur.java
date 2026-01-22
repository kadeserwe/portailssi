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
@Table(name = "eco_groupesimputilisateur")
public class EcoGroupesImputilisateur  implements java.io.Serializable {
	
	private Long id;
	private EcoGroupesImputation groupesImputation;
	private Utilisateur utilisateur;

	public EcoGroupesImputilisateur() {
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
	@JoinColumn(name = "groupesimputation")

	public EcoGroupesImputation getGroupesImputation() {
		return groupesImputation;
	}
	public void setGroupesImputation(EcoGroupesImputation groupesImputation) {
		this.groupesImputation = groupesImputation;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "utilisateur")
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
