package exercicios.aula05;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto? R$");
		double valor = scanner.nextDouble();
		
		System.out.println("Qual o valor pago para o produto? R$");
		double pago = scanner.nextDouble();
		
		double troco = pago - valor;
		
		System.out.println("O troco será de: R$" + troco);
	}

}
