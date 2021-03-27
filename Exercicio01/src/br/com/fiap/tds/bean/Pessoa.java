package br.com.fiap.tds.bean;

public class Pessoa {

	//Atributos
	public String nome;
	
	public int idade;
	
	public float altura;
	
	//Métodos
	public void alterarNome(String nome) {
		this.nome = nome; //this -> referencia a classe/objeto
	}
	
	public void alterarIdade(int idade) {
		this.idade = idade;
	}
	
	public void alterarAltura(float altura) {
		this.altura = altura;
	}
	
	public String obterNome() {
		return nome;
	}
	
	public int obterIdade() {
		return idade;
	}
	
	public float obterAltura() {
		return altura;
	}
	
	public void alterarTudo(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String obterTudo() {
		return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
	}
	
	
}