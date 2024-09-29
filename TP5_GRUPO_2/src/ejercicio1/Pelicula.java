package ejercicio1;

public class Pelicula implements Comparable<Pelicula> {

	private final int id;
	private static int idcont = 0;
	private String nombre;
	private Categoria categoria;
	
	public Pelicula(String nombre, Categoria categoria) {
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
	
	public static int devuelveProximoId() {
		return idcont+1;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Pelicula otraPelicula) {
		return this.nombre.compareTo(otraPelicula.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Genero: " + categoria.getNombre() + ", ID: " + id + ".";
	}

	
	
	
}
