package ClasseoObjeto;

public class Caneta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// atributos da classe caneta
		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;

	}

	public String cor;
	public double ponta;
	protected boolean tampada;
	public String modelo;
	protected int carga;

	public void status() {

		System.out.println(" Uma caneta: " + this.cor);
		System.out.println("Est� tampada?: " + this.tampada);
		System.out.println("O modelo da caneta �: " + this.modelo);
		System.out.println("Possui a ponta: " + this.ponta);
		System.out.println("E est� com a carga em: " + this.carga + "%");
	}

	// Criando os m�todos
	public void rabiscar() {

		if (tampada == true) {
			System.out.println("ERRO! N�O POSSO RABISCAR.");
		} else {
			System.out.println("Estou rabiscando.");
		}
	}

	protected void tampar() {

		this.tampada = true;
	}

	protected void destampar() {

		this.tampada = false;
	}
}
