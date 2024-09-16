package logica.aulas.aula05;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		System.out.println(6 == 3);
		
		int num1 = 40;
		
		System.out.println(num1 != 14);
		System.out.println(num1 == 14);
		
		System.out.println(false);
		
		boolean arLigado = false;
		
		boolean comparacao = num1 > 2;
		System.out.println("Comparação: " + comparacao);
		
		String nome1 = "Maria";
		String nome2 = "maria";
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));

	}

}
