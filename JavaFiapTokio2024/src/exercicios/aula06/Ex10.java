package exercicios.aula06;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual: R$ ");
		double salarioAtual = sc.nextDouble();
		
		double reajuste;
		
		if (salarioAtual <= 280) {
			reajuste = 0.2;
		} else if (salarioAtual > 280 && salarioAtual <= 700) { //salarioatual > 280 é desnecessario
			reajuste = 0.15;
		} else if (salarioAtual > 700 && salarioAtual <= 1500) { //salarioatual > 700 é desnecessario
			reajuste = 0.1;
		} else {
			reajuste = 0.05;
		}
		
		double valorAumento = salarioAtual * reajuste;
		
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("Salario anterior ao reajuste: " + salarioAtual);
		System.out.println("Percentual do aumento: " + reajuste * 100 + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salário com aumento: " + novoSalario);

	}

}
