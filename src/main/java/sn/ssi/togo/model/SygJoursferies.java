package sn.ssi.togo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_joursferies")
	public class SygJoursferies  implements java.io.Serializable {
		
  		private Long id;
		private String description;
		private Date date;
	


		public SygJoursferies() {
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

	


		@Column(name = "description",  length = 255)
		public String getDescription() {
			return description;
		}
    	public void setDescription(String description) {
			this.description = description;
		}

		
    	@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
    	public Date getDate() {
    		return date;
    	}
    	public void setDate(Date date) {
    		this.date = date;
    	}
	}

