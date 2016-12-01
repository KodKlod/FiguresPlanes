package co.simplon.poo.s2;

public class Cube extends FiguresTroisD {

	
	//Constructeur
	public Cube(int nbFaces) {
		super(6);
		this.dimensionCote1= dimensionCote1;
	}

	@Override
	public void calculerSurface() {
		perimetre = 4*dimensionCote1;
		//J'aurai pu créer une agrégation avec la classe carre...
		surface = perimetre*6;
		System.out.println("la surface du cube est de "+surface + "cm");
	}
		
		@Override
		public void calculerPerimetre (){
			perimetre = 1;
			//Juste pour ne bloquer mon code
			//Mais je sais que c'est faux
		}
	

}
