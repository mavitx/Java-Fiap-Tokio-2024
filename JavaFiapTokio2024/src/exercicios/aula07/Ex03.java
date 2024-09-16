package exercicios.aula07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número n: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= 25; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		
	}

}
