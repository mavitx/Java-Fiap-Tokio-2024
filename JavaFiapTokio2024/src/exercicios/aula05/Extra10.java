package exercicios.aula05;

import java.util.Scanner;

public class Extra10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida voce tem? ");
		int dias = scanner.nextInt();
		
		// 1 ano = 12 meses = 365 dias
		// 1/12 de um ano = 1 mes = 30 dias
		
		int ano = dias / 365;
		int meses = (dias % 365) / 30;   // resto do ano = meses (+ dias)
		int diaResto = dias % 365 % 30; // resto do ano / 30 (dias)
		
		System.out.println("\nVoce tem " + ano + " anos,"); 
		System.out.println(meses + " meses,");
		System.out.println(diaResto + " dias.");

	}

}
