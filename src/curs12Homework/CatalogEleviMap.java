package curs12Homework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CatalogEleviMap {

	public static void main(String[] args) {

/*
	define map to stores key as name, value as Grade
 Using treemap here to save in the order of keys
*/
TreeMap<Object, Object> elevMap = new TreeMap<>();
String cont;
int option = 0;

// using scanner to take input from users
Scanner scan = new Scanner(System.in);

// iterate using while, select appropriate option
while (option != 5) {
System.out.println("----    Menu    ----");
System.out.println("----    1.Adauga elev ----");
System.out.println("----    2.Sterge elev ----");
System.out.println("----    3.Modifica nota ----");
System.out.println("----    4.Printeaza toate notele ----");
System.out.println("----    5.Exit ----");
System.out.print("Select your option from above:");

// read option
option = scan.nextInt();
scan.nextLine();

// perform operation
if (option == 1) {
		          System.out.println("Introdu numele elevului:");
		          String elevName = scan.nextLine();
		                if (elevMap.containsKey(elevName)) {
		                    System.out.println("Elevul exista in catalog");
		                    continue;
		                }
		                System.out.println("Introdu nota elevului:");
		                String nota = scan.nextLine();
		                elevMap.put(elevName, nota);
		            } else if (option == 2) {
		                System.out.println("Introdu numele elevului:");
		                String elevName = scan.nextLine();
		                if (!elevMap.containsKey(elevName)) {
		                    System.out.println("Numele elevului nu exista pentru a fi sters.");
		                    continue;
		                }
		                elevMap.remove(elevName);
		            } else if (option == 3) {
		            	System.out.println("Introdu numele elevului: ");
		                String elevName = scan.nextLine();
		                if (!elevMap.containsKey(elevName)) {
		                    System.out.println("Numele elevului nu exista pentru a i se modifica nota");
		                    continue;
		                }
		                System.out.println("Introdu nota elevului: ");
		                String nota = scan.nextLine();
		                elevMap.put(elevName, nota);
		            } else if (option == 4) {
		                for (Map.Entry entry : elevMap.entrySet()) {
		                    System.out.println(entry.getKey() + ":" + entry.getValue());
		                }
		            } else if (option == 5) {
		                System.out.println("You have selected to Exit. Bye");
		            } else {
		                System.out.println("Please enter valid option.");
		                continue;
		            }
		        }
		        // finally close the scanner object
		        scan.close();
		    }
	}

