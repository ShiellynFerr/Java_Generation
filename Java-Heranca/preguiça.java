package familia_36;

public class preguiça extends animal {

	private String alimentaçao;
	private int qtdadeFilhotes;
	private String habitat;
	
	
	
	
	public preguiça(String nome, int idade, String som, String correr,String alimentaçao, int qtdadeFilhotes, String habitat) {
		super(nome, idade,som,correr);
		// TODO Auto-generated constructor stub
		
		this.alimentaçao = alimentaçao;
		this.qtdadeFilhotes = qtdadeFilhotes;
		this.habitat = habitat;
		
	}


	public void subir() {
		System.out.println("A preguiça está subindo a arvore");
	}

	public String getAlimentaçao() {
		return alimentaçao;
	}



	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
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
