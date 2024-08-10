package Ejercicio1;

public class Empleado {

	private final int id;
	private String nombre;
	private int edad;
	private static int idcont = 999;
	
	public Empleado() {
		idcont++;
		this.id = idcont;
		this.nombre = "Sin Nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad) {
		idcont++;
		this.id = idcont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public static int devuelveProximoID() {
		return idcont+1;
	}
	
	//getters and setters
	
	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return "ID Empleado: " + id + ". - Nombre: " + nombre + ". - Edad: " + edad + ".";
	}
	
	
}
