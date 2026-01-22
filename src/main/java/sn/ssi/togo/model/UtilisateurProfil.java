package sn.ssi.togo.model;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "sys_utilisateurprofil")
public class UtilisateurProfil implements java.io.Serializable {

	private UtilisateurProfilId id;

	public UtilisateurProfil() {
	}

	public UtilisateurProfil(final UtilisateurProfilId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "usrid", column = @Column(name = "usr_id", nullable = false)),
			@AttributeOverride(name = "pfcode", column = @Column(name = "pf_code", nullable = false, length = 32)) })
	public UtilisateurProfilId getId() {
		return id;
	}

	public void setId(final UtilisateurProfilId id) {
		this.id = id;
	}

}
