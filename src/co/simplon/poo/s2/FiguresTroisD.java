package co.simplon.poo.s2;

public abstract class FiguresTroisD {

	public int nbAretes;
	protected int dimensionArete1;
	public double perimetre;
	public int surface;

	
	/**
	 * Constructeur de FiguresTroisD
	 * Pour permettre l'instanciation de la classe
	 */
	public FiguresTroisD(int nbAretes) {
		super();
		this.nbAretes = nbAretes;
	}	
	

	/*Getters et Setters
	 * 
	 */
	  	protected int getNbAretes() {
		return nbAretes;
	}


	protected void setNbAretes(int nbAretes) {
		this.nbAretes = nbAretes;
	}


	protected int getDimensionArete1() {
		return dimensionArete1;
	}


	protected void setDimensionArete1(int dimensionArete1) {
		this.dimensionArete1 = dimensionArete1;
	}


	protected double getPerimetre() {
		return perimetre;
	}


	protected void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}


	protected int getSurface() {
		return surface;
	}


	protected void setSurface(int surface) {
		this.surface = surface;
	}


	/** Méthode
	* pour calculer la surface des différentes figures 3D
	*/
	public abstract void calculerSurface();

}
	
