package br.com.empresa.gerenciamento;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");
		
		String parameterName = request.getParameter("parametro");
		
		Empresa empresa = new Empresa();
		empresa.setName(parameterName);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//Despachando a requisição para o JSP
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");// Aqui eu informo o caminho JSP para onde vou despachar a requisição
		request.setAttribute("xpto", empresa.getName()); //Aqui eu crio um apelido que será chamado na página JSP acima  e o objeto com see getName() ou qualquer get que for necessário 
		rd.forward(request, response);//Aqui é a requisisção sendo enviada de fato para o JSP
	}

}
