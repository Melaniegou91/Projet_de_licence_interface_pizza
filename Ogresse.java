package projetpizza;

public class Ogresse extends Pizza {
	//Nous avons multiplier le prix par 1,33 car la pizza ogresse est 1/3 plus chère que la pizza humaine
	public Ogresse(String nom_pizza, double prix_pizza_normale) {
		super(nom_pizza, 1.33*prix_pizza_normale);
	 
	}
	
	public Ogresse(String nom_pizza) {
		super(nom_pizza);
	}
}
