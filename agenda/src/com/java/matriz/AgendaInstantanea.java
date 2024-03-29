package com.java.matriz;

import java.util.Scanner;

public class AgendaInstantanea {

	public static void main(String[] args) {
		System.out.println("Bem-vindo a sua agenda semanal pessoal. Escolha uma opcao:"
				+ "\n 1.Criar agenda \n 2.AgendarCompromisso \n 3.Visualizar Agenda \n Para sair escreva 0");
		Scanner scan = new Scanner(System.in);
		int escolha;
		String[][] agenda = new String[2][7];
		
		// Escolha do usuario
		do {
		
			escolha = scan.nextInt();
			
			switch (escolha){
				case 1: 
					criarAgenda(agenda);
					System.out.println("Agenda criada com sucesso");
					break;
				case 2: 
					agendarCompromisso(agenda);
					break;
				case 3:
					visualizarAgenda(agenda);
					break;
				case 0:
					System.out.println("Programa finalizado");
					System.exit(0);
					break;
				default:
					System.out.println("Entrada invalida");
					
			}
		} while (escolha != 0 || escolha != 0);
		scan.close();
	}
	
	
	
	//metodo para visualizacao
	public static void visualizarAgenda(String[][] agenda ) {
		
		for (int i=0; i < 2; i++) {
			for (int j=0; j<7; j++) {
				System.out.print(agenda[i][j] + "               ");
			}
			System.out.println();
		}
	}
	
	
	
	//metodo para preenchimento vazio da agenda
	public static void criarAgenda( String[][] agenda) {
		String[] diasSemana = {"DOM", "SEG", "TER", "QUAR", "QUIN", "SEX", "SAB"};
		for (int col =0 ; col < 7; col++) {
			agenda[0][col] = diasSemana[col];
			agenda[1][col] = "";
		}
		
	}
	
	
	
	//metodo para agendar compromisso
	public static void agendarCompromisso (String[][] agenda) {
		System.out.println("Digite o dia da semana (1-Domingo 7-Sabado) ");
		Scanner scan = new Scanner(System.in);
		
		//guarda dia da semana do compromisso
		int diaSemana = scan.nextInt();
		System.out.println("Digite o compromisso");
		//elimina \n
		scan.nextLine();
		
		//guarda texto do compromisso
		String compromisso = scan.nextLine();
		
		//verifica se ja tem um compromisso no mesmo dia
		if (agenda[1][diaSemana-1] != "") {
			System.out.println("Ja existe um compromisso agendado para este dia. Gostaria de sobescrever? [y/n]");
		}
		else {
			System.out.println("Tem certeza que quer marcar este compromisso? [y/n]");
		}
		
		
		//confirma se o usuario quer mesmo marcar
		String confirma = scan.nextLine();
		
		if (confirma.contentEquals("y")) {
			agenda[1][diaSemana-1] = compromisso;
			System.out.println("Compromisso marcado com sucesso");
		}
		else {
			System.out.println("Compromisso cancelado");	
		}
		
		
	}

}

