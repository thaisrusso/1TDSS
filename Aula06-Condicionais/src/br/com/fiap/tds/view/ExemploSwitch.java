package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploSwitch {
	
	public static void main(String[] args) {
		
		//Ler a sigla de um estado
		String sigla = JOptionPane.showInputDialog("Digite o estado");
		
		//Exibir a capital do estado (3 ou 4 estados)
		switch(sigla)  {
			case "SP": {
				JOptionPane.showMessageDialog(null, "São Paulo");
				break;
			}
			case "MG" : {
				JOptionPane.showMessageDialog(null, "Belo Horizonte");
				break;
			}
			case "BA" : {
				JOptionPane.showMessageDialog(null, "Salvador");
				break;
			}
			case "AC" : {
				JOptionPane.showMessageDialog(null, "Rio Branco");
				break;
			} 
			default:
				JOptionPane.showMessageDialog(null, "Estado não encontrado");
		}//switch
		
	}//main

}//classe
