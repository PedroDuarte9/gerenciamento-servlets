package br.com.empresa.gerenciamento;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/oi")
public class OlaServidorzinho extends HttpServlet  {
  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter saida = resp.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<h1>Olá Mundo, primeiro Servlet</h1>");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("O Servlet foi chamado");
	}
}
