package projetpizza;

public class Menu_geant extends Menu {
	//Attributs
	public static double prix_menu ;
	int quantite_pizza=1;
	int quantite_boisson=1;
	int quantite_dessert=1;
	

	//Constructeur
	public Menu_geant (double prix_menu ) {
		super("Menu géant",12.00);
		this.prix_menu=prix_menu;
		
	}
	
	
	
}
