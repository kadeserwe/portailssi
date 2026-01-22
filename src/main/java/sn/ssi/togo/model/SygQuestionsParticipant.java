package sn.ssi.togo.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.swing.text.StyledEditorKit.BoldAction;

@Entity
@Table(name = "syg_questions_participants_formation")
public class SygQuestionsParticipant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private SygParticipantsFormation participant;
	private String textques;
	private String autretypeparticipant;

	
	public SygQuestionsParticipant(){
		
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "participant_id")
	public SygParticipantsFormation getParticipant() {
		return participant;
	}

	public void setParticipant(SygParticipantsFormation participant) {
		this.participant = participant;
	}
	

	@Column(name = "textquestion")
	public String getTextques() {
		return textques;
	}

	public void setTextques(String textques) {
		this.textques = textques;
	}
	
	@Column(name = "autre_typeparticipant")
	public String getAutretypeparticipant() {
		return autretypeparticipant;
	}

	public void setAutretypeparticipant(String autretypeparticipant) {
		this.autretypeparticipant = autretypeparticipant;
	}

}
