import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class coleçoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> minhalista = new ArrayList<Integer>();

		minhalista.add(2);
		minhalista.add(1);
		minhalista.add(3);
		minhalista.add(2);
		minhalista.add(1);

		for (Integer listaElementos : minhalista) {

			System.out.println(listaElementos);
		}

		System.out.println("Removendo o elemento da lista");
		System.out.println();
		minhalista.remove(0);

		for (Integer listaElementos : minhalista) {

			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhalista.get(0);
		System.out.println("O primeiro elemento é: " + primeiroElemento);
		
		//metodo size conta o tamanho do array list
		System.out.println();
		for(int i =0 ; i<minhalista.size();i++) {
			
			System.out.println("Elemento: "+minhalista.get(i));
			
		}
		
		//ordena o array list
		Collections.sort(minhalista);
		System.out.println("Depois de ordenado");
		System.out.println(minhalista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		
		//uma api derivado do meu collection
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		//enquanto for verdade ele vai rodando
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
	}

}
