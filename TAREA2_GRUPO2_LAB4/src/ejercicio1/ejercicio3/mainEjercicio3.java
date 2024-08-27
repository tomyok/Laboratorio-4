package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		Polideportivo p1 = new Polideportivo();
		Polideportivo p2 = new Polideportivo();
		Polideportivo p3 = new Polideportivo();
		
		EdificioDeOficinas e1 = new EdificioDeOficinas();
		EdificioDeOficinas e2 = new EdificioDeOficinas();
		
		ArrayList<Edificio> arrayEdificios = new ArrayList<Edificio>();
		arrayEdificios.add(p1);
		arrayEdificios.add(p2);
		arrayEdificios.add(p3);
		arrayEdificios.add(e1);
		arrayEdificios.add(e2);
		
		ListIterator<Edificio> iterador = arrayEdificios.listIterator();
		while(iterador.hasNext()) {
			Edificio edi = iterador.next();
			iterador.remove();
			System.out.println(edi.toString());
		}

	}

}
