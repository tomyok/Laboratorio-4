package Dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		Usuario us1 = new Usuario("Jorgelina","Ramirez");
		
		/*int filas = usuarioDAO.agregarUsuario(us1);
		
		if(filas==1) {
			System.out.println("Usuario agregado a la DB correctamente.");
		} else {
			System.out.println("Usuario no agregado a la DB.");
		}
		*/
		
		ArrayList<Usuario> lista = usuarioDAO.obtenerListadoUsuarios();
		
		for(Usuario us : lista) {
			System.out.println(us.toString());
		}
		
		usuarioDAO.agregarUsuarioSP(us1);
	}

}
