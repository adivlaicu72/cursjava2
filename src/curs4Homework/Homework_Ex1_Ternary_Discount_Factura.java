package curs4Homework;

import java.util.Scanner;

public class Homework_Ex1_Ternary_Discount_Factura {

	public static void main(String[] args) {
		double factura = 100;
		double discount = 0.00;
		double factura_cu_discount = 0.00;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu valoarea facturii: ");
		factura = scan.nextInt();
		scan.close();
		
		discount =(factura > 100) ? factura*10.0/100 : factura * 5.0/100;
		factura_cu_discount = factura - discount;
		System.out.println("Valoarea facturii cu discount este: " +factura_cu_discount);
	}

}
