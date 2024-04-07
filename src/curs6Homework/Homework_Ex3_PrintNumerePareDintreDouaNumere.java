package curs6Homework;

import java.util.Scanner;

public class Homework_Ex3_PrintNumerePareDintreDouaNumere {

	static Scanner scan = new Scanner(System.in);
	static int a, b, i;
	
	
	public static void main(String[] args) {
//		rezolvareCuFor();
		rezolvareCuWhile();

	}

	public static void rezolvareCuFor() {
		System.out.println("Introdu primul numar:");	
		a = scan.nextInt();
		System.out.println("Introdu al doilea numar:");
		b = scan.nextInt();
		
		 if (a > b) {
				System.out.println("Numarul a trebuie sa fie mai mic decat numarul b");
			}
		 else {for(i=a; i<b; i++) {
				if (i%2 == 0) {
					System.out.println("Numar par in intervalul [a-b]: " +i);
				}
		}
		
		System.out.println("--------------------------------------");	
	
		 }
	}
	
	public static void rezolvareCuWhile() {
		System.out.println("Introdu primul numar:");	
		a = scan.nextInt();
		System.out.println("Introdu al doilea numar:");
		b = scan.nextInt();
		
		i=a;
		while(i<b) {
			i++;
			 if (i%2 == 0) {		
					System.out.println("Numar par in intervalul [a-b]: " +i);
				}		
		 } 
		 
		}
		
	
	}
