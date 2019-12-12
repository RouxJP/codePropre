package ex3;

/** Classe qui décrit un zoo
 * @author DIGINAMIC
 */
public class Zoo {

	/** Nom du Zoo */
	private String 				nom;
	/** Zone africaine */
	private SavaneAfricaine 	savaneAfricaine;
	/** Zone Carnivore */
	private ZoneCarnivore 		zoneCarnivore;
	/** Zone reptile */
	private FermeReptile 		fermeReptile;
	/** Zone Aquarium */
	private Aquarium 			aquarium;
	
	/** Constructeur */
	public Zoo(String nom){
		this.nom 				= nom;
		this.savaneAfricaine	= new SavaneAfricaine();
		this.zoneCarnivore		= new ZoneCarnivore();
		this.fermeReptile		= new FermeReptile();
		this.aquarium			= new Aquarium();
	}
	
	/** Ajouter un animal dans une zone si celle ci l'accepte */
	public void addAnimal( Animal animal){
		try {
			savaneAfricaine.addAnimal(animal);		
		}catch( Exception ie) {
			try {
				zoneCarnivore.addAnimal(animal);		
			}catch( Exception ie2) {
				try {
					fermeReptile.addAnimal(animal);		
				}catch( Exception ie3) {
					try {
						aquarium.addAnimal(animal);		
					}catch( Exception ie4) {
						System.out.println(ie4.getMessage());
					}
					
				}
				
			}

		}
		

	}
	
	/** Afficher la liste des animaux du Zoo, */
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
