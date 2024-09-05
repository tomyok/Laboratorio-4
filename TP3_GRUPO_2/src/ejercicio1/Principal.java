package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

import ejercicio1.Archivo;

public class Principal {

	public static void main(String[] args) {
		Archivo archivoLeer = new Archivo();
		archivoLeer.setRuta("Personas.txt");
		
		TreeSet<Persona> personas = Persona.leerPersonas(archivoLeer);
		
		Archivo archivoEscribir = new Archivo();
		archivoEscribir.setRuta("PersonasEscribir.txt");	
		
		if(archivoEscribir.existe())
		{
			System.out.println("Existe el archivo");
		} else {
			archivoEscribir.CrearArchivo();
		}
	
	
	Iterator<Persona> iterador = personas.iterator();
	while(iterador.hasNext()) {
		Persona per = (Persona) iterador.next();
		archivoEscribir.Escribir(per.toString()+"\n");
	}
	
	System.out.println("\n Lee archivo: ");
	archivoEscribir.Leer();
	
	
	}
}
