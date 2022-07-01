package projetpizza;

import java.util.ArrayList;

public class Romana_humaine extends Humaine {
	//attributs
		ArrayList <String> ingredients=new ArrayList<String>();	
	//constructeurs
		
		public Romana_humaine () {
			super("Romana",11.10);
			ingredients.add("Tomate");
			ingredients.add("Mozzarella");
			ingredients.add("anchois");
			ingredients.add("Origan");
			
		}

}
