package curs8Homework;

import java.util.Scanner;

public class Homework_Bonus_Vanzari_Ex_switch {
	/*
	Scriem un program care simuleaza un program de acordat bonusuri.
		Programul primeste input de la utilizator :
			=> Anul de vechime in firma
			=> Valoarea vanzarilor efectuate
			=> Luna in care a efectuat vanzarile
			
		=>	Daca are un an vechime atunci primeste un bonus de 100
		=> 	Daca are 2 ani vechime atunci primeste un bonus de 200
			
			
		=>	Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
				5000 atunci primeste bonus 600
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
				decembrie se vand singure!”
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
				bonus 1200
	 */

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu numarul de ani de vechime in intervalul 1-3: ");
		int anVechime = scan.nextInt();
		
		switch(anVechime) {
		case 1: 
			System.out.println("Primesti un bonus de 100 lei");
			break;
		case 2:
			System.out.println("Primesti un bonus de 200 lei");
			break;
		
		case 3:
			
			System.out.println("Te rog introdu luna vanzari: ");
			int lunaVanzari = scan.nextInt();
			System.out.println("Te rog introdu valoare vanzari: ");
			int valoareVanzari = scan.nextInt();
			
			if (valoareVanzari <= 5000) {
				System.out.println("Primesti un bonus de 600 lei");
			}
			else if (valoareVanzari > 10000) {
				System.out.println("Primesti un bonus de 1200 lei");
			}else {
				switch(lunaVanzari) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 800 lei");
				}
				break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 1000 lei");
						}
				break;
				case 12:
				if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 900 lei");
					System.out.println("In decembrie se vand singure!");
				}
				break;
				default:
					if (valoareVanzari > 10000) {
					System.out.println("Primesti un bonus de 1200 lei");
				}
			}
		}
	}
}
}
