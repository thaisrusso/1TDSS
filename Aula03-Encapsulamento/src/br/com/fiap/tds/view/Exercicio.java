package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Cor;
import br.com.fiap.tds.bean.Lancha;

public class Exercicio {

	//CTRL + SHIFT + o (import)
	//main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Instanciar as classes e atribuir os valores 
		Cor cor = new Cor();
		cor.setNome("Branco");
		cor.setR(255);
		cor.setG(255);
		cor.setB(255);
		
		Lancha lancha = new Lancha();
		lancha.setAnoFabricacao(2016);
		lancha.setComprimento(20);
		lancha.setModelo("Nautica");
		lancha.setQuantidadeLugares(10);
		lancha.setQuantidadeMotores(2);
		lancha.setCor(cor);
		
		//Exibir os valores do ano, modelo e nome da cor
		//sysout -> CTRL + espaço
		System.out.println("Ano: " + lancha.getAnoFabricacao() + 
			" Modelo: " + lancha.getModelo() + " Cor: " + lancha.getCor().getNome());
	}
	
}
