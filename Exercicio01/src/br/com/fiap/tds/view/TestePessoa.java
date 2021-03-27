package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Pessoa;

public class TestePessoa {
	
	//main + CTRL espaço
	public static void main(String[] args) {
		//Ler os dados da pessoa (nome, idade, altura)
		//CTRL + SHIFT + o -> import
		Scanner leitor = new Scanner(System.in);
		
		//sysout + CTRL espaço
		System.out.println("Digite nome: ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a altura: ");
		float altura = leitor.nextFloat();
		
		System.out.println("Digite a idade");
		int idade = leitor.nextInt();
		
		//Instanciar uma pessoa
		Pessoa pessoa = new Pessoa();
		
		//Atribuir os valores no objeto pessoa
		pessoa.alterarTudo(nome, idade, altura);
		
		//Exibir os dados do objeto
		String dados = pessoa.obterTudo();
		System.out.println(dados);
		
		leitor.close();
	}
}
