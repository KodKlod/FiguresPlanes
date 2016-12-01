package co.simplon.poo.s2;

public class Cercle extends FiguresPlanes {

	public long dimensionRayon;
	

	/**Constructeur du cercle
	 * 
	 * @param nbCotes
	 */
	public Cercle(int nbCotes) {
		super(nbCotes);
		this.dimensionRayon = dimensionRayon;
	}

	
	//Getters et Setters

	protected long getDimensionRayon() {
		return dimensionRayon;
	}

	protected void setDimensionRayon(long dimensionRayon) {
		this.dimensionRayon = dimensionRayon;
	}

	/** Méthode
	* pour calculer le périmètre des différentes figures
	* pour personnaliser au cercle
	*/
	public void calculerPerimetre(){
		perimetre = dimensionRayon*Math.PI;
		
	}
	
		
}
