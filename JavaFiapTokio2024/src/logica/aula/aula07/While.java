package logica.aula.aula07;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		/*
		int i = 5;
		
		while (i >= 0) {
			System.out.println("Ola mundo " + i);
			i--;
		} */
		
		/*
		String jogar = "sim";
		
		Scanner sc = new Scanner(System.in);
		
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente? ");
			jogar = sc.nextLine();
		}
		*/
		
		int i = 0;
		
		while (i < 10) {
			i++; // i = 1 inicial
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("Produto " + i);
		}
		
		System.out.println("FIM");
		
	}

}
