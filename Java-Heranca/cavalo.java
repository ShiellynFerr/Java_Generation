package familia_36;

public class cavalo extends animal {

	private int dura�aoVida;
	private String for�a;
	
   public cavalo (String nome, int idade, String som, String correr,int dura�aoVida, String for�a) {
	super(nome, idade, som, correr);
	
	this.dura�aoVida = dura�aoVida;
	this.for�a = for�a;
	
}

   //criando os m�todos
public int getDura�aoVida() {
	return dura�aoVida;
}

public void setDura�aoVida(int dura�aoVida) {
	this.dura�aoVida = dura�aoVida;
}

public String getFor�a() {
	return for�a;
}

public void setFor�a(String for�a) {
	this.for�a = for�a;
}
   
 
   
}
