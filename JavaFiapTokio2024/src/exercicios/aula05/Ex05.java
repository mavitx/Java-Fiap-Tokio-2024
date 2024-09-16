package exercicios.aula05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Digite o valor B: ");
		double valor2 = scanner.nextDouble();
		
		double mediaPonderada =  (valor1 * 0.4) + (valor2 * 0.6);
		
		System.out.println("O valor final da média ponderada é: " + mediaPonderada);
		
		scanner.close();
	}

}
