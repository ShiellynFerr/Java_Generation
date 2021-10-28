package PacoteJava;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetor[];
		int x=0,numero,somaPar=0, somaImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("Informe um número: ");
			numero = leia.nextInt();	
			
			 if (numero %2 == 0) {
		        	somaPar++;
		        } else {
		        	somaImpar++;
		        }
		}
		
		
		

	}

}
