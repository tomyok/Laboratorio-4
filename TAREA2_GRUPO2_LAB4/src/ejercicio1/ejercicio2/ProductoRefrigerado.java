package ejercicio2;

public class ProductoRefrigerado extends Producto{
	
	private String codigoOrganismo;
	
	public ProductoRefrigerado() {
		super();
		codigoOrganismo = "0000";
	}
	public ProductoRefrigerado(String fechaCaducidad, int nroDeLote, String codigoOrganismo) {
		super(fechaCaducidad, nroDeLote);
		this.codigoOrganismo=codigoOrganismo;
	}
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}
	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

}
