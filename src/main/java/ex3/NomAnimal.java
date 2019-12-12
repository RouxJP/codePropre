package ex3;

/** Liste des animaux */
public enum NomAnimal {

	GAZELLE( "Gazelle"),
	ZEBRE( "Zèbre"),
	PANTHERE("Panthère"),
	REQUIN_BLANC("Requin blanc"),
	TRUITE_DOREE("Truite dorée"),
	BOA_CONSTRUCTEUR("Boa constrictor"),
	PYTHON( "Python"),
	LION( "Lion");
	
	private String	libelle;
	
	private NomAnimal( String libelle) {
		setLibelle(libelle);
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
