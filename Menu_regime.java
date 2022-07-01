package projetpizza;

public class Menu_regime extends Menu {
	//Attributs
	public static double prix_menu ;
	int quantite_pizza=1;
	int quantite_boisson=1;
	int quantite_dessert=1;
	

	
	public Menu_regime (double prix_menu) {
		super("Menu regime",10);
		this.prix_menu=prix_menu;
		
	}

}
