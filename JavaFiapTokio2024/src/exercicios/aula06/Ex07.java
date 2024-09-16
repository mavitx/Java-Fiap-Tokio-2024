package exercicios.aula06;

public class Ex07 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		boolean primeira = (a <= b) && (b < d);
		boolean segunda = (a == b) || (c != b);
		boolean terceira = (d > a) && (c >= b);
		boolean quarta = (a <= b) || (c <= d);
		boolean quinta = ((b > c) || (c < a)) && (d <= b);
		
		System.out.println(primeira);
		System.out.println(segunda);
		System.out.println(terceira);
		System.out.println(quarta);
		System.out.println(quinta);


	}

}
