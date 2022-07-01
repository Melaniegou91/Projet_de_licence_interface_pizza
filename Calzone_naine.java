package projetpizza;

import java.util.ArrayList;

public class Calzone_naine extends Naine{
	
	ArrayList <String> ingredients = new ArrayList<String>();
	
	public Calzone_naine() {
		super("Calzone",12); 
		
		ingredients.add("Tomate");
		ingredients.add("Mozzarella");
		ingredients.add("jambon");
		ingredients.add("champignons");
		ingredients.add("Origan");
		ingredients.add("jaune d'oeuf");
	}
	
	

}
