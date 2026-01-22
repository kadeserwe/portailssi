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
	@Table(name = "pmb_conf_dates_real")
	public class SygConfigurationDatesRealisations  implements java.io.Serializable {
		
  		private Long id;  
		private SygModepassation mode;
		private int dureea,dureeb,dureec,dureed,dureee,dureef,dureeg,dureeh,dureei;
		private String datepreparationdaodcrbc,datereceptionavisccmpdncmpappel,datenonobjectionptfappel,dateinvitationsoumission,
		dateouvertureplis,datefinevaluation,datereceptionavisccmpdncmp,datenonobjectionptf,dateprevisionnellesignaturecontrat,type;
		
		private String datepreparationtdrami,dateavisccmpdncmpami,datelancementmanifestation,dateouverturemanifestation,datepreparationdp,
		dateavisccmpdncmpdp,dateouverturedp,dateavisccmpdncmpdppt,datenonobjectionptfpt,
		dateouverture,datefinevaluationpf,dateavisccmpdncmp,datenegociation,dateavisptfservcontrole;
		private int dureej,dureek,dureel,dureem,dureen,dureeo,dureep,dureeq,dureer,durees,dureet,dureeu,dureev,dureew,dureex;
		
		private String examendncmp,examenccmp;
		
    	public SygConfigurationDatesRealisations() {
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

   

    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "mode_id")
    	public SygModepassation getMode() {
			return mode;
		}
        public void setMode(SygModepassation mode) {
			this.mode = mode;
		}




    
	

		@Column(name = "dureea",length=5)
		public int getDureea() {
			return dureea;
		}
		public void setDureea(int dureea) {
			this.dureea = dureea;
		}

		
		@Column(name = "dureeb",length=5)
		public int getDureeb() {
			return dureeb;
		}
		public void setDureeb(int dureeb) {
			this.dureeb = dureeb;
		}


		@Column(name = "dureec",length=5)
		public int getDureec() {
			return dureec;
		}
    	public void setDureec(int dureec) {
			this.dureec = dureec;
		}


    	@Column(name = "dureed",length=5)
		public int getDureed() {
			return dureed;
		}
		public void setDureed(int dureed) {
			this.dureed = dureed;
		}


		@Column(name = "dureee",length=5)
		public int getDureee() {
			return dureee;
		}
    	public void setDureee(int dureee) {
			this.dureee = dureee;
		}


    	@Column(name = "dureef",length=5)
		public int getDureef() {
			return dureef;
		}
    	public void setDureef(int dureef) {
			this.dureef = dureef;
		}


    	@Column(name = "dureeg",length=5)
		public int getDureeg() {
			return dureeg;
		}
    	public void setDureeg(int dureeg) {
			this.dureeg = dureeg;
		}


    	@Column(name = "dureeh",length=5)
		public int getDureeh() {
			return dureeh;
		}
    	public void setDureeh(int dureeh) {
			this.dureeh = dureeh;
		}


    	@Column(name = "dureei",length=5)
		public int getDureei() {
			return dureei;
		}
    	public void setDureei(int dureei) {
			this.dureei = dureei;
		}



		@Column(name = "datepreparationdaodcrbc",length=50)
		public String getDatepreparationdaodcrbc() {
			return datepreparationdaodcrbc;
		}
    	public void setDatepreparationdaodcrbc(String datepreparationdaodcrbc) {
			this.datepreparationdaodcrbc = datepreparationdaodcrbc;
		}


    	@Column(name = "datereceptionavisccmpdncmpappel",length=50)
		public String getDatereceptionavisccmpdncmpappel() {
			return datereceptionavisccmpdncmpappel;
		}
		public void setDatereceptionavisccmpdncmpappel(
				String datereceptionavisccmpdncmpappel) {
			this.datereceptionavisccmpdncmpappel = datereceptionavisccmpdncmpappel;
		}


		@Column(name = "datenonobjectionptfappel",length=50)
		public String getDatenonobjectionptfappel() {
			return datenonobjectionptfappel;
		}
		public void setDatenonobjectionptfappel(String datenonobjectionptfappel) {
			this.datenonobjectionptfappel = datenonobjectionptfappel;
		}


		@Column(name = "dateinvitationsoumission",length=50)
		public String getDateinvitationsoumission() {
			return dateinvitationsoumission;
		}
    	public void setDateinvitationsoumission(String dateinvitationsoumission) {
			this.dateinvitationsoumission = dateinvitationsoumission;
		}


    	@Column(name = "dateouvertureplis",length=50)
		public String getDateouvertureplis() {
			return dateouvertureplis;
		}
		public void setDateouvertureplis(String dateouvertureplis) {
			this.dateouvertureplis = dateouvertureplis;
		}


		@Column(name = "datefinevaluation",length=50)
		public String getDatefinevaluation() {
			return datefinevaluation;
		}
		public void setDatefinevaluation(String datefinevaluation) {
			this.datefinevaluation = datefinevaluation;
		}


		@Column(name = "datereceptionavisccmpdncmp",length=50)
		public String getDatereceptionavisccmpdncmp() {
			return datereceptionavisccmpdncmp;
		}
    	public void setDatereceptionavisccmpdncmp(String datereceptionavisccmpdncmp) {
			this.datereceptionavisccmpdncmp = datereceptionavisccmpdncmp;
		}


    	@Column(name = "datenonobjectionptf",length=50)
		public String getDatenonobjectionptf() {
			return datenonobjectionptf;
		}
		public void setDatenonobjectionptf(String datenonobjectionptf) {
			this.datenonobjectionptf = datenonobjectionptf;
		}


		@Column(name = "dateprevisionnellesignaturecontrat",length=50)
		public String getDateprevisionnellesignaturecontrat() {
			return dateprevisionnellesignaturecontrat;
		}
    	public void setDateprevisionnellesignaturecontrat(
				String dateprevisionnellesignaturecontrat) {
			this.dateprevisionnellesignaturecontrat = dateprevisionnellesignaturecontrat;
		}




    	
    	@Column(name = "dateavisccmpdncmp",length=50)
		public String getDateavisccmpdncmp() {
			return dateavisccmpdncmp;
		}
    	public void setDateavisccmpdncmp(String dateavisccmpdncmp) {
			this.dateavisccmpdncmp = dateavisccmpdncmp;
		}


    	@Column(name = "datepreparationtdrami",length=50)
		public String getDatepreparationtdrami() {
			return datepreparationtdrami;
		}
		public void setDatepreparationtdrami(String datepreparationtdrami) {
			this.datepreparationtdrami = datepreparationtdrami;
		}


		@Column(name = "dateavisccmpdncmpami",length=50)
		public String getDateavisccmpdncmpami() {
			return dateavisccmpdncmpami;
		}
    	public void setDateavisccmpdncmpami(String dateavisccmpdncmpami) {
			this.dateavisccmpdncmpami = dateavisccmpdncmpami;
		}


    	@Column(name = "datelancementmanifestation",length=50)
		public String getDatelancementmanifestation() {
			return datelancementmanifestation;
		}
    	public void setDatelancementmanifestation(String datelancementmanifestation) {
			this.datelancementmanifestation = datelancementmanifestation;
		}


    	@Column(name = "dateouverturemanifestation",length=50)
		public String getDateouverturemanifestation() {
			return dateouverturemanifestation;
		}
    	public void setDateouverturemanifestation(String dateouverturemanifestation) {
			this.dateouverturemanifestation = dateouverturemanifestation;
		}


    	@Column(name = "datepreparationdp",length=50)
		public String getDatepreparationdp() {
			return datepreparationdp;
		}
    	public void setDatepreparationdp(String datepreparationdp) {
			this.datepreparationdp = datepreparationdp;
		}


    	@Column(name = "dateavisccmpdncmpdp",length=50)
		public String getDateavisccmpdncmpdp() {
			return dateavisccmpdncmpdp;
		}
    	public void setDateavisccmpdncmpdp(String dateavisccmpdncmpdp) {
			this.dateavisccmpdncmpdp = dateavisccmpdncmpdp;
		}


    	@Column(name = "dateouverturedp",length=50)
		public String getDateouverturedp() {
			return dateouverturedp;
		}
    	public void setDateouverturedp(String dateouverturedp) {
			this.dateouverturedp = dateouverturedp;
		}


    	@Column(name = "dateavisccmpdncmpdppt",length=50)
		public String getDateavisccmpdncmpdppt() {
			return dateavisccmpdncmpdppt;
		}
    	public void setDateavisccmpdncmpdppt(String dateavisccmpdncmpdppt) {
			this.dateavisccmpdncmpdppt = dateavisccmpdncmpdppt;
		}


    	@Column(name = "datenonobjectionptfpt",length=50)
		public String getDatenonobjectionptfpt() {
			return datenonobjectionptfpt;
		}
		public void setDatenonobjectionptfpt(String datenonobjectionptfpt) {
			this.datenonobjectionptfpt = datenonobjectionptfpt;
		}


		@Column(name = "dateouverture",length=50)
		public String getDateouverture() {
			return dateouverture;
		}
    	public void setDateouverture(String dateouverture) {
			this.dateouverture = dateouverture;
		}


    	@Column(name = "datefinevaluationpf",length=50)
		public String getDatefinevaluationpf() {
			return datefinevaluationpf;
		}
    	public void setDatefinevaluationpf(String datefinevaluationpf) {
			this.datefinevaluationpf = datefinevaluationpf;
		}


    	@Column(name = "datenegociation",length=50)
		public String getDatenegociation() {
			return datenegociation;
		}
    	public void setDatenegociation(String datenegociation) {
			this.datenegociation = datenegociation;
		}


    	@Column(name = "dateavisptfservcontrole",length=50)
		public String getDateavisptfservcontrole() {
			return dateavisptfservcontrole;
		}
    	public void setDateavisptfservcontrole(String dateavisptfservcontrole) {
			this.dateavisptfservcontrole = dateavisptfservcontrole;
		}



    	

    	///::::
    	@Column(name = "dureej",length=5)
		public int getDureej() {
			return dureej;
		}
    	public void setDureej(int dureej) {
			this.dureej = dureej;
		}


    	@Column(name = "dureek",length=5)
		public int getDureek() {
			return dureek;
		}
    	public void setDureek(int dureek) {
			this.dureek = dureek;
		}


    	@Column(name = "dureel",length=5)
		public int getDureel() {
			return dureel;
		}
		public void setDureel(int dureel) {
			this.dureel = dureel;
		}


		@Column(name = "dureem",length=5)
		public int getDureem() {
			return dureem;
		}
		public void setDureem(int dureem) {
			this.dureem = dureem;
		}


		@Column(name = "dureen",length=5)
		public int getDureen() {
			return dureen;
		}
    	public void setDureen(int dureen) {
			this.dureen = dureen;
		}


    	@Column(name = "dureeo",length=5)
		public int getDureeo() {
			return dureeo;
		}
    	public void setDureeo(int dureeo) {
			this.dureeo = dureeo;
		}


    	@Column(name = "dureep",length=5)
		public int getDureep() {
			return dureep;
		}
    	public void setDureep(int dureep) {
			this.dureep = dureep;
		}


    	@Column(name = "dureeq",length=5)
		public int getDureeq() {
			return dureeq;
		}
    	public void setDureeq(int dureeq) {
			this.dureeq = dureeq;
		}


    	@Column(name = "dureer",length=5)
		public int getDureer() {
			return dureer;
		}
    	public void setDureer(int dureer) {
			this.dureer = dureer;
		}


    	@Column(name = "durees",length=5)
		public int getDurees() {
			return durees;
		}
    	public void setDurees(int durees) {
			this.durees = durees;
		}


    	@Column(name = "dureet",length=5)
		public int getDureet() {
			return dureet;
		}
    	public void setDureet(int dureet) {
			this.dureet = dureet;
		}


    	@Column(name = "dureeu",length=5)
		public int getDureeu() {
			return dureeu;
		}
    	public void setDureeu(int dureeu) {
			this.dureeu = dureeu;
		}


    	@Column(name = "dureev",length=5)
		public int getDureev() {
			return dureev;
		}
		public void setDureev(int dureev) {
			this.dureev = dureev;
		}


		@Column(name = "dureew",length=5)
		public int getDureew() {
			return dureew;
		}
    	public void setDureew(int dureew) {
			this.dureew = dureew;
		}


    	@Column(name = "dureex",length=5)
		public int getDureex() {
			return dureex;
		}
    	public void setDureex(int dureex) {
			this.dureex = dureex;
		}


    	@Column(name = "examendncmp",length=5)
		public String getExamendncmp() {
			return examendncmp;
		}
    	public void setExamendncmp(String examendncmp) {
			this.examendncmp = examendncmp;
		}


    	@Column(name = "examenccmp",length=5)
		public String getExamenccmp() {
			return examenccmp;
		}
        public void setExamenccmp(String examenccmp) {
			this.examenccmp = examenccmp;
		}


        @Column(name = "type",length=5)
		public String getType() {
			return type;
		}
    	public void setType(String type) {
			this.type = type;
		}
    	
    	
    	
    	
	}

