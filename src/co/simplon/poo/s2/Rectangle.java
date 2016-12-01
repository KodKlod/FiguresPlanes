package co.simplon.poo.s2;

public class Rectangle extends Quadrilatere{

	public int dimensionCote2;
	
	/**Constructeur du Rectangle
	 * 
	 * @param nbCotes
	 */
	public Rectangle(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
		this.dimensionCote2=dimensionCote2;
	}

	//Getters et Setters
	protected int getDimensionCote2() {
		return dimensionCote2;
	}


	protected void setDimensionCote2(int dimensionCote2) {
		this.dimensionCote2 = dimensionCote2;
	}


	/** Méthode
	* pour calculer le périmètre des rectangles
	*/
	@Override
	public void calculerPerimetre(){
		perimetre =(2*dimensionCote1)+(2*dimensionCote2);
		System.out.println("le périmètre du rectangle est : " + "perimetre");
	}

	@Override
	public void calculerSurface () {
		surface = dimensionCote1*dimensionCote2;
	}

}
