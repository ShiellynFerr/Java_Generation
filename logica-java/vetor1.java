package PacoteJava;

public class vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetorA [] = {1,0,5,-2,-5,7};
		int somaV=0, x;
		
		
	
		
		for(x=0; x<vetorA.length; x++) {
			somaV=vetorA[0]+vetorA[1]+vetorA[5];
			vetorA[4]=100;
		}
       System.out.println("A soma dos vetores é:"+somaV);
       System.out.println("O valor do vetor 4 é:"+vetorA[4]);
       
       for(x=0;x<vetorA.length; x++) {System.out.println("Os valores dos vetores são:"+vetorA[x]);}
       
}
	
}
