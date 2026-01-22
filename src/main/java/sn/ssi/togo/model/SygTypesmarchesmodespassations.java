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

@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_typesmarches_modespassations")
	public class SygTypesmarchesmodespassations  implements Serializable {
		
  		private Long id;
	    private SygTypesmarches type;
		private SygModepassation mode;
		
	
     	public SygTypesmarchesmodespassations() {
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

	
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "type")
		public SygTypesmarches getType() {
			return type;
		}
    	public void setType(SygTypesmarches type) {
			this.type = type;
		}

        @ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "mode")
     	public SygModepassation getMode() {
			return mode;
		}
		public void setMode(SygModepassation mode) {
			this.mode = mode;
		}

   	
	}

