package Tarea4;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionMultiple extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoras;
	private String seleccion;
	private String especialidad;
	private String sistema;


	public SeleccionMultiple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 343);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEligeUnSistema = new JLabel("Elige un sistema operativo");
		lblEligeUnSistema.setBounds(38, 38, 167, 16);
		contentPane.add(lblEligeUnSistema);

		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(222, 34, 81, 25);
		contentPane.add(rdbtnWindows);

		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(311, 34, 62, 25);
		contentPane.add(rdbtnMac);

		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(377, 34, 74, 25);
		contentPane.add(rdbtnLinux);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnMac);
		grupo.add(rdbtnLinux);

		JPanel panel = new JPanel();
		panel.setBounds(20, 11, 441, 68);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 90, 441, 133);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		contentPane.add(panel_1);

		JLabel lblEligeUnaEspecialidad = new JLabel("Elige una especialidad");

		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");

		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");

		JCheckBox chckbxDisenoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblEligeUnaEspecialidad)
						.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxDisenoGrafico)
								.addComponent(chckbxProgramacion)
								.addComponent(chckbxAdministracin))
						.addGap(149))
				);
		gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(25)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEligeUnaEspecialidad)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(chckbxProgramacion)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(chckbxAdministracin)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(chckbxDisenoGrafico)
						.addContainerGap(27, Short.MAX_VALUE))
				);
		panel_1.setLayout(gl_panel_1);

		JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");
		lblHoras.setBounds(140, 237, 243, 14);
		contentPane.add(lblHoras);

		txtHoras = new JTextField();
		txtHoras.setBounds(375, 234, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);

		JLabel lblError = new JLabel("");
		lblError.setBounds(20, 274, 146, 14);
		contentPane.add(lblError);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				boolean hayError = false;
				especialidad = "";

				if(chckbxProgramacion.isSelected()) {
					especialidad += chckbxProgramacion.getText() + " - ";
				}
				if(chckbxAdministracin.isSelected()) {
					especialidad += chckbxAdministracin.getText()+ " - ";				
				}
				if(chckbxDisenoGrafico.isSelected()) {
					especialidad += chckbxDisenoGrafico.getText() + " - ";				
				}
				if(!chckbxProgramacion.isSelected() && !chckbxDisenoGrafico.isSelected() && !chckbxAdministracin.isSelected()) {
					hayError = true;
				}

				if(rdbtnWindows.isSelected()) {
					sistema = rdbtnWindows.getText();
				}
				else {
					if(rdbtnMac.isSelected()) {
						sistema = rdbtnMac.getText();
					}
					else {
						if(rdbtnLinux.isSelected()) {
							sistema = rdbtnLinux.getText();
						}
						else {
							hayError = true;
						}
					}
				}

				if(txtHoras.getText().isEmpty()) {
					hayError = true;
				}

				seleccion = sistema + " - " + especialidad + txtHoras.getText();

				if(!hayError)
				{
					Mensaje mensaje = new Mensaje(seleccion);
					mensaje.setVisible(true);
					lblError.setText("");
				}
				else {
					lblError.setText("Falta completar campos");
					lblError.setForeground(Color.red);
				}
			}
		});
		btnAceptar.setBounds(372, 270, 89, 23);
		contentPane.add(btnAceptar);

		setTitle("Selección múltiple");
	}
}
