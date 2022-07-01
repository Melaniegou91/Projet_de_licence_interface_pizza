package projetpizza;

import java.util.ArrayList;

public class Siciliana_naine extends Naine{
	//attributs
	
		ArrayList <String> ingredients=new ArrayList<String>();
		//constructeurs
		public Siciliana_naine () {
			super("Siciliana",12.50);
			ingredients.add("Tomate");
			ingredients.add("Mozzarella");
			ingredients.add("jambon");
			ingredients.add("olive");
			ingredients.add("Origan");
			
		}

}
