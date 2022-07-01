package projetpizza;
import java.util.ArrayList;
public class Romana_ogresse extends Ogresse {
	//attributs
		ArrayList <String> ingredients=new ArrayList<String>();
		
		//constructeurs

		public Romana_ogresse() {
		super("Romana",11.10);
		ingredients.add("Tomate");
		ingredients.add("Mozzarella");
		ingredients.add("anchois");
		ingredients.add("Origan");
		}


}
