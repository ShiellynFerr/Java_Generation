package Heran�a;

import java.util.Scanner;

public class escolhaanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner leia = new Scanner (System.in);
       int op;
	
		cachorro dog = new cachorro("Dengo", 4, "auauau", 6, "Docil e agitado", "Poodle");
		cavalo horse = new cavalo("Sprit", 10, "RINH�ACHCHU", 15, 30, "Caramelo");
		pregui�a pregui = new pregui�a("Aurora", 35, "ZZZZZZZZZ", 0, "Se alimenta de folhas e frutas", 1,
				" Mata Atl�ntica e Amaz�nia", "Sobe em arvores");
		
		do {	 // Menu de Op��es
			System.out.println( "\n -----------------------------" );
			System.out.println( " \n Escolha uma op��o " );	
			System.out.println ( " \n 1) CACHORRO " );	
			System.out.println( " \n 2) CAVALO " );
			System.out.println( " \n 3) BICHO-PREGUI�A " );
			System.out.println( " \n Op��o: " ); op = leia. nextInt ();
			System.out.println( " \n ----------------------------- " );
			
			switch(op) {
			
			case 1:
				System.out.println("O nome do cachorro �");
				System.out.println(dog.getNome());
				System.out.println("Ele possui");
				System.out.println(dog.getIdade() + " anos de vida ");
				System.out.println("O temperamento dele �");
				System.out.println(dog.getTemperamento());
				System.out.println("A ra�a dele �: ");
				System.out.println(dog.getRaca());
				
				String som = leia.nextLine(); dog. som (som);	// L� o som digitado  dog.correr();
				int correr = leia.nextInt(); dog.correr(correr);
				break;
				
			case 2:
				
				System.out.println("O nome do cavalo �: ");
				System.out.println(horse.getNome());
				System.out.println("Ele possui");
				System.out.println(horse.getIdade() + " anos de vida ");
				System.out.println("A expectativa de vida dele � de: ");
				System.out.println(horse.getDura�aoVida()+ "anos de vida");
				System.out.println("A cor dele �: ");
				System.out.println(horse.getCor());
				
				String som1 = leia.nextLine(); horse. som (som1);	// L� o som digitado  dog.correr();
				int correr1 = leia.nextInt(); horse.correr(correr1);
				break;
				
			case 3:
				
				System.out.println("O nome da pregui�a  �: ");
				System.out.println(pregui.getNome());
				System.out.println("Ela possui");
				System.out.println(pregui.getIdade() + " anos de vida ");
				System.out.println("A sua alimenta��o � baseada em: ");
				System.out.println(pregui.getAlimenta�ao());
				System.out.println("Por gesta��o ela tem apenas " + pregui.getQtdadeFilhotes() +" filhote");
				System.out.println("O seu habitat �: " + pregui.getHabitat());
				
				
				String subir = leia.nextLine(); pregui. subir(subir);	
				
				break;
				default: System.out.println("Op��o invalida, tente novamente!");
		} 
	
		} while(op !=0 ); 
		
		System.out.println("Programa finalizado");
		

	

}

}