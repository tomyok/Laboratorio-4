package Presentacion.Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnPersona;
	private JMenuItem mntAgregar;
	private JMenuItem mntModificar;
	private JMenuItem mntEliminar;
	private JMenuItem mntListar;
	private JPanel contentPane;

	public VentanaPrincipal() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 441);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPersona = new JMenu("Persona");
		menuBar.add(mnPersona);
		
		mntAgregar = new JMenuItem("Agregar");
		mnPersona.add(mntAgregar);
		
		mntModificar = new JMenuItem("Modificar");
		mntModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				PanelModificar panelModificar = new PanelModificar();
				contentPane.add(panelModificar);
				contentPane.repaint();
				contentPane.revalidate();				
			}
		});
		mnPersona.add(mntModificar);
		
		mntEliminar = new JMenuItem("Eliminar");
		mnPersona.add(mntEliminar);
		
		mntListar = new JMenuItem("Listar");
		mnPersona.add(mntListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}


	public JMenu getMnPersona() {
		return mnPersona;
	}


	public void setMnPersona(JMenu mnPersona) {
		this.mnPersona = mnPersona;
	}


	public JMenuItem getMntAgregar() {
		return mntAgregar;
	}


	public void setMntAgregar(JMenuItem mntAgregar) {
		this.mntAgregar = mntAgregar;
	}


	public JMenuItem getMntModificar() {
		return mntModificar;
	}


	public void setMntModificar(JMenuItem mntModificar) {
		this.mntModificar = mntModificar;
	}


	public JMenuItem getMntEliminar() {
		return mntEliminar;
	}


	public void setMntEliminar(JMenuItem mntEliminar) {
		this.mntEliminar = mntEliminar;
	}


	public JMenuItem getMntListar() {
		return mntListar;
	}


	public void setMntListar(JMenuItem mntListar) {
		this.mntListar = mntListar;
	}
	
	
}
