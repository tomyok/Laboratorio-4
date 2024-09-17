package Tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Contactos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private String resultado = "Los datos ingresados fueron: ";

	public Contactos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(150, 150, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(51, 36, 50, 16);
        contentPane.add(lblNombre);
        
        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(51, 79, 56, 16);
        contentPane.add(lblApellido);
        
        JLabel lblTelfono = new JLabel("Tel\u00E9fono");
        lblTelfono.setBounds(51, 121, 56, 16);
        contentPane.add(lblTelfono);
        
        JLabel lblFechaNac = new JLabel("Fecha Nac.");
        lblFechaNac.setBounds(51, 167, 73, 16);
        contentPane.add(lblFechaNac);
        
        txtNombre = new JTextField();
        txtNombre.setBackground(Color.WHITE);
        txtNombre.setBounds(149, 33, 166, 22);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(149, 76, 166, 22);
        contentPane.add(txtApellido);
        txtApellido.setColumns(10);
        
        txtTelefono = new JTextField();
        txtTelefono.setBounds(149, 118, 166, 22);
        contentPane.add(txtTelefono);
        txtTelefono.setColumns(10);
        
        txtFechaNac = new JTextField();
        txtFechaNac.setBounds(149, 164, 166, 22);
        contentPane.add(txtFechaNac);
        txtFechaNac.setColumns(10);
        
        JLabel lblMostrar = new JLabel(resultado);
        lblMostrar.setBounds(51, 310, 386, 40);
        contentPane.add(lblMostrar);
        
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		boolean hayError = false; 

                if(!txtNombre.getText().trim().equals("")) {
                    resultado += txtNombre.getText().trim() + " ";
                    txtNombre.setBackground(Color.WHITE); 
                } else {
                    txtNombre.setBackground(Color.RED);
                    hayError = true;
                }

                if(!txtApellido.getText().trim().equals("")) {
                    resultado += txtApellido.getText().trim() + " ";
                    txtApellido.setBackground(Color.WHITE);
                } else {
                    txtApellido.setBackground(Color.RED);
                    hayError = true;
                }

                if(!txtTelefono.getText().trim().equals("")) {
                    resultado += txtTelefono.getText().trim() + " ";
                    txtTelefono.setBackground(Color.WHITE);
                } else {
                    txtTelefono.setBackground(Color.RED);
                    hayError = true;
                }

                if(!txtFechaNac.getText().trim().equals("")) {
                    resultado += txtFechaNac.getText().trim() + " ";
                    txtFechaNac.setBackground(Color.WHITE);
                } else {
                    txtFechaNac.setBackground(Color.RED);
                    hayError = true;
                }

                
                if(!hayError) {
                    lblMostrar.setText(resultado);
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtTelefono.setText("");
                    txtFechaNac.setText("");
                } else {
                    resultado="Los datos ingresados fueron: ";
                }
            }
        });
        btnMostrar.setBounds(218, 199, 97, 25);
        contentPane.add(btnMostrar);
        
        setTitle("Contactos");
	}
}
