package br.com.fiap.tds.bean;

public class Funcionario {

	//Atributos
	
	private String nome;
	
	private long matricula;
	
	private Profissao profissao;
	
	private double salario;
	
	//Construtores -> CTRL + 3 gcuf
	
	public Funcionario() {}

	public Funcionario(long matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome, Profissao profissao) {
		this.profissao = profissao;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	//Método
	
	public String exibirDados() {
		return "Nome: " + nome + " matricula: " +  matricula + " salário: " 
				+ salario + " profissão: " + profissao.getNome();
	}
	
	//Getters e Setters -> CTRL + 3 ggas

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
