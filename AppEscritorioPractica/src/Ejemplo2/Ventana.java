package Ejemplo2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private JButton boton;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("AppEscritorio2");
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10,15,140,50);
		
		getContentPane().add(boton);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
	
	
	
}
