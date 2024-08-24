package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		this.cargo = "Sin cargo.";
		this.antiguedadDocente = 0;
	}
	
	public Profesor(String Nombre, int edad, String cargo, int antiguedadDocente) {
		super(Nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public int compareTo(Profesor o) {
		if(o.getEdad()>this.getEdad()) {
			return -1;
		}
		return 1;
	}
	
	
}
