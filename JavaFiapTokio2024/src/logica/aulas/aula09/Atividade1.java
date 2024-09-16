package logica.aulas.aula09;

public class Atividade1 {

	public static void main(String[] args) {
		
		String nomes[] = {"Ana", "Bia", "Rodrigo", "Bruno"};
		
		String nomeTemporario = nomes[0]; // ana
		
		for (int j = 1; j < nomes.length - 1; j++) {
			System.out.println(nomeTemporario + ", " + nomes[j]);
			
			for (int i = 0; j < nomes.length; i++) {
				System.out.println();
			}
				
		}

	}

}
