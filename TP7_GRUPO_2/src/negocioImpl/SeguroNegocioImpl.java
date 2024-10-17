package negocioImpl;


import java.util.ArrayList;
import java.util.List;

import daoImpl.SeguroDaoImpl;
import entidades.Seguro;
import negocio.SeguroNegocio;

public class SeguroNegocioImpl implements SeguroNegocio{
	SeguroDaoImpl sdao= new SeguroDaoImpl();
		
public SeguroNegocioImpl() {
		
	}	

	@Override
	public boolean insert(Seguro seguro) {
		boolean estado = false;
		if(seguro.getDescripcion().trim().length()>0 && seguro.getTipoSeguro().getDescripcion().trim().length()>0 && 
				seguro.getCostoContratacion()>0 && seguro.getCostoAsegurado()>0) {
			estado = sdao.agregarSeguro(seguro);
		}
		return estado;
	}

	@Override
	public ArrayList<Seguro> readAll() {
		return sdao.obtenerSeguros();
	}

	@Override
	public List<Seguro> filtrarPorTipoSeguro(int tipoSeguroId) {
		return sdao.obtenerSegurosPorTipo(tipoSeguroId);
	}

}
