package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva {

	private int tipoDeInstalacion;
	private double superficie;
	
	public Polideportivo() {
		tipoDeInstalacion = 0;
		superficie = 0;
	}

	public Polideportivo(int tipoDeInstalacion, double superficie) {
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficie = superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Polideportivo [tipoDeInstalacion=" + tipoDeInstalacion + ", superficie=" + superficie + "]";
	}

}
