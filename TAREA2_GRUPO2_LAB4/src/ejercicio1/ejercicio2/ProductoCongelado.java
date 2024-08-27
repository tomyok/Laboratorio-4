package ejercicio2;

public class ProductoCongelado extends Producto{
	
	private int temperaturaRecomendada;
	
	public ProductoCongelado() {
		super();
		temperaturaRecomendada = 0;
	}
	public ProductoCongelado(String fechaCaducidad, int nroDeLote, int temperaturaRecomendada) {
		super(fechaCaducidad, nroDeLote);
		this.temperaturaRecomendada=temperaturaRecomendada;
	}
	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Congelado" +", Temperatura recomendada: " + this.temperaturaRecomendada + ".";		
	}
}
