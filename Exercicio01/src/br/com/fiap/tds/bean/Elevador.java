package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos
	public int andar, totalAndares, totalPessoas, capacidade;
	
	//Métodos
	public void inicializa(int totalAndares, int capacidade) {
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public int entra() {
		// ++x -> primeiro incrementa e depois utiliza o valor
		// x++ -> primeiro utiliza o valor e depois incrementa
		int valor = ++totalPessoas; 
		//totalPessoas = totalPessoas + 1;
		//totalPessoas += 1;
		return valor;
	}
	
	public int sai() {
		int valor = --totalPessoas; 
		//totalPessoas = totalPessoas - 1;
		//totalPessoas -= 1;
		return valor;
	}
	
	public void sobe() {
		andar++;
	}
	
	public void desce() {
		andar--;
	}
	
}
