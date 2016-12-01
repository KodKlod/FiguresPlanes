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

	/** M�thode
	* pour calculer le p�rim�tre des losanges
	*/
	@Override
	public void calculerPerimetre() {
		perimetre =(4*dimensionCote1);
		System.out.println("le p�rim�tre du losange est : " + "perimetre");
	}

	@Override
	public void calculerSurface (){
		surface = dimensionCote1*dimensionCote1;
	}
	
}