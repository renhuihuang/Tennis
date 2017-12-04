

import static org.junit.Assert.*;

import org.junit.Test;

public class DeuceTest {

	@Test
	public void testEst_deuce() {
		Joueur joueur1 = new Joueur("Alice", 3, false);
		Joueur joueur2 = new Joueur("Bob", 3, false);

		if(!Deuce.est_deuce(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 2, false);
		joueur2 = new Joueur("Bob", 3, false);
		
		if(Deuce.est_deuce(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 3, false);
		joueur2 = new Joueur("Bob", 2, false);
		
		if(Deuce.est_deuce(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
	}




}
