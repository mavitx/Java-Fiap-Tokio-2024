package exercicios.aula11;

public class OperacaoMatematica {
	
	public static double operacao (char op, double num1, double num2) {
		switch (op) {
		  case '+': 
			  return num1 + num2;
		  case '-': 
			  return num1 - num2;
		  case '*': 
			  return num1 * num2;
		  case '/': 
			  return num1 / num2;
		}
		
		return -1;
		
	}
	
	private static double somar (double a, double b) {
		return a + b;
	}

}
