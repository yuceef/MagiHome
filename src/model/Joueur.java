/**
 * 
 */
package model;

/**
 * @author yucee
 *
 */
public abstract class Joueur {
	protected int niveau;
	protected int vie;
	protected int force;
	protected int agilite;
	protected int intelligence;
	protected String nomJoueur;
	
	/**
	 * 
	 */
	public Joueur() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nomJoueur + " niveau " + niveau + " je possède " + vie + " de vitalité, " + force + " de force, " + agilite
				+ " d'agilité et " + intelligence + " d'intelligence !";
	}
	
	/**
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	/**
	 * @return the vie
	 */
	public int getVie() {
		return vie;
	}
	/**
	 * @param vie the vie to set
	 */
	public void setVie(int vie) {
		this.vie = vie;
	}
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}
	/**
	 * @return the agilite
	 */
	public int getAgilite() {
		return agilite;
	}
	/**
	 * @param agilite the agilite to set
	 */
	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}
	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	/**
	 * @return the nomJoueur
	 */
	public String getNomJoueur() {
		return nomJoueur;
	}
	/**
	 * @param nomJoueur the nomJoueur to set
	 */
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	
	
}
