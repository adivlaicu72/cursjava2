package curs7;

import java.util.Scanner;

/*
 * Facem un joca care simuleaza un joc de zaruri
 * Avem urmatoarele reguli:
 * 1. Daca userul da in total: 2, 6, 12 --> Pierde jocul
 * 2. Daca userul da in total: 7,11 --> Castiga jocul
 * 3. Daca userul da in total: 3,10 --> repeta automat aruncarea
 * 4. Daca userul da in total orice alta varianta decat cele de mai sus, intrebam daca vrea
 * sa mai dea inca o data
 * raspunsul lui va fi un true sau false
 * 
 */
public class DiceGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int zar1 = (int) (Math.random() * 6 +1);
		int zar2 = (int) (Math.random() * 6 +1);
		int total = zar1 + zar2;
		boolean raspuns = true;
		
		System.out.println("Ai dat : " + total);
		
		if(total ==2 || total == 6 || total == 12) {
			System.out.println("Ai dat " + total + "! Ai pierdut jocul!");
			break;
		}else if (total == 7 || total == 11) {
			System.out.println("Ai dat " + total + "! Ai catigat jocul!");
			break;
		}else if (total == 3 || total == 10) {
			System.out.println("Ai dat " + total + "! Automat mai dai o data!");
			continue;
		}
		System.out.println("Mai vrei sa dai o data ?");
		raspuns = scan.nextBoolean();
		
		
	}
}

}
