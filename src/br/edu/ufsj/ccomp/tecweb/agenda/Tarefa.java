package br.edu.ufsj.ccomp.tecweb.agenda;

public class Tarefa {
	
	private String assunto;
	private int horaInicio;
	private int horaFim;
	private int esforco;
	private int prioridade;
	
	public Tarefa(String assunto, int horaInicio, int horaFim, int esforco, int prioridade) {
		this.assunto = assunto;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.esforco = esforco;
		this.prioridade = prioridade;
	}
	
	public String imprimir() {
		return "Assunto: " + this.assunto + " - Hora Inicio: " + this.horaInicio + " - Hora Fim: " + this.horaFim +
				" - Esforco: " + this.esforco + " - Prioridade: " + this.prioridade;
	}

}
