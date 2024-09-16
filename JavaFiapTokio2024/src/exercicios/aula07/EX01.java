package exercicios.aula07;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		String ola = "sim";
		
		Scanner sc = new Scanner(System.in);
		
		while (ola.equals("sim")) {
			System.out.println("Ola mundo!");
			
			System.out.println("Deseja dar *Ola mundo* novamente?");
			ola = sc.nextLine();
		}
		
	}

}
