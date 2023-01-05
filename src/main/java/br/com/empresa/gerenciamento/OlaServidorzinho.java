package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ooi")
public class OlaServidorzinho extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter mostra = resp.getWriter();
		mostra.println("<html><body>Olá mundo, primeiro servlet.</body></html>");
		
		System.out.println("O Servlet OlaServidorzinho foi chamado");
		
	}
}
