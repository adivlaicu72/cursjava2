package curs8Homework;

import java.util.Scanner;

public class Homework_Ex2_Suma_Zece_Numere {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Introdu 10 numere:");
            int myArray[] = new int[10];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = scan.nextInt();             
            }

                int sum = 0;
                for (int i = 0; i < myArray.length; i++) {
                    sum += myArray[i];
                }  
                System.out.println("Suma numerelor din array este :" +sum);

        }
}
