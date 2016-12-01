package co.simplon.poo.s2;

public abstract class FiguresTroisD {

	public int nbAretes;
	protected int dimensionCote1;
	public double perimetre;

	
	/**
	 * Constructeur de FiguresTroisD
	 * Pour permettre l'instanciation de la classe
	 */
	public FiguresTroisD(int nbCotes) {
		super();
		this.nbAretes = nbAretes;
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
	
  	/** M�thode
	* pour calculer le p�rim�tre des diff�rentes figures
	*/
	public abstract void calculerPerimetre();

}
	
