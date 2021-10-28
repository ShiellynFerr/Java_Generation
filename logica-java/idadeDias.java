package PacoteJava;

import java.util.Scanner;
public class idadeDias {
	
	
	
	public static void main(String[] args) {
    	 
    	 int idadeA, idadeM, idadeD, totalDias, idadeDias,idadeMeses;
    	 Scanner leia = new Scanner(System.in);
    	 
    	 System.out.println("\n Digite sua idade em anos: ");
    	 idadeA = leia.nextInt();
    	 System.out.println("\n Digite sua idade em meses: ");
    	 idadeM = leia.nextInt();
    	 System.out.println("\n Digite sua idade em dias: ");
    	 idadeD = leia.nextInt();
    	
    	 
    	 idadeDias = idadeA*365;
    	 idadeMeses = idadeM*30;
    	 totalDias = idadeDias + idadeMeses + idadeD;
    	 
    	 System.out.println("\n Sua idade em dias é:" + totalDias);
    			 
    	 
    	 
     }
     
}
