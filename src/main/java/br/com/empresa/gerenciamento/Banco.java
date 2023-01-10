package br.com.empresa.gerenciamento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static	{
		Empresa empresa = new Empresa();
		empresa.setName("Alura");
		empresa.setId(Banco.chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setName("Google");
		lista.add(empresa);
		lista.add(empresa2);
		
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
		System.out.println(empresa);
		
	}

	public List<Empresa> getListagem(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}	
	}
}
