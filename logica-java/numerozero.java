package PacoteJava;
import java.util.Scanner;

public class numerozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numero,soma=0;
		 
		Scanner leia= new Scanner (System.in);
		
		
		do {
		 
		 System.out.println("Por favor  digite um número");
		 numero = leia.nextInt();
		 soma += numero;
		
  
	} while(numero!=0);
		 
		System.out.println("A soma dos números digitados é igual a: "+soma);

}
	
}
