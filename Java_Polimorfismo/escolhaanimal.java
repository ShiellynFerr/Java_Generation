package Herança;

import java.util.Scanner;

public class escolhaanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner leia = new Scanner (System.in);
       int op;
	
		cachorro dog = new cachorro("Dengo", 4, "auauau", 6, "Docil e agitado", "Poodle");
		cavalo horse = new cavalo("Sprit", 10, "RINHÁACHCHU", 15, 30, "Caramelo");
		preguiça pregui = new preguiça("Aurora", 35, "ZZZZZZZZZ", 0, "Se alimenta de folhas e frutas", 1,
				" Mata Atlântica e Amazônia", "Sobe em arvores");
		
		do {	 // Menu de Opções
			System.out.println( "\n -----------------------------" );
			System.out.println( " \n Escolha uma opção " );	
			System.out.println ( " \n 1) CACHORRO " );	
			System.out.println( " \n 2) CAVALO " );
			System.out.println( " \n 3) BICHO-PREGUIÇA " );
			System.out.println( " \n Opção: " ); op = leia. nextInt ();
			System.out.println( " \n ----------------------------- " );
			
			switch(op) {
			
			case 1:
				System.out.println("O nome do cachorro é");
				System.out.println(dog.getNome());
				System.out.println("Ele possui");
				System.out.println(dog.getIdade() + " anos de vida ");
				System.out.println("O temperamento dele é");
				System.out.println(dog.getTemperamento());
				System.out.println("A raça dele é: ");
				System.out.println(dog.getRaca());
				
				String som = leia.nextLine(); dog. som (som);	// Lê o som digitado  dog.correr();
				int correr = leia.nextInt(); dog.correr(correr);
				break;
				
			case 2:
				
				System.out.println("O nome do cavalo é: ");
				System.out.println(horse.getNome());
				System.out.println("Ele possui");
				System.out.println(horse.getIdade() + " anos de vida ");
				System.out.println("A expectativa de vida dele é de: ");
				System.out.println(horse.getDuraçaoVida()+ "anos de vida");
				System.out.println("A cor dele é: ");
				System.out.println(horse.getCor());
				
				String som1 = leia.nextLine(); horse. som (som1);	// Lê o som digitado  dog.correr();
				int correr1 = leia.nextInt(); horse.correr(correr1);
				break;
				
			case 3:
				
				System.out.println("O nome da preguiça  é: ");
				System.out.println(pregui.getNome());
				System.out.println("Ela possui");
				System.out.println(pregui.getIdade() + " anos de vida ");
				System.out.println("A sua alimentação é baseada em: ");
				System.out.println(pregui.getAlimentaçao());
				System.out.println("Por gestação ela tem apenas " + pregui.getQtdadeFilhotes() +" filhote");
				System.out.println("O seu habitat é: " + pregui.getHabitat());
				
				
				String subir = leia.nextLine(); pregui. subir(subir);	
				
				break;
				default: System.out.println("Opção invalida, tente novamente!");
		} 
	
		} while(op !=0 ); 
		
		System.out.println("Programa finalizado");
		

	

}

}