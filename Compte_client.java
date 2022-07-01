package projetpizza;
import java.util.Scanner;
public class Compte_client {
	  //attributs
			private String nom_client;
			private double solde;
			private int num_carte_client;
			private int num_tel_client;
			
			
			
			//constructeurs
			public Compte_client(String nom_client, int num_tel_client, double solde, int num_carte_client) {
				this.nom_client=nom_client;
				this.num_tel_client=num_tel_client;
				this.solde=solde;
				this.num_carte_client=num_carte_client;
			}
			
			/* les méthodes get et set permettent respectivement d'accéder et modifier les attributs */
			// La methode toString permet d'afficher
			public String toString() {
				return("Compte { num tel : "+num_tel_client+ " nom :" + nom_client+" solde :"+solde+ " num_carte_client :"+num_carte_client+"}");
			}	
				
			public int getNumero() {
				return num_tel_client;
			}
			
			public void setNumero(int num_tel_client) {
				this.num_tel_client= num_tel_client;
			}
			public String getNomClient() {
				return nom_client;
			}
			
			public void setNomClient(String nom_client) {
				this.nom_client=nom_client;
			}
			public double getSolde() {
				return solde;
			}
			
			public void setSolde(int solde) {
				this.solde=solde;
			}
			
	
		    //méthodes
		
		
		public static void pizza_gratuite() { //permet de savoir si on peut avoir une pizza gratuitement
			if(Serveur.compte_pizza_h>=10) {
				System.out.println("Une pizza gratuite vous est offerte:)!");
			//On remet à zéro l'historique pour ne pas cumuler des pizzas gratuites, après avoir atteint les 10 pizzas
			}
			else {
				System.out.println("Il vous reste "+(10-Serveur.compte_pizza_h)+"  pizzas à acheter pour avoir une pizza offerte!");
			}

		}
		
		//permet de savoir si on est en mesure de payer avec la carte ou si il faut la recharger
		
		public void acceptation_paiement(){
			System.out.println("Carte reconnue.");
		if (this.solde<Commande.prix) {
			System.out.println("Il faut recharger votre compte.");
		}
		else {
			this.solde=solde-Commande.prix;
			System.out.println("Vous pouvez payer votre commande.");
		}
		}
		// Cette méthode permet de savoir si la carte était valide, pour cela l'utilisateur a droit à 3 essais
		public void paiement_carte() {
			Scanner clav=new Scanner(System.in);
			int num_carte;
			System.out.println("Veuillez saisir votre n° de carte (dans la demo le num est toujours 99 ): ");
			num_carte=clav.nextInt();
			
			if (num_carte==this.num_carte_client) {
				acceptation_paiement();
			}
			else {
				System.out.println("Carte inconnue. Il vous reste 2 essais.");
				int num_carte_2;
				System.out.println("Veuillez saisir de nouveau un n° de carte valide: ");
				num_carte_2=clav.nextInt();
				if(num_carte_2==this.num_carte_client) {
					acceptation_paiement();
				}
				else {
					System.out.println("Carte inconnue. Il vous reste 1 essai");
					int num_carte_3;
					System.out.println("Veuillez saisir de nouveau un n° de carte valide: ");
					num_carte_3=clav.nextInt();
					if (num_carte_3==this.num_carte_client) {
						acceptation_paiement();
					}
					else {
						System.out.println("Carte bloquée.");
					}
					
				}
			}
					
		}
}
