package ejercicio2;

public class ProductoFresco extends Producto{

	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco() {
		super();
		fechaEnvasado = "12/12/2012";
		paisOrigen = "No tiene";
	}
	public ProductoFresco(String fecha, int Lote, String fechaEnv, String pais) {
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
		return super.toString() + "Fresco" + ", Fecha envasado: " + this.fechaEnvasado + ", Pais de origen: " + this.paisOrigen + ".";
	}
	
	
	
}
