package PacoteJava;

import  java.util.Scanner;



public class imparoupar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int x =0,numero, somapar=0,somaimpar=0;
        
        Scanner leia = new Scanner (System.in);
        for(x=0;x<10;x++) {
        	System.out.println("Por favor digite um n�mero: ");
        	numero = leia.nextInt();
         if (numero %2 == 0) {
        	somapar++;
        } else {
        	somaimpar++;
        }
      
	} 
	
System.out.printf("\nA quantidade de n�meros pares s�o "+somapar);
System.out.printf("\nA quantidade de n�meros impares s�o "+somaimpar);

	 
    
     
}
}



