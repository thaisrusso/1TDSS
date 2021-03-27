package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		//Ler a capacidade e o total de andares
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a capacidade:");
		int cap = leitor.nextInt();
		
		System.out.println("Digite o total de andares:");
		int andares = leitor.nextInt();
		
		//Instanciar um Elevador
		Elevador elevador = new Elevador();
		
		//Atribuir os valores no objeto 
		elevador.inicializa(andares, cap);
		
		//Subir
		elevador.sobe();
		
		//Descer
		elevador.desce();
		
		//Subir
		elevador.sobe();
		
		//Entrar
		elevador.entra();
		
		//Exibir os dados do elevador
		System.out.println("Total andares: " + elevador.totalAndares + 
				" Andar atual: " + elevador.andar + " Capacidade: " +
				elevador.capacidade + " Pessoas: " + elevador.totalPessoas);
		
		leitor.close();
	}
	
}