package depot;
import projet_perso.Reception;
import java.util.Random;
import java.util.Scanner;

public class depot {
	public static int[][] Depot;
	public static int index=0;
	
	static int genererInt(int borneInf, int borneSup){ // methode generer nombre aléatoire
		 Random random = new Random();
		 int nb;
		 nb = borneInf+random.nextInt(borneSup-borneInf);
		 return nb;
	}
	
	public static void CreerDepot() { //Generation aleatoire des vetements disponible dans le depot
		Depot = new int[255][3];
		int i = 0;
		while(i<64) {
			Depot[i][0]=genererInt(20,56); //Taille
			Depot[i][1]=genererInt(30,201); //Prix
			Depot[i][2]=genererInt(0,4); // Type		
			i+=1;
		}
		index=i;
	}
	
	public static int isDisponible(int taille, int Type) { //Methode qui verifie si un vetement est disponible avec la bonne taille
		int i=0;
		while(i<=index) {
			if(Depot[i][0]==taille && Depot[i][2]==Type) {
				int prix=Depot[i][1];
				return prix;
			}
			i++;
		}
		return 0;
	}
	
	public static int CreerVetement(int Taille, int Type) {
		switch(Type){
	       case 0:
	    	   index+=1;
	    	   Depot[index][0] = Taille;
	    	   Depot[index][1] = genererInt(30,201);
	    	   Depot[index][2] = Type;
	    	   System.out.print("\r\nNouveau T-shirt creer avec comme caracteristique : ");
	    	   System.out.print("\r\nTaille: ");
	    	   System.out.print(Depot[index][0]);
	    	   System.out.print("\r\nPrix: ");
	    	   System.out.print(Depot[index][1]);
	    	   int prix = Depot[index][1];
	    	   return prix;
	       case 1:
	    	   index+=1;
	    	   Depot[index][0] = Taille;
	    	   Depot[index][1] = genererInt(30,201);
	    	   Depot[index][2] = Type;
	    	   System.out.print("\r\nNouveau pantalon creer avec comme caracteristique : ");
	    	   System.out.print("\r\nTaille: ");
	    	   System.out.print(Depot[index][0]);
	    	   System.out.print("\r\nPrix: ");
	    	   System.out.print(Depot[index][1]);
	    	   int prix1 = Depot[index][1];
	    	   return prix1;
	   
	       case 2:
	    	   index+=1;
	    	   Depot[index][0] = Taille;
	    	   Depot[index][1] = genererInt(30,201);
	    	   Depot[index][2] = Type;
	    	   System.out.print("\r\nNouvelle chaussure creer avec comme caracteristique : ");
	    	   System.out.print("\r\nTaille: ");
	    	   System.out.print(Depot[index][0]);
	    	   System.out.print("\r\nPrix: ");
	    	   System.out.print(Depot[index][1]);
	    	   int prix2 = Depot[index][1];
	    	   return prix2;
	       case 3:
	    	   index+=1;
	    	   Depot[index][0] = Taille;
	    	   Depot[index][1] = genererInt(30,201);
	    	   Depot[index][2] = Type;
	    	   System.out.print("\r\nNouveau pull creer avec comme caracteristique : ");
	    	   System.out.print("\r\nTaille: ");
	    	   System.out.print(Depot[index][0]);
	    	   System.out.print("\r\nPrix: ");
	    	   System.out.print(Depot[index][1]);
	    	   int prix3 = Depot[index][1];
	    	   return prix3;
	   }
		return 0;
	}
	
	public static void AfficherDepot() {
		int i=0;
		while(i<index) {
			System.out.print("\r\n");
			System.out.print("\r\nTaille: ");
			System.out.print(Depot[i][0]);
			System.out.print("\r\nPrix: ");
			System.out.print(Depot[i][1]);
			System.out.print("\r\nType de vetement : ");
			switch(Depot[i][2]){
			   
		       case 0:
		    	   System.out.print("T-shirt");
		    	   break;
		   
		       case 1:
		    	   System.out.print("Pantalon");
		    	   break;
		       case 2:
		    	   System.out.print("Chaussure");
		    	   break;
		       case 3:
		    	   System.out.print("Pull");
		    	   break;
		   }
			i+=1;
			
		}
	}
}
