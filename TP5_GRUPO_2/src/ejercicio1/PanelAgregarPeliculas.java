package ejercicio1;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPeliculas extends JPanel {
	private JTextField txtNombrePelicula;
	private JComboBox<Categoria> cBoxGenero;
	private DefaultListModel<Pelicula> dlPeliculas;
	private Pelicula prox;
	

	/**
	 * Create the panel.
	 */
	public PanelAgregarPeliculas() {
		setLayout(null);
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(111, 62, 33, 16);
		add(lblId);
		
		JLabel lblIDPelicula = new JLabel(String.valueOf(Pelicula.devuelveProximoId()));
		lblIDPelicula.setBounds(205, 62, 56, 16);
		add(lblIDPelicula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(111, 103, 56, 16);
		add(lblNombre);
		
		txtNombrePelicula = new JTextField();
		txtNombrePelicula.setBounds(215, 91, 116, 22);
		add(txtNombrePelicula);
		txtNombrePelicula.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero: ");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(111, 148, 56, 16);
		add(lblGenero);
		
		cBoxGenero = new JComboBox<Categoria>();
		cBoxGenero.setBounds(215, 145, 150, 22);
		add(cBoxGenero);
		cBoxGenero.addItem(new Categoria(0, "Seleccione un genero"));
		cBoxGenero.addItem(new Categoria(1, "Terror"));
		cBoxGenero.addItem(new Categoria(2, "Accion"));
		cBoxGenero.addItem(new Categoria(3, "Suspenso"));
		cBoxGenero.addItem(new Categoria(4, "Romantica"));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if((!txtNombrePelicula.getText().isEmpty()) && (cBoxGenero.getSelectedItem().toString() != "Seleccione un genero")) {
			
				String nombre = txtNombrePelicula.getText();
				Categoria categoria = (Categoria) cBoxGenero.getSelectedItem();
				Pelicula aux = new Pelicula(nombre, categoria);
				dlPeliculas.addElement(aux);
				
				txtNombrePelicula.setText("");
				cBoxGenero.setSelectedIndex(0);
				lblIDPelicula.setText(String.valueOf(Pelicula.devuelveProximoId()));
			}else {
				JOptionPane.showMessageDialog(null, "No ingreso un titulo o falto seleccionar la categoria, verifiquelo");
			}
		
			}
		});
		btnAceptar.setBounds(164, 203, 97, 25);
		add(btnAceptar);

	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido)
	{
		this.dlPeliculas = listModelRecibido;
	}
}
