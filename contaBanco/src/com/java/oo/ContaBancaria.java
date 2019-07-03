package com.java.oo;

public class ContaBancaria {
	String nomeProprietario;
	String cpfProprietario;
	int agenciaBanco;
	int codigoBanco;
	int numeroConta;
	
	double saldoConta;
	
	void mostrarDadosConta() {
		System.out.println("Agência: "+ this.agenciaBanco);
		System.out.println("Número da conta: "+ this.numeroConta);
		System.out.println("Código do banco: "+ this.codigoBanco);
	}
	
	void realizarDeposito (double quantidadeDeposito) {
		this.saldoConta += quantidadeDeposito;
		System.out.println("Deposito de "+ quantidadeDeposito + " realizado com sucesso!");
	}
	
	void consultaSaldo () {
		System.out.println(this.nomeProprietario+", seu saldo atual é de R$"+this.saldoConta+" reais");
	}
	
	void realizarSaque (double valorSaque) {
		if (valorSaque <= this.saldoConta) {
			this.saldoConta -= valorSaque;
			System.out.println("Saque autorizado, pode retirar o dinheiro");
		}
		else {
			System.out.println("Saque não autorizado. Saldo insuficiente");
		}
	}
}
