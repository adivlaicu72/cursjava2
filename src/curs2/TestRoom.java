package curs2;

public class TestRoom {

	public static void main(String[] args) {
		
		Room baie = new Room(2, 4);
		System.out.println("Arie baie:" + baie.calculArie());
		System.out.println("Perimetru baie:" + baie.calculPerimetru());
		
		Room dormitor = new Room(8.5, 6.0, "ALB");
		System.out.println("Arie dormitor:" + dormitor.calculArie());
		System.out.println("Perimetru dormitor:" + dormitor.calculPerimetru());
		System.out.println("Culoare dormitor: " + dormitor.afiseazaCuloareDreptunghi());
		
		Room dreptunghi = new Room(10, 5, "ALB");
		System.out.println("Arie dreptunghi:" + dreptunghi.calculArie());
		System.out.println("Perimetru dreptunghi: " + dreptunghi.calculPerimetru());
		System.out.println("Culoare dreptunghi: " + dreptunghi.afiseazaCuloareDreptunghi());

	}

}
