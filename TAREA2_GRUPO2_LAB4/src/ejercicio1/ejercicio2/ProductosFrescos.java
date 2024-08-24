package ejercicio2;

public class ProductosFrescos extends Producto{

	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos() {
		super();
		fechaEnvasado = "12/12/2012";
		paisOrigen = "No tiene";
	}
	public ProductosFrescos(String fecha, int Lote, String fechaEnv, String pais) {
		super(fecha, Lote);
		fechaEnvasado = fechaEnv;
		paisOrigen = pais;
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	@Override
	public String toString() {
		return "ProductosFrescos" + super.toString() + ", fechaEnvasado: " + fechaEnvasado + ", paisOrigen: " + paisOrigen + ".";
	}
	
	
	
}
