package co.simplon.poo.s2;

public abstract class TriangleRectangle extends Triangle {

		
	/** Constructeur du triangle rectangle
	 * 
	 * @param nbCotes : nombre de c�t�s d'un triangle
	 */
	public TriangleRectangle(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
		this.dimensionCote2=dimensionCote2;
		this.dimensionCote3=dimensionCote3;
		this.degreAngle1=degreAngle1;
	}

	
	/** Rappel M�thode
	* pour calculer le p�rim�tre des triangles
	*/
	public void calculerPerimetre(){
		perimetre =dimensionCote1+dimensionCote2+dimensionCote3;
	System.out.println("le p�rim�tre du triangle rectangle est : " + "perimetre");
	}
}
