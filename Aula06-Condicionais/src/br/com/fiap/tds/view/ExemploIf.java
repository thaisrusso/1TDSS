package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploIf {
	
	public static void main(String[] args) {
		
		//Ler a idade do usuário
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		//Verificar se é permitido beber
		// if ou else com uma única instrução -> não precisam das {}
		if (idade >= 18) 
			System.out.println("Permitido");
		else 
			System.out.println("Não permitido");
		
		//Declarar uma variável do tipo boolean
		boolean ok = false;
		
		//Validar se a variável é verdadeira
		//O diferente no java é !=, =! é a negação + atribuição
		if (ok) {
			System.out.println("Ok é verdadeiro");
		} else {
			System.out.println("Ok é falso");
		}
		
		//Validar se a variável é falso
		if (!ok) {
			System.out.println("Ok é falso");
		} else {
			System.out.println("Ok é verdadeiro");
		}
		
	}//main

}//classe