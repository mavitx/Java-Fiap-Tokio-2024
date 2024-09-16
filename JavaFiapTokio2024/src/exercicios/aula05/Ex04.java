package exercicios.aula05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int valor2 = scanner.nextInt();
		
		System.out.println("A média será igual a : " + (valor1+valor2) / 2);
		
		scanner.close();
	}

}
