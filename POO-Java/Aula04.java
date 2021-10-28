package Getandset;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta c1 = new Caneta("Nic", "Rosa", (float) 0.5);
		
		//métodos que protegem o acesso ao atributo diretamente
       
		//c1.setModelo("BIC Cristal");
		//c1.setPonta(0.5f);
		c1.status();
		
		//System.out.println(" Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}

}
