package PacoteJava;

import java.util.Scanner;

public class Tresnumeros {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, maior=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Por favor digite um n�mero: ");
		n1 =leia.nextInt();
		System.out.println("Agora digite outro n�mero: ");
		n2 =leia.nextInt();
		System.out.println("E por ultimo mais um n�mero: ");
		n3 =leia.nextInt();
		
		
          if (n1>n2) {
        	  maior = n1;
          } else if (n2>n1) {
        	  maior = n2;
          } else if(n3>maior){
        	  maior = n3;
          }
          
          System.out.printf("O maior n�mero � %d", maior);
                   
          
	}

}
