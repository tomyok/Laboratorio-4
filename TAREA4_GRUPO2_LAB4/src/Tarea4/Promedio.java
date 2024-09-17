package Tarea4;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        
        JLabel lblNotasDelEstudiante = new JLabel("Notas del estudiante");
        lblNotasDelEstudiante.setBackground(Color.WHITE);
        lblNotasDelEstudiante.setBounds(58, 11, 99, 24);
        contentPane.add(lblNotasDelEstudiante);
        
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
        
        JSeparator separator = new JSeparator();
        separator.setForeground(SystemColor.activeCaption);
        separator.setBounds(160, 24, 149, 2);
        contentPane.add(separator);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(SystemColor.activeCaption);
        separator_2.setOrientation(SwingConstants.VERTICAL);
        separator_2.setBounds(40, 24, 2, 186);
        contentPane.add(separator_2);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(SystemColor.activeCaption);
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBounds(309, 24, 2, 186);
        contentPane.add(separator_1);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setForeground(SystemColor.activeCaption);
        separator_3.setBounds(40, 210, 269, 2);
        contentPane.add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setForeground(SystemColor.activeCaption);
        separator_4.setBounds(41, 24, 10, 2);
        contentPane.add(separator_4);
        
        JLabel label = new JLabel("Notas del estudiante");
        label.setBackground(Color.WHITE);
        label.setBounds(58, 222, 108, 24);
        contentPane.add(label);
        
        JSeparator separator_5 = new JSeparator();
        separator_5.setForeground(SystemColor.activeCaption);
        separator_5.setBounds(160, 233, 148, 2);
        contentPane.add(separator_5);
        
        JSeparator separator_6 = new JSeparator();
        separator_6.setForeground(SystemColor.activeCaption);
        separator_6.setBounds(41, 233, 10, 2);
        contentPane.add(separator_6);
        
        JSeparator separator_7 = new JSeparator();
        separator_7.setOrientation(SwingConstants.VERTICAL);
        separator_7.setForeground(SystemColor.activeCaption);
        separator_7.setBounds(308, 233, 2, 86);
        contentPane.add(separator_7);
        
        JSeparator separator_8 = new JSeparator();
        separator_8.setOrientation(SwingConstants.VERTICAL);
        separator_8.setForeground(SystemColor.activeCaption);
        separator_8.setBounds(40, 233, 2, 86);
        contentPane.add(separator_8);
        
        JSeparator separator_9 = new JSeparator();
        separator_9.setForeground(SystemColor.activeCaption);
        separator_9.setBounds(40, 319, 269, 2);
        contentPane.add(separator_9);
        
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
        
        setTitle("Promedio:");
}
}
