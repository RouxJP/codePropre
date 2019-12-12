package ex2;

/** Classe qui décrit un compte rémunéré
 * 
 * @author acer
 *
 */
public class CompteTaux extends CompteBancaire{
	/** Capital max du compte rémunéré */
	public static final int CAPITAL_MAX = 3000000;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	
	/** Constructeur d'un compte rémunéré
	 * 
	 * @param type
	 * @param solde
	 * @param decouvert
	 */
	public CompteTaux( double solde, double taux) {
		super(  solde);
		setTauxRemuneration( taux);
		
	}

	/** Soustraire un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant( double montant){
		if ( getSolde() - montant > 0){
			setSolde( getSolde() - montant);
		}	
	}
	
	/** Calculer et ajouter la rémunération annuelle du compte
	 * 
	 */
	public void appliquerRemuAnnuelle(){
		setSolde( getSolde()*( 1  + ( tauxRemuneration/100)));
	}
	
	
	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	
}
