package exercicios.aula07;

public class Ex10 {

	public static void main(String[] args) {
		
		for (int numero = 2; numero <= 2000; numero++) {
			int divisor = 2;
			
			while (numero % divisor != 0) {
				divisor++;
			}
			
			if (divisor == numero) {
				System.out.printf("%d é primo\n", numero);
			}
			
		}
		
	}

}
