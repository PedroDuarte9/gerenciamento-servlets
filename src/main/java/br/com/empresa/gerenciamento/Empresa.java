package br.com.empresa.gerenciamento;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String name;
	private Date data = new Date();
	
	public Empresa () {
		
	}
	
	public Empresa(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Empresa " +  name + data;
	}
	
	
	
}
