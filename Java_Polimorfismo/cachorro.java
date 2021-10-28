package Herança;

public class cachorro extends animal{

	
	//criando os atributos 	
	private String temperamento;
	private String raca;

	//criando o construtor
	public cachorro(String nome, int idade, String som, int  correr,String temperamento, String raca) {
		super(nome, idade, som, correr);
		
		this.temperamento = temperamento;
		this.raca=  raca;
		
		
	}
	
	public void cachorro1(String nome, int idade, String som, int correr, String temperamento2, String raca2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void infos(){
		
		System.out.println("Cachorro");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Raça: " + getRaca());
		System.out.println("Temperamento: " + getTemperamento());
	}
	
	@Override
	public void som(String som) {
		
		System.out.println("O cachorro começou a latir!!! " +som);
	}
	
	@Override
	public void correr(int correr) {
		System.out.println("O cachorro começou a correr em uma velocidade de: " + getCorrer()+ "Km/h!!SS");
	}
	
	
	//criando os métodos

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
		
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	

	
	
	
}

