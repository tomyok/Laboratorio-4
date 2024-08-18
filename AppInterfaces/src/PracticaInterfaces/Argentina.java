package PracticaInterfaces;

public class Argentina implements IEquipo{

	private String nombreClub;

	public Argentina() {
		
	}
	
	public Argentina(String nombreClub) {
		super();
		this.nombreClub = nombreClub;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	@Override
	public String toString() {
		return "Argentina nombreClub = " + nombreClub + ".";
	}

	@Override
	public String estadisticas() {
		return "Aca hay estadisticas del club.";
	}
	
	
	
	
}
