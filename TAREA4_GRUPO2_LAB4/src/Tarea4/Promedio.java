package Tarea4;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Promedio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota3;
	private JTextField txtNota2;
	private JTextField txtNota1;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	public Promedio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPanel1 = new JLabel("Notas del estudiante", JLabel.CENTER);
		lblPanel1.setBackground(SystemColor.control);
		lblPanel1.setOpaque(true);
		lblPanel1.setBounds(58, 11, 108, 24);
		contentPane.add(lblPanel1);

		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(58, 46, 50, 16);
		contentPane.add(lblNota1);

		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(58, 89, 56, 16);
		contentPane.add(lblNota2);

		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(58, 132, 56, 16);
		contentPane.add(lblNota3);

		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(58, 175, 56, 16);
		contentPane.add(lblTPS);

		JComboBox<String> cbxTPS = new JComboBox<String>();
		cbxTPS.setMaximumRowCount(2);
		cbxTPS.setBounds(124, 173, 111, 20);
		contentPane.add(cbxTPS);
		cbxTPS.addItem("Aprobado");
		cbxTPS.addItem("Desaprobado");

		txtNota3 = new JTextField();
		txtNota3.setBounds(124, 130, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);

		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(124, 87, 86, 20);
		contentPane.add(txtNota2);

		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(124, 44, 86, 20);
		contentPane.add(txtNota1);

		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(58, 254, 108, 14);
		contentPane.add(lblPromedio);

		JLabel lblCondicion = new JLabel("Condici\u00F3n:");
		lblCondicion.setBounds(58, 294, 99, 14);
		contentPane.add(lblCondicion);

		txtPromedio = new JTextField();
		txtPromedio.setBounds(149, 251, 86, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);

		txtCondicion = new JTextField();
		txtCondicion.setBounds(149, 291, 86, 20);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);

		JLabel lblPanel2 = new JLabel("Notas del estudiante", JLabel.CENTER);
		lblPanel2.setBackground(SystemColor.control);
		lblPanel2.setOpaque(true);
		lblPanel2.setBounds(58, 227, 108, 16);
		contentPane.add(lblPanel2);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean hayError = false; 
				float suma=0;

				if(!txtNota1.getText().trim().equals("")) {
					try 
					{
						float valor = Float.parseFloat(txtNota1.getText().trim());
						suma += valor;  
						txtNota1.setBackground(Color.WHITE);
					} catch (NumberFormatException e1) {
						txtNota1.setBackground(Color.RED);
						hayError = true;
					}
				} else {
					txtNota1.setBackground(Color.RED);
					hayError = true;
				}

				if(!txtNota2.getText().trim().equals("")) {
					try 
					{
						float valor = Float.parseFloat(txtNota2.getText().trim());
						suma += valor;  
						txtNota2.setBackground(Color.WHITE);
					} catch (NumberFormatException e2) {
						txtNota2.setBackground(Color.RED);
						hayError = true;
					}
				} else {
					txtNota2.setBackground(Color.RED);
					hayError = true;
				}

				if(!txtNota3.getText().trim().equals("")) {
					try 
					{
						float valor = Float.parseFloat(txtNota3.getText().trim());
						suma += valor;  
						txtNota3.setBackground(Color.WHITE);
					} catch (NumberFormatException e3) {
						txtNota3.setBackground(Color.RED);
						hayError = true;
					}
				} else {
					txtNota3.setBackground(Color.RED);
					hayError = true;
				}


				if(!hayError) {
					float promedio = suma / 3;
					txtPromedio.setText(String.valueOf(promedio));

					// Validaciones de condicion.
					if(Integer.parseInt(txtNota1.getText().trim()) < 6 || Integer.parseInt(txtNota2.getText().trim()) < 6 || Integer.parseInt(txtNota3.getText().trim()) < 6) {
						txtCondicion.setText("Libre");
					}
					if(Integer.parseInt(txtNota1.getText().trim()) >= 6 && Integer.parseInt(txtNota2.getText().trim()) >= 6 && Integer.parseInt(txtNota3.getText().trim()) >= 6 && ((String)cbxTPS.getSelectedItem() == "Aprobado")) {
						txtCondicion.setText("Regular");
					}
					if(Integer.parseInt(txtNota1.getText().trim()) >= 8 && Integer.parseInt(txtNota2.getText().trim()) >= 8 && Integer.parseInt(txtNota3.getText().trim()) >= 8 && ((String)cbxTPS.getSelectedItem() == "Aprobado")) {
						txtCondicion.setText("Promocionado");
					}

					if((String)cbxTPS.getSelectedItem() == "Desaprobado") {
						txtCondicion.setText("Libre");
					}

				} else {
					//mostrar error.
					txtPromedio.setText("Error");
					txtCondicion.setText("Error");
				}


			}
		});
		btnCalcular.setBounds(343, 46, 120, 23);
		contentPane.add(btnCalcular);

		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
			}
		});
		btnNuevo.setBounds(343, 86, 120, 23);
		contentPane.add(btnNuevo);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(343, 129, 120, 23);
		contentPane.add(btnSalir);

		JPanel Panel1 = new JPanel();
		Panel1.setBorder(new LineBorder(SystemColor.inactiveCaption));
		Panel1.setBounds(40, 24, 269, 190);
		contentPane.add(Panel1);

		JPanel Panel2 = new JPanel();
		Panel2.setBorder(new LineBorder(SystemColor.inactiveCaption));
		Panel2.setBounds(40, 236, 269, 103);
		contentPane.add(Panel2);

		setTitle("Promedio:");
	}
}
