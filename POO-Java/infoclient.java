package POO;

public class infoclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente info = new cliente ("Gabriel", 19, 521455876, "Rua Carmem Miranda N_358", 986777,"Gabrielsoares@gmail.com");
		
		System.out.println("\nEsses s�o os dados do cliente");
		System.out.println("O nome do cliente � " + info.getNome());
		System.out.println("A idade do cliente � " + info.getIdade() + " anos ");	
		System.out.println("O endere�o do cliente � " + info.getEndere�o());
		System.out.println("O n�mero para contato do cliente � " + info.getCell());
		System.out.println("O email do cliente � " + info.getEmail());

	}

}
