package logica.aula.aulas08;

import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {
		
		Calendar c = Calendar .getInstance();
		
		System.out.println("Data e hora atual: " + c.getTime());
		
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mes: " + c.get(Calendar.MONTH));
		System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
	}

}
