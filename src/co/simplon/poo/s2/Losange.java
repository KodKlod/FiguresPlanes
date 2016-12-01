package co.simplon.poo.s2;

public abstract class Losange extends Quadrilatere {

	public int degreAngle;
	
	
	//Constructeur du losange
	public Losange(int nbCotes) {
		super(nbCotes);
		this.dimensionCote1=dimensionCote1;
	}

	//Getters et Setters
		protected int getDegreAngle() {
		return degreAngle;
	}

	protected void setDegreAngle(int degreAngle) {
		this.degreAngle = degreAngle;
	}

	/** Méthode
	* pour calculer le périmètre des losanges
	*/
	@Override
	public void calculerPerimetre() {
		perimetre =(4*dimensionCote1);
		System.out.println("le périmètre du losange est : " + "perimetre");
	}

	@Override
	public void calculerSurface (){
		surface = dimensionCote1*dimensionCote1;
	}
	
}