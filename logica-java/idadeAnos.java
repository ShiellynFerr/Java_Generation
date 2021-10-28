package PacoteJava;

import java.util.Scanner;

public class idadeAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int anos, meses, dias, totalDias;
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\n Entre com o total de dias que você tem de vida");
		 totalDias = leia.nextInt();
		 
		 anos = totalDias/365;
		 meses= (totalDias % 365)/30;
		 dias =  (totalDias % 365)%30;
		 
		 System.out.println(" \nVocê tem  "+ anos + " anos " + meses +" meses e " + dias + " dias de vida ");
				 
		 
		 
	}

}
