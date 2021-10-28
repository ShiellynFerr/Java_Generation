package PacoteJava;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1-Você é muito gentil..");
		System.out.println("\n2-Você é muito persistente..");
		System.out.println("\n3-Você é muito resiliente..");
		System.out.println("\n4-Você é muito dedicado..");
		op = leia.nextInt();
		
	   switch(op) {
		
	   case 1: 	System.out.println("\n1-Você é muito gentil..");
	   break;
	   
	   case 2 : System.out.println("\n2-Você é muito persistente..");
	   break;
	   
	   case 3: System.out.println("\n3-Você é muito resiliente..");
	   break;
	   
	   case 4: System.out.println("\n4-Você é muito dedicado..");
	   break;
	   default: 
		   System.out.println("Opção Inválida!");
	   }
		
		
		

	}

}
