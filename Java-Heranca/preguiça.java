package familia_36;

public class pregui�a extends animal {

	private String alimenta�ao;
	private int qtdadeFilhotes;
	private String habitat;
	
	
	
	
	public pregui�a(String nome, int idade, String som, String correr,String alimenta�ao, int qtdadeFilhotes, String habitat) {
		super(nome, idade,som,correr);
		// TODO Auto-generated constructor stub
		
		this.alimenta�ao = alimenta�ao;
		this.qtdadeFilhotes = qtdadeFilhotes;
		this.habitat = habitat;
		
	}


	public void subir() {
		System.out.println("A pregui�a est� subindo a arvore");
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
	
	

}
