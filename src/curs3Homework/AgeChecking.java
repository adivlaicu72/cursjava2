package curs3Homework;

import java.util.Scanner;

public class AgeChecking {
	
	int age;
	
public void askTheAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu varsta: ");
		age = scan.nextInt();
		scan.close();
	}


public void compareTheAge() {
		
		if (age < 18) {
			System.out.println("Esti minor !");
			}
		
		else if (age >= 18 && age <= 65) {
			System.out.println("Esti adult !");
			}
		
		else if (age > 65) {
			System.out.println("Esti batran !");
			}

	}
}
