package ejercicio1;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class PanelAgregarPeliculas extends JPanel {
	private JTextField txtNombrePelicula;
	private JComboBox<Categoria> generos;
	private Peliculas aux;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPeliculas() {
		setLayout(null);
		aux= new Peliculas();
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(111, 62, 33, 16);
		add(lblId);
		
		JLabel lblIDPelicula = new JLabel("");
		lblIDPelicula.setBounds(205, 62, 56, 16);
		lblIDPelicula.setText(Integer.toString(aux.getId()));
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
		
		JComboBox cBoxGenero = new JComboBox<Categoria>();
		cBoxGenero.setBounds(215, 145, 150, 22);
		add(cBoxGenero);
		cBoxGenero.addItem(new Categoria(0, "Seleccione un genero"));
		cBoxGenero.addItem(new Categoria(1, "Terror"));
		cBoxGenero.addItem(new Categoria(2, "Accion"));
		cBoxGenero.addItem(new Categoria(3, "Suspenso"));
		cBoxGenero.addItem(new Categoria(4, "Romantica"));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(164, 203, 97, 25);
		add(btnAceptar);

	}
}
