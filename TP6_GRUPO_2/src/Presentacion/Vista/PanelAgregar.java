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
	private JButton btnAceptar;
	/**
	 * Create the panel.
	 */
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}
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
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(37, 181, 89, 23);
		add(btnAceptar);
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}
	public JTextField getTxtDni() {
		return txtDni;
	}
	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}
}
