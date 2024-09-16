package exercicios.aula06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor dos Volts/h R$: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o tipo de cliente: \n(1) residência \n(2) comércio \n(3) indústria \n ");
		int tipoCliente = sc.nextInt();
		
		switch (tipoCliente) {
			case 1: 
				System.out.println("Valor a ser pago: R$ " + ((valor * 0.60) + valor));
				break;
			case 2: 
				System.out.println("Valor a ser pago: R$ " + ((valor * 0.48) + valor));
				break;
			case 3: 
				System.out.println("Valor a ser pago: R$ " + ((valor * 1.29) + valor));
				break;
			default:
				System.out.println("Erro");
		}
		

	}

}
