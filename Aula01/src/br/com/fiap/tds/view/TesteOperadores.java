package br.com.fiap.tds.view;

public class TesteOperadores {

	public static void main(String[] args) {
		//Declarar duas vari�veis do tipo int
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x + y;
		//Exibir o resultado da soma
		System.out.println("Soma: " + soma);
		
		//Realizar a subtra��o
		int subtracao = x - y;
		//Exibir o resultado da subtra��o
		System.out.println("Subtra��o: " + subtracao);
		
		//Realizar a multiplica��o 
		int multiplicacao = x * y;
		//Exibir o resultado da multiplica��o
		System.out.println("Multiplica��o: " + multiplicacao);
			
		//Realizar a divis�o
		int divisao = x / y;
		
		//Exibir o resultado da divis�o
		System.out.println("Divis�o: " + divisao);
		
		//Obter o resto da divis�o 10 % 2 = 0 , 10 % 3= 1 (mod)
		int resto = x % y;
		//Resto da divis�o
		System.out.println("Resto da divis�o: " + resto);
		
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