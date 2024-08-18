package PracticaInterfaces;

public class Jugador {

	private String nombre;
	private IEquipo equipo;

	public Jugador() {
		
	}
	 
	public Jugador(String nombre, IEquipo equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador nombre = " + nombre + ". Equipo = " + equipo.toString();
	}
	
	
}
