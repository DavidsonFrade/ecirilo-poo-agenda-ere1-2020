package br.edu.ufsj.ccomp.tecweb.agenda;

import br.edu.ufsj.ccomp.tecweb.agenda.util.Console;

public class Programa {
	
	private static Usuario[] usuarios = new Usuario[100];
	private static int numUsuarios = 0;
	
	public static void main(String[] args) {		
		
		int opcao = 0;

	    do {

	        System.out.println(" 1 - Cadastrar Usuario");
	        System.out.println(" 2 - Listar Usuarios");
	        System.out.println(" 3 - Cadastrar Tarefa");
	        System.out.println(" 4 - Imprimir Tarefas");	
	        System.out.println(" 5 - Cadastrar Reuniao");
	        System.out.println(" 6 - Imprimir Reunioes");	
	        System.out.println(" 7 - Imprimir Agenda");
	        System.out.println(" 30 - Sair");

	        System.out.println("Escolha uma opcao: ");
			opcao = Integer.parseInt(Console.readLine());

	        switch ( opcao ) {
	            case 1 :
	            	System.out.println("Cadastar Usuario");
	            	cadastrarUsuario();
	                break;
	            case 2 :
	            	System.out.println("Listar Usuarios");
	                listarUsuarios();
	                break;
	            case 3 :
	            	System.out.println("Cadastar Tarefa");
	                cadastrarTarefa();
	                break;
	            case 4 :
	            	System.out.println("Imprimir Tarefas");
	                imprimirTarefas();
	                break;	          
	            case 5 :
	            	System.out.println("Cadastar Reuniao");
	                cadastrarReuniao();
	                break;
	            case 6 :
	            	System.out.println("Imprimir Reunioes");
	                imprimirReunioes();
	                break;	          
	            case 7 :
	            	System.out.println("Imprimir Agenda");
	            	imprimirAgenda();	            
	        }

	    } while( opcao != 30 );		
	}
	
	public static void cadastrarUsuario() {
		
		System.out.println("Nome: ");
	    String nome = Console.readLine();

	    System.out.println("Email: ");
	    String email = Console.readLine();
	    
	    Usuario usuario = new Usuario(nome, email);
	    usuarios[numUsuarios++] = usuario;
	    	    
	}
	
	public static void listarUsuarios() {
		
		for (int x = 0; x < numUsuarios; x++) {
			Usuario usuario = usuarios[x];
			System.out.println(usuario.imprimir());
		}
	}
	
	public static void cadastrarTarefa() {
		
		System.out.println("Usuario: ");
		int codigoUsuario = Integer.parseInt(Console.readLine());
		
		Usuario usuario = usuarios[codigoUsuario];

		System.out.println("Assunto: ");
		String assunto = Console.readLine();
		
		System.out.println("Hora Inicio: ");
		String horaInicio = Console.readLine();		
		
		System.out.println("Hora Fim: ");
		String horaFim = Console.readLine();
				
		System.out.println("Esforco: ");
		String esforco = Console.readLine();
		
		System.out.println("Prioridade: ");
		String prioridade = Console.readLine();
		
		Tarefa tarefa = new Tarefa(assunto, Integer.parseInt(horaInicio), 
				Integer.parseInt(horaFim), 
				Integer.parseInt(esforco), 
				Integer.parseInt(prioridade));
		
		Agenda agenda = usuario.obterAgenda();
		agenda.adicionarEvento(tarefa);		
	}
		
	public static void imprimirTarefas() {
		
		System.out.println("Usuario: ");
		int codigoUsuario = Integer.parseInt(Console.readLine());	
		
		Usuario usuario = usuarios[codigoUsuario];
		
		Evento[] eventos = usuario.obterAgenda().obterEventos();
		int numEventos = usuario.obterAgenda().obterNumEventos();
		
		for ( int x = 0; x < numEventos; x++ ) {
			if ( eventos[x] instanceof Tarefa) {
				System.out.println(eventos[x].imprimir());
			}			
		}
		
	}
	
	public static void cadastrarReuniao() {
		
		System.out.println("Usuario: ");
		int codigoUsuario = Integer.parseInt(Console.readLine());	
		
		Usuario usuario = usuarios[codigoUsuario];
		
		System.out.println("Assunto: ");
		String assunto = Console.readLine();
		
		System.out.println("Hora Inicio: ");
		String horaInicio = Console.readLine();
		
		System.out.println("Hora Fim: ");
		String horaFim = Console.readLine();
				
		System.out.println("Local: ");
		String local = Console.readLine();
		
		System.out.println("Presenca: ");
		String presenca = Console.readLine();	
		
		Reuniao reuniao = new Reuniao(assunto, Integer.parseInt(horaInicio), 
				Integer.parseInt(horaFim), 
				local, 
				Boolean.parseBoolean(presenca));
		
		Agenda agenda = usuario.obterAgenda();
		agenda.adicionarEvento(reuniao);	
				
	}
	
	public static void imprimirReunioes() {
		
		System.out.println("Usuario: ");
		int codigoUsuario = Integer.parseInt(Console.readLine());
		
		Usuario usuario = usuarios[codigoUsuario];
		
		Evento[] eventos = usuario.obterAgenda().obterEventos();
		int numEventos = usuario.obterAgenda().obterNumEventos();
		
		for ( int x = 0; x < numEventos; x++ ) {
			if ( eventos[x] instanceof Reuniao) {
				System.out.println(eventos[x].imprimir());
			}			
		}
				
	}

	public static void imprimirAgenda() {
		
		System.out.println("Usuario: ");
		int codigoUsuario = Integer.parseInt(Console.readLine());
		
		Usuario usuario = usuarios[codigoUsuario];
		
		System.out.println("Agenda do usuario - " + usuario.obterNome());
		System.out.println("");
		
		System.out.println("Eventos: ");
		Evento[] eventos = usuario.obterAgenda().obterEventos();
		int numEventos = usuario.obterAgenda().obterNumEventos();
		
		for ( int x = 0; x < numEventos; x++ ) {
			System.out.println(eventos[x].imprimir());
		}					
	}
}
