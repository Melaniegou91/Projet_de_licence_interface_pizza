package projetpizza;

public class Naine extends Pizza{
// Nous avons multiplié le prix par 0,66 car la pizza naine est 1/3 moins chères que la pizza humaine
	public Naine(String nom_pizza, double prix_pizza_normale) {
		super(nom_pizza, 0.66*prix_pizza_normale);
	 
	}
	
	public Naine(String nom_pizza) {
		super(nom_pizza);
	}


}
