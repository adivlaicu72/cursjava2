package curs3;

import java.util.Scanner;

/*
 *  facem un program care citeste un numar de la tastatura
 *  daca nr este intre 1 si 5 printeaza : este zi lucratoare
 *  daca nr este intre 6 si 7 printeaza : este zi de weekend
 *  Daca numarul nu este intre 1 si 7 printeaza: Numar invalid!
 */
public class verificareZiLucratoare {
	
	int zi;
	
	public void askTheUserForANumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number :");
		zi = scan.nextInt();
	}
	
	public void verificaZi() {
		askTheUserForANumber(); //sunt in aceeasi metoda deci apelez clasa fara obiect
		// && --> AND
		// || --> OR
		if(zi >= 1 && zi <= 5 ) {
			System.out.println("Este zi lucratoare");
		}else if( zi == 6 || zi == 7) {
			System.out.println("Este weekend");
		} else {
			System.out.println("Zi invalida");
		}
	}
}
