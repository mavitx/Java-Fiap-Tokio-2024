package exercicios.aula05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da peça 1: ");
		String nome1 = scanner.nextLine(); 
		
		System.out.println("Digite a quantidade de peça(s) 1: ");
		int quant1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o valor de cada peça 1: ");
		double unitario1 = Double.parseDouble(scanner.nextLine());
		
		double valorPg1 = quant1 * unitario1;
		
		System.out.println("Digite o nome da peça 2: ");
		String nome2 = scanner.nextLine(); 
		
		System.out.println("Digite a quantidade de peça(s) 2: ");
		int quant2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o valor de cada peça 2: ");
		double unitario2 = Double.parseDouble(scanner.nextLine());
		
		double valorPg2 = quant2 * unitario2;
		
		System.out.println("O valor total é de: R$" + (valorPg1 + valorPg2));
		
		scanner.close();
	}

}
