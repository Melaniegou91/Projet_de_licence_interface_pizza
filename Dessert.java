package projetpizza;

import java.util.ArrayList;

public class Dessert extends Objet_de_commande{
	//attributs
		String nom_dessert;
		public static double prix_dessert;
		ArrayList <String> ingredients=new ArrayList<String>();
		
		//constructeurs
		
		public Dessert(String nom_dessert, double prix_dessert) {
			this.nom_dessert=nom_dessert;
			this.prix_dessert=prix_dessert;
		}
		public Dessert(String nom_dessert) {
			this.nom_dessert=nom_dessert;
		}
		
		
}
