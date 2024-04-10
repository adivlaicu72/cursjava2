package curs10package1;

class DefaultAccessModifier {
	
	/*
	 * Default inseamna atunci cand nu specificam nimic
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Same class : yes
	 * Alta clasa in acelasi pachet : yes
	 * Subclasa sau clasa copil in acelasi pachet  : yes
	 * Alta clasa in alt pachet : no
	 * Subclasa sau clasa copil in alt pachet : no
	 */

	String mesaj = "Default access modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	
}
