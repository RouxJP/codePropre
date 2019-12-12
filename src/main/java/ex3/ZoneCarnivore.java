package ex3;

import java.util.List;

/** Zone  pour les animaux carnivores 
 * 
 * @author acer
 *
 */
public class ZoneCarnivore extends Zone {
	/** Masse moyenne en kg de nourriture consommée par 1 carnivore */
	public static final double MASSE_NOURRITURE = 10;

	public ZoneCarnivore() {
		super( );
	}

	
	@Override
	/** Retourne le type de Zone 
	 * 
	 */
	public TypeZone getZone() {
		return TypeZone.ZONE_CARNIVORE;	
	}
	
	@Override
	/** Retourne la masse de nourriture pour un animal 
	 * 
	 */
	public double getPoids() {
		// TODO Auto-generated method stub
		return MASSE_NOURRITURE;
	}
	
	@Override
	/** Retourner true si la zone accepte l'animal
	 *  
	 */
	public boolean acceptAnimal( Animal animal) {
		return ( animal.getTypeAnimal().equals( TypeAnimal.MAMMIFERE)
				 &&
				 animal.getComportement().equals( Comportement.CARNIVORE) );
	}
	
	
	

}

	



