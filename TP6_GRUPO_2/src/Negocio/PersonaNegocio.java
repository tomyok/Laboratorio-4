package Negocio;

import java.util.List;

import Entidad.Persona;

public interface PersonaNegocio {

	public boolean insert(Persona persona);
	public boolean delete(Persona persona_a_eliminar);
	public List<Persona> readAll();
	public boolean edit(Persona persona_modificar);
	public Persona readDni(String dni);
}
