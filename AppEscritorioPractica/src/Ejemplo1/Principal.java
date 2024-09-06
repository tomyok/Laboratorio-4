package Ejemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setLocation(350,350);
		//frame.setBounds(350, 350, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AppEscritorio");
		frame.setVisible(true);
		
		JButton boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10,15,140,50);
		
		frame.setLayout(null);
		frame.getContentPane().add(boton);
		
	}

}
