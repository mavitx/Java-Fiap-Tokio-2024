package exercicios.aula05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		System.out.println("Centena = " + (numero / 100) * 100);
		System.out.println("Dezena = "+ ((numero % 100) / 10) * 10);
		System.out.println("Unidade = " + ((numero % 100) % 10));
	}

}
