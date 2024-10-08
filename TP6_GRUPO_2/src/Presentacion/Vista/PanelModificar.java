package Presentacion.Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Entidad.Persona;
import Negocio.PersonaNegocio;
import NegocioImpl.PersonaNegocioImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JList;

public class PanelModificar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;

	/**
	 * Create the panel.
	 */
	public PanelModificar() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 224, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(151, 224, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(290, 224, 46, 14);
		add(lblDni);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char caracter = arg0.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					arg0.consume();
				}
			}
		});
		txtNombre.setBounds(10, 237, 131, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					e.consume();
				}
			}
		});
		txtApellido.setBounds(150, 237, 131, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isDigit(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE) {
					e.consume();
				}				
			}
		});
		txtDni.setBounds(290, 237, 131, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(431, 236, 89, 23);
		add(btnModificar);
		
		JLabel lblSeleccione = new JLabel("Seleccione la persona que desea eliminar");
		lblSeleccione.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccione.setBounds(10, 11, 510, 14);
		add(lblSeleccione);
		
		JList list = new JList();
		list.setBounds(10, 36, 508, 176);
		add(list);
	}
}
