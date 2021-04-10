package br.com.fiap.tds.bean;

public class Data {

	private int ano, mes, dia;
	
	//Método que retorna a data no formato dd/mm/aaaa
	public String retornarData() {
		return dia + "/" + mes + "/" + ano;
	}
	
	//Método que retorna o nome do mês de acordo com o número que está armazenado no atributo mês;
	public String retornaMes() {
		if (mes == 1) 
			return "Janeiro";
		if (mes == 2) 
			return "Fevereiro";
		if (mes == 3) 
			return "Março";
		if (mes == 4)
			return "Abril";
		if (mes == 5)
			return "Maio";
		if (mes == 6)
			return "Junho";
		if (mes == 7)
			return "Julho";
		if (mes == 8)
			return "Agosto";
		if (mes == 9)
			return "Setembro";
		if (mes == 10)
			return "Outubro";
		if (mes == 11)
			return "Novembro";
		
		return "Dezembro";
	}	
	
	//Método para validar o dia. 
	//Ele deve estar entre 1 e 31. Caso contrário inicializar o atributo com o valor 1
	private int validarDia(int dia) {
		// > (maior), < (menor), >= (maior ou igual), <= (menor ou igual)
		// == (igual), != (diferente), && (e), || (ou), ! (negação)
		if (dia >= 1 && dia <= 31 ) {
			return dia;
		} else {
			return 1;
		}
	}
	
	//Método para validar o mês. 
	//Ele deve estar entre 1 e 12. Caso contrário inicializar o atributo com 1;
	private int validarMes(int mes) {
		if (mes >= 1 && mes <=12) {
			return mes;
		} else {
			return 1;
		}
	}
	
	//Método para validar o ano. 
	//Ele não deve ser negativo. Caso contrário inicializar o atributo com 2020;
	private int validarAno(int ano) {
		if (ano > 0) {
			return ano;
		} else {
			return 2020;
		}
	}
	
	public void setMes(int mes) {
		this.mes = validarMes(mes);
	}
	
	public void setDia(int dia) {
		this.dia = validarDia(dia);
	}
	
	public void setAno(int ano) {
		this.ano = validarAno(ano);
	}

	public int getAno() {
		return ano;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}
	
}
