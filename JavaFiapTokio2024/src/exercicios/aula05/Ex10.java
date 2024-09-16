package exercicios.aula05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos anos voce tem? ");
		int anos = scanner.nextInt();
		
		System.out.println("Quantos meses se passaram desde seu ultimo aniversário? ");
		int meses = scanner.nextInt();
		
		System.out.println("Levando em consideração apenas os dias do mês, quantos dias passaram desde seu dia de aniversário anterior? ");
		int dias = scanner.nextInt();
		
		int diasTotal = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você já viveu " + diasTotal + " dias.");

	}

}
