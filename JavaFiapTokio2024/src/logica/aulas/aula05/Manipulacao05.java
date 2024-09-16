package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao05 {

	public static void main(String[] args) {
		
		//String idade = "25";
		//int idadeInteiro = Integer.parseInt(idade);
		
		//System.out.println(idadeInteiro);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto: ");
		String preco = scanner.nextLine();
		
		double precoDouble = Double.parseDouble(preco);
		
		System.out.println(precoDouble);
		
	}

}
