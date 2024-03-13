package curs1;
/* compilam codul
 * preluat de catre JVM
 * incarca membrii statici ai clasei (var sau metoda decalarata cu cuvantul cheie )
 * initializare obiectului clasei
 */

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstClass obiect = new FirstClass();
		 obiect.greetings();
		 FirstClass obiect2 = new FirstClass();
		 obiect2.greetings();
	}
		
	
	public void greetings() {
			System.out.println("Hello!");
			//sysout --> urmat de ctrl + space
		}
		

	}