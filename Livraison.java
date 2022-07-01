package projetpizza;
import java.util.Scanner;
public class Livraison {
	public static int mode_livraison;
	public static double temps_livraison;
	public static String nom_vehicule;
	
	// Cette méthode permet au livreur d'indiquer son temps de livraison et son mode de transport
	public static void mode_livraison() {
		System.out.println("* *");
		System.out.println("*Livreur*");
		System.out.println("* *");
		Scanner clav=new Scanner(System.in);
		System.out.println("Veuillez saisir le temps de livraison");
		temps_livraison=clav.nextInt();
		do {
			
			System.out.println("Par quel mode de transport vous deplacez vous : voiture(1),moto(2) ou velo(3)");
			mode_livraison=clav.nextInt();
			}while (mode_livraison!=1 && mode_livraison!=2 && mode_livraison!=3);
			if(mode_livraison==1) {
				nom_vehicule="voiture";
				
			}else if(mode_livraison==2) {
				nom_vehicule="moto";
			}else if(mode_livraison==3) {
				nom_vehicule="velo";
			}
	}


}
