package PacoteJava;

import java.util.Scanner;

public class ordemcrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Por favor digite um número: ");
		n1 = leia.nextInt();
		System.out.println("Agora digite outro número: ");
		n2 = leia.nextInt();
		System.out.println("Por ultimo digite  mais um número: ");
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n2 > n3) {
			System.out.printf("\n",n1,n2,n3);
		}else if(n1 >= n3 && n3 > n2) {
			System.out.printf("\n",n1,n3,n2);
		} else if(n2 >= n1 && n1 > n3) {
			System.out.printf("\n",n2,n1,n3);
		} else if(n2 >= n3 && n3 > n1) {
			System.out.printf("\n",n2,n3,n1);
		} else if(n3 >= n1 && n1 > n2) {
			System.out.printf("\n",n3,n1,n2);
		} else {
			System.out.printf("\n",n3,n2,n1);
		} 
		
	}
	
}
