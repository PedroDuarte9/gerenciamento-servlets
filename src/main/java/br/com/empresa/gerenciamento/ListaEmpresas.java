package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresas
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Empresas");
		
		String parametro = request.getParameter("parametro");
		
		Empresa empresa = new Empresa();
		empresa.setName(parametro);
				
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		List<Empresa> list = banco.getListagem();
		request.setAttribute("atributo", list);
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresass.jsp");
		
		rd.forward(request, response);
		
		
	}

}
