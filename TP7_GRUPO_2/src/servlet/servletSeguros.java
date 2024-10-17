package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Seguro;
import entidades.TipoSeguro;
import negocioImpl.SeguroNegocioImpl;

/**
 * Servlet implementation class servletSeguros
 */
@WebServlet("/servletSeguros")
public class servletSeguros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servletSeguros() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("btnFiltrar") != null) {
	        int tipoSeguroId = Integer.parseInt(request.getParameter("tipoSeguro")); // ID del tipo de seguro seleccionado

	        SeguroNegocioImpl sNeg = new SeguroNegocioImpl();
	        ArrayList<Seguro> listaFiltrada = (ArrayList<Seguro>) sNeg.filtrarPorTipoSeguro(tipoSeguroId); // Llamada al m�todo de filtrado en la capa de negocio

	        request.setAttribute("listaS", listaFiltrada);
	        RequestDispatcher rd = request.getRequestDispatcher("/ListarSeguros.jsp");
	        rd.forward(request, response);
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btnAceptar")!=null) {
			String error = validarFormulario(request);
			
			if (error != null) {
				request.setAttribute("error", error);
				RequestDispatcher rd = request.getRequestDispatcher("/FormularioSeguro.jsp");
				rd.forward(request, response);
				return;
			}
			
			Seguro s = new Seguro();
			s.setDescripcion(request.getParameter("txtDescripcion"));
			TipoSeguro tipoSeguro = new TipoSeguro();
			tipoSeguro.setIdTipo(Integer.parseInt(request.getParameter("tipoSeguro")));
			tipoSeguro.setDescripcion(request.getParameter("tipoDescripcion"));
		    s.setTipoSeguro(tipoSeguro);
			s.setCostoContratacion(Float.parseFloat(request.getParameter("txtCostoContratacion")));
			s.setCostoAsegurado(Float.parseFloat(request.getParameter("txtCostoMaxAsegurado")));
			
			SeguroNegocioImpl sNeg = new SeguroNegocioImpl();
			boolean estado = sNeg.insert(s);
			
			request.setAttribute("cantFilas", estado);
			RequestDispatcher rd = request.getRequestDispatcher("/Inicio.jsp");
			rd.forward(request, response);
		}
	}
	
	private String validarFormulario(HttpServletRequest request) {
		String descripcion = request.getParameter("txtDescripcion");
		String tipoSeguroId = request.getParameter("tipoSeguro");
		String tipoDescripcion = request.getParameter("tipoDescripcion");
		String costoContratacionStr = request.getParameter("txtCostoContratacion");
		String costoMaxAseguradoStr = request.getParameter("txtCostoMaxAsegurado");

		// Verifica que los campos no est�n vac�os
		if (descripcion == null || descripcion.trim().isEmpty()) {
			return "La descripci�n es obligatoria.";
		}
		if (tipoSeguroId == null || tipoSeguroId.trim().isEmpty()) {
			return "Debes seleccionar un tipo de seguro.";
		}
		if (tipoDescripcion == null || tipoDescripcion.trim().isEmpty()) {
			return "La descripci�n del tipo de seguro es obligatoria.";
		}
		if (costoContratacionStr == null || costoContratacionStr.trim().isEmpty()) {
			return "El costo de contrataci�n es obligatorio.";
		}
		if (costoMaxAseguradoStr == null || costoMaxAseguradoStr.trim().isEmpty()) {
			return "El costo m�ximo asegurado es obligatorio.";
		}

		// Verificar que los campos num�ricos sean v�lidos
		try {
			Float.parseFloat(costoContratacionStr);
		} catch (NumberFormatException e) {
			return "El costo de contrataci�n debe ser un n�mero v�lido.";
		}
		try {
			Float.parseFloat(costoMaxAseguradoStr);
		} catch (NumberFormatException e) {
			return "El costo m�ximo asegurado debe ser un n�mero v�lido.";
		}

		// Si todo est� correcto, devolver null (sin errores)
		return null;
	}

}
