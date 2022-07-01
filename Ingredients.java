package projetpizza;
// Pour les classes Ingredients et Stock nous voulions creer un syst�me qui prenait en compte
//le nombre d'ingredients utilis�s pour une pizza et savoir si cette pizza pouvait �tre r�alisable ou non

public class Ingredients extends Stock {
	static int nombre_ingredients;
	private String nom_ingredients;
	
	public Ingredients(int nombre_ingredients, String nom_ingredients){
		this.nombre_ingredients=nombre_ingredients;
		this.nom_ingredients=nom_ingredients;
	}
	
	
	
	public void set_nom_ingredients(String nom_ingredients) {
		this.nom_ingredients= nom_ingredients;
	}
	public String get_nom_ingredients() {
		return nom_ingredients;
	}
	public void set_nombre_ingredients(int nombre_ingredients) {
		this.nombre_ingredients= nombre_ingredients;
	}
	public int get_nombre_ingredients() {
		return nombre_ingredients;
	}

}
