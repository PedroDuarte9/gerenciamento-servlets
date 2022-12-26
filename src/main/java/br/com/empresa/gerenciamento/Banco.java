package br.com.empresa.gerenciamento;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
		
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		lista.add(empresa1);
		lista.add(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);	
	}
	
	public List<Empresa> getEmpresas(){ //Esse método que retorna uma lista precisa ser criado nessa classe
		return Banco.lista;
	}
}
