package Presentacion.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

import Entidad.Persona;
import Negocio.PersonaNegocio;
import Presentacion.Vista.PanelAgregar;
import Presentacion.Vista.PanelEliminar;
import Presentacion.Vista.PanelListar;
import Presentacion.Vista.PanelModificar;
import Presentacion.Vista.VentanaPrincipal;

public class Controlador implements ActionListener{

	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregar pnlIngresoPersonas;
	private PanelModificar pnlModificar;
	private PanelEliminar pnlEliminar;
	private PanelListar pnlListar;
	private PersonaNegocio pNeg;
	
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg) {
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		// PANELES
		this.pnlIngresoPersonas = new PanelAgregar();
		this.pnlModificar = new PanelModificar();
		this.pnlEliminar = new PanelEliminar();
		this.pnlListar = new PanelListar();
		
		// EVENTOS MENÚ
		this.ventanaPrincipal.getMntAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		this.ventanaPrincipal.getMntModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
		this.ventanaPrincipal.getMntEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
		this.ventanaPrincipal.getMntListar().addActionListener(a->EventoClickMenu_AbrirPanel_ListaPersonas(a));
		
		// EVENTOS PANEL AGREGAR
		this.pnlIngresoPersonas.getBtnAceptar().addActionListener(a->EventoClickBoton_AgregarPersona_PanelAgregarPersonas(a));
		this.pnlIngresoPersonas.getTxtNombre().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char caracter = arg0.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					arg0.consume();
				}
			}
		});
		this.pnlIngresoPersonas.getTxtApellido().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					e.consume();
				}
			}
		});
		this.pnlIngresoPersonas.getTxtDni().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isDigit(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE) {
					e.consume();
				}				
			}
		});
		
		//EVENTOS PANEL ELIMINAR
		this.pnlEliminar.getBtnEliminar().addActionListener(a->EventoClickBoton_EliminarPersona_PanelEliminarPersonas(a));
		
		//EVENTOS PANEL MODIFICAR
		this.pnlModificar.getBtnModificar().addActionListener(a->EventoClickBoton_ModificarPersona_PanelModificar(a));
		this.pnlModificar.getListaPersonas().addListSelectionListener(a->EventoClick_ElegirPersona_PanelModificar(a));
		this.pnlModificar.getTxtNombre().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char caracter = arg0.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					arg0.consume();
				}
			}
		});
		this.pnlModificar.getTxtApellido().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE && caracter != ' ') {
					e.consume();
				}
			}
		});
		this.pnlModificar.getTxtDni().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(!Character.isDigit(caracter) && caracter != KeyEvent.VK_BACK_SPACE && caracter != KeyEvent.VK_DELETE) {
					e.consume();
				}				
			}
		});
	}
	

	private void EventoClick_ElegirPersona_PanelModificar(ListSelectionEvent a) {
		Persona seleccion = (Persona) pnlModificar.getListaPersonas().getSelectedValue();
		
		if (seleccion != null) {
	        pnlModificar.getTxtNombre().setText(seleccion.getNombre());
	        pnlModificar.getTxtApellido().setText(seleccion.getApellido());
	        pnlModificar.getTxtDni().setText(seleccion.getDni());
	    } else {
	        pnlModificar.getTxtNombre().setText("");
	        pnlModificar.getTxtApellido().setText("");
	        pnlModificar.getTxtDni().setText("");
	    }
	}


	private void EventoClickBoton_ModificarPersona_PanelModificar(ActionEvent a) {
		Persona seleccion = (Persona) pnlModificar.getListaPersonas().getSelectedValue();
		seleccion.setNombre(pnlModificar.getTxtNombre().getText());
		seleccion.setApellido(pnlModificar.getTxtApellido().getText());
		if(pNeg.edit(seleccion)) {
			JOptionPane.showMessageDialog(null, "Persona modificada correctamente");
			pnlModificar.getTxtNombre().setText("");
			pnlModificar.getTxtApellido().setText("");
			pnlModificar.getTxtDni().setText("");
			
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlModificar);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
			
		} else {
			JOptionPane.showMessageDialog(null, "Error al modificar Persona");
		}
	}


	private void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a) {
		
	    List<Persona> personas = pNeg.readAll();
	    pnlEliminar.getListaPersonas().setListData(personas.toArray());
	    
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlEliminar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}


	private void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a) {
		List<Persona> personas = pNeg.readAll();
		pnlModificar.getListaPersonas().setListData(personas.toArray());
		
		JList<Persona> listaPersonas = pnlModificar.getListaPersonas();

		if (listaPersonas.getModel().getSize() > 0) {
		    listaPersonas.setSelectedIndex(0);
		}
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlModificar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
		
	}



	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	

	private void EventoClickBoton_AgregarPersona_PanelAgregarPersonas(ActionEvent a) {
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
	
	private void EventoClickBoton_EliminarPersona_PanelEliminarPersonas(ActionEvent a) {
		Persona seleccion = (Persona) pnlEliminar.getListaPersonas().getSelectedValue();

		if(seleccion != null) {
			boolean estado = this.pNeg.delete(seleccion);
			
			if(estado) {
				JOptionPane.showMessageDialog(null, "Persona eliminada correctamente");	
			    List<Persona> personas = pNeg.readAll();
			    pnlEliminar.getListaPersonas().setListData(personas.toArray());
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Ocurrió un error. Vuelva a intentarlo más tarde");					
			}
		}
		else {		
			JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");	
		}
	}
	
	public void cargarTabla(List<Persona> personas ) {
		
		DefaultTableModel tableModel = pnlListar.getTableModel();
		tableModel.setRowCount(0);
	
		for (Persona persona : personas) {
			tableModel.addRow(new Object[]{persona.getNombre(), persona.getApellido(), persona.getDni()});
		}
	}

	private void EventoClickMenu_AbrirPanel_ListaPersonas(ActionEvent a) {
		 
	    List<Persona> personas = pNeg.readAll();
	    cargarTabla(personas);
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlListar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
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
