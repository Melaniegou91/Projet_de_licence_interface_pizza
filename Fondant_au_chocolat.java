package projetpizza;

import java.util.ArrayList;
public class Fondant_au_chocolat extends Dessert {
	//attributs
	ArrayList <String> ingredients=new ArrayList<String>();
	
//constructeurs
	
	public Fondant_au_chocolat () {
		super("Fondant au chocolat",7.00);
		ingredients.add("chocolat");
		ingredients.add("glace vanille");
		ingredients.add("sauce chocolat");
		
	}



}
