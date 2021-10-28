package POO;

public class infoclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente info = new cliente ("Gabriel", 19, 521455876, "Rua Carmem Miranda N_358", 986777,"Gabrielsoares@gmail.com");
		
		System.out.println("\nEsses são os dados do cliente");
		System.out.println("O nome do cliente é " + info.getNome());
		System.out.println("A idade do cliente é " + info.getIdade() + " anos ");	
		System.out.println("O endereço do cliente é " + info.getEndereço());
		System.out.println("O número para contato do cliente é " + info.getCell());
		System.out.println("O email do cliente é " + info.getEmail());

	}

}
