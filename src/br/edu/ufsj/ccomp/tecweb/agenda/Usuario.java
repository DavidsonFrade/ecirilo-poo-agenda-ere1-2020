package br.edu.ufsj.ccomp.tecweb.agenda;

public class Usuario {
	
	private String nome;
	private String email;
	
	private Agenda agenda;
	
	public Usuario() {
		this.agenda = new Agenda();
	}
	
	public Usuario(String nome, String email) {
		this();
		this.nome = nome;
		this.email = email;
	}
	
	public String imprimir() {
		return "Nome: " + this.nome + " - Email: " + this.email;
	}
	
	public Agenda obterAgenda() {
		return this.agenda;
	}
	
	public String obterNome() {
		return this.nome;
	}
	
	public String obterEmail() {
		return this.email;
	}

}
