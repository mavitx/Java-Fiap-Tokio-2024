package logica.aulas.aula04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Olá! Seu nome é " + nome + " e você tem " + idade + " anos.");

	}

}
