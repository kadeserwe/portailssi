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
	@Table(name = "pmb_familles")
	public class SygFamilles  implements java.io.Serializable {
		
  		private Long id;
		private String code;
		private String designation;
		private String commentaire;
		
		private SygCategories categories;
		
		
    	public SygFamilles() {
    		super();
		}
    	
    	@Id
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
    	@Column(name = "id",  length = 10)
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		@Column(name = "code",  length = 100)
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		
		
		@Column(name = "designation",  length = 255)
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		
		@Column(name = "commentaire",  length = 255)
		public String getCommentaire() {
			return commentaire;
		}
		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}
		
		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "categories")
		public SygCategories getCategories() {
			return categories;
		}
		public void setCategories(SygCategories categories) {
			this.categories = categories;
		}

		
	}

