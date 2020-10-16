package br.edu.ufsj.ccomp.tecweb.agenda;

public class Reuniao {
	
	private String assunto;
	private int horaInicio;
	private int horaFim;
	private String local;
	private boolean presenca;
	
	public Reuniao(String assunto, int horaInicio, int horaFim, String local, boolean presenca) {
		this.assunto = assunto;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.local = local;
		this.presenca = presenca;
	}
	
	public String imprimir() {
		return "Assunto: " + this.assunto + " - Hora Inicio: " + this.horaInicio + " - Hora Fim: " + this.horaFim +
				" - Local: " + this.local + " - Presenca: " + (this.presenca ? "Obrigatoria" : "Nao obrigatoria");
	}

}
