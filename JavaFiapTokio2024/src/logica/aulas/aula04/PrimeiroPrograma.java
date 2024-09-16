package logica.aulas.aula04;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		System.out.println("Ola mundo!");
		
		int idade;
		idade  = 25;
		System.out.println("Idade: " + idade);
		
		idade  = 52;
		System.out.println("Idade: " + idade);
		
		double salario = 1530.24;
		System.out.println("Salario: R$ " + salario);
		
		String nome = "Maria";
		System.out.println(nome);
		
		System.out.println("Bem-vindo(a), " + nome + "!");
		System.out.println(nome + ", você tem " + idade + " anos.");
		
		System.out.printf("Bem-vinda, %s! \n", nome);
		System.out.printf("%s, voce tem %d anos.", nome, idade);
	}

}
