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

@Entity
@Table(name = "syg_sous_rubrique")
public class SygSousRubrique implements Serializable {
	
    private Long id;
    private String code;
    private String libelle;
    private String description;
    private SygRubrique rubrique;
    private Integer ordre;
    
    public SygSousRubrique() {
    }

   

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 10)
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
    @Column(name = "code", nullable = false, length = 25)
    public String getCode() {
	return this.code;
    }

	public void setCode(String code) {
	this.code = code;
    }

    @Column(name = "libelle", length = 200)
    public String getLibelle() {
	return this.libelle;
    }

    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }

    @Column(name = "description", length = 200)
    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }


    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rubrique_id")
	public SygRubrique getRubrique() {
		return rubrique;
	}

	public void setRubrique(SygRubrique rubrique) {
		this.rubrique = rubrique;
	}


    @Column(name = "ordre")
	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

    
}


