package Ejemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JButton boton;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("AppEscritorio2");
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10,15,140,50);
		boton.addActionListener(new eventoBoton());
		
		getContentPane().add(boton);
		
		setLayout(null);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
	
}

class eventoBoton implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Hiciste click");
		
	}
	
}
