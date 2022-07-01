package projetpizza;
import java.util.ArrayList;
public class Stock {
	ArrayList <Ingredients> stock_ingredients = new ArrayList<Ingredients>();
	Ingredients tomate = new Ingredients(12,"Tomate");
	Ingredients mozzarella = new Ingredients(12,"Mozzarella");
	Ingredients parmesan = new Ingredients(12,"Parmesan");
	Ingredients origan = new Ingredients(12,"Origan");
	Ingredients brie = new Ingredients(12,"Brie");
	Ingredients olive = new Ingredients(12,"Olive");
	public Stock() {
		stock_ingredients.add(this.tomate);
	    stock_ingredients.add(this.mozzarella);
	    stock_ingredients.add(this.parmesan);
	    stock_ingredients.add(this.origan);
	    stock_ingredients.add(this.brie);
	    stock_ingredients.add(this.olive);
	
		
	}
	
	public void commande_realisable() {
		if (Ingredients.nombre_ingredients<=0) {
			
		}
	}
/*public void mis_a_jour() {
	boolean verifier_ingredients=false;
	System.out.println("Le numéro est:"+ingredients);
	for (Ingredients stock : this.stock_ingredients) {				
		if (compte.getNumero() == numero ) {
			verifier_numero = true;
			return compte;
		}
	}
	if(verifier_numero == false) { 
		System.out.println("Création du compte en cours :) ");
	}
		
	
	return null;
	
	
}*/
}
