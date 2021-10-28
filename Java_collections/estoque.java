import java.util.ArrayList;
import java.util.Scanner;

public class estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		System.out.println("  ____           _       _                            \r\n"
				+ " |  _ \\    ___  | |_    | |       ___   __   __   ___ \r\n"
				+ " | |_) |  / _ \\ | __|   | |      / _ \\  \\ \\ / /  / _ \\\r\n"
				+ " |  __/  |  __/ | |_    | |___  | (_) |  \\ V /  |  __/\r\n"
				+ " |_|      \\___|  \\__|   |_____|  \\___/    \\_/    \\___|\r\n"
				+ "");
		System.out.println("Seja bem vindo ao nosso Pet shop");
		
			do
			{
				System.out.println("\n----------------------------------------------------");
				System.out.println("\n1-Você gostaria de adicionar produtos ao estoque do pet shop?");
				System.out.println("\n2- -Você deseja remover produtos do estoque?");
				System.out.println("\n3- Você gostaria de atualizar produtos do estoque?");
				System.out.println("\n4- Você gostaria de consultar todos os produtos do estoque?");
				System.out.println("\n0- Deseja sair do programa?");
				System.out.println("\n----------------------------------------------------");
				System.out.println("\nDigite sua opção: ");
				op = ler.nextInt();
				
				switch(op)
				{
				case 1: 
					ler.nextLine();
					System.out.println("\nDigite o produto para adicionar ao estoque: ");
					String produto = ler.nextLine();
					estoque.add(produto);
					System.out.println("Você adicionou " + produto+ ", seu produto foi adicinado ao estoque");
					break;
					
				case 2:
					ler.nextLine();
					System.out.println("\nDigite o produto para remover do estoque: ");
					String produtoRemov = ler.nextLine();
					if(estoque.contains(produtoRemov)) //verficando se tem o produto dentro do meu estoque, se tiver eu posso remover
					{
						estoque.remove(produtoRemov);
					}
					else {
						System.out.println("Produto não encontrado no estoque!");
					}
					break;
					
				case 3: 
					ler.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String verifica = ler.nextLine();
					System.out.println("\nDigite o nome do produto que entrará no lugar do: "+verifica+" : ");
					String novo = ler.nextLine();
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}else {
						System.out.println("Produto não encontrado no estoque!");
					}
					break;
					
				case 4:
					ler.nextLine();
					System.out.println("\nProdutos do estoque: ");
					System.out.println(estoque);
					break;
				default: 
					System.out.println("\nOpção Inválida!");
				}
				
			}while(op != 0);

	

}

}	
