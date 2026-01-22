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
	@Table(name = "pmb_avisgeneral")
	public class SygContent  implements java.io.Serializable {
		
  		private Long id;  
		private String Title,resume,contenu;
		private int Publier;
		private Date Date;
		
    	public SygContent() {
    		super();
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

		@Column(name = "title",  length = 50)
		public String getTitle() {
			return this.Title;
		}

		public void setTitle(String Title) {
			this.Title = Title;
		}



		@Column(name = "resume",  length = 50)
		public String getResume() {
			return this.resume;
		}

		public void setResume(String resume) {
			this.resume = resume;
		}


		@Column(name = "contenu",  length = 50)
		public String getContenu() {
			return this.contenu;
		}
		public void setContenu(String contenu) {
			this.contenu = contenu;
		}


		@Column(name = "publier",  length = 50)
		public int getPublier() {
			return Publier;
		}
		public void setPublier(int publier) {
			Publier = publier;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
		public Date getDate() {
			return Date;
		}
		public void setDate(Date date) {
			Date = date;
		}

    	
    	
	}

