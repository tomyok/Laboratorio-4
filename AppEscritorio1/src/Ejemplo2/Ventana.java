package Ejemplo2;

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

	private JPanel contentPane;
	private JComboBox<Categorias> cbCategorias;
	private JButton btnAceptar;

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

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbCategorias = new JComboBox<Categorias>();
		cbCategorias.setBounds(62, 107, 141, 26);
		contentPane.add(cbCategorias);
		
		cbCategorias.addItem(new Categorias(1, "Cocina"));
		cbCategorias.addItem(new Categorias(2, "Living"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showConfirmDialog(null, "Categoria: " + ((Categorias)cbCategorias.getSelectedItem()).getNombre());
				
			}
		});
		btnAceptar.setBounds(237, 106, 115, 29);
		contentPane.add(btnAceptar);
	}
}
