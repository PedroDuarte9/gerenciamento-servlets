package br.com.empresa.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.empresa.model.Banco;
import br.com.empresa.model.Empresa;

public class ListaAcao {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		
		List<Empresa> list = banco.getListagem();
		
		request.setAttribute("atributo", list);
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresass.jsp");
		rd.forward(request, response);
		
	}
	

}
