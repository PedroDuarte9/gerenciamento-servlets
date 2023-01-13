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
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");
		
		String parameterName = request.getParameter("parametro");
		
		String dataParametro = request.getParameter("data");
		
		
		Date paramData = null; 
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			paramData = sdf.parse(dataParametro);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setName(parameterName);
		empresa.setData(paramData);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getName());
		
		response.sendRedirect("listaEmpresas");
		
		//Despachando a requisição para o JSP
		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");// Aqui eu informo o caminho JSP para onde vou despachar a requisição
//		request.setAttribute("empresa", empresa.getName()); //Aqui eu crio um apelido que será chamado na página JSP acima  e o objeto com see getName() ou qualquer get que for necessário 
//		rd.forward(request, response);//Aqui é a requisisção sendo enviada de fato para o JSP
	}

}
