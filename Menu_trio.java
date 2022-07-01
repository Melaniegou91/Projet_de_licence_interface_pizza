package projetpizza;

public class Menu_trio extends Menu {
	public static double prix_menu;
	int quantite_pizza=3;
	int quantite_boisson=3;
	int quantite_dessert=3;
	
	
	public Menu_trio (double prix_menu) {
		super ("menu trio",15);
		this.prix_menu=prix_menu;
		
	}
}
