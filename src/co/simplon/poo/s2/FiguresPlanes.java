package co.simplon.poo.s2;

public abstract class FiguresPlanes {

	public int nbCotes;
	protected int dimensionCote1;
	public double perimetre;

	
	/**
	 * Constructeur de FiguresPlanes
	 * Pour permettre l'instanciation de la classe
	 * en renseignant au minimu le nb de cotes
	 */
	public FiguresPlanes(int nbCotes) {
		super();
		this.nbCotes = nbCotes;
	}	
	


	/*Getters et Setters
	 * 
	 */
	protected int getDimensionCote1() {
		return dimensionCote1;
	}

	protected void setDimensionCote1(int dimensionCote1) {
		this.dimensionCote1 = dimensionCote1;
	}

	public int getNbCotes() {
		return nbCotes;
	}
	
	protected void setNbCotes(int nbCotes) {
		this.nbCotes = nbCotes;
	}
	
  	/** Méthode
	* pour calculer le périmètre des différentes figures
	*/
	public abstract void calculerPerimetre();

}
	
