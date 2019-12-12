package ex3;

/** Classe qui décrit un animal herbivore */
public class AnimalHerbivore extends Animal{

	/** Constructeur */
	public AnimalHerbivore( NomAnimal 		nomAnimal, 
							TypeAnimal		typeAnimal) {
		super(nomAnimal, typeAnimal, Comportement.HERBIVORE);
		
	}


}
