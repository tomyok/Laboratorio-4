package ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int numeroDeLote;
	
	public Producto() {
		fechaCaducidad = "29/12/2025";
		numeroDeLote = 0;
	}
	public Producto(String fecha, int Lote) {
		fechaCaducidad = fecha;
		numeroDeLote = Lote;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroDeLote() {
		return numeroDeLote;
	}
	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}
	@Override
	public String toString() {
		return "Producto fechaCaducidad: " + fechaCaducidad + ", numeroDeLote: " + numeroDeLote;
	}
	
}
