package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
	
		Profesor profe1 = new Profesor("Jorge", 45, "gerente", 10);
		Profesor profe2 = new Profesor("Manuel", 35, "comandante", 20);
		Profesor profe3 = new Profesor("Miguel", 25, "gerente", 30);
		Profesor profe4 = new Profesor("Jose", 40, "profesor", 40);
		Profesor profe5 = new Profesor("Josefina", 55, "ayudante", 11);
		Profesor profe6 = new Profesor("Jorge", 45, "gerente", 10);
		
		ArrayList <Profesor> arraysProfesores = new ArrayList<Profesor>(5);
		arraysProfesores.add(profe1);
		arraysProfesores.add(profe2);
		arraysProfesores.add(profe3);
		arraysProfesores.add(profe4);
		arraysProfesores.add(profe5);
		
		ListIterator<Profesor> it = arraysProfesores.listIterator();
		while(it.hasNext()) {
			Profesor profe = it.next();
			it.remove();
			System.out.println(profe.toString());
		}
		
		if(profe1.equals(profe6)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}
		
	}

}
