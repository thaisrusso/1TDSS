package br.com.fiap.tds.bean;

public class Produto {

	//Atributos
	//Tipo primitivo -> armazena somente o valor
	double preco, desconto;
	
	double imposto;
	
	int quantidade;
	
	boolean disponivel;
	
	char tamanho = 'M'; // char -> aspas simples
	
	//Tipos por refer�ncia -> utiliza uma classe como atributo
	String nome = "Telefone"; // String -> aspas duplas
	
}
