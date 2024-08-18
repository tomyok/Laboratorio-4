package PracticaInterfaces;

public class Main {

	public static void main(String[] args) {
		
		Argentina arg = new Argentina("River Plate");
		RiverPlate rvp = new RiverPlate("Argentina");
		Jugador j1 = new Jugador("Alberto Diaz", arg);
		
		System.out.println(j1.toString());
		
	}

}
