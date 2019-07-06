package com.java.curso;

import com.java.fichas.*;

public class Curso {
	Professor professor;
	int cargaHoraria;
	String nomeCurso;
	Aluno[] alunos;
	
	
	public Curso(String nomeProfessor, int cargaHoraria, String nomeCurso) {
		Professor prof = new Professor();
		this.professor = prof;
		this.professor.setNome(nomeProfessor);
		this.cargaHoraria = cargaHoraria;
		this.nomeCurso = nomeCurso;
	}
	
	public void adicionaAlunosCurso (String[] nomeAlunos) {
		this.alunos = new Aluno[nomeAlunos.length];
		for (int i=0; i<nomeAlunos.length; i++) {
			Aluno aluno = new Aluno(nomeAlunos[i]);
			this.alunos[i] = aluno;
		}
	}
	
	
	public void mostrarDadosCurso () {
		System.out.println("Nome do curso: " + this.nomeCurso);
		System.out.println("Professor responsável: " + this.professor.getNome());
		System.out.println("CH: " + this.cargaHoraria);
		System.out.println("Número de alunos: " + this.alunos.length);
		this.mostraAlunosCurso();
	}
	
	public void mostraAlunosCurso() {
		for (Aluno elem: this.alunos) {
			System.out.println(elem.nomeAluno);
		}
	}
	
	public void adicionaNotaParcial(int posicaoAluno, double[] notasParciais) {
		this.alunos[posicaoAluno].setNotasParciais(notasParciais);
	}
	
	public void calculaMediaAlunos () {
		double media =0;
		System.out.println("Mostrando a média de cada aluno:");
		for (Aluno elem: alunos) {
			for (double somado : elem.getNotasParciais() ) {
				media += somado;
			}
			System.out.println(elem.nomeAluno + ": "+ (media/3));
			media = 0;
		}
	}

	
	
	
}
