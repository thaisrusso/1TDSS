package br.com.fiap.tds.bean;

public class Profissao {

	//Atributo
	
	private String nome;
	
	//Construtores
	
	public Profissao() {}
	
	public Profissao(String nome) {
		this.nome = nome;
	}
	
	//Métodos Getters/Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
