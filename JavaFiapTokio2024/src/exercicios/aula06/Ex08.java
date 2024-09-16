package exercicios.aula06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Distancia total: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Combustivel total: ");
		double combust = sc.nextDouble();
		
		double kmPorLitro = distancia / combust;
		
		System.out.println(kmPorLitro + " Km/L.");
		
		if (kmPorLitro <=  8) {
			System.out.println("Esse carro bebe!");
		} else {
			System.out.println("Autonomia legal!");
		}

	}

}
