package Heran�a;

public class cavalo extends animal {

	private int dura�aoVida;
	private String cor;
	
	//criando o construtor
	public cavalo(String nome, int idade, String som, int  correr, int dura�aoVida,String cor) {
		super(nome, idade, som, correr);
		
		this.dura�aoVida = dura�aoVida;
		this.cor=  cor;
		
	}
   
	
	//polimorfismo metodos abstratos
   
   @Override
   public void infos() {
	   System.out.println("Cachorro");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("A dura��o de vida � de: " + getDura�aoVida());
		System.out.println("A cor do cavalo �: " + getCor());
   }

   @Override
   public void som(String som) {
	   
   	System.out.println("O cavalo come�o a Relinchar!!!");
   	
   }

   @Override
   public void correr(int correr) {
   System.out.println("O cavalo come�ou a correr em uma velocidade de: " + getCorrer()+ "Km/h");
   	
   }

   //criando os m�todos

   public int getDura�aoVida() {
	return dura�aoVida;
}

public void setDura�aoVida(int dura�aoVida) {
	this.dura�aoVida = dura�aoVida;
}




public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}
   
 
   
}
