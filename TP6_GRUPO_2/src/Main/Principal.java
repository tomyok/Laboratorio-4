package Main;

import Negocio.PersonaNegocio;
import NegocioImpl.PersonaNegocioImpl;
import Presentacion.Controlador.Controlador;
import Presentacion.Vista.VentanaPrincipal;



public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal vista = new VentanaPrincipal();
		PersonaNegocio pNeg = new PersonaNegocioImpl();
		Controlador controlador = new Controlador(vista, pNeg);
		controlador.inicializar();
	}
}
