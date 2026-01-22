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
	@Table(name = "pmb_config_dates_real")
	public class SygConfigurationsDatesRealisations  implements java.io.Serializable {
		
  		private Long id;  
		private SygModepassation mode;
		private String examendncmp,examenccmp,examenptf,type;
		private String date1,date2,date3,date4,date5,date6,date7,date8,date9,date10,date11,date12,date13,date14,
		date15,date16,date17,date18,date19;
		private String reference1,reference2,reference3,reference4,reference5,reference6,reference7,reference8,reference9,reference10,reference11,
		reference12,reference13,reference14,reference15,reference16,reference17,reference18,reference19;
		private int valeur1,valeur2,valeur3,valeur4,valeur5,valeur6,valeur7,valeur8,valeur9,valeur10,valeur11,valeur12,valeur13,valeur14,
		valeur15,valeur16,valeur17,valeur18,valeur19;
		
		
	


		public SygConfigurationsDatesRealisations() {
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


    	@Column(name = "examenptf",length=5)
		public String getExamenptf() {
			return examenptf;
		}
    	public void setExamenptf(String examenptf) {
			this.examenptf = examenptf;
		}

	

    	@Column(name = "date1",length=15)
    	public String getDate1() {
			return date1;
		}
    	public void setDate1(String date1) {
			this.date1 = date1;
		}


    	@Column(name = "date2",length=15)
		public String getDate2() {
			return date2;
		}
    	public void setDate2(String date2) {
			this.date2 = date2;
		}


    	@Column(name = "date3",length=15)
		public String getDate3() {
			return date3;
		}
    	public void setDate3(String date3) {
			this.date3 = date3;
		}


    	@Column(name = "date4",length=15)
		public String getDate4() {
			return date4;
		}
    	public void setDate4(String date4) {
			this.date4 = date4;
		}
 	
    	
    	@Column(name = "date5",length=15)
		public String getDate5() {
			return date5;
		}
    	public void setDate5(String date5) {
			this.date5 = date5;
		}

    	@Column(name = "date6",length=15)
    	public String getDate6() {
			return date6;
		}
    	public void setDate6(String date6) {
			this.date6 = date6;
		}


    	@Column(name = "date7",length=15)
		public String getDate7() {
			return date7;
		}
    	public void setDate7(String date7) {
			this.date7 = date7;
		}


    	@Column(name = "date8",length=15)
		public String getDate8() {
			return date8;
		}
    	public void setDate8(String date8) {
			this.date8 = date8;
		}


    	@Column(name = "date9",length=15)
		public String getDate9() {
			return date9;
		}
    	public void setDate9(String date9) {
			this.date9 = date9;
		}
 	
    	
    	@Column(name = "date10",length=15)
		public String getDate10() {
			return date10;
		}
    	public void setDate10(String date10) {
			this.date10 = date10;
		}
    	
    	

    	@Column(name = "date11",length=15)
    	public String getDate11() {
			return date11;
		}
    	public void setDate11(String date11) {
			this.date11 = date11;
		}


    	@Column(name = "date12",length=15)
		public String getDate12() {
			return date12;
		}
    	public void setDate12(String date12) {
			this.date12 = date12;
		}


    	@Column(name = "date13",length=15)
		public String getDate13() {
			return date13;
		}
    	public void setDate13(String date13) {
			this.date13 = date13;
		}


    	@Column(name = "date14",length=15)
		public String getDate14() {
			return date14;
		}
    	public void setDate14(String date14) {
			this.date14 = date14;
		}
 	
    	
    	@Column(name = "date15",length=15)
		public String getDate15() {
			return date15;
		}
    	public void setDate15(String date15) {
			this.date15 = date15;
		}
    	
    	@Column(name = "date16",length=15)
    	public String getDate16() {
			return date16;
		}
    	public void setDate16(String date16) {
			this.date16 = date16;
		}


    	@Column(name = "date17",length=15)
		public String getDate17() {
			return date17;
		}
    	public void setDate17(String date17) {
			this.date17 = date17;
		}


    	@Column(name = "date18",length=15)
		public String getDate18() {
			return date18;
		}
    	public void setDate18(String date18) {
			this.date18 = date18;
		}


    	@Column(name = "date19",length=15)
		public String getDate19() {
			return date19;
		}
    	public void setDate19(String date19) {
			this.date19 = date19;
		}


    	@Column(name = "reference1",length=15)
		public String getReference1() {
			return reference1;
		}
    	public void setReference1(String reference1) {
			this.reference1 = reference1;
		}


    	@Column(name = "reference2",length=15)
		public String getReference2() {
			return reference2;
		}
        public void setReference2(String reference2) {
			this.reference2 = reference2;
		}


        @Column(name = "reference3",length=15)
		public String getReference3() {
			return reference3;
		}
    	public void setReference3(String reference3) {
			this.reference3 = reference3;
		}


    	@Column(name = "reference4",length=15)
		public String getReference4() {
			return reference4;
		}
    	public void setReference4(String reference4) {
			this.reference4 = reference4;
		}


    	@Column(name = "reference5",length=15)
		public String getReference5() {
			return reference5;
		}
    	public void setReference5(String reference5) {
			this.reference5 = reference5;
		}


    	@Column(name = "reference6",length=15)
		public String getReference6() {
			return reference6;
		}
    	public void setReference6(String reference6) {
			this.reference6 = reference6;
		}


    	@Column(name = "reference7",length=15)
		public String getReference7() {
			return reference7;
		}
    	public void setReference7(String reference7) {
			this.reference7 = reference7;
		}
 	
    	
    	@Column(name = "reference8",length=15)
		public String getReference8() {
			return reference8;
		}
    	public void setReference8(String reference8) {
			this.reference8 = reference8;
		}


    	@Column(name = "reference9",length=15)
		public String getReference9() {
			return reference9;
		}
        public void setReference9(String reference9) {
			this.reference9 = reference9;
		}


        @Column(name = "reference10",length=15)
		public String getReference10() {
			return reference10;
		}
    	public void setReference10(String reference10) {
			this.reference10 = reference10;
		}


    	@Column(name = "reference11",length=15)
		public String getReference11() {
			return reference11;
		}
    	public void setReference11(String reference11) {
			this.reference11 = reference11;
		}


    	@Column(name = "reference12",length=15)
		public String getReference12() {
			return reference12;
		}
    	public void setReference12(String reference12) {
			this.reference12 = reference12;
		}


    	@Column(name = "reference13",length=15)
		public String getReference13() {
			return reference13;
		}
    	public void setReference13(String reference13) {
			this.reference13 = reference13;
		}


    	@Column(name = "reference14",length=15)
		public String getReference14() {
			return reference14;
		}
    	public void setReference14(String reference14) {
			this.reference14 = reference14;
		}
 	
    	@Column(name = "reference15",length=15)
		public String getReference15() {
			return reference15;
		}
    	public void setReference15(String reference15) {
			this.reference15 = reference15;
		}


    	@Column(name = "reference16",length=15)
		public String getReference16() {
			return reference16;
		}
        public void setReference16(String reference16) {
			this.reference16 = reference16;
		}


        @Column(name = "reference17",length=15)
		public String getReference17() {
			return reference17;
		}
    	public void setReference17(String reference17) {
			this.reference17 = reference17;
		}


    	@Column(name = "reference18",length=15)
		public String getReference18() {
			return reference18;
		}
    	public void setReference18(String reference18) {
			this.reference18 = reference18;
		}


    	@Column(name = "reference19",length=15)
		public String getReference19() {
			return reference19;
		}
    	public void setReference19(String reference19) {
			this.reference19 = reference19;
		}


    	@Column(name = "valeur1",length=15)
		public int getValeur1() {
			return valeur1;
		}
    	public void setValeur1(int valeur1) {
			this.valeur1 = valeur1;
		}


    	@Column(name = "valeur2",length=15)
		public int getValeur2() {
			return valeur2;
		}
    	public void setValeur2(int valeur2) {
			this.valeur2 = valeur2;
		}


        @Column(name = "valeur3",length=15)
		public int getValeur3() {
			return valeur3;
		}
    	public void setValeur3(int valeur3) {
			this.valeur3 = valeur3;
		}


    	@Column(name = "valeur4",length=15)
		public int getValeur4() {
			return valeur4;
		}
    	public void setValeur4(int valeur4) {
			this.valeur4 = valeur4;
		}


    	@Column(name = "valeur5",length=15)
		public int getValeur5() {
			return valeur5;
		}
    	public void setValeur5(int valeur5) {
			this.valeur5 = valeur5;
		}


    	@Column(name = "valeur6",length=15)
		public int getValeur6() {
			return valeur6;
		}
    	public void setValeur6(int valeur6) {
			this.valeur6 = valeur6;
		}


    	@Column(name = "valeur7",length=15)
		public int getValeur7() {
			return valeur7;
		}
    	public void setValeur7(int valeur7) {
			this.valeur7 = valeur7;
		}


    	@Column(name = "valeur8",length=15)
		public int getValeur8() {
			return valeur8;
		}
    	public void setValeur8(int valeur8) {
			this.valeur8 = valeur8;
		}


    	@Column(name = "valeur9",length=15)
		public int getValeur9() {
			return valeur9;
		}
    	public void setValeur9(int valeur9) {
			this.valeur9 = valeur9;
		}

    	@Column(name = "valeur10",length=15)
		public int getValeur10() {
			return valeur10;
		}
    	public void setValeur10(int valeur10) {
			this.valeur10 = valeur10;
		}


    	@Column(name = "valeur11",length=15)
		public int getValeur11() {
			return valeur11;
		}
    	public void setValeur11(int valeur11) {
			this.valeur11 = valeur11;
		}

    	@Column(name = "valeur12",length=15)
		public int getValeur12() {
			return valeur12;
		}
    	public void setValeur12(int valeur12) {
			this.valeur12 = valeur12;
		}

        @Column(name = "valeur13",length=15)
		public int getValeur13() {
			return valeur13;
		}
    	public void setValeur13(int valeur13) {
			this.valeur13 = valeur13;
		}


    	@Column(name = "valeur14",length=15)
		public int getValeur14() {
			return valeur14;
		}
    	public void setValeur14(int valeur14) {
			this.valeur14 = valeur14;
		}


    	@Column(name = "valeur15",length=15)
		public int getValeur15() {
			return valeur15;
		}
    	public void setValeur15(int valeur15) {
			this.valeur15 = valeur15;
		}
    	
    	@Column(name = "valeur16",length=15)
		public int getValeur16() {
			return valeur16;
		}
    	public void setValeur16(int valeur16) {
			this.valeur16 = valeur16;
		}

    	@Column(name = "valeur17",length=15)
		public int getValeur17() {
			return valeur17;
		}
    	public void setValeur17(int valeur17) {
			this.valeur17 = valeur17;
		}

        @Column(name = "valeur18",length=15)
		public int getValeur18() {
			return valeur18;
		}
    	public void setValeur18(int valeur18) {
			this.valeur18 = valeur18;
		}


    	@Column(name = "valeur19",length=15)
		public int getValeur19() {
			return valeur19;
		}
    	public void setValeur19(int valeur19) {
			this.valeur19 = valeur19;
		}


    	@Column(name = "type",length=5)
		public String getType() {
			return type;
		}
        public void setType(String type) {
			this.type = type;
		}
    	
    	

	}

