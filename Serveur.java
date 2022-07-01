package projetpizza;

import java.util.Scanner;

public class Serveur{ //attributs
	Carte carte;
	static public int compte_pizza_h = 0; //compte toutes les pizzas (incluant celles des menus)
	static public int compte_pizza = 0;//compte uniquement pizzas achetées à l'unité
	static public int compte_menu_trio = 0;
	static public int compte_menu_regime = 0;
	static public int compte_menu_geant = 0;
	static public int compte_boisson = 0;
	static public int compte_dessert = 0;

	static int choice=1;

	//constructeurs
	public Serveur(Carte carte){
		this.carte=carte;
		
	}

	//méthodes

	//pour choisir sa pizza(naine/humaine/ogresse), boisson, dessert

	public static void choisir_pizza_naine(int pn) {
	if(pn==1) {
		   Calzone_naine pizza_naine = new Calzone_naine();
	} else if(pn==2) {
		   Margherita_naine pizza_naine = new Margherita_naine();
	} else if(pn==3) {
		 Quatre_fromages_naine pizza_naine = new Quatre_fromages_naine();  
	} else if(pn==4) {
		 Romana_naine pizza_naine = new Romana_naine();  
	}else if (pn ==5) {
		   Siciliana_naine pizza_naine = new Siciliana_naine();
	} 
	}


	public static void choisir_pizza_humaine(int ph) {
	if (ph==1) {
		Calzone_humaine pizza_1 = new Calzone_humaine ();
	 }else if (ph==2) {
		 Margherita_humaine pizza_1= new Margherita_humaine();
	 }else if (ph==3) {
			Quatre_fromages_humaine pizza_1 = new Quatre_fromages_humaine();
	 }else if (ph==4) {
			Romana_humaine pizza_1 = new Romana_humaine ();
			}else if (ph==5) {
				Siciliana_humaine pizza_1 = new Siciliana_humaine();
			}
	}



	public static void choisir_pizza_ogresse(int po) {
	if(po==1) {
		   Calzone_ogresse pizza_geant = new Calzone_ogresse();
	} else if(po==2) {
		   Margherita_ogresse pizza_geant = new Margherita_ogresse();
	} else if(po==3) {
		 Quatre_fromages_ogresse pizza_geant = new Quatre_fromages_ogresse();  
	} else if(po==4) {
		 Romana_ogresse pizza_geant = new Romana_ogresse();  
	}else if (po ==5) {
		   Siciliana_ogresse pizza_geant = new Siciliana_ogresse();
	}
	}



	public static void choisir_boisson(int b) {
		if (b==1) {
	    	Coca_cola boisson_1 = new Coca_cola ();
	    	}else if (b==2) {
	    		Cocktail boisson_1= new Cocktail();
	    		}else if (b==3) {
				    		Eau boisson_1 = new Eau();
			    	 }else if (b==4) {
				    		Fanta boisson_1 = new Fanta ();
				     		}else if (b==5) {
				    			Seven_UP boisson_1 = new Seven_UP();
				     		}
	}


	public static void choisir_dessert(int d) {
		if (d==1) {
			Fondant_au_chocolat dessert_1 = new Fondant_au_chocolat ();
			}else if (d==2) {
				Fraisier dessert_1 = new Fraisier();
			    }else if (d==3) {
			    	Glace_au_chocolat dessert_1  = new Glace_au_chocolat();
			    	
			    	 }
	}



	//demander si le client veut commander autre chose
	 public static void autre_chose (int a) {
		 int b;
		 Scanner clav=new Scanner (System.in);
			do {System.out.println("Voulez vous autre chose? oui (1) ou non(2)");
			  b=clav.nextInt();
		    }while (b!=1 && b!=2  );
			 if (b==1) {
				 a=1;
				 choix_repas();
			 }
			 else {
				 a=2;
				 System.out.println("Merci de votre commande.");
			 }
	     }

	 // pour commander son repas

