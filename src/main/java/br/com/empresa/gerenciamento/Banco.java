package br.com.empresa.gerenciamento;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		
		System.out.println(empresa);
		
	}

	public List<Empresa> getListagem(){
		return Banco.lista;
	}
}
