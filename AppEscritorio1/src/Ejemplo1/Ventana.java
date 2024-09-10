package Ejemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JComboBox<String> cbLocalidades;
	private JButton btnAceptar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbLocalidades = new JComboBox<String>();
		cbLocalidades.setBounds(39, 91, 140, 26);
		contentPane.add(cbLocalidades);
		
		cbLocalidades.addItem("Capital");
		cbLocalidades.addItem("Rio Cuarto");
		cbLocalidades.addItem("Rio tercero");
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Localidad seleccionada: " + cbLocalidades.getSelectedItem());
			}
		});
		btnAceptar.setBounds(208, 90, 115, 29);
		contentPane.add(btnAceptar);
	}
}
