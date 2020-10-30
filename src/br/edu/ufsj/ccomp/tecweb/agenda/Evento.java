package br.edu.ufsj.ccomp.tecweb.agenda;

public class Evento {
	
	private String assunto;
	private int horaInicio;
	private int horaFim;
	
	public Evento(String assunto, int horaInicio, int horaFim) {
		this.assunto = assunto;
		
		if ( horaInicio >= 0 && horaInicio <= 23 ) {		
			this.horaInicio = horaInicio;
		}
		
		if ( horaFim >= 0 && horaFim <= 23 ) {
			this.horaFim = horaFim;
		}
	}
	
	public String imprimir() {
		return "Assunto: " + this.assunto + " - Hora Inicio: " + this.horaInicio + " - Hora Fim: " + this.horaFim;
	}

}
