package familia_36;

public class cavalo extends animal {

	private int duraçaoVida;
	private String força;
	
   public cavalo (String nome, int idade, String som, String correr,int duraçaoVida, String força) {
	super(nome, idade, som, correr);
	
	this.duraçaoVida = duraçaoVida;
	this.força = força;
	
}

   //criando os métodos
public int getDuraçaoVida() {
	return duraçaoVida;
}

public void setDuraçaoVida(int duraçaoVida) {
	this.duraçaoVida = duraçaoVida;
}

public String getForça() {
	return força;
}

public void setForça(String força) {
	this.força = força;
}
   
 
   
}
