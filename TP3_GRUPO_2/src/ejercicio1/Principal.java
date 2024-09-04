package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

import ejercicio1.Archivo;

public class Principal {

	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(!archivo.existe())
		{
			System.out.println("No existe el archivo solicitado");
		}else {
			//LECTURA:
			System.out.println("\n A CONTINUACIÓN LOS DATOS DEL ARCHIVO: ");
			archivo.Leer();
		}
		
		TreeSet<Persona> personas = Persona.leerPersonas(archivo);
	
	Iterator<Persona> iterador = personas.iterator();
	while(iterador.hasNext()) {
		Persona per = (Persona) iterador.next();
		System.out.println(per.toString());
	}
	}
}
