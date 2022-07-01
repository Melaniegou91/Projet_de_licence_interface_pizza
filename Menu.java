package projetpizza;

public class Menu extends Objet_de_commande {

	//attributs
		double prix_menu;
		String nom_menu;
		int quantite_menu;
	
	   public Menu(String nom_menu, double prix_menu) {
	   this.nom_menu=nom_menu;
	   this.prix_menu=prix_menu;
	   }
	   

}


