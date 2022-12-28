package projet_perso;
import projet_perso.Reception;
import projet_perso.main;

import java.util.Scanner;

import projet_perso.Envoie;

public class TraitementColis {
	public static int numeroColis_en_cours;
	public static int taille_en_cours;
	public static int prix_en_cours;
	public static int marque_en_cours;
	public static int j;
	
	public static int TypeVetement(int Type) {
		switch(Type){
		   
	       case 0:
	           Scanner sc1 = new Scanner(System.in);
	           System.out.print("\r\nTaille du T-shirt ? : ");
	           int taille = sc1.nextInt();
	           return taille;
	   
	       case 1:
	           Scanner sc2 = new Scanner(System.in);
	           System.out.print("\r\nTaille du Pantalon ? : ");
	           int taille1 = sc2.nextInt();
	           return taille1;
	   
	       case 2:
	           Scanner sc3 = new Scanner(System.in);
	           System.out.print("\r\nTaille chaussure ? : ");
	           int taille2 = sc3.nextInt();
	           return taille2;
	       case 3:
	           Scanner sc4 = new Scanner(System.in);
	           System.out.print("\r\nTaille du Pull ? : ");
	           int taille3 = sc4.nextInt();
	           return taille3;
	   }
		return 0;
	}
	
	public static void TraitementColis(int[][] Colis, int NumColis) { // Methode de tri des colis par ordre decroissant
		for(int i=0;i<NumColis;i++) {
			int prix_en_cours = Colis[i][3];
			j=i;
			while(j>0 && Colis[i-1][3]<prix_en_cours) {
				
				
				int numeroColis_en_cours = Colis[j][0];
				Colis[j][0]=Colis[j-1][0];
				Colis[j-1][0]=numeroColis_en_cours;
				
				int taille_en_cours = Colis[j][1];
				Colis[j][1]=Colis[j-1][1];
				Colis[j-1][1]=taille_en_cours;
				
				int marque_en_cours = Colis[j][2];
				Colis[j][2]=Colis[j-1][2];
				Colis[j-1][2]=marque_en_cours;
				
				Colis[j][3]=Colis[j-1][3];
				j-=1;
			}
			Colis[j][3]=prix_en_cours;
		}
	}
}
