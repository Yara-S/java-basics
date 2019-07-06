package recursividade;

import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {
		
		int enesimo;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o n-esimo número da sequência a ser calculado");
		
		enesimo = scan.nextInt();
		
		System.out.println(Fibonacci.calculaFibonacci(enesimo));	

	}

}
