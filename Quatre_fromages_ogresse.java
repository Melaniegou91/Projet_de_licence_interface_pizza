package projetpizza;

import java.util.ArrayList;

public class Quatre_fromages_ogresse extends Ogresse{
	
	ArrayList <String> ingredients = new ArrayList<String>();
	
	public Quatre_fromages_ogresse() {
		super("Quatres fromages", 13.75);
		ingredients.add("Tomate");
	    ingredients.add("Mozzarella");
	    ingredients.add("gorgonzola");
	    ingredients.add("parmesan");
	    ingredients.add("Origan");
	    ingredients.add("brie");
		
	}

}
