package br.com.empresa.gerenciamento;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.empresa.acao.ListaAcao;
import br.com.empresa.acao.MostraAcao;
import br.com.empresa.acao.RemoveAcao;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/unicaEntrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListaEmpresa")) {
			ListaAcao listaAcao = new ListaAcao();
			listaAcao.executa(request, response);
			
			
		} else if(paramAcao.equals("RemovaEmpresas")) {
			RemoveAcao removeAcao = new RemoveAcao();
			removeAcao.executa(request, response);
			
		} else if(paramAcao.equals("MostraEmpresas")) {
			MostraAcao mostraAcao = new MostraAcao();
			mostraAcao.executa(request, response);
		}
	}

}
