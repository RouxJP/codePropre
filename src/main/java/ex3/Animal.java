package ex3;

/** Classe qui décrit un Animal
 * 
 * @author acer
 *
 */
public  class Animal {
	/** Nom de l'animal */
	private NomAnimal			nomAnimal ;
	/** Type de l'animal */
	private TypeAnimal			typeAnimal;
	/** Comportement de l'animal */
	private Comportement		comportement;

	public Animal(	NomAnimal		nomAnimal, 	
					TypeAnimal		typeAnimal, 
					Comportement	comportement) {
		setNomAnimal(nomAnimal);
		setTypeAnimal(typeAnimal);
		setComportement(comportement);
	}
	
	/** Getter
	 * @return the nomAnimal
	 */
	public NomAnimal getNomAnimal() {
		return nomAnimal;
	}

	/** Setter
	 * @param nomAnimal the nomAnimal to set
	 */
	public void setNomAnimal(NomAnimal nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	/** Getter
	 * @return the typeAnimal
	 */
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	/** Setter
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/** Getter
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}


}