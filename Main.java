package projetpizza;

import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			BD_clients BDD_clients = new BD_clients();
			

			Scanner clav = new Scanner(System.in);
			boolean app=true;
			do {
				
				int choix;
				do {
					System.out.println("Veuillez choisir une option :");
					System.out.println(" Fermer l'application : (0)");
					System.out.println(" creer un new compte : (1)");
					System.out.println(" Faire la commande (2)");
					
					choix=clav.nextInt();	
					
				} while (choix != 0 && choix!=1 && choix!=2);
				
				switch(choix) {
				
					case 0 :
						System.out.println("L'application est fermé");
						app=false;
						break;
					case 1 :
						BDD_clients.lancement_creation_compte();
						System.out.println(BDD_clients);
						break;
					case 2:
						
						
						Compte_client mon_compte = BDD_clients.lancement_creation_compte();
						System.out.println(BDD_clients);
						Serveur.choix_repas();
						System.out.println(" Le prix de votre commande est estimé à : "+ Commande.prix + " euros");
						System.out.println(" Votre numéro de commande est : n°"+ Commande.num_commande );
						Livraison.mode_livraison();
						Commande.prix_a_payer();
						Compte_client.pizza_gratuite();
						mon_compte.paiement_carte();
						
						break;
						
				}
			} while(app);
		
			
			
		}	
	
}

