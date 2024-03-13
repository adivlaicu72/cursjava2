package curs2;
/*
 * Conventie naming Java;
 * --numele claselor este UpperCamelCase Ex: ExempluVariabila
 * --nume metode si var este lowerCamelCase Ex: numeTester
 * 
 * Bad practice in java : clasa exemplu_clasa sau variabila ex: nume_tester
 * 
 */

public class Tester {
	
	//variabile
	String numeTester;//String --valoare default null
	int varstaTester;// numeric--valoare default 0
	
	//metoda
	public void afiseazaDetaliiTester() {
		System.out.println("Numele testerului este:  " + numeTester);
		System.out.println("Varsta testerului este:  " + varstaTester);
		System.out.println("Lungimea numelui este:  " + numeTester.length());
		
	}
	
	//constructor default
//	public Tester() {};
	
	//Tester tester1 = new Tester("Monica", 34);
	public Tester(String nume, int varsta) {
		numeTester =  nume;
		varstaTester = varsta;
	};
}
