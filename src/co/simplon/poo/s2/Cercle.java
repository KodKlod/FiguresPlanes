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

	/** M�thode
	* pour calculer le p�rim�tre des diff�rentes figures
	* pour personnaliser au cercle
	*/
	public void calculerPerimetre(){
		perimetre = dimensionRayon*Math.PI;
		
	}
	
		
}
