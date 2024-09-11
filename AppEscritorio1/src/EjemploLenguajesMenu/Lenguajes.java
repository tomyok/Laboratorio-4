package EjemploLenguajesMenu;

public class Lenguajes {
	
	private String nombre;
	private String dificultad;
	
	public Lenguajes(){
		
	}
	
	public Lenguajes(String nombre, String dificultad) {
		this.nombre = nombre;
		this.dificultad = dificultad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", dificultad: " + dificultad + ".";
	}
	
	

}
