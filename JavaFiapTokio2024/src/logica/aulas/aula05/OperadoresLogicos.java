package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// E = &&
		// email	senha	login
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		// OU = ||
		// sol		jogo BR		churrasco
		
		boolean logicaOU = false || true;
		System.out.println(logicaOU);
		
		//NEGAÇÃO = !
		// inverte
		
		boolean negacao = !false;
		System.out.println(negacao);

	}

}
