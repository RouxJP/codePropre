package ex2;

/** 
 * Représente un compte bancaire de type compte courante 
 * (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class  CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	
	/**
	 * Ce constructeur est utilisé pour créer un compte courant ou remunéré
	 * 
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire( double solde) {
		super();
		this.solde 		= solde;
	}
	
	/** Ajouter un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant( double montant){
		this.solde += montant;
	}
	
	/** Soustraire un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant( double montant);
	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde( double solde) {
		this.solde = solde;
	}
}
