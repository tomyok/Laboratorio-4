package Presentacion.Vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelListar extends JPanel {

	private JTable table;
	private DefaultTableModel tableModel;
	
	public PanelListar() {
		setLayout(null);
		
		String [] nombresColumnas= {"Nombre", "Apellido","DNI"};
		tableModel = new DefaultTableModel(nombresColumnas, 0);
		
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(40, 58, 382, 174);
		add(scrollPane);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}

}
