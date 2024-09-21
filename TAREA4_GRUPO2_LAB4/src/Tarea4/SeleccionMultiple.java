package Tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class SeleccionMultiple extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoras;

	
	public SeleccionMultiple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 343);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setBounds(38, 38, 167, 16);
		contentPane.add(lblElijeUnSistema);
		
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
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		
		JCheckBox chckbxDisenoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblElijeUnaEspecialidad)
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
						.addComponent(lblElijeUnaEspecialidad)
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
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(372, 265, 89, 23);
		contentPane.add(btnAceptar);
		
			
		setTitle("Selección múltiple");
	}
}
