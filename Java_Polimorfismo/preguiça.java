package Herança;

public class preguiça extends animal {

	private String alimentaçao;
	private int qtdadeFilhotes;
	private String habitat;
	private String subir;
	
	
	
	
	public preguiça(String nome, int idade, String som, int correr,String alimentaçao, int qtdadeFilhotes, String habitat, String subir) {
		super(nome, idade,som,correr);
		
		this.alimentaçao = alimentaçao;
		this.qtdadeFilhotes = qtdadeFilhotes;
		this.habitat = habitat;
		this.setSubir(subir);
		
	}
	
	//polimorfismo metodos abstratos
	
	@Override
	public void infos() {

		System.out.println("Preguiça");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("A alimentaão da preguiça é: " + getAlimentaçao());
		System.out.println("A quantidade de filhotes que é uma preguiça tem por gestação é: " + getAlimentaçao());
		System.out.println("O seu habitat natural é: " + getHabitat());
		
	}


	@Override
	public void som(String som) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void subir(String subir) {
		System.out.println("A preguiça está subindo na arvore!!!");
		
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
