package ejercicio1;

public class Pelicula {

	private final int id;
	private static int idcont = 0;
	private String nombre;
	private Categoria categoria;
	
	public Pelicula() {
		idcont++;
		this.id = idcont;
	}
	
	public Pelicula(int id, String nombre, Categoria categoria) {
		idcont++;
		this.id = idcont;
		this.nombre = nombre;
		this.categoria = categoria;
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

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Genero: " + categoria.getNombre() + ", ID: " + id + ".";
	}

	
	
	
}
