package curs9Homework;

public class TestQualification {

	public static void main(String[] args) {
		Qualification obj =  new Qualification("Java", 3, "Afternoon");
        obj.verify();
       
        Qualification obj2 =  new Qualification("Python", 1, "Morning");
        obj2.verify();

	}

}
