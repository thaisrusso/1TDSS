package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoString {

	//Transformar um primitivo em uma String
	public static void main(String[] args) {
		
		//Ler uma idade (int)
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		//Ler uma altura (float)
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
		
		//Exibir a soma
		JOptionPane.showMessageDialog(null, idade + altura);
		
		//Transformar os números em String
		String idadeString =  String.valueOf(idade);
		String alturaString = String.valueOf(altura);		
		
		//Exibir a soma
		JOptionPane.showMessageDialog(null, idadeString + alturaString);
		
		//Concatenar String -> concatena um número com uma string: resultado é String
		String teste = idade + "";
		
	}
	
}
