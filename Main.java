
public class Main {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur("Alice", 0, false);
		Joueur joueur2 = new Joueur("Bob", 0, false);
		int joueur_en_ADV = 0;
		System.out.println("Joueur 1 : Alice.\nJoueur 2 : Bob.\n\nDebut du jeu        : 0 - 0");
		
		
		while(!Match.fin_du_jeu(joueur1, joueur2)){
			
			// Si on a 40 - 40, on entre dans le DEUCE.
			if(Deuce.est_deuce(joueur1, joueur2)){
				joueur_en_ADV = Deuce.jouer_en_deuce(joueur1, joueur2);
				Deuce.balle_de_match(joueur1, joueur2, joueur_en_ADV);
			}
			
			// Sinon on continue à jouer.
			else{
				Match.jouer(joueur1, joueur2);
				Match.afficher_resultat(joueur1, joueur2);
			}
		}
		
		System.out.println("");
		if(joueur1.isWin()){
			System.out.println("Alice win!");
		}
		else{
			System.out.println("Bob win!");
		}
		
	}

}
