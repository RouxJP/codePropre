package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Zone d'un zoo
 * @author acer
 *
 */
public abstract class Zone {
	/** Liste des animaux de la zone */
	public 	List<Animal> 	lstAnimal;

	/** Constructeur */
	public Zone() {
		lstAnimal = new ArrayList<Animal>();
	}
	
	/** Retourne le type de zone */
	public abstract TypeZone getZone( );
	
	/** Retourne le poids de nourriture par animal par jour */
	public abstract double getPoids();
	
	/** Retourner true si la zone accepte l'animal */
	public abstract boolean acceptAnimal( Animal animal);
	
	/** Ajoute un animal dans la zone */
	public void addAnimal( Animal animal) throws AddAnimalException{
		if( acceptAnimal(  animal) ) {
			lstAnimal.add( animal);
		}else {
			throw new AddAnimalException( "Animal pas accepté");
		}
	}
	
	
	/** Retourner le nombre d'animaux de la zone */
	public int compterAnimaux() {
		return lstAnimal.size();
	}

	/** Afficher la liste des animaux */
	public void afficherListeAnimaux(){
		for (Animal animal: lstAnimal){
			System.out.println( animal.getNomAnimal().getLibelle());
		}
	}
	
	
	/** Calcule la quantite de nourriture pour cette zone par jour
	 * 
	 * @return
	 */
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * getPoids();
	}

}
