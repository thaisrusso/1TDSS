package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.*;

public class Teste {

	public static void main(String[] args) {
		//Ler os dados do endereço, cliente e conta
		Scanner leitor = new Scanner(System.in);
		
		//sysout -> CTRL + espaço
		System.out.println("Digite a rua: ");
		String rua = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o número: ");
		short numero = leitor.nextShort();
		
		System.out.println("Digite o complemento: ");
		String complemento = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o CEP: ");
		String cep = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o bairro: ");
		String bairro = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o nome: ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o CPF: ");
		String cpf = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o saldo: ");
		double saldo = leitor.nextDouble();
		
		//Instanciar um endereço, cliente e conta corrente
		Endereco endereco = new Endereco();
		
		Cliente cliente = new Cliente();

		ContaCorrente cc = new ContaCorrente();
		
		//Atribuir os valores nos objetos
		endereco.bairro = bairro;
		endereco.cep = cep;
		endereco.complemento = complemento;
		endereco.numero = numero;
		endereco.rua = rua;
		
		cliente.cpf = cpf;
		cliente.nome = nome;
		cliente.endereco = endereco;
		
		cc.saldo = saldo;
		cc.titular = cliente;
		
		//Exibir os dados: nome do cliente, saldo da conta e o cep
		System.out.println("Nome do cliente: " + cc.titular.nome + " Saldo: " +
			cc.saldo + " CEP: " + 	cc.titular.endereco.cep );
		
		leitor.close();
	}
	
}