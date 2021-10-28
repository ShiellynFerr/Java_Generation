package POO;

public class cliente {

	private String nome;
	private int idade;
	private String endereco;
	private int cpf;
	private double cell;
	private String email;
	
	

	

	public cliente (String nome,int idade, int cpf, String endereco, double cell,String email)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
		this.cell = cell;
		this.email = email;
	}
	
	public void ImprimirInfo()
	{
		System.out.println("\nCliente: "+nome+"\nDe idade: "+idade+"\nPortador do CPF Nº: "+cpf+"\nResidente no endereço: "+endereco);
	}
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

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public double getCell() {
		return cell;
	}

	public void setCell(double cell) {
		this.cell = cell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

