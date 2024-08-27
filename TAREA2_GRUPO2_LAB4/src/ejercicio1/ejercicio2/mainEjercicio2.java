package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		Producto producto = new Producto("25/12/2024", 512);
		ProductoCongelado prodCongelado = new ProductoCongelado("12/6/2025", 541, 24);
		ProductoFresco prodFresco = new ProductoFresco("18/11/2024", 12, "02/07/2024", "Argentina");
		ProductoRefrigerado prodRefrigerado = new ProductoRefrigerado("21/11/2025", 74, "CVE23");
				
		System.out.println(producto);
		System.out.println(prodCongelado);			
		System.out.println(prodFresco);
		System.out.println(prodRefrigerado);

	}

}
