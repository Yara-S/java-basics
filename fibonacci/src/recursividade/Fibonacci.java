package recursividade;

public class Fibonacci {
	
	public static int calculaFibonacci (int enesimo) {
		if (enesimo == 1) {
			return 0;
		}
		else if (enesimo ==2) {
			return 1;
		}
		
		return calculaFibonacci(enesimo-2)+ calculaFibonacci(enesimo-1);
	}
}
