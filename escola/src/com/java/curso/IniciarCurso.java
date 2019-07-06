package com.java.curso;

import java.util.Scanner;

public class IniciarCurso {

	public static void main(String[] args) {
		
		String nomeCurso;
		String nomeProfessor;
		int ch;
		String[] nomeAlunos;
		
		Scanner scan = new Scanner (System.in);
		
		// dados para inicar o curso
		System.out.println("Digite o nome do curso:");
		nomeCurso = scan.nextLine();
		System.out.println("Carga horária:");
		ch = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o nome do professor:");
		nomeProfessor = scan.nextLine();
		
		Curso curso = new Curso(nomeProfessor, ch, nomeCurso);
		
		// dados para criar array de alunos
		System.out.println("Digite a quantidade de alunos");
		int quant = scan.nextInt();
		scan.nextLine();
		
		nomeAlunos = new String[quant];
		
		for (int i =0; i<quant; i++) {
			System.out.println("Digite o nome do aluno:");
			nomeAlunos[i] = scan.nextLine();
		}
		
				
		curso.adicionaAlunosCurso(nomeAlunos);
		
		curso.mostrarDadosCurso();
		
		
		
		// dados para inserir notas parciais
		
		System.out.println("\n"+"Adicione as notas parciais");
		
		for (int i =0; i<quant; i++) {
			double[] notasParciais = new double[3];
			System.out.println(nomeAlunos[i]);
			for (int j =0; j<3; j++) {
				System.out.println("Digite a nota parcial " + (j+1));
				notasParciais[j] = scan.nextDouble();
			}
			curso.adicionaNotaParcial(i, notasParciais);
		}
		
		curso.calculaMediaAlunos();


	}

}
