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
	@Table(name = "syg_recom_participant_formation")
public class SygRecomPartFormation implements Serializable {
	
		private Long id;
//		private SygProformation formation;
		private SygParticipantsFormation participant;
		private String recomtexte;
		
		
		public  SygRecomPartFormation(){
			
		}
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
			
//		@ManyToOne(fetch = FetchType.EAGER)
//    	@JoinColumn(name = "formation_id")
//		public SygProformation getFormation() {
//			return formation;
//		}
//		public void setFormation(SygProformation formation) {
//			this.formation = formation;
//		}
		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "participant_id")
		public SygParticipantsFormation getParticipant() {
			return participant;
		}
		public void setParticipant(SygParticipantsFormation participant) {
			this.participant = participant;
		}
		
		@Column(name = "recommandation")
		public String getRecomtexte() {
			return recomtexte;
		}
		public void setRecomtexte(String recomtexte) {
			this.recomtexte = recomtexte;
		}

		
		
}
