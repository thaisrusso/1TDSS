package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Produto;

public class TesteEntradaProduto {

	public static void main(String[] args) {
		
		//Instanciar um Produto
		Produto produto = new Produto();
		
		//Instanciar um Scanner
		Scanner leitor = new Scanner(System.in);
		
		//Ler os dados para atribuir no produto
		System.out.print("Digite o produto: ");
		//Lê uma String
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o corredor: ");
		//Lê um char -> .charAt(0) recuperar o primeiro caractere
		char prateleira = leitor.next().charAt(0); 
		
		System.out.print("Digite o preço: ");
		double valor = leitor.nextDouble();
		
		System.out.print("Digite a quantidade");
		int qtd = leitor.nextInt();
		
		System.out.print("Está disponível? (true/false)");
		boolean dis = leitor.nextBoolean();
		
		//Atribuir os dados para o produto
		produto.configurarProduto(nome, valor, dis, prateleira, qtd);
		
		//Exibir os dados do produto
		String dados = produto.retornarDadosProduto();
		System.out.println(dados);
		
		//Pedir a % de desconto
		
		
		//Calcular e exibir o preço com desconto
		
		
		leitor.close();
	}
	
}
