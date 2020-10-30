package br.edu.ufsj.ccomp.tecweb.agenda;

public class Agenda {
	
	private Evento[] eventos;
	private int numEventos;
	
	public Agenda() {
		this.numEventos = 0;
		this.eventos = new Evento[100];
	}
	
	public void adicionarEvento(Evento evento) {
		this.eventos[this.numEventos++] = evento;
	}
	
	public Evento[] obterEventos() {
		return this.eventos;
	}
	
	public int obterNumEventos() {
		return this.numEventos;
	}	
}
