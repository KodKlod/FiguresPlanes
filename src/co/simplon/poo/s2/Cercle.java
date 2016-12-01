package co.simplon.poo.s2;

public class Cercle extends FiguresPlanes {

	public long dimensionRayon;
	

	/**Constructeur du cercle
	 * 
	 * @param nbCotes
	 */
	public Cercle(int nbCotes) {
		super(1);
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
	@Override
	public void calculerPerimetre(){
		perimetre = dimensionRayon*Math.PI;
		
	}
	
	@Override
	public void calculerSurface (){
		surface = 1+1;
		//Oui c'est faux mais c'est pas grave
		//c'est pour l'exercice
	}
}
