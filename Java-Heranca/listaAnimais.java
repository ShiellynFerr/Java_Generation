package familia_36;

public class listaAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cachorro perro = new cachorro("Dengo", 3, "AUAUAUAU", "� muito brincalh�o e adora correr", "Agitado,alegre e manhoso", "vacinas em dia");
		System.out.println("O nome do cachorro �");
		System.out.println(perro.getNome());
		System.out.println("Ele possui");
		System.out.println(perro.getIdade() + " anos de vida ");
		System.out.println("O som que ele imite � ");
		System.out.println(perro.getSom());
		System.out.println("E adivinhem s�? ");
		System.out.println(perro.getCorrer());
		System.out.println("O temperamento dele �");
		System.out.println(perro.getTemperamento());
		System.out.println("E ele est� com as");
		System.out.println(perro.getVacinas());
		
		
		cavalo cava = new cavalo ("Sprit ", 17, "INAHANAHA ", " Corre muito e � veloz ", 30,"� muito forte");
		System.out.println("\nO nome do cavalo � " + cava.getNome());
		System.out.println("Ele possui" + cava.getIdade() +" anos de vida");
		System.out.println("O som que ele emite � " + cava.getSom());
		System.out.println(cava.getCorrer());
		System.out.println("Possui a expectativa de: " + cava.getDura�aoVida());
		System.out.println(cava.getFor�a());
		
		pregui�a pregui = new pregui�a ("Shiellyn",45,"ZZZZZZZZZZZ", "Ela n�o corre", "Folhas e Frutas", 1, "Natural da mata Atl�ntica e da Amaz�nia");
		System.out.println("\nO nome da pregui�a �: " + pregui.getNome());
		System.out.println(" Ela possui " + pregui.getIdade() + " anos de vida ");
		System.out.println("O som que ela emite � " + pregui.getSom());
		System.out.println(pregui.getCorrer());
		System.out.println("A alimenta��o principal dela consiste de: "+ pregui.getAlimenta�ao());
		System.out.println(" Ela tem apenas " + pregui.getQtdadeFilhotes() + "filhote por gravidez ");
		System.out.println("O seu habitat natural �: "+ pregui.getHabitat());
		pregui.subir();
	}

}
