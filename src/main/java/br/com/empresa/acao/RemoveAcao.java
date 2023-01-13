package br.com.empresa.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.empresa.model.Banco;

public class RemoveAcao {

	public void executa(HttpServletRequest request, HttpServletResponse reponse) {
		
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
	}
	
	

}
