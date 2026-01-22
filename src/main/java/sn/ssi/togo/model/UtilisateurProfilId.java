package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class UtilisateurProfilId implements java.io.Serializable {

	private long usrId;
	private String pfCode;

	public UtilisateurProfilId() {
	}

	public UtilisateurProfilId(final long usrId, final String pfCode) {
		this.usrId = usrId;
		this.pfCode = pfCode;
	}

	@Column(name = "usr_id", nullable = false)
	public long getUsrId() {
		return usrId;
	}

	public void setUsrId(final long usrId) {
		this.usrId = usrId;
	}

	@Column(name = "pf_code", nullable = false, length = 32)
	public String getPfCode() {
		return pfCode;
	}

	public void setPfCode(final String pfCode) {
		this.pfCode = pfCode;
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (!(other instanceof UtilisateurProfilId))
			return false;
		final UtilisateurProfilId castOther = (UtilisateurProfilId) other;

		return getUsrId() == castOther.getUsrId()
				&& (getPfCode() == castOther.getPfCode() || getPfCode() != null
						&& castOther.getPfCode() != null
						&& getPfCode().equals(castOther.getPfCode()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) getUsrId();
		result = 37 * result
				+ (getPfCode() == null ? 0 : getPfCode().hashCode());
		return result;
	}

}
