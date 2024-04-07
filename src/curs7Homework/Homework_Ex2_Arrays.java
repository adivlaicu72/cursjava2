package curs7Homework;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Scriem un program care printeaza in consola numele unei luni a
* anului bazandu-se pe inputul utilizatorului.
* 
* Intreba untilizatorul un numar si pe baza numarului va printa numele
* lunii. Ex : utilizatorul introduce 1 si printeaza Ianuarie
*  Folosim un array pentru numele lunilor
*  Daca ultilzatorul introduce un numar invalid, intreaba din nou pan numarul introdus este valid
* Pentru numar invalid informeaza utilizatorul print-un mesaj ca numarul este invalid.
* 
*/

public class Homework_Ex2_Arrays {
	
	public static final String[] calendarArray = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int monthNumber = scan.nextInt();
		
		while (monthNumber > 12) {
			System.out.println("Invalid input - Wrong month number.");
			System.out.println("Please enter a valid month number: [1-12]");
			monthNumber = scan.nextInt();
		} 
		
		 if(monthNumber==1)
			System.out.println("This is a: " +calendarArray[0]);
		else if(monthNumber==2)
			System.out.println("This is a: " +calendarArray[1]);
		else if(monthNumber==3)
			System.out.println("This is a: " +calendarArray[2]);
		else if(monthNumber==4)
			System.out.println("This is a: " +calendarArray[3]);
		else if(monthNumber==5)
			System.out.println("This is a: " +calendarArray[4]);
		else if(monthNumber==6)
			System.out.println("This is a: " +calendarArray[5]);
		else if(monthNumber==7)
			System.out.println("This is a: " +calendarArray[6]);
		else if(monthNumber==8)
			System.out.println("This is a: " +calendarArray[7]);
		else if(monthNumber==9)
			System.out.println("This is a: " +calendarArray[8]);
		else if(monthNumber==10)
			System.out.println("This is a: " +calendarArray[9]);
		else if(monthNumber==11)
			System.out.println("This is a: " +calendarArray[10]);
		else if (monthNumber==12)
			System.out.println("This is a: " +calendarArray[11]);
		
	}
}
