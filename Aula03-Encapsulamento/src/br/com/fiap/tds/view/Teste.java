package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Usuario;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um Usuário -> criar o objeto
		//CTRL + SHIFT + o -> import
		Usuario usuario = new Usuario();
		
		usuario.setNome("Thiago");
		String nome = usuario.getNome();
		
		System.out.println(nome);
		//usuario.logar();
	}
	
}
