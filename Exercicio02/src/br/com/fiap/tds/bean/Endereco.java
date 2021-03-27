package br.com.fiap.tds.bean;

public class Endereco {

	//Atributos
	
	public String rua, complemento, bairro, cep;
	
	public short numero; //byte, short, int, long
	
	//Métodos
	
	public short getNumero() {
		return numero;
	}
	
	public void setNumero(short novoNumero) {
		numero = novoNumero;
	}
	
}