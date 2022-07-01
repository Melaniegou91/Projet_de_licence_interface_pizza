package projetpizza;
import java.util.ArrayList;
public class Fraisier extends Dessert {
	
	//attributs
	ArrayList <String> ingredients=new ArrayList<String>();
	
	//constructeurs
	
	public Fraisier () {
		super("Fraisier",7.50);
		ingredients.add("pâte");
		ingredients.add("fraise");
		
	}
	

}

