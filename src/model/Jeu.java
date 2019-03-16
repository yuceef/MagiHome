/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yucee
 *
 */
public class Jeu {
	private List<Joueur> joueurs;

	public Jeu() {
		super();
		this.joueurs = new ArrayList<Joueur>();
	}

	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("Test: Demarrer le jeu");
	}

}
