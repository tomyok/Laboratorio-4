package PracticaInterfaces;

public class RiverPlate implements IEquipo{

	private String nombrePais;

	public RiverPlate() {
		
	}
	
	public RiverPlate(String nombrePais) {
		super();
		this.nombrePais = nombrePais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	@Override
	public String toString() {
		return "RiverPlate nombrePais = " + nombrePais + ".";
	}

	@Override
	public String estadisticas() {
		return "Aca hay estadisticas del club.";
	}
	
	
	
}
