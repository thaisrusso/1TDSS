package br.com.fiap.tds.view;

public class TesteOperadores {

	public static void main(String[] args) {
		//Declarar duas variáveis do tipo int
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x + y;
		//Exibir o resultado da soma
		System.out.println("Soma: " + soma);
		
		//Realizar a subtração
		int subtracao = x - y;
		//Exibir o resultado da subtração
		System.out.println("Subtração: " + subtracao);
		
		//Realizar a multiplicação 
		int multiplicacao = x * y;
		//Exibir o resultado da multiplicação
		System.out.println("Multiplicação: " + multiplicacao);
			
		//Realizar a divisão
		int divisao = x / y;
		
		//Exibir o resultado da divisão
		System.out.println("Divisão: " + divisao);
		
		//Obter o resto da divisão 10 % 2 = 0 , 10 % 3= 1 (mod)
		int resto = x % y;
		//Resto da divisão
		System.out.println("Resto da divisão: " + resto);
		
		//Incremento -> incrementa em uma unidade
		x++;
		System.out.println("X = " + x);
		
		//Decremento -> decrementa em uma unidade
		x--;
		System.out.println("X = " + x);
		
		x += 2; // x = x + 2;
		System.out.println("X = " + x);
		
	}
}