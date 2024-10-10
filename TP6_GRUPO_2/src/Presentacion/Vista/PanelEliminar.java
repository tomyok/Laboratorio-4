package Presentacion.Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

public class PanelEliminar extends JPanel {
	
	private JList listaPersonas;
	private JButton btnEliminar;
	
	public PanelEliminar() {
		setLayout(null);
		
		JLabel lblEliminarUsuarios = new JLabel("Eliminar usuarios");
		lblEliminarUsuarios.setBounds(184, 13, 113, 16);
		add(lblEliminarUsuarios);
		
		listaPersonas = new JList();
		listaPersonas.setBounds(142, 34, 196, 205);
		add(listaPersonas);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(142, 252, 196, 25);
		add(btnEliminar);
	}

	public JList getListaPersonas() {
		return listaPersonas;
	}
	public void setListaPersonas(JList listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	
}
