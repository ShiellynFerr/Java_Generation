package PacoteJava;

import java.util.Scanner;

public class Classificacao {
 
	 public static void main (String[] args) {
		  
		 int idade;
		 String nome;
		 Scanner leia = new Scanner (System.in);
		 
		  System.out.println("Por favor informe seu nome");
		  nome = leia.nextLine();
		  System.out.println("Agora informe a sua idade");
		  idade = leia.nextInt();
		  
		  if(idade >= 18 && idade <= 25) {
				System.out.println( nome +" Você está  na nossa categoria adulto.");
			} else if(idade >=15 && idade < 18) {
				System.out.println( nome +" Você está na nossa categoria Juvenil.");
			} else if(idade >=10 && idade < 15) {
				System.out.println( nome +"Você está na nossa categoria infantil.");
			}
			
		}

	}
