package EjemploLenguajesMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private static DefaultListModel<Lenguajes> listModel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					listModel = new DefaultListModel<Lenguajes>();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 430, 265);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnLanguage = new JMenu("Lenguajes");
		menuBar.add(mnLanguage);
		
		JMenuItem mntmAdd = new JMenuItem("Agregar Lenguajes");
		
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			contentPane.removeAll();
			PanelIngresoLenguajes panel = new PanelIngresoLenguajes();
			panel.setDefaultListModel(listModel);
			panel.setBounds(0, 0, 430, 265);
			contentPane.add(panel);
			contentPane.repaint();
			contentPane.revalidate();
				
			}
		});
		mnLanguage.add(mntmAdd);
		
		JMenuItem mntmSee = new JMenuItem("Lista De Lenguajes");
		
		mntmSee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			contentPane.removeAll();
			PanelListadoLenguajes panel = new PanelListadoLenguajes();
			panel.setListModel(listModel);
			panel.setBounds(0, 0, 430, 265);
			contentPane.add(panel);
			contentPane.repaint();
			contentPane.revalidate();
				
			}
		});
		mnLanguage.add(mntmSee);
	}
}
