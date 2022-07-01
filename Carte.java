package projetpizza;

public class Carte {
	Menu [] liste_menu=new Menu[2];
	Pizza [] liste_pizza=new Pizza[3];
	Boisson [] liste_boisson=new Boisson[4];
	Dessert [] liste_dessert=new Dessert [2];
	
	public Carte(Menu[]liste_menu) {
		this.liste_menu=liste_menu;
		liste_menu[0]=new Menu_trio(20);
		liste_menu[1]=new Menu_geant(12);
		liste_menu[2]=new Menu_regime(10);
	}
	public Carte(Pizza[]liste_pizza) {
		this.liste_pizza=liste_pizza;
		liste_pizza[0]=new Calzone_naine();
		liste_pizza[1]=new Margherita_naine();
		liste_pizza[2]=new Quatre_fromages_naine();
		liste_pizza[3]=new Romana_naine();
		liste_pizza[4]=new Siciliana_naine();
		
		liste_pizza[5]=new Calzone_humaine();
		liste_pizza[6]=new Margherita_humaine();
		liste_pizza[7]=new Quatre_fromages_humaine();
		liste_pizza[8]=new Romana_humaine();
		liste_pizza[9]=new Siciliana_humaine();
		
		liste_pizza[10]=new Calzone_ogresse();
		liste_pizza[11]=new Margherita_ogresse();	
		liste_pizza[12]=new Quatre_fromages_ogresse();
		liste_pizza[13]=new Romana_ogresse();
		liste_pizza[14]=new Siciliana_ogresse();
	}
	public Carte(Boisson[]liste_boisson) {
		this.liste_boisson=liste_boisson;
		liste_boisson[0]=new Coca_cola();
		liste_boisson[1]=new Cocktail();
		liste_boisson[2]=new Eau();
		liste_boisson[3]=new Fanta();
		liste_boisson[3]=new Seven_UP();
	}
	public Carte(Dessert[]liste_dessert) {
		this.liste_dessert=liste_dessert;
		liste_dessert[0]=new Fondant_au_chocolat();
		liste_dessert[1]=new Fraisier();
		liste_dessert[2]=new Glace_au_chocolat();
	}

}
