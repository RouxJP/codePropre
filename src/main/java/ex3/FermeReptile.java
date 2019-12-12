package ex3;

import java.util.List;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {
	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	public static final double MASSE_NOURRITURE = 0.1;


	/** Constructeur */
	public FermeReptile() {
		super();
	}

	@Override
	/** Retourner le poids de nourriture par animal et par jour
	 * 
	 */
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	/** Retourner le type de la zone
	 */
	public TypeZone getZone() {
		return( TypeZone.FERME_REPTILE);
	}

	@Override
	/** Retourner true si la zone accepte l'animal 
	 * */
	public boolean acceptAnimal( Animal animal) {
		return animal.getTypeAnimal().equals(TypeAnimal.SERPENT) ;
	}
	


}
