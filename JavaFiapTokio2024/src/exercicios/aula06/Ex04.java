package exercicios.aula06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = sc.nextInt();
		
		System.out.println("Digite um outro número: ");
		int b = sc.nextInt();
		
		if (((a % b) == 0) || ((b % a) == 0)) {
			System.out.println("São multiplos.");
		} else {
			System.out.println("Não são multiplos.");
		}
		
	}

}
