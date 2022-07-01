package projetpizza;

import java.util.ArrayList;

public class Siciliana_humaine extends Humaine{
	//attributs
			ArrayList <String> ingredients=new ArrayList<String>();
			int quantite_pizza;
		//constructeurs
			
			public Siciliana_humaine () {
				super("Siciliana",12.50);
				ingredients.add("Tomate");
				ingredients.add("Mozzarella");
				ingredients.add("jambon");
				ingredients.add("olive");
				ingredients.add("Origan");
				
			}


}
