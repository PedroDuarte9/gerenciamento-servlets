package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.empresa.model.Banco;
import br.com.empresa.model.Empresa;

/**
 * Servlet implementation class AlterarEmpresasServlet
 */
@WebServlet("/alterarEmpresas")
public class AlterarEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramName = request.getParameter("parametro");
		
		String paramDat = request.getParameter("data");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Date paramData = null; 
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			paramData = sdf.parse(paramDat);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaPeloId(id);
		
		empresa.setName(paramName);
		empresa.setData(paramData);
		
		
		response.sendRedirect("listaEmpresas");
		
		
		
	}

}
