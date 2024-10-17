package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
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
