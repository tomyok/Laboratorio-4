package dao;



import java.util.ArrayList;

import entidades.Seguro;

public interface SeguroDao {

	public boolean agregarSeguro(Seguro seguro);
	public ArrayList<Seguro> obtenerSeguros();
	public ArrayList<Seguro> obtenerSegurosPorTipo(int tipoSeguroId);
}
