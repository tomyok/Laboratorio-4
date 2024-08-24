package ejercicio1;

public class Empleado {

	private final int id;
	private String nombre;
	private int edad;
	
	private static int idCont=999;
	
	public static int devuelveProximoId() {
		return ++idCont;
	}
	public Empleado() {
		idCont++;
		
		this.id = idCont;
		this.nombre="Sin nombre";
		this.edad=99;
	}
	
	public Empleado(String nombre, int edad) {
		idCont++;
		
		this.id=idCont;
		this.nombre=nombre;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	

	@Override
	public String toString() {
		return "Empleado: " + nombre + ", Edad: " + edad + ", Legajo: " + id + ".";
	}
	
	

}
