package logica.aulas.aula04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seu nome é: ");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome + "!");
		
		sc.close();

	}

}
