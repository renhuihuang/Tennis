import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {


	@Test
	public void testConvertir_score() {
		int score;
		
		score = Match.convertir_score(1);
		if(score!=15){
			fail("Not yet implemented");
		}
		
		score = Match.convertir_score(2);
		if(score!=30){
			fail("Not yet implemented");
		}
		
		score = Match.convertir_score(3);
		if(score!=40){
			fail("Not yet implemented");
		}
		
		score = Match.convertir_score(4);
		if(score!=50){
			fail("Not yet implemented");
		}
		
		score = Match.convertir_score(0);
		if(score!=0){
			fail("Not yet implemented");
		}
		
	}


	@Test
	public void testFin_du_jeu() {
		Joueur joueur1 = new Joueur("Alice", 3, false);
		Joueur joueur2 = new Joueur("Bob", 3, false);
		
		if(Match.fin_du_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 2, false);
		joueur2 = new Joueur("Bob", 4, false);
		if(!Match.fin_du_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 4, false);
		joueur2 = new Joueur("Bob", 2, false);
		if(!Match.fin_du_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 1, false);
		joueur2 = new Joueur("Bob", 3, false);
		if(!Match.fin_du_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 3, false);
		joueur2 = new Joueur("Bob", 1, false);
		if(!Match.fin_du_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
	}

}
