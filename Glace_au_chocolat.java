package projetpizza;
import java.util.ArrayList;
public class Glace_au_chocolat extends Dessert{
	
    //attributs
	ArrayList <String> ingredients=new ArrayList<String>();
	
	//constructeurs
	
	public Glace_au_chocolat () {
		super("Glace au chocolat",6.00);
		ingredients.add("glace");
		ingredients.add("chocolat");
	}

}
