package curs3;

public class StaticVsNonStatic {
	
	String prenume; //var de instanta
	static String nume; //var de clasa, este asociata cu clasa in sine nu cu obiectul clasa

	public static void main(String[] args) {
		
		StaticVsNonStatic obiect = new StaticVsNonStatic();
		obiect.prenume = "Oana";
		//prenume = "Ioana";
		StaticVsNonStatic.nume = "Carmen";
		
		
		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Ion";
		person1.prenume = "Popescu";
		
		System.out.println("Person1 " + person1.nume + " " + person1.prenume);
		
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Ionescu";
		person2.prenume = "George";
		
		System.out.println("Person2 " + person2.nume + " " + person2.prenume);
		
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person3.nume = "Necunoscut";
		person3.prenume = "Maria";
		
		System.out.println("Person3 " + person3.nume + " " + person3.prenume);
		
		System.out.println("------------------------------------------------");
		System.out.println("Person1 " + person1.nume + " " + person1.prenume);
		System.out.println("Person2 " + person2.nume + " " + person2.prenume);
		System.out.println("Person3 " + person3.nume + " " + person3.prenume);
	}

}
