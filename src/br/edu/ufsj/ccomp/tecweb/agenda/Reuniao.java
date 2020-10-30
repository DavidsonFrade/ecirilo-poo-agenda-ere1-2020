package br.edu.ufsj.ccomp.tecweb.agenda;

public class Reuniao extends Evento {
	
	private String local;
	private boolean presenca;
	
	public Reuniao(String assunto, int horaInicio, int horaFim, String local, boolean presenca) {
		super(assunto, horaInicio, horaFim);
		
		this.local = local;
		this.presenca = presenca;
	}
	
	public String imprimir() {
		return super.imprimir() + 
				" - Local: " + this.local + " - Presenca: " + (this.presenca ? "Obrigatoria" : "Nao obrigatoria");
	}
}
