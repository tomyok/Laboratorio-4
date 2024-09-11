package Ejemplo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ejemplo2.Categorias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JList list;
	private DefaultListModel<Categorias> defaultListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(44, 35, 69, 20);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(44, 82, 69, 20);
		contentPane.add(lblNombre);
		
		txtId = new JTextField();
		txtId.setBounds(128, 32, 146, 26);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(128, 79, 146, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
			if(list.getSelectedIndex()!=-1) {
				//Se selecciono un elemto del JList
				JOptionPane.showMessageDialog(null, "Se elimino la categoria: " + ((Categorias)defaultListModel.getElementAt(list.getSelectedIndex())).getNombre());
				defaultListModel.remove(list.getSelectedIndex());
			}
				
			}
		});
		list.setBounds(44, 160, 401, 114);
		
		defaultListModel = new DefaultListModel<Categorias>();
		list.setModel(defaultListModel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Categorias cate = new Categorias();
				cate.setId(Integer.parseInt(txtId.getText()));
				cate.setNombre(txtNombre.getText());
				defaultListModel.addElement(cate);
				
				
			}
		});
		btnAceptar.setBounds(330, 50, 115, 29);
		contentPane.add(btnAceptar);
		
		
		contentPane.add(list);
	}
}
