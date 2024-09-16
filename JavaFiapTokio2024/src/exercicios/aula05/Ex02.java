package exercicios.aula05;

public class Ex02 {

	public static void main(String[] args) {
		
		int numint = 120;
		float num = 1234565;
		double numqueb = 123.456;
		
		System.out.println("Número 1: " + numint);
		System.out.println("Número 2: " + num);
		System.out.println("Número 3: " + numqueb);
		
		String inte = Integer.toString(numint);
		String grande = Float.toString(num);
		String queb = Double.toString(numqueb);
		
		System.out.println("Número 1: " + inte);
		System.out.println("Número 2: " + grande);
		System.out.println("Número 3: " + queb);
	}

}
