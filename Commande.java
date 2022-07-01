package projetpizza;

import java.util.Scanner;

public class Commande{
	//attributs
		Compte_client nom;
		String nom_pizza;
		int quantite_pizza;
		String lieu_fabrication;
		double temps_livraison;
		static double prix = Serveur.compte_boisson* Boisson.prix_boisson + Serveur.compte_dessert*Dessert.prix_dessert + Serveur.compte_pizza*Pizza.prix_pizza_normale+ Serveur.compte_menu_trio*Menu_trio.prix_menu + Serveur.compte_menu_regime*Menu_regime.prix_menu+ Serveur.compte_menu_geant*Menu_geant.prix_menu;
		static int num_commande;
		static double prix_final; 
		
		
		 //constructeurs
		public Commande(Compte_client nom,String nom_pizza, int quantite_pizza, String lieu_fabrication, double temps_livraison) {
			this.nom=nom;
			this.nom_pizza=nom_pizza;
			this.quantite_pizza=quantite_pizza;
			this.lieu_fabrication=lieu_fabrication;
			this.temps_livraison=temps_livraison;
		}

		 //méthodes
		
public static void commande() {
	Serveur.choix_repas();
	System.out.println("Vous avez commandé : "+ Serveur.compte_pizza + " pizzas");
	
}
	//Cette méthode affiche le prix final à payer, si le temps dépasse 30 min on réduit de moitié le prix du menu et les pizzas sont offertes

public static void prix_a_payer(){
if (Livraison.temps_livraison >30) {
	
	prix_final = Serveur.compte_boisson* Boisson.prix_boisson + Serveur.compte_dessert*Dessert.prix_dessert + Serveur.compte_pizza*0+ Serveur.compte_menu_trio*7.50 + Serveur.compte_menu_regime*5+ Serveur.compte_menu_geant*6;
	System.out.println(" ");
	System.out.println(" *Client* ");
	System.out.println(" ");
	System.out.println("Le temps de livraison étant supérieur à 30 min, vous devez payez : "+ Commande.prix_final);
	System.out.println("Le livreur vous livrera par :"+ Livraison.nom_vehicule);
	
	
}else if(Livraison.temps_livraison <30) {
	System.out.println(" ");
	System.out.println(" *Client* ");
	System.out.println(" ");
	System.out.println(" vous devez payez : "+ Commande.prix);
	System.out.println("Le livreur vous livrera par :"+ Livraison.nom_vehicule);
		
}
}
public static void creer_num_commande() {
	for (int i=0;i<200;i++) {
	    num_commande++;
	}
}
}
