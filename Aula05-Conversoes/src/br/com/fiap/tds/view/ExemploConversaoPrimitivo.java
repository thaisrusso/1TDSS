package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoPrimitivo {
	
	//Converter uma string para um tipo primitivo
	//main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Abre uma janela com a mensagem e um campo para o usuário digitar
		String numero = JOptionPane.showInputDialog("Digite um número");
		
		//Converter a String para os tipos primitivos
		//byte, short, int, long - float, double
		
		byte valorByte = Byte.parseByte(numero);
		
		short valorShort = Short.parseShort(numero);
		
		int valorInt = Integer.parseInt(numero);
		
		long valorLong = Long.parseLong(numero);
		
		float valorFloat = Float.parseFloat(numero);
		
		double valorDouble = Double.parseDouble(numero);
		
		//Exibir a soma de tudo
		double total = valorByte + valorShort + valorInt + valorLong + valorFloat + valorDouble;
		
		JOptionPane.showMessageDialog(null, "Total é : " +  total);
		
		//Transformar um String em um boolean
		String verdadeiro = "true"; 
		
		boolean bool = Boolean.parseBoolean(verdadeiro); // "true" -> true senão -> false
		
		JOptionPane.showMessageDialog(null, bool);
	}

}