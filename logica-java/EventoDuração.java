package PacoteJava;

import java.util.Scanner;

public class EventoDuração{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eventoTotal, horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Por favor informe a duração total do seu evento em segundos");
		eventoTotal = leia.nextInt();
		
	     horas = eventoTotal / 3600;
	     minutos = (eventoTotal % 3600) / 60;
	     segundos =  (eventoTotal % 3600) % 60;
	     
	     System.out.println(" O total da duração do seu evento foi de: " + horas + " hora(s) " + minutos + " minuto(s) e " + segundos + " segundos. " );
		

	}

}
