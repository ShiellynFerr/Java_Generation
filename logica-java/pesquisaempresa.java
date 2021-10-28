package PacoteJava;

import java.util.Scanner;

public class pesquisaempresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int sexo,idade,temperamento,pessoasN40=0,cal,outrosCal=0,mulheresN=0,homensA=0,calmMenos18=0,x=0;
		
		
			
		while(x<2) {
			
			System.out.println("Olá por favor digite qual é o seu sexo, escolha (1) "
					+ "para feminino e (2) para Masculino e (3) para Outros");
			sexo = leia.nextInt ();
			System.out.println("Agora informe a sua idade");
			idade = leia.nextInt();
			System.out.println("E por fim informe o seu temperamento: Para calma(o) digite (1),"
					+ " Para  nervosa(o) digite(2), Para agressiva(o) digite(3)");
			temperamento = leia.nextInt();
			
			if (sexo == 1 && temperamento == 2) {
				mulheresN++;
			} if (sexo == 2 && temperamento == 3) {
				homensA++;
			} if(temperamento == 1) {
				outrosCal++;
			} if (temperamento == 1 && idade<18) {
				calmMenos18++;
			} if (temperamento == 2 && idade >40) {
				pessoasN40++;
			}
			
			System.out.println("O número de pessoas calmas é igual a: "+ outrosCal);
			System.out.println("O número de mulheres nervosas é igual a: " + mulheresN);
			System.out.println("O número de homens agressivos é igual a: " + homensA);
			System.out.println("o número de pessoas nervosas com mais de 40 anos é igual a: " + pessoasN40);
			System.out.println("O número de pessoas calmas com menos de 17 anos é igual a: "+ calmMenos18);
		} 
		
		
		
		
	}

}
