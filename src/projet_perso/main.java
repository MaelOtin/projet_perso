package projet_perso;
import depot.depot;

import projet_perso.Reception;
import projet_perso.TraitementColis;
import projet_perso.Envoie;
import java.util.Scanner;

public class main {
	private int NumColisMain;
	
	public static void main(String[] args) throws Exception {
		depot.CreerDepot(); // Generation du depot
		depot.AfficherDepot(); // Affichage du depot
		int Max = 64; // Nombre de colis maximal que on peut envoyer simulatenement
 		projet_perso.TraitementColis TraitementColis = new TraitementColis();
		projet_perso.Reception.CreationColis(Max); //Creation colis
		projet_perso.Reception.ReceptionColis(Max); //Demande du client
		int NumColisMain = projet_perso.Reception.returnNumColis(); //numero colis
		projet_perso.TraitementColis.TraitementColis(projet_perso.Reception.Colis,NumColisMain); // On trie les colis par prix decroissant
		projet_perso.Reception.afficherColis(NumColisMain); // On affiche les colis a envoyer
		while(projet_perso.Envoie.DemandeEnvoie()==false) { // Tant que l'utilisateur ne demande pas d'envoyer les vetement on continue
			projet_perso.Reception.ReceptionColis(Max);
			int NumColisMain1 = projet_perso.Reception.returnNumColis();
			projet_perso.TraitementColis.TraitementColis(projet_perso.Reception.Colis,NumColisMain1);
			projet_perso.Reception.afficherColis(NumColisMain1);
		}
		int NumColisMain2 = projet_perso.Reception.returnNumColis();
		projet_perso.Envoie.Envoie(projet_perso.Reception.Colis, NumColisMain2, Max); // sinon on envoie les colis (on créer une nouvelle liste)
	}
}
