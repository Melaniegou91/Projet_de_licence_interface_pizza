package projetpizza;

import java.util.ArrayList;

public class Pizza extends Objet_de_commande{
	//attributs
		String nom_pizza;
		ArrayList <String> ingredients=new ArrayList<String>(); //liste d'ingrédients
		public static double prix_pizza_normale;
		
		
		public Pizza(String nom_pizza,ArrayList <String> ingredients, double prix_pizza_normale) {
			this.nom_pizza=nom_pizza;
			this.ingredients=ingredients;
			this.prix_pizza_normale=prix_pizza_normale;
		}



		//constructeurs

	public Pizza (String nom_pizza, double prix_pizza_normale){
		this.nom_pizza=nom_pizza;
		this.prix_pizza_normale=prix_pizza_normale;
	}
	
	public Pizza (String nom_pizza) {
		this.nom_pizza=nom_pizza;
		
	}


	
		

		
		
		//méthodes

	/*public void faire_la_pizza(String nom_pizza, double prix_pizza_normale) {
		if(nom_pizza=="Margherita") {
			ingredients.add("Tomate");
		    ingredients.add("Mozzarella");
		    ingredients.add("Origan");
		    
		    prix_pizza_normale=12.50;
		    
		} else if (nom_pizza=="Siciliana") {
			ingredients.add("Tomate");
			ingredients.add("Mozzarella");
			ingredients.add("jambon");
			ingredients.add("olive");
			ingredients.add("Origan");
			
			prix_pizza_normale=12.50;
			
		}else if (nom_pizza=="Romana") {
			ingredients.add("Tomate");
			ingredients.add("Mozzarella");
			ingredients.add("anchois");
			ingredients.add("Origan");
			
			prix_pizza_normale=11.10;
		
		
	    }else if (nom_pizza=="Calzone") {
		    ingredients.add("Tomate");
		    ingredients.add("Mozzarella");
		    ingredients.add("jambon");
		    ingredients.add("champignons");
		    ingredients.add("Origan");
		    ingredients.add("jaune d'oeuf");
		
	    	prix_pizza_normale=12.50;
		
	    }else if (nom_pizza=="4 fromages") {
		    ingredients.add("Tomate");
		    ingredients.add("Mozzarella");
		    ingredients.add("gorgonzolla");
		    ingredients.add("parmesan");
		    ingredients.add("Origan");
		    ingredients.add("brie");
		
		    prix_pizza_normale=13.75;
		
	}
	}*/

}
