package curs10package2;

import curs10package1.ProtectedAccessModifier;

public class ClasaCopilProtectedModifier extends ProtectedAccessModifier{
	// * Sub-clasa sau clasa copil din  alt pachet : yes
	public static void main(String[] args) {

		ClasaCopilProtectedModifier obj =  new ClasaCopilProtectedModifier();
		obj.printMesaj();
		
		
	}

}