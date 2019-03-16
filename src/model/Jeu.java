/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yucee
 *
 */
public class Jeu {
	private Scanner scanner;
	private List<Joueur> joueurs;

	public Jeu() {
		super();
		this.scanner = new Scanner(System.in);
		this.joueurs = new ArrayList<Joueur>();
	}

	public void demarrer() {
		// TODO Auto-generated method stub
		joueurs.add(creationJoueur());
		joueurs.add(creationJoueur());
		demarrerCombat();
	}

	private void demarrerCombat() {
		// TODO Auto-generated method stub
		
	}

	private Joueur creationJoueur() {
		// TODO Auto-generated method stub
		int classe, niveau, force, agilite, intelligence;
		Joueur joueur;
		System.out.println("Création du personnage du Joueur "+ (joueurs.size() + 1));
		classe = lireEcran("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1,3);
		joueur = creationJoueurProfile(classe);
		joueur.setNomJoueur("Joueur "+ (joueurs.size() + 1));
		niveau = lireEcran("Niveau du perssonage?", 1,100);
		joueur.setNiveau(niveau);
		joueur.setVie(niveau*5);
		force = lireEcran("Force du perssonage?", 0,niveau);
		joueur.setForce(force);
		agilite = lireEcran("Agilité du perssonage?", 0,niveau-force);
		joueur.setAgilite(agilite);
		intelligence = lireEcran("Intelligence du perssonage?", niveau-force-agilite,niveau-force-agilite);
		joueur.setIntelligence(intelligence);	
		System.out.println(joueur.toString());
		return joueur;	
	}

	private int lireEcran(String msg, int minValeur, int maxValeur) {
		int ecran;
		do {
			System.out.println(msg);
			ecran = scanner.nextInt();
		}while(verifier(ecran,minValeur,maxValeur));
		return ecran;
	}
	
	/**
	 * @param classe
	 * @return Joueur
	 */
	private Joueur creationJoueurProfile(int classe) {
		// TODO Auto-generated method stub
		switch(classe) {
			case 1:
				return new Guerrier();
				
			case 2:
				return new Rodeur();
				
			case 3:
				return new Mage();
	
			default:
				return null;			
		}
	}	

	/**
	 * @param ecran
	 * @param minValeur
	 * @param maxValeur
	 * @return boolean 
	 */
	private boolean verifier(int ecran, int minValeur, int maxValeur) {
		// TODO Auto-generated method stub
		return ecran < minValeur || ecran > maxValeur;
	}
}
