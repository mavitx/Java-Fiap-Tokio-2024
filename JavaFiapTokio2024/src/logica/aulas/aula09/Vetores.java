package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		int[] vetorInteiros = new int[10];
		
		vetorInteiros[0] = 10; // colocando o valor 10 ma posição 0
		vetorInteiros[1] = 1999; // valor 1999 na posicao 1
		
		System.out.println("Valor inteiro na posição 0: " + vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1]; 
		System.out.println("Ano nascimento: " + anoNascimento);
		
		//acessando a posicao via variavel
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
		// lista de compras
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta posição 1: " + listaFrutas[1]);
		
		// outro jeito de listar
		
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Pitaia", "Banana"};
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Quantidade de frutas: " + qtdFrutas);
		
		// FOR INDEXADO
		for (int i = 0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		// CRIAR UMA LISTA DE NUMEROS
		
		int[] numeros = {16, 24, 29, 33};
		
		// FOR EACH -- percorre a lista e acessa os valores da posiçao 
		
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		/*
		System.out.println();
		
		for (String fruta: listaFrutas2) {
			System.out.println(listaFrutas2);
		}
		*/
		

	}

}
