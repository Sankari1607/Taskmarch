package package3;

public class TestH {
	
	public static void main(String [] args) {
		
		Malar m = new Malar();// instantiations
		m.billing();
		m.insurance();
		m.patientmentalHealth();
		m.patientdiets();
		
			
		fortis f = new fortis();
		f.billing();
	
		
		//f.billing();
		//f.insurance();
		//f.patientsmentalhealth();
		f.patientdiets();
		
		IndianM m1 = new Malar();
		m1.insurance();
		m1.patientdiets();
		
		IndianM m2 = new fortis();
		m2.insurance();
		m2.patientdiets();
		
	}	
		
}
