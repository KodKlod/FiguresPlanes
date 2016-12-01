package co.simplon.poo.s2;

public abstract class FiguresPlanes extends Figures implements IFigures {

	/**
	 * Constructeur de FiguresPlanes
	 * Pour permettre l'instanciation de la classe
	 * en renseignant au minimu le nb de cotes
	 */
	public FiguresPlanes(int nbCotes) {
		super();
		this.nbCotes = nbCotes;
	}	

}
	
