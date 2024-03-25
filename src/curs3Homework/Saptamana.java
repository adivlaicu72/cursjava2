package curs3Homework;

import java.util.Scanner;

public class Saptamana {
	int dayOfWeek;
	
public void askTheDayOfWeek() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce zi este astazi? :");
		System.out.println("Te rog introdu un numar in intervalul 1-7 :");
		dayOfWeek = scan.nextInt();
		scan.close();
		
	}
public void checkDayOfWeek() {
		
		if ( dayOfWeek <= 0)  {
			System.out.println("Te rog sa introduci un numar mai mare ca 0 !");
			}
		else if (dayOfWeek == 1) {
			System.out.println("Astazi este luni");
			}
		else if (dayOfWeek == 2) {
			System.out.println("Astazi este marti");
			}
		else if (dayOfWeek == 3) {
			System.out.println("Astazi este miercuri");
			}
		else if (dayOfWeek == 4) {
			System.out.println("Astazi este joi");
			}
		else if (dayOfWeek == 5) {
			System.out.println("Astazi este vineri");
			}
		else if (dayOfWeek == 6) {
			System.out.println("Astazi este sambata");
			}
		else if (dayOfWeek == 7) {
			System.out.println("Astazi este duminica");
			}
		else if ( dayOfWeek > 7 ) {
			System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid !");
			}
	}
}
