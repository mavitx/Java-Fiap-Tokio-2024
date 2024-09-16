package logica.aula.aula06;

public class SwitchCase {

	public static void main(String[] args) {
		
		int tipoUsuario = 0;
		
		// 0 = adm
		// 1 = cliente
		
		switch (tipoUsuario) {
			case 0: 
				System.out.println("Usuario administrador");
				break;
			case 1:
				System.out.println("Usuario cliente");
				break;
			default:
				System.out.println("Erro");
		}

	}

}
