package co.simplon.poo.s2;

public abstract class Triangle extends FiguresPlanes {

	public int dimensionCote2;
	public int dimensionCote3;
	public int degreAngle1;
	public int degreAngle2;
	public int degreAngle3;
	
	/** Constructeur de la classe Triangle
	 * 
	 * @param nbCotes : nombre de côtés d'un triangle
	 */
	public Triangle(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
		this.dimensionCote2=dimensionCote2;
		this.dimensionCote3=dimensionCote3;
		this.degreAngle1=degreAngle1;
	}

	
	//Getters et Setters
	protected int getDimensionCote2() {
		return dimensionCote2;
	}

	protected void setDimensionCote2(int dimensionCote2) {
		this.dimensionCote2 = dimensionCote2;
	}

	protected int getDimensionCote3() {
		return dimensionCote3;
	}


	protected void setDimensionCote3(int dimensionCote3) {
		this.dimensionCote3 = dimensionCote3;
	}

	protected int getDegreAngle1() {
		return degreAngle1;
	}


	protected void setDegreAngle1(int degreAngle1) {
		this.degreAngle1 = degreAngle1;
	}

	protected int getDegreAngle2() {
		return degreAngle2;
	}


	protected void setDegreAngle2(int degreAngle2) {
		this.degreAngle2 = degreAngle2;
	}


	protected int getDegreAngle3() {
		return degreAngle3;
	}


	protected void setDegreAngle3(int degreAngle3) {
		this.degreAngle3 = degreAngle3;
	}


	/** Rappel Méthode
	* pour calculer le périmètre des triangles
	*/
	public void calculerPerimetre(){
		perimetre =dimensionCote1+dimensionCote2+dimensionCote3;
	System.out.println("le périmètre du triangle est : " + "perimetre");
	}
}
