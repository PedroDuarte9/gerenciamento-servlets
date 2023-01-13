package br.com.empresa.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.empresa.model.Banco;
import br.com.empresa.model.Empresa;

public class MostraAcao {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id"); 
		
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.getEmpresaPeloId(id);
		
		System.out.println(empresa.getName());
		
		request.setAttribute("empresa", empresa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formularioEdit.jsp");
		rd.forward(request, response);
		
		
	}

	

}
