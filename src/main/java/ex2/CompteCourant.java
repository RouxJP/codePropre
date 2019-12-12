package ex2;

/** Classe qui décrit un compte courant 
 * 
 * @author acer
 *
 */
public class CompteCourant extends CompteBancaire{
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** Constructeur d'un compte courant 
	 * 
	 * @param type
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant( double solde, double decouvert) {
		super( solde);
		setDecouvert( decouvert);
	}

	/** 
	 * Soustraire un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant( double montant){
		if( getSolde() - montant > getDecouvert()){
			setSolde( getSolde() - montant);
		}	
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert( double decouvert) {
		this.decouvert = decouvert;
	}

}
