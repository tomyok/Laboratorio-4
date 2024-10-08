package Presentacion.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Entidad.Persona;
import Negocio.PersonaNegocio;
import NegocioImpl.PersonaNegocioImpl;
import Presentacion.Vista.PanelAgregar;
import Presentacion.Vista.VentanaPrincipal;

public class Controlador implements ActionListener{

	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregar pnlIngresoPersonas;
	private PersonaNegocio pNeg;
	
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg) {
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		this.pnlIngresoPersonas = new PanelAgregar();
		
		this.ventanaPrincipal.getMntAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		
		this.pnlIngresoPersonas.getBtnAceptar().addActionListener(a->EventoClickBoton_AgregarPesona_PanelAgregarPersonas(a));
	}
	
	
	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}


	private void EventoClickBoton_AgregarPesona_PanelAgregarPersonas(ActionEvent a) {
		String nombre = this.pnlIngresoPersonas.getTxtNombre().getText();
		String apellido = this.pnlIngresoPersonas.getTxtApellido().getText();
		String dni = this.pnlIngresoPersonas.getTxtDni().getText();
		if(!nombre.isEmpty() && !apellido.isEmpty() && !dni.isEmpty()) {
			Persona persona = new Persona();
			persona = this.pNeg.readDni(dni);
			if (persona.getDni() == null) {
				persona.setDni(dni);
				persona.setApellido(apellido);
				persona.setNombre(nombre);
				
				boolean estado = this.pNeg.insert(persona);
				
				if(estado) {
					JOptionPane.showMessageDialog(null, "Persona agregada correctamente");
					this.pnlIngresoPersonas.getTxtNombre().setText("");
					this.pnlIngresoPersonas.getTxtApellido().setText("");
					this.pnlIngresoPersonas.getTxtDni().setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Error al guardar");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe una persona con ese DNI. Revise los datos ingresados");						
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos");
		}
	}

public void inicializar()
{
	this.ventanaPrincipal.setVisible(true);;
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
