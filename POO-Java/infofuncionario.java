package POO;

import java.util.Scanner;

public class infofuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		funcionario func = new funcionario();
		func.setNome("Bruna");
		func.setIdade(23);
		func.setCodigoTrab(67);
		func.setTempoDeTrab(2);
		func.setSalario(3000);
		
		
		
		System.out.println("\nEsses s�o os dados do funcionario(a)");
		System.out.println("O nome do funcionario(a) � " + func.getNome());
		System.out.println("A idade do funcionario(a) � " + func.getIdade());	
		System.out.println("O seu c�digo identificador � " + func.getCodigoTrab());
		System.out.println("O seu tempo de trabalho na empresa � de " + func.getTempoDeTrab() + " anos ");
		System.out.println("O seu sal�rio � R$ " + func.getSalario()+ " reais ");
		
		} 
	}


