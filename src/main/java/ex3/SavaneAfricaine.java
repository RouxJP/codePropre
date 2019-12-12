package ex3;

import java.util.List;

/** Zone de la savane AFricaine */
public class SavaneAfricaine extends Zone{
	/** Masse moyenne en kg de nourriture consommée par 1 animal de la savane  */
	public static final double MASSE_NOURRITURE = 0;

	/** Constructeur */
	public SavaneAfricaine() {
		super( );
	}
	

	@Override
	/** Retourner le type de zone 
	 * 
	 */
	public TypeZone getZone() {
		return( TypeZone.SAVANE_AFRICAINE);
	}


	@Override
	/** Retourner le poids de nourriture par animal et par jour
	 * 
	 */
	public double getPoids() {
		return MASSE_NOURRITURE;
	}
	
	
	@Override
	/** Retourner true si la zone accepte l'animal 
	 * 
	 */
	public boolean acceptAnimal( Animal animal) {
		return ( animal.getTypeAnimal().equals( TypeAnimal.MAMMIFERE)
				 &&
				 animal.getComportement().equals( Comportement.HERBIVORE) );
	}
	

}
