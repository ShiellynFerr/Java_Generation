package familia_36;

public class cachorro extends animal{

	
	//criando os atributos 	
	private String temperamento;
	private String  vacinas;

	public cachorro(String nome, int idade, String som, String correr,String temperamento, String vacinas) {
		super(nome, idade, som, correr);
		
		this.temperamento = temperamento;
		this.vacinas = vacinas;
		
	}
	
	//criando os métodos

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getVacinas() {
		return vacinas;
	}

	public void setVacinas(String vacinas) {
		this.vacinas = vacinas;
	}
	
	
}

