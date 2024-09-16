package logicas.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	// com parametro e sem retorno -> nome
	static void saudacaoComArg(String nome) {
		System.out.println("Seja bem-vindo, " + nome);
	}
	
	// com parametro e sem retorno -> numero
	static void somar(int n1, int n2) {
		System.out.println("Soma: " + (n1 + n2));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		
		// chamando a função e passando o parametro
		saudacaoComArg(nomeDigitado);
		
		// chamando a função de soma
		somar(1, 5);

	}

}
