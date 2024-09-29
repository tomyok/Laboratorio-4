package ejercicio1;

import javax.swing.JPanel;

import javax.swing.JList;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

public class PanelListarPeliculas extends JPanel {
	
	private DefaultListModel<Pelicula> dlPeliculas;
	private JList<Pelicula> lista;

	/**
	 * Create the panel.
	 */
	public PanelListarPeliculas(DefaultListModel<Pelicula> dlPeliculas) {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setBounds(10, 101, 86, 14);
		add(lblPeliculas);
		
		ArrayList<Pelicula> arrayPelis = new ArrayList<>();
        for (int i = 0; i < dlPeliculas.size(); i++) {
            arrayPelis.add(dlPeliculas.getElementAt(i));
        }

        //ordenamiento burbuja:
        for (int i = 0; i < arrayPelis.size() - 1; i++) {
            for (int j = 0; j < arrayPelis.size() - 1 - i; j++) {
                if (arrayPelis.get(j).getNombre().compareToIgnoreCase(arrayPelis.get(j + 1).getNombre()) > 0) {
                    Pelicula temp = arrayPelis.get(j);
                    arrayPelis.set(j, arrayPelis.get(j + 1));
                    arrayPelis.set(j + 1, temp);
                }
            }
        }

        // Crear un nuevo DefaultListModel ordenado
        DefaultListModel<Pelicula> dlPeliculasOrdenadas = new DefaultListModel<>();
        for (Pelicula pelicula : arrayPelis) {
            dlPeliculasOrdenadas.addElement(pelicula);
        }
	              
		lista = new JList<Pelicula>(dlPeliculasOrdenadas);
		lista.setBounds(121, 11, 262, 198);
		add(lista);		
	}
}
