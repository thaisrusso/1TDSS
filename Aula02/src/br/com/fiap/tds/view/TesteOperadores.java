package br.com.fiap.tds.view;

import java.util.Scanner;

public class TesteOperadores {

	public static void main(String[] args) {
		
		//Declarar uma variavel para armazenar o objeto que le o teclado
		//new -> instancia uma classe -> para obter o Objeto
		Scanner leitor = new Scanner(System.in);
		
		//Ler um número inteiro
		System.out.print("Digite um número:");
		int x = leitor.nextInt();
		
		//Ler outro número inteiro
		System.out.print("Digite outro número:");
		int y = leitor.nextInt(); 
		
		//Exibir a subtração dos dois números
		//x -= y;
		System.out.println("A subtração é " + (x - y));
		
		// x = 50;
		
		x /=10; // x = x / 10;
		System.out.println("A divisão é " + x); // x = 5;
		
		// x = 5;
		
		x *=10; // x = x * 10;
		System.out.println("A multiplicação é " + x); // x = 50;
		
		// x = 50;
		
		x %=10; // x = x % 10;
		System.out.println("O resto da divisão é " + x); // x = 0;
		
		//Fechar o leitor
		leitor.close();
		
	}
	
}



