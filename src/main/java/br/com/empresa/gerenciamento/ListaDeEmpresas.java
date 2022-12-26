package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaDeEmpresas
 * 
 * Essa classe é responsável por mostrar uma lista das empresas cadastradas no banco 
 * 
 */
@WebServlet("/listaDeEmpresas")
public class ListaDeEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> list = banco.getEmpresas(); //Está lista precisa ser criada na classe de referencia como um método para poder funcionar
		request.setAttribute("listaEmpresas", list);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");
		
		rd.forward(request, response);
		
		
		 
	}

}
