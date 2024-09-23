package Tarea4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Contactos contactos;
	private Promedio promedio;
	private SeleccionMultiple seleccMultiple;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGrupoNro = new JLabel("Grupo Nro: 2");
		lblGrupoNro.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblGrupoNro.setBounds(15, 33, 154, 29);
		contentPane.add(lblGrupoNro);

		JButton btnEjercicio_1 = new JButton("Ejercicio 1");
		btnEjercicio_1.addActionListener(new btnEjercicio_1());
		btnEjercicio_1.setBounds(145, 78, 115, 29);
		contentPane.add(btnEjercicio_1);

		JButton btnEjercicio_2 = new JButton("Ejercicio 2");
		btnEjercicio_2.addActionListener(new btnEjercicio_2());
		btnEjercicio_2.setBounds(145, 123, 115, 29);
		contentPane.add(btnEjercicio_2);

		JButton btnEjercicio_3 = new JButton("Ejercicio 3");
		btnEjercicio_3.addActionListener(new btnEjercicio_3());
		btnEjercicio_3.setBounds(145, 168, 115, 29);
		contentPane.add(btnEjercicio_3);
	}

	class btnEjercicio_1 implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			if(contactos == null || !contactos.isVisible()) {
				contactos = new Contactos();
				contactos.setVisible(true);		
			}
			else {
				contactos.toFront();
			}
		}		
	}

	class btnEjercicio_2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(promedio == null) {
				promedio = new Promedio();
				promedio.setVisible(true);
			}
			else {
				promedio.toFront();
			}
		}
	}

	class btnEjercicio_3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(seleccMultiple == null) {
				seleccMultiple = new SeleccionMultiple();
				seleccMultiple.setVisible(true);
			}
			else {
				seleccMultiple.toFront();
			}
		}
	}
}
