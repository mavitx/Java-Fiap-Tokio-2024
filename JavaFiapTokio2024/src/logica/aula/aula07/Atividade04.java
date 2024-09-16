package logica.aula.aula07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notaA, notaB;
		
		do {
			System.out.println("Digite a primeira nota: ");
			notaA = sc.nextInt();
		} while (notaA < 0 || notaA > 10);
		
		do {
			System.out.println("Digite a segunda nota: ");
			notaB = sc.nextInt();
		} while (notaB < 0 || notaB > 10);
		
		double media = (notaA + notaB) / 2;
		System.out.println("A média é: " + media);
		
	}

}
