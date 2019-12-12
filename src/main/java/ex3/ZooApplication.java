package ex3;

/** Classe qui teste l'application zoo 
 * 
 * @author acer
 *
 */
public class ZooApplication {

	
	public static void main(String[] args) {
		
		/** Creer un Zoo */
		Zoo zoo = new Zoo("Thoiry");
		
		/** Remplir le zoo d'animaux Carnivores */
		Animal animalCarnivore = new AnimalCarnivore( NomAnimal.LION, TypeAnimal.MAMMIFERE);
		zoo.addAnimal( animalCarnivore);
		zoo.addAnimal( new AnimalCarnivore( NomAnimal.PANTHERE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal( new AnimalCarnivore( NomAnimal.BOA_CONSTRUCTEUR, TypeAnimal.SERPENT));
		zoo.addAnimal( new AnimalCarnivore( NomAnimal.PYTHON, TypeAnimal.SERPENT));
		
		/** Remplir le zoo d'animaux Herbivores */
		zoo.addAnimal( new AnimalHerbivore( NomAnimal.GAZELLE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal( new AnimalHerbivore( NomAnimal.ZEBRE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal( new AnimalHerbivore( NomAnimal.REQUIN_BLANC, TypeAnimal.POISSON));
		zoo.addAnimal( new AnimalHerbivore( NomAnimal.TRUITE_DOREE, TypeAnimal.POISSON));
	
		zoo.afficherListeAnimaux();
	}

}
