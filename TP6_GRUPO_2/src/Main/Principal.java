package Main;

import Negocio.PersonaNegocio;
import NegocioImpl.PersonaNegocioImpl;
import Entidad.Persona;

public class Principal {

	public static void main(String[] args) {
		
		PersonaNegocio asd = new PersonaNegocioImpl();
		Persona p1 = new Persona("123", "Roberto", "Amigdalas");
		if(asd.insert(p1)) {
		System.out.println("se agrego correctamente.");
		} else {
			System.out.println("no se agrego la persona.");
		}
	}

}
