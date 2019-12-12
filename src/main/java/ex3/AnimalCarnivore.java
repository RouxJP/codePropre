package ex3;
/** Classe qui décrit un animal carnivore
 * 
 * @author acer
 *
 */
public class AnimalCarnivore extends Animal{

	/** Constructeur */
	public AnimalCarnivore( NomAnimal 		nomAnimal, 
							TypeAnimal		typeAnimal) {
		super(nomAnimal, typeAnimal, Comportement.CARNIVORE);
		
	}



}
