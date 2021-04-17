package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Profissao;

public class Teste {

	//main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Ler os dados da profissão e do funcionário, digitado pelo usuário
		Scanner leitor = new Scanner(System.in); //CTRL + SHIFT + o (import)
		
		System.out.println("Digite o nome da profissão"); //sysout -> CTRL + espaço
		String nomeProfissao = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o nome do funcionário");
		String nomeFuncionario = leitor.next() + leitor.nextLine();
		
		System.out.println("Digita a matricula");
		long matricula = leitor.nextLong();
		
		System.out.println("Digite o salário");
		double salario = leitor.nextDouble();
		
		//Instanciar uma profissão (criar o objeto) com o nome informado
		Profissao profissao = new Profissao(nomeProfissao);
		
		//Instanciar um funcionário, com os dados informados
		Funcionario funcionario = new Funcionario(matricula, nomeFuncionario, profissao);
		funcionario.setSalario(salario);
		
		//Exibir os dados do funcionário
		String dados = funcionario.exibirDados();
		System.out.println(dados);
		
		leitor.close();
	}
	
}
