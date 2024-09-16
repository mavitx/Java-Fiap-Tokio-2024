package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {
		
		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println("Número 1: "+ num1);
		System.out.println("Número 2: " + num2);
		
		float soma = num1 + num2;
		System.out.println("Soma: " + soma);

		float subtracao = num1 - num2;
		System.out.println("Subtração: " + subtracao);
		
		float multip = num1 * num2;
		System.out.println("Multiplicação: " + multip);
		
		float divisao = num1 / num2;
		System.out.println("Divisão: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto: " + resto);
		
		//UNARIO
		System.out.println("///////////");
		
		int numero = 15;
		System.out.println(numero);
		
		numero++; // num = num + 1
		System.out.println(numero); //16
		System.out.println(numero++); //primeiro exibiu o print
		System.out.println(numero); //17
		System.out.println(++numero); //realizou a operação primeiro
		System.out.println(numero+1); //operação visual (nao guarda)
		System.out.println(numero);
		
		numero--; // 18 - 1 = 17
		System.out.println(numero); //17
		
		//ATRIBUIÇÃO
		double number = 5;
		
		System.out.println("/////////");
		System.out.println(number);
		
		number += 8; // number = number + 7
		System.out.println(number);
		
		number /= 2; 
		System.out.println(number);
		
	}

}
