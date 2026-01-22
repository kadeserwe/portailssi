package sn.ssi.togo.model;

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
	@Table(name = "pmb_glossaire")
	public class SygGlossaire  implements java.io.Serializable {
		
		private Long glossId ;
		private String glossTerme;
		private String glossDefinition;
		private char tletter;
		
		public SygGlossaire() {
		}

		public void setGlossId(Long glossId) {
			this.glossId = glossId;
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "glossid")
		public Long getGlossId() {
			return glossId;
		}

		public void setGlossTerme(String glossTerme) {
			this.glossTerme = glossTerme;
		}
		@Column(name = "glossterme")
		public String getGlossTerme() {
			return glossTerme;
		}

		public void setGlossDefinition(String glossDefinition) {
			this.glossDefinition = glossDefinition;
		}
		@Column(name = "glossdefinition")
		public String getGlossDefinition() {
			return glossDefinition;
		}

		public void setTletter(char tletter) {
			this.tletter = tletter;
		}
		@Column(name = "tletter")
		public char getTletter() {
			return tletter;
		}

		
	}

