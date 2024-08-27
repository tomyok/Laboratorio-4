package ejercicio3;

public class EdificioDeOficinas implements Edificio{

	private double superficie;
	
	public EdificioDeOficinas() {
		superficie = 0;
	}
	
	public EdificioDeOficinas(double superficie) {
		this.superficie = superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "EdificioDeOficinas [superficie=" + superficie + "]";
	}

}
