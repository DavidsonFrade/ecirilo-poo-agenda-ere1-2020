package br.edu.ufsj.ccomp.tecweb.agenda;

public class Tarefa extends Evento {
		
	private int esforco = 1;
	private int prioridade = 1;
	
	public Tarefa(String assunto, int horaInicio, int horaFim, int esforco, int prioridade) {
		super(assunto, horaInicio, horaFim);
		
		if ( esforco >= 1 && esforco <= 5 ) {
			this.esforco = esforco;
		}
		
		if ( prioridade >= 1 && prioridade <= 10 ) {
			this.prioridade = prioridade;
		}
	}
	
	public String imprimir() {
		return super.imprimir() +
				" - Esforco: " + this.esforco + " - Prioridade: " + this.prioridade;
	}

}
