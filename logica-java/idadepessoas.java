package PacoteJava;
import java.util.Scanner;

public class idadepessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade=0,idade21=0,idade50=0;
		
		System.out.println("Caso queira sair do programa digite o número -99");
		System.out.println("\nOlá informe a sua idade: ");
		idade = leia.nextInt();
		while(idade != -99) {
			
			if(idade<21 && idade>=0) {idade21++;}
		
			else if(idade>50) {idade50++;}
			
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
		
		}
		System.out.println("Total de pessoas com idade menor que 21 anos: " + idade21); 
		System.out.println("Total de pessoas com idade maior que 50 anos: " + idade50); 
	}  
}
