package EjemploLenguajesMenu;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelIngresoLenguajes extends JPanel {

	private DefaultListModel<Lenguajes> listModel;
	private JTextField txtNombre;
	private JTextField txtDificultad;
	private JButton btnAgregar;

	/**
	 * Create the panel.
	 */
	public PanelIngresoLenguajes() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre.setBounds(15, 96, 144, 20);
		add(lblNombre);
		
		JLabel lblDificultad = new JLabel("Dificultad :");
		lblDificultad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDificultad.setBounds(15, 131, 144, 20);
		add(lblDificultad);
		
		JLabel lblAgregarLenguajeDe = new JLabel("Agregar Lenguaje De Programaci\u00F3n");
		lblAgregarLenguajeDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarLenguajeDe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAgregarLenguajeDe.setBounds(-10, 16, 450, 27);
		add(lblAgregarLenguajeDe);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(132, 94, 146, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDificultad = new JTextField();
		txtDificultad.setBounds(132, 129, 146, 26);
		add(txtDificultad);
		txtDificultad.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtNombre.getText().isEmpty() && !txtDificultad.getText().isEmpty()) {
					
				Lenguajes aux = new Lenguajes(txtNombre.getText(), txtDificultad.getText());
				listModel.addElement(aux);
				
				txtNombre.setText("");
				txtDificultad.setText("");
				}
			}
		});
		btnAgregar.setBounds(293, 129, 115, 29);
		add(btnAgregar);

	}

	public void setDefaultListModel(DefaultListModel<Lenguajes> listModel) {
		
		this.listModel = listModel;
		
	}
}
