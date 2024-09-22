package ejercicio1;

public class Peliculas {

	private final int id;
	private static int idcont = 0;
	private String nombre;
	private String genero;
	
	public Peliculas() {
		idcont++;
		this.id = idcont;
	}
	
	public Peliculas(int id, String nombre, String genero) {
		idcont++;
		this.id = idcont;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Genero: " + genero + ", ID: " + id + ".";
	}
	
	
	
}
