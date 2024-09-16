package exercicios.aula05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor a ser convertido? R$");
		float valor = scanner.nextFloat();
		
		float dolar = valor / 5.62f;
		float euro = valor / 6.23f;
		float arg = valor / 0.0059f;
		float est = valor / 7.41f;
		float iene = valor / 0.039f;
		
		System.out.printf("Dólar: %.2f \n", dolar);
		System.out.printf("Euro: %.2f \n", euro);
		System.out.printf("Peso Argentino: %.2f \n", arg);
		System.out.printf("Estelina: %.2f \n", est);
		System.out.printf("Iene: %.2f \n", iene);
	}

}
