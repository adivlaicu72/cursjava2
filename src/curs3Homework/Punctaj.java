package curs3Homework;

import java.util.Scanner;

public class Punctaj {
	
	int punctaj;
	
public void askTheNumberOfPoints() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul: ");
		punctaj = scan.nextInt();
		scan.close();
		
	}


public void compareTheNumberOfPoints() {
		
		if ( punctaj>= 0 && punctaj <= 65) {
			
			System.out.println("Ai picat. Mai Incearca !");
		
			}
		
		else if (punctaj >= 66) {
		
			System.out.println("Felicitari, Ai trecut !");
		
	
			}

	} 

}
