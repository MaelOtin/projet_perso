package projet_perso;
import projet_perso.TraitementColis;
import projet_perso.main;
import projet_perso.Reception;

import java.util.Arrays;
import java.util.Scanner;

public class Envoie {
	public boolean demande;

	
	public static void Envoie(int[][] Colis, int NumColis, int Max) {
		for(int i=0;i<NumColis;i++) {
			System.out.print("\r\n Suppression du colis numero : " + Colis[i][0]);
		}
		System.out.print("\r\n");
		projet_perso.Reception.CreationColis(Max);
	}
	
	public static boolean DemandeEnvoie() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\r\n Voulez vous envoyez les colis ? (1 = Oui | 0 = non) : ");
		int demande = sc.nextInt();
		if(demande!=0 && demande!=1) {
			System.out.print("\r\nLa demande doit valoir 0 pour non ou 1 pour oui");
			return false;
		}
		if(demande==1){
			return true;
		}
		else {
			return false;
		}
	}
}
