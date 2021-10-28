package PacoteJava;

import java.util.Scanner;

public class matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int numeros [][] = new int[3][3];
		int linha,coluna, num10=0;
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			 for(coluna=0;coluna<3;coluna++) {
				 System.out.println("Informe um número");
				 numeros [linha] [coluna]=leia.nextInt();
				 
				 if(numeros[linha][coluna]>10) {
					 
					 num10++;
				 }
			 }
			
		}
		 System.out.println("O número de números digitados maiores do que 10 é: "+num10); 	 
	}
	

}
