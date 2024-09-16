package exercicios.aula06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite um outro numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Digite um caracter: ");
		char caracter = sc.next().charAt(0);
		
		switch (caracter) {
			case '+': 
				System.out.println("Resultado da soma: " + (num1 + num2));
				break;
			case '-': 
				System.out.println("Resultado da subtração: " + (num1 - num2));
				break;
			case '*': 
				System.out.println("Resultado da multiplicação: " + (num1 * num2));
				break;
			case '/': 
				if (num2 != 0) {
					System.out.println("Resultado da divisão: " + (num1 / num2));
				} else {
					System.out.println("Não é possível realizar a divisão!!");
				}
				break;
			default:
				System.out.println("Operação Inválida");
		}
		
	}

}
