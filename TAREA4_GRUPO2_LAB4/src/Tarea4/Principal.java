package Tarea4;

import java.awt.BorderLayout;
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
		
		JButton btnEjercicio = new JButton("Ejercicio 1");
		btnEjercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contactos contactos = new Contactos();
				contactos.setVisible(true);
			}
		});
		btnEjercicio.setBounds(145, 78, 115, 29);
		contentPane.add(btnEjercicio);
		
		JButton btnEjercicio_1 = new JButton("Ejercicio 2");
		btnEjercicio_1.setBounds(145, 123, 115, 29);
		contentPane.add(btnEjercicio_1);
		
		JButton btnEjercicio_2 = new JButton("Ejercicio 3");
		btnEjercicio_2.setBounds(145, 168, 115, 29);
		contentPane.add(btnEjercicio_2);
	}
}
