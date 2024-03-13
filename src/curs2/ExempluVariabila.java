package curs2;

public class ExempluVariabila {

	//variabilla de instanta
	int age = 35; // declarare si initializare variabila
	//constanta
	final int varsta = 30;
			
			
	public void mesaj() {
		//variabila locala
		String nume = "Ion";
		
		//decalarare variabila
		String mesaj;
		//inititalizare vriabila
		mesaj = "Salut";
				
		age = 45;
//		varsta = 45;
	}
	
	public static void main(String[] args) {
		
		//sysout
		//System.out.println(age);
		
		ExempluVariabila obj = new ExempluVariabila();
		System.out.println(obj.age);
	}

}
