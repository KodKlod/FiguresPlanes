package co.simplon.poo.s2;

public class Carre extends Losange{

		
	/**Constructeur du carr�
	 * 
	 * @param nbCotes
	 */
	public Carre(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
		this.degreAngle = 90;
	}

	/** M�thode
	* pour calculer le p�rim�tre des carres
	*/
	public void calculerPerimetre() {
		perimetre =(4*dimensionCote1);
		System.out.println("le p�rim�tre du carr� est : " + "perimetre");
	}	
	
	
	
}
