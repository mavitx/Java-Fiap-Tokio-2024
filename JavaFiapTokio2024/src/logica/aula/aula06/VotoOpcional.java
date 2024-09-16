package logica.aula.aula06;

public class VotoOpcional {

	public static void main(String[] args) {

		int idade = 15;
		
		boolean verificaMenorIdade = idade >= 16 && idade < 18;
		System.out.println("Voto menor idade: " + verificaMenorIdade);
		
		boolean verificaIdoso = idade > 70;
		System.out.println("Voto maior idade (vein): " + verificaIdoso);
		
		if (verificaMenorIdade || verificaIdoso) {
			System.out.println("Voto opcional");
		}
		
		if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Voto opcional");
		}
		
	}

}
