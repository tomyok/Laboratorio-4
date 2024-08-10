package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado ej1 = new Empleado("Jose Nahuel", 26);
		Empleado ej2 = new Empleado();
		Empleado ej3 = new Empleado("Jose Matias", 28);
		Empleado ej4 = new Empleado();
		Empleado ej5 = new Empleado("Jose Tobias", 30);
		
		System.out.println(ej1.toString());
		System.out.println(ej2.toString());
		System.out.println(ej3.toString());
		System.out.println(ej4.toString());
		System.out.println(ej5.toString());
		System.out.println("El proximo ID sera el N°"+Empleado.devuelveProximoID());
	}

}
