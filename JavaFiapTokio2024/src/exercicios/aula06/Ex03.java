package exercicios.aula06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		int nota4 = sc.nextInt();
		
		int notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notaFinal >= 7) {
			System.out.println("Aprovado");
		} else if (notaFinal >= 5){
			System.out.println("Recuperação");
		} else if (notaFinal  < 5) {
			System.out.println("Reprovado");
		}
		
	}

}
