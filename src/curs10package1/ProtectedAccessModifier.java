package curs10package1;

public class ProtectedAccessModifier {
	
	/*
	 * Scopul lui protected este in acelasi pachet si subclase din alte pachete
	 * Clasele nu pot fi declarate ca protected 
	 * 
	 * Aceeasi clasa : yes
	 * Alta clasa acelasi pachet : yes
	 * Sub-clasa sau clasa copil acelasi pachet : yes
	 * Alta clasa din alt pachet : no
	 * Sub-clasa sau clasa copil din alt pachet : yes
	 * 
	 */
	
	protected String mesaj = "Protected access modifier";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}

}
