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
@Table(name = "pmb_typeevenement")
public class SygTypeEvenement implements Serializable {

    private Long  Id;
    private String libelle;
   

  
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",  length = 10)
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		@Column(name = "libelle",  length = 50)
		public String getLibelle() {
			return libelle;
		}
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

}
