package co.simplon.poo.s2;

public class Carre extends Quadrilatere{

		
	/**Constructeur du carré
	 * 
	 * @param nbCotes
	 */
	public Carre(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
	}

	/** Méthode
	* pour calculer le périmètre des carres
	*/
	public void calculerPerimetre(){
		perimetre =(4*dimensionCote1);
		System.out.println("le périmètre du carré est : " + "perimetre");
	}

}
