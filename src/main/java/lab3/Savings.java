package lab3;

public class Savings {
	public class Savings_lab3 {
		private String hadgalamjiin_ner;
		private String hagdgalamjiin_valuyt;
		private double hadgalamjiin_jiliin_huu;
		private int hadgalamjiin_hugatsaa;
		private double hadgalamjiin_ehnii_uldegdel;
		public Savings_lab3 (String hadgalamjiin_ner, String hagdgalamjiin_valuyt, double hadgalamjiin_jiliin_huu, int hadgalamjiin_hugatsaa, double  hadgalamjiin_ehnii_uldegdel) {
	        this.hadgalamjiin_ner = hadgalamjiin_ner;
	        this.hagdgalamjiin_valuyt = hagdgalamjiin_valuyt;
	        this.hadgalamjiin_jiliin_huu = hadgalamjiin_jiliin_huu;
	        this.hadgalamjiin_hugatsaa = hadgalamjiin_hugatsaa;
	        this. hadgalamjiin_ehnii_uldegdel =  hadgalamjiin_ehnii_uldegdel;
	    }
		 private double savingsCalcAccrued() {
			 return hadgalamjiin_ehnii_uldegdel * hadgalamjiin_jiliin_huu * (hadgalamjiin_hugatsaa/ 12 / 100);
		    }
		 private double savingsCalc() {
			 return hadgalamjiin_ehnii_uldegdel + savingsCalcAccrued();
		 }
		 public void savingsReport() {
			 System.out.printf("hadgalamjiin ner: %s, etssiin uldegdel: %.2f%s", hadgalamjiin_ner, savingsCalc(), hagdgalamjiin_valuyt);
		 }
		 
	}
}
