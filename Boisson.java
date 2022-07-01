package projetpizza;
import java.util.ArrayList;
public class Boisson extends Objet_de_commande{
	//attributs
		String nom_boisson;
		public static double prix_boisson;
		ArrayList <String> ingredients=new ArrayList<String>(); //liste d'ingrédients
		
		//constructeurs
		
		public Boisson(String nom_boisson, double prix_boisson) {
			this.nom_boisson=nom_boisson;
			this.prix_boisson=prix_boisson;
		}
		public Boisson(String nom_boisson) {
			this.nom_boisson=nom_boisson;
		}
}
