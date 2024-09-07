package Ejemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JButton boton;
	private JTextField txtTexto;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("AppEscritorio2");

		txtTexto = new JTextField();
		txtTexto.setColumns(10);
		txtTexto.setBounds(63,33,200,36);
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10,15,140,50);
		boton.addActionListener(new eventoBoton(txtTexto));
		
		
		getContentPane().add(boton);
		getContentPane().add(txtTexto);
		
		setLayout(null);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
	
}

class eventoBoton implements ActionListener{

	private JTextField txtTexto;
	
	public eventoBoton(JTextField txt){
		txtTexto = txt;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Hola, " + txtTexto.getText());
		
	}
	
}
