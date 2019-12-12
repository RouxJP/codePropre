package ex3;

import java.util.List;

/** Classe qui décrit une zone  Aquarium */
public class Aquarium extends Zone{
	/** Masse moyenne en kg de nourriture consommée par 1 poisson  */
	public static final double MASSE_NOURRITURE = 0.2;
	
	
	/** Constructeur */
	public Aquarium() {
		super( );
	}

	@Override
	/** Retourner true si la zone accepte l'animal 
	 * */
	public boolean acceptAnimal( Animal animal) {
		return animal.getTypeAnimal().equals(TypeAnimal.POISSON) ;
	}
	
	
	@Override
	/** Retourne le type de zone 
	 * */
	public TypeZone getZone() {
		return TypeZone.AQUARIUM;
	}


	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}


}
