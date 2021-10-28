package Herança;

public abstract class animal {

	//criando os atributos da classe animal
	private String nome;
	private int idade;
	private String som;
	private int correr;
	
	
	//criando construtor
	public animal (String nome, int idade, String som, int correr) {
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.setCorrer(correr);
				
	}
	
	abstract public void infos();
	abstract public void som(String som);
	abstract public void correr(int correr);
	
	

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getCorrer() {
		return correr;
	}

	public void setCorrer(int correr) {
		this.correr = correr;
	}

	public void subir(String subir) {
	
		
	}

	
	


	
	
	
	
	
	
	
}
