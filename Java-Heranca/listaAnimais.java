package familia_36;

public class listaAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cachorro perro = new cachorro("Dengo", 3, "AUAUAUAU", "É muito brincalhão e adora correr", "Agitado,alegre e manhoso", "vacinas em dia");
		System.out.println("O nome do cachorro é");
		System.out.println(perro.getNome());
		System.out.println("Ele possui");
		System.out.println(perro.getIdade() + " anos de vida ");
		System.out.println("O som que ele imite é ");
		System.out.println(perro.getSom());
		System.out.println("E adivinhem só? ");
		System.out.println(perro.getCorrer());
		System.out.println("O temperamento dele é");
		System.out.println(perro.getTemperamento());
		System.out.println("E ele está com as");
		System.out.println(perro.getVacinas());
		
		
		cavalo cava = new cavalo ("Sprit ", 17, "INAHANAHA ", " Corre muito e é veloz ", 30,"É muito forte");
		System.out.println("\nO nome do cavalo é " + cava.getNome());
		System.out.println("Ele possui" + cava.getIdade() +" anos de vida");
		System.out.println("O som que ele emite é " + cava.getSom());
		System.out.println(cava.getCorrer());
		System.out.println("Possui a expectativa de: " + cava.getDuraçaoVida());
		System.out.println(cava.getForça());
		
		preguiça pregui = new preguiça ("Shiellyn",45,"ZZZZZZZZZZZ", "Ela não corre", "Folhas e Frutas", 1, "Natural da mata Atlântica e da Amazônia");
		System.out.println("\nO nome da preguiça é: " + pregui.getNome());
		System.out.println(" Ela possui " + pregui.getIdade() + " anos de vida ");
		System.out.println("O som que ela emite é " + pregui.getSom());
		System.out.println(pregui.getCorrer());
		System.out.println("A alimentação principal dela consiste de: "+ pregui.getAlimentaçao());
		System.out.println(" Ela tem apenas " + pregui.getQtdadeFilhotes() + "filhote por gravidez ");
		System.out.println("O seu habitat natural é: "+ pregui.getHabitat());
		pregui.subir();
	}

}
