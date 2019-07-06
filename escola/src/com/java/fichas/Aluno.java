package com.java.fichas;

public class Aluno {
	public String nomeAluno;
	private double[] notasParciais = new double[3];
	
	
	public double[] getNotasParciais() {
		return notasParciais;
	}


	public void setNotasParciais(double[] notasParciais) {
		this.notasParciais = notasParciais;
	}


	public Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
}
