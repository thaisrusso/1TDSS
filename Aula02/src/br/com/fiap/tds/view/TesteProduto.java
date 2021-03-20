package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		//Instanciar um produto -> criar o objeto
		Produto livro = new Produto();
		
		//Atribuindo valores nos atributos
		livro.nome = "Java como programar";
		livro.preco = 200;
		livro.disponivel = true;
		livro.corredor = 'A';
		livro.quantidade = 10;
		
		//Acionando o método
		double x = livro.calcularDesconto(30);
		System.out.println("O valor com desconto do livro é " + x);
		
		//Instanciar outro produto
		Produto tv = new Produto();
		
		//Chamar o método para atribuir valores nos atributos 
		tv.configurarProduto("Tv Lg", 1200, true, 'C', 32);
		
		//Calcular o desconto para a tv
		double y = tv.calcularDesconto(30);
		System.out.println("O valor da tv com desconto: " + y);
		
		//Alterando o nome do produto
		tv.nome = "Tv Samsung";
		
		//Exibir o nome e o preço da TV
		System.out.println(tv.nome + " " + tv.preco);
		
		//Chamar o método que retorna os dados do produto e exibi-lo
		String dadosTv = tv.retornarDadosProduto();
		System.out.println(dadosTv);
		
		String dadosLivro = livro.retornarDadosProduto();
		System.out.println(dadosLivro);
		
	}
	
}
