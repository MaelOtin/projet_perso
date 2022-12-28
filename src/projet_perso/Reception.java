package projet_perso;
import depot.depot;
import java.util.Scanner;
import projet_perso.TraitementColis;
import projet_perso.main;
import projet_perso.Envoie;

public class Reception {
	public static int[][] Colis;
	public static int NumColis=0;
	
	
	public static void ReceptionColis(int Max) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("\r\nCombien de client veulent acheter un vetement ? : "); 
		int NbAjoutColis = sc1.nextInt(); // Nombre de client dont on doit preparer la commande
		for(int i=0;i<NbAjoutColis;i++) {
			if(NumColis>=Max) { //Si le nbr de colis a envoyer est trop elever alors on envoie d'abord les colis avant de poursuivre
				System.out.print("\r\nLe nombre de vetement maximal a etait atteind. Les colis vont etre envoyes.");
				break;
			}
			else {
				Scanner sc2 = new Scanner(System.in);
				System.out.print("\r\nType de vetement ? (T-shirt = 0 | Pantalon = 1 | Chaussure = 2 | Pull = 3) : ");
				int Type = sc2.nextInt();
				if(Type != 0 && Type != 1 && Type != 2 && Type != 3) {
					System.out.print("\r\nCe vetement ne correspond a aucun type.");
					break;
				}
				int Taille = projet_perso.TraitementColis.TypeVetement(Type);
				
				if(depot.isDisponible(Taille,Type)==0) {
					System.out.print("\r\nCe vetement n'est pas disponible et va être créer");
					int prix=depot.CreerVetement(Taille,Type);
					AjouterColis(NumColis,Taille,prix,Type);
					NumColis+=1;
				}
				else {
					System.out.print("\r\nCe vetement est disponible et va être traiter pour l'envoie.");
					System.out.print("\r\n");
					int prix=depot.isDisponible(Taille,Type);
					AjouterColis(NumColis,Taille,prix,Type);
					NumColis+=1;
				}
				
			}
			
		}
	}
	
	public static int returnNumColis() { //getter Numcolis
		return NumColis;
	}
	
	public static void afficherColis(int NumColis) {
		System.out.print("\r\nVetement commander par les clients : ");
		System.out.print("\r\n");
		for(int i=0;i<NumColis;i++) {
			System.out.print("\r\n");
			System.out.print("Numero de la commande : ");
			System.out.print(Colis[i][0]);
			System.out.print("\r\n");
			System.out.print("Taille vetement (FR) : ");
			System.out.print(Colis[i][1]);
			System.out.print("\r\n");
			System.out.print("Type de vetement : ");
			switch(Colis[i][2]){
			   
		       case 0: 
		           System.out.println("T-shirt");
		           break;
		   
		       case 1:
		           System.out.println("Pantalon");
		           break;
		   
		       case 2:
		           System.out.println("Chaussure");
		           break;
		       case 3:
		           System.out.println("Pull");
		           break;
		   }
			System.out.print("Prix : ");
			System.out.print(Colis[i][3]);
			System.out.print("\r\n");
			
		}
	}
	
	public static void CreationColis(int max) {
		Colis = new int[max][4];
		
	}
	public static void AjouterColis(int NumColis, int Taille,int prix, int Type) {
		Colis[NumColis][0] = NumColis;
		Colis[NumColis][1] = Taille;
		Colis[NumColis][2] = Type;
		Colis[NumColis][3] = prix;
		
	}
		
}
