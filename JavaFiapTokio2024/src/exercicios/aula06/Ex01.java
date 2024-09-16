package exercicios.aula06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este numero é par!");
		} else {
			System.out.println("Este numero é impar!");
		}

	}

}
