package projetpizza;

import java.util.ArrayList;

public class Margherita_naine extends Naine {
	//attributs
		ArrayList <String> ingredients=new ArrayList<String>();
		
		public Margherita_naine() {
			super("Margherita",12.50);
			ingredients.add("Tomate");
		    ingredients.add("Mozzarella");
		    ingredients.add("Origan");
		}

}
