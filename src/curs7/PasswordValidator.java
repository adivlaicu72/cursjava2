package curs7;

import java.util.Scanner;

/*
 * Facem un program care valideaza o parola pe baza unor reguli
 * Regulile sunt: 
 * 1. Parola trebuie sa contina cel putina 10 caractere
 * 2. Parola trebuie sa contina o litera upper case
 * 3. Parola nu trebuie sa file la fel ca username
 * 
 * Printam regulile parolei
 * Intrebam userul un username si o parola
 * validam parola, daca parola respecta regulile
 * printam Parola valida
 * daca parola nu respecta regulile, atunci printam care dintre reguli nu este respectata
 * si intrebam din nou
 *
 * 
 */

public class PasswordValidator {
	Scanner scan = new Scanner(System.in);
	String username, password;
	String regula1 = "Parola trebuie sa contina cel putin 10 caractere";
	String regula2 = "Parola trebuie sa contina o litera upper case";
	String regula3 = "Parola nu trebuie sa fie la fel ca username";
	
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println(regula1);
		System.out.println(regula2);
		System.out.println(regula3);
	}
	
	public void readUsername() {
		System.out.println("Te rog introdu un username :");
		username = scan.next();
	}
	
	public void readPassword() {
		System.out.println("Te rog introdu un parola :");
		username = scan.next();
	}
	
	public boolean checkPasswordRules() {
		boolean flag = true;
		
		if(password.length() < 10) {
			System.out.println(regula1);
			flag = false;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println(regula2);
			flag = false;
		}
		
		if(password.equals(username)) {
			System.out.println(regula3);
			flag = false;
		}
	
		return flag;
	}
	
	public void validatePassword() {
		
		do {
			readPassword();
			
		}while(!checkPasswordRules());
		
	}
}
