package Heran�a;

public class pregui�a extends animal {

	private String alimenta�ao;
	private int qtdadeFilhotes;
	private String habitat;
	private String subir;
	
	
	
	
	public pregui�a(String nome, int idade, String som, int correr,String alimenta�ao, int qtdadeFilhotes, String habitat, String subir) {
		super(nome, idade,som,correr);
		
		this.alimenta�ao = alimenta�ao;
		this.qtdadeFilhotes = qtdadeFilhotes;
		this.habitat = habitat;
		this.setSubir(subir);
		
	}
	
	//polimorfismo metodos abstratos
	
	@Override
	public void infos() {

		System.out.println("Pregui�a");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("A alimenta�o da pregui�a �: " + getAlimenta�ao());
		System.out.println("A quantidade de filhotes que � uma pregui�a tem por gesta��o �: " + getAlimenta�ao());
		System.out.println("O seu habitat natural �: " + getHabitat());
		
	}


	@Override
	public void som(String som) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void subir(String subir) {
		System.out.println("A pregui�a est� subindo na arvore!!!");
		
	}


	
	public String getAlimenta�ao() {
		return alimenta�ao;
	}



	public void setAlimenta�ao(String alimenta�ao) {
		this.alimenta�ao = alimenta�ao;
	}



	public int getQtdadeFilhotes() {
		return qtdadeFilhotes;
	}



	public void setQtdadeFilhotes(int qtdadeFilhotes) {
		this.qtdadeFilhotes = qtdadeFilhotes;
	}



	public String getHabitat() {
		return habitat;
	}



	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}



	public String getSubir() {
		return subir;
	}



	public void setSubir(String subir) {
		this.subir = subir;
	}

	@Override
	public void correr(int correr) {
		// TODO Auto-generated method stub
		
	}
	
	

}
