package br.edu.ufsj.ccomp.tecweb.agenda;

public class Agenda {
	
	private Tarefa[] tarefas;
	private int numTarefas;
	
	private Reuniao[] reunioes;
	private int numReunioes;
	
	public Agenda() {
		this.numTarefas = 0;
		this.tarefas = new Tarefa[100];
		
		this.numReunioes = 0;
		this.reunioes = new Reuniao[100];
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefas[this.numTarefas++] = tarefa;
	}
	
	public void adicionarReuniao(Reuniao reuniao) {
		this.reunioes[this.numReunioes++] = reuniao;
	}
	
	public Tarefa[] obterTarefas() {
		return this.tarefas;
	}
	
	public int obterNumTarefas() {
		return this.numTarefas;
	}
	
	public Reuniao[] obterReunioes() {
		return this.reunioes;
	}
	
	public int obterNumReunioes() {
		return this.numReunioes;
	}

}
