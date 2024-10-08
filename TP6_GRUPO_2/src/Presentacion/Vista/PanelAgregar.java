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

public class PanelAgregar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;

	/**
	 * Create the panel.
	 */
	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 53, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(37, 90, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(37, 130, 46, 14);
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
		txtNombre.setBounds(93, 50, 184, 20);
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
		txtApellido.setBounds(93, 87, 184, 20);
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
		txtDni.setBounds(93, 127, 184, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtDni.getText().isEmpty()) {
					String dni = txtDni.getText();
					Persona persona = new Persona();
					PersonaNegocioImpl pNeg = new PersonaNegocioImpl();
					persona = pNeg.readDni(dni);
					if (persona.getDni() == null) {
						persona.setDni(dni);
						persona.setApellido(txtNombre.getText());
						persona.setNombre(txtApellido.getText());
						
						boolean estado = pNeg.insert(persona);
						
						if(estado) {
							JOptionPane.showMessageDialog(null, "Persona agregada correctamente");
							txtNombre.setText("");
							txtApellido.setText("");
							txtDni.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al guardar");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Ya existe una persona con ese DNI. Revise los datos ingresados");						
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos");
				}
			}
		});
		btnAceptar.setBounds(37, 181, 89, 23);
		add(btnAceptar);
	}
}
