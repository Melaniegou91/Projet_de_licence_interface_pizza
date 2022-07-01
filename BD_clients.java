package projetpizza;
import java.util.Scanner;
import java.util.ArrayList;
public class BD_clients {
	
	private int dernierNumero; // pour numeroter les comptes 
    private ArrayList<Compte_client> liste_clients = new ArrayList<Compte_client>();
   
    
    
	
	public BD_clients(){
		this.dernierNumero=0;	
	}
	public String toString() {
		return ("Liste client { "+this.liste_clients + " }" );
	}
	public ArrayList<Compte_client> get_liste_clients(){
		return this.liste_clients;
	}
	public int get_dernierNumero(){
		return this.dernierNumero;
	}
	public int setDernierNumero(int new_valeur) {
		return this.dernierNumero = new_valeur;
		
	}
//Si le client ne dispose pas de compte, �a lui en cr�er un.
    public Compte_client ajouterCompte(String nom, int num_tel,double solde) { 
 
	    int num_carte_client=99;
	    Compte_client nouveau_compte_client = new Compte_client( nom, num_tel, solde,num_carte_client);
		this.liste_clients.add(nouveau_compte_client);			
		return nouveau_compte_client ;
    }
	    /* Permet de verifier si un compte existe d�ja*/
	    
	    public Compte_client verifierCompte(int numero) {
	    	boolean verifier_numero=false;
	    	System.out.println("Le num�ro est:"+numero);
			for (Compte_client compte : this.liste_clients) {				
				if (compte.getNumero() == numero ) {
					verifier_numero = true;
					return compte;
				}
			}
			if(verifier_numero == false) { 
				System.out.println("Cr�ation du compte en cours :) ");
			}
				
			
			return null;
	    }
		
	    /* Permet � l'utilisateur de rentrer ses informations afin de d�terminer si il a un compte ou non.
	     * Si oui, �a affiche que le compte existe d�j�
	     * sinon ca va envoyer sur la m�thode ajouterCompte();
	     */
		public Compte_client lancement_creation_compte() {
			String nom;
			int num_tel;
			double solde=0;
			Compte_client compte_connecte;
			Scanner clav=new Scanner(System.in);
			System.out.println("Veuillez saisir votre nom svp:");
		    nom=clav.nextLine();
		    
			System.out.println("Bienvenue "+nom+ " chez Rapizz!");
			System.out.println("Veuillez saisir votre num�ro de t�l�phone svp:");
			num_tel=clav.nextInt();
			compte_connecte= verifierCompte(num_tel);
			if (compte_connecte!=null) {
				System.out.println("Le compte existe d�ja");
			} else {
				compte_connecte = ajouterCompte(nom, num_tel,solde);
				
			}
			return compte_connecte;
		}
}
