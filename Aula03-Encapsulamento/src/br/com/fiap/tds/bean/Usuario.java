package br.com.fiap.tds.bean;

/*
 * Modificadores de acesso:
 * - private -> somente a própria classe
 * ~ (sem modificador) default/package -> a própria classe e todos no mesmo pacote
 * # protected -> a própria classe, todos no mesmo pacote e as classes filhas
 * + public -> todos
 */

public class Usuario {

	//Atributos
	private String nome;
	
	private int idade;
	
	private boolean ativo;
	
	//Métodos
	public void logar() {
		
	}
	
	//Gets/Sets
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	//Quando for boolean -> getAtivo() ou isAtivo()
	public boolean isAtivo() {
		return ativo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}