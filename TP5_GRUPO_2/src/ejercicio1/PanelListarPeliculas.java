package ejercicio1;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;

public class PanelListarPeliculas extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelListarPeliculas() {
		setLayout(null);
		
		JLabel lblPelculas = new JLabel("Pel\u00EDculas");
		lblPelculas.setBounds(10, 101, 86, 14);
		add(lblPelculas);
		
		JList list = new JList();
		list.setBounds(121, 11, 262, 198);
		add(list);
	}
}
