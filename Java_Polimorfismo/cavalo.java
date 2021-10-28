package Herança;

public class cavalo extends animal {

	private int duraçaoVida;
	private String cor;
	
	//criando o construtor
	public cavalo(String nome, int idade, String som, int  correr, int duraçaoVida,String cor) {
		super(nome, idade, som, correr);
		
		this.duraçaoVida = duraçaoVida;
		this.cor=  cor;
		
	}
   
	
	//polimorfismo metodos abstratos
   
   @Override
   public void infos() {
	   System.out.println("Cachorro");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("A duração de vida é de: " + getDuraçaoVida());
		System.out.println("A cor do cavalo é: " + getCor());
   }

   @Override
   public void som(String som) {
	   
   	System.out.println("O cavalo começo a Relinchar!!!");
   	
   }

   @Override
   public void correr(int correr) {
   System.out.println("O cavalo começou a correr em uma velocidade de: " + getCorrer()+ "Km/h");
   	
   }

   //criando os métodos

   public int getDuraçaoVida() {
	return duraçaoVida;
}

public void setDuraçaoVida(int duraçaoVida) {
	this.duraçaoVida = duraçaoVida;
}




public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}
   
 
   
}
