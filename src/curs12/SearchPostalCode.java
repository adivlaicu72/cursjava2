package curs12;
/*
 * Facem un program care cauta pe baza unui cod postal si printeaza 
 * orasul aferent codului
 * avem o clasa care inca de la initializarea obiectului initilizeaza si ea
 * o serie de coduri postale si orase
 * avem o functionalitate care cauta pe baza codului si printeaza orasul
 * daca codul postal nu exista arunc o execeptie : PostalCodeException
 * si intreb din nou utilizatorul pana primesc cod corect (deci e bucla)
 * 
 * 
 */

public class SearchPostalCode {

	public static void main(String[] args) throws PostalCodeException {
		
		CoduriPostale cp = new CoduriPostale();
		System.out.println(cp.map);

	}

}
