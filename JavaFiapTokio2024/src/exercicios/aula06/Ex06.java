package exercicios.aula06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		int ano = sc.nextInt();
		
		int idade = 2024 - ano;
		
		if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("Voto opcional!");
		} else if (idade < 16) {
			System.out.println("Voto proibido!");
		} else {
			System.out.println("Voto obrigatório!");
		}
		
	}

}
