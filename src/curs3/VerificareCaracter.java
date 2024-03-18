package curs3;

import java.util.Scanner;

public class VerificareCaracter {
	
	// masina	"a"	'a'
	// 012345	 0
	
	char character;
	
	public void askTheUserForACharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a caracter :");
		character = scan.next().charAt(0);
	}
	
	public void verificaDacaCaracterulEsteLitera() {
		askTheUserForACharacter();
		
		if(Character.isLetter(character)) {
			System.out.println("Characterul este litera");
			
		} else {
			System.out.println("Characterul nu este litera");
		}
		
	}

}
