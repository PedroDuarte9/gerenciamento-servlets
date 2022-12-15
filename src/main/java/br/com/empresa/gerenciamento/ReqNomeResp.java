package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqNomeResp
 */
@WebServlet("/req-nome-resp")
public class ReqNomeResp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String entrada = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(entrada);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter saida = response.getWriter();
		saida.println("<html><body><h2>Nome da empresa: " + entrada + " este será o nome que foi passado.</h2></body></html>");
		
		System.out.println("O Servlet foi executado.");
	}

}
