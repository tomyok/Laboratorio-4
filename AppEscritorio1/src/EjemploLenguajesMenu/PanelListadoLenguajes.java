package EjemploLenguajesMenu;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PanelListadoLenguajes extends JPanel {

	private JList<Lenguajes> list;
	private DefaultListModel<Lenguajes> listModel;
	/**
	 * Create the panel.
	 */
	public PanelListadoLenguajes() {
		setLayout(null);
		
		list = new JList<Lenguajes>();
		list.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 18));
		list.setBounds(15, 61, 400, 150);
		add(list);
		
		JLabel lblNewLabel = new JLabel("Listado De Lenguajes De Programaci\u00F3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(15, 16, 400, 29);
		add(lblNewLabel);

	}
	public DefaultListModel<Lenguajes> getListModel() {
		return listModel;
	}
	public void setListModel(DefaultListModel<Lenguajes> listModel) {
		this.listModel = listModel;
		list.setModel(this.listModel);
	}
}
