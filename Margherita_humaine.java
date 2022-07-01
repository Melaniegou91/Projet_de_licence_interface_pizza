package projetpizza;

import java.util.ArrayList;

public class Margherita_humaine extends Humaine{
	//attributs
		ArrayList <String> ingredients=new ArrayList<String>();
		
		public Margherita_humaine () {
			super("Margherita",12.50);
			ingredients.add("Tomate");
		    ingredients.add("Mozzarella");
		    ingredients.add("Origan");
		    
		}

}
