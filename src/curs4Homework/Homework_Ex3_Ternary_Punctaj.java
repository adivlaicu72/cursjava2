package curs4Homework;

import java.util.Scanner;

public class Homework_Ex3_Ternary_Punctaj {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul: ");
		int punctaj = scan.nextInt();
		scan.close();
		
		String calificativ = (punctaj >= 90)? "FB" : (punctaj<90&&punctaj>=80)?"B":"S";
		String rezultat = (calificativ == "FB" )? "Ai primit : FoarteBine" : (calificativ == "B") ?"Ai primit : Bine":"Ai primit : Suficient";
		System.out.println(rezultat);
		System.out.println("Calificativul este: " +calificativ);
	}

}
