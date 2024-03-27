package curs6;

import java.util.Scanner;

/*
 * 
 * avem un program care cere numere incontinuu de la user
 * le inmulteste cu 10 si le printeaza
 * face asta pana cand userul introduce 0
 * cand userul a introdus 0, iese din bucla
 * 
 * 
 */
public class ForVsWhile {
	static Scanner scan = new Scanner(System.in);
	static int numar;

	public static void main(String[] args) {
//	rezolvareCuFor();
//	rezolvareCuFor2();
		rezolvareCuWhile();
	}
	
	public static void rezolvareCuFor() {
		System.out.println("Introdu un numar:");
		
		for(numar = scan.nextInt(); numar !=0; numar = scan.nextInt()) {
			numar = numar *10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");
		}
	}
	
	public static void rezolvareCuFor2() {
		System.out.println("Introdu un numar:");
		
		for(;;) {
			numar = scan.nextInt();
			if(numar == 0) {
				break;
		}
			numar = numar *10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");	
	}
	}
	public static void rezolvareCuWhile() {
		System.out.println("Introdu un numar:");
		
		numar = scan.nextInt();
		
		while(numar == 0) {
			numar = numar *10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");	
			numar = scan.nextInt();
		}
		
		
	}
}