	public static void choix_repas() {
		Scanner clav =new Scanner(System.in);

		if ( choice!=2) {
		int choix;
		do {
			System.out.println("    ");
			System.out.println("*Client:*");
		System.out.println("Voulez-vous commander un menu (1), une pizza (2), un dessert (3) ou une boisson (4)? ");
		choix=clav.nextInt();	
			
		}while (choix != 1  && choix!=2 && choix !=3 && choix !=4) ;
		double compteur_pas_pizza=0;
		double compteur_pizza=0;
		
		if (choix==1 ) {
			int choix_2;
			do { 
			System.out.println("Veuillez choisir un menu: menu trio (1), menu geant (2) ou menu regime (3) svp: ");
		    choix_2=clav.nextInt();
			
			}while (choix_2!=1 && choix_2!=2 && choix_2!=3 );
			//menu trio
			if (choix_2==1) {
				int choix_3;
		    	 do { 
						System.out.println("Veuillez choisir la première pizza: Calzone (1), Margherita(2),Quatres fromages (3), Romana (4) ou Siciliana (5) svp: ");
					    choix_3=clav.nextInt();
						
						}while (choix_3!=1 && choix_3!=2 && choix_3!=3 && choix_3!=4 && choix_3!=5 );
		    	 choisir_pizza_humaine(choix_3);
		    	 
		    	 int choix_4;
		    	 do { 
						System.out.println("Veuillez choisir la deuxieme pizza: Calzone (1), Margherita(2),Quatres fromages (3), Romana (4) ou Siciliana (5) svp: ");
					    choix_4=clav.nextInt();
						
						}while (choix_4!=1 && choix_4!=2 && choix_4!=3 && choix_4!=4 && choix_4!=5 );
		    	 choisir_pizza_humaine(choix_4);
		    	 
		    	 int choix_5	;
		    	 do { 
						System.out.println("Veuillez choisir la troisieme pizza: Calzone (1), Margherita(2),Quatres fromages (3), Romana (4) ou Siciliana (5) svp: ");
					    choix_5=clav.nextInt();
						
						}while (choix_5!=1 && choix_5!=2 && choix_5!=3 && choix_5!=4 && choix_5!=5 );
		    	choisir_pizza_humaine(choix_5);
		    	 
		    	    int choix_6;
				    do { System.out.println("Veuillez choisir la premiere boisson: Coca (1), Coktail(2), Eau (3), Fanta (4) ou 7up (5) svp: ");
				    choix_6=clav.nextInt();
				    }while (choix_6!=1 && choix_6!=2 && choix_6!=3 && choix_6!=4 && choix_6!=5 );
				    choisir_boisson(choix_6);
				    
				    int choix_7	;
				    do { System.out.println("Veuillez choisir la deuxieme boisson: Coca (1), Coktail(2), Eau (3), Fanta (4) ou 7up (5) svp: ");
				    choix_7=clav.nextInt();
				    }while (choix_7!=1 && choix_7!=2 && choix_7!=3 && choix_7!=4 && choix_7!=5 );
				   choisir_boisson(choix_7);
				   
				    int choix_8	;
				    do { System.out.println("Veuillez choisir la troisieme boisson: Coca (1), Coktail(2), Eau (3), Fanta (4) ou 7up (5) svp: ");
				    choix_8=clav.nextInt();
				    }while (choix_8!=1 && choix_8!=2 && choix_8!=3 && choix_8!=4 && choix_8!=5 );
				   choisir_boisson(choix_8);
				   
				    int choix_9	;
				    do { System.out.println("Veuillez choisir le premier dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
					choix_9=clav.nextInt();
					}while (choix_9!=1 && choix_9!=2 && choix_9!=3 );
				    choisir_dessert(choix_9);
			
					int choix_10	;
				    do { System.out.println("Veuillez choisir le second dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
					choix_10=clav.nextInt();
					}while (choix_10!=1 && choix_10!=2 && choix_10!=3 );
					choisir_dessert(choix_10);
					
					int choix_11	;
				    do { System.out.println("Veuillez choisir le troisieme dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
					choix_11=clav.nextInt();
					}while (choix_11!=1 && choix_11!=2 && choix_11!=3);
					choisir_dessert(choix_11);
					
					Menu_trio menu = new Menu_trio(12);
					compte_pizza_h+=3;
					compte_menu_trio++;
		    	 
					//menu geant
				
			}else if (choix_2==2) {
				int choix_1;
		        do { System.out.println("Veuillez choisir votre pizza: Calzone (1), Margherita(2),Quatres fromages (3), Romana (4) ou Siciliana (5) svp: ");
				choix_1=clav.nextInt();
			    }while (choix_1!=1 && choix_1!=2 && choix_1!=3 && choix_1!=4 && choix_1!=5 );
				  choisir_pizza_ogresse(choix_1);
				  
				   int choix_3;
				   do { System.out.println("Veuillez choisir votre boisson:  Coca (1), Coktail(2), Eau (3), Fanta (4) ou 7up (5) svp: ");
				    choix_3=clav.nextInt();
					
					}while (choix_3!=1 && choix_3!=2 && choix_3!=3 && choix_3!=4 && choix_3!=5 );
				   
				   choisir_boisson(choix_3);
				   
				   int choix_4;
				   do { System.out.println("Veuillez choisir le dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
				    choix_4=clav.nextInt();
					
					}while (choix_4!=1 && choix_4!=2 && choix_4!=3   );
				   choisir_dessert(choix_4);
				   
				   Menu_geant menu1 = new Menu_geant(15);
				   compte_pizza_h++;
				   compte_menu_geant++;
			
					//menu regime
			}else if (choix_2==3) {
				int choix_1;
		        do { System.out.println("Veuillez choisir votre pizza: Calzone (1), Margherita(2),Quatres fromages (3), Romana (4) ou Siciliana (5) svp: ");
				choix_1=clav.nextInt();
			    }while (choix_1!=1 && choix_1!=2 && choix_1!=3 && choix_1!=4 && choix_1!=5 );
				  choisir_pizza_naine(choix_1);
				  
				   int choix_3;
				   do { System.out.println("Veuillez choisir votre boisson:  Coca (1), Coktail(2), Eau (3), Fanta (4) ou 7up (5) svp: ");
				    choix_3=clav.nextInt();
					
					}while (choix_3!=1 && choix_3!=2 && choix_3!=3 && choix_3!=4 && choix_3!=5 );
				   choisir_boisson(choix_3);
				   
				   int choix_4;
				   do { System.out.println("Veuillez choisir le dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
				    choix_4=clav.nextInt();
					
					}while (choix_4!=1 && choix_4!=2 && choix_4!=3   );
	                choisir_dessert(choix_4);

				   Menu_regime menu2= new Menu_regime(10);
				   compte_pizza_h++;
				   compte_menu_regime++;
				
			}
			
			
				
		}else if (choix==2 ) {
			int choix_1;
			do { 
			System.out.println("Veuillez choisir la taille de votre pizza : naine(1), humaine (2) ou ogresse (3) svp: ");
		    choix_1=clav.nextInt();
			}while (choix_1!=1 && choix_1!=2 && choix_1!=3 );
			
			// pizza naine
			if (choix_1==1) {
				int choix2;
				do { 
				System.out.println("Veuillez choisir votre pizza : Calzone(1), Margherita (2),Quatre fromages (3), Romana (4) ou Sciciliana (5) svp: ");
			    choix2=clav.nextInt();
				}while (choix2!=1 && choix2!=2 && choix2!=3 && choix2!=4 && choix2!=5 );
				
				choisir_pizza_naine(choix2);
				
				compte_pizza++;
				compte_pizza_h++;
				
				//pizza humaine
			}else if (choix_1==2) {
					int choix3;
					do { 
					System.out.println("Veuillez choisir votre pizza : Calzone(1), Margherita (2),Quatre fromages (3), Romana (4) ou Sciciliana (5) svp: ");
				    choix3=clav.nextInt();
					}while (choix3!=1 && choix3!=2 && choix3!=3 && choix3!=4 && choix3!=5 );
					
					choisir_pizza_humaine(choix3);
					
					compte_pizza_h++;
					compte_pizza++;
			
					//pizza ogresse
			}else if (choix_1==3) {
				int choix4;
				do {
					System.out.println("Veuillez choisir votre pizza : Calzone(1), Margherita (2),Quatre fromages (3), Romana (4) ou Sciciliana (5) svp: ");
				    choix4=clav.nextInt();	
				}while (choix4!=1 && choix4!=2 && choix4!=3 && choix4!=4 && choix4!=5 );

				choisir_pizza_ogresse(choix4);
				
				compte_pizza_h++;
				compte_pizza++;
			}
	}else if (choix == 3) {
		int choix1;
		   do { System.out.println("Veuillez choisir le dessert: Fondant au chocolat (1), Fraisier(2) ou Glace au chocolat(3) svp: ");
		    choix1=clav.nextInt();
			
			}while (choix1!=1 && choix1!=2 && choix1!=3   );
		   choisir_dessert(choix1);
		   compte_dessert++;
		
	}else if (choix == 4) {
		int choix1;
		do { 
		System.out.println("Veuillez choisir votre boisson : Cocktail(1), Coca-Cola (2), Eau (3), Fanta (4) ou Seven_UP (5) svp: ");
	    choix1=clav.nextInt();
		}while (choix1!=1 && choix1!=2 && choix1!=3 && choix1!=3 && choix1!=3 );
		
		choisir_boisson(choix1);
		compte_boisson++;
		
	}
		autre_chose(choice);
		
		
	}		 	
	} 
}	


	
