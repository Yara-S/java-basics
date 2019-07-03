package com.java.oo;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int quit = 2;
		String nome;
		String cpf;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bem vindo(a) ao banco, informe seu nome e CPF para podermos abrir sua conta");
		
		System.out.println("Nome:");
		nome = scan.nextLine();
		System.out.println("CPF:");
		cpf = scan.nextLine();
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.nomeProprietario = nome;
		conta.cpfProprietario = cpf;
		conta.numeroConta = 00013456-1;
		conta.agenciaBanco = 2119;
		conta.codigoBanco = 077;
		conta.saldoConta = 0;
		
		System.out.println("Sua conta foi criada com sucesso! Seguem abaixo os dados:");
		conta.mostrarDadosConta();
		
		while (quit != 0) {
			
			System.out.println("Para fazer um deposito digite 1. Para consultar seu saldo digite 2. Para realizar saque digite 3. Para sair digite 0");
			
			quit = scan.nextInt();
			
			switch (quit) {
			case 1:
				System.out.println ("Informe-nos o valor do depósito:");
				conta.realizarDeposito(scan.nextDouble());
				break;
			case 2:
				conta.consultaSaldo();
				break;
			case 0:
				System.out.println("Nosso banco agradece sua operação, tenha um bom dia");
				break;
			case 3:
				System.out.println("Informe-nos o valor que deseja sacar:");
				conta.realizarSaque(scan.nextDouble());
				break;
			default:
				System.out.println("Entrada inválida");
			}
			
			
		}

	}

}
