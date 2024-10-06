package NegocioImpl;

import java.util.List;

import Dao.PersonaDao;
import DaoImpl.PersonaDaoImpl;
import Entidad.Persona;
import Negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio{

	PersonaDao pdao = new PersonaDaoImpl();
	
	public PersonaNegocioImpl() {
		
	}
	
	@Override
	public boolean insert(Persona persona) {
		
		boolean estado=false;
		if(persona.getNombre().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			estado=pdao.insert(persona);
		}
		return estado;
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		boolean estado=false;
		if(persona_a_eliminar.getDni()!="" )
		{
			estado=pdao.delete(persona_a_eliminar);
		}
		return estado;
	}

	@Override
	public List<Persona> readAll() {
		return pdao.readAll();
	}

	@Override
	public boolean edit(Persona persona_modificar) {
		boolean estado=false;
		if(persona_modificar.getNombre().trim().length()>0 && persona_modificar.getApellido().trim().length()>0)
		{
			estado=pdao.edit(persona_modificar);
		}
		return estado;
	}

}
