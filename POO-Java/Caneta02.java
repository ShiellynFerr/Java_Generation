package Getandset;

public class Caneta02 {

	public	String modelo;
	private String cor;
	private	float ponta;
	private boolean tampada;



	//criando construtor
	public Caneta02(String m, String c, float p) {
		// TODO Auto-generated constructor stub
		
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	}


	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = (float) p;
	}
	
	public void tampar () {
		this.tampada = true;
	}

	public void destampar () {
		this.tampada = false;
	}
	public void status () {
		System.out.println("Informações da caneta");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor " + this.cor);
		System.out.println("Tampada " + this.tampada);
	}



	}


