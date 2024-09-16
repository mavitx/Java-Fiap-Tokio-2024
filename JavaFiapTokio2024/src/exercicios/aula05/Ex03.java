package exercicios.aula05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu gênero:\n M = masculino \n F = feminino \n O = outro \n N = não responder");
		
		char generos = scanner.nextLine().charAt(0);
		
		System.out.printf("Olá, %s! O gênero escolhido por você foi: %s", nome, generos);
		
		scanner.close();
	}

}
