package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represente une zone du zoo, avec son environnement propre
 *
 */
public abstract class Zone {

	/** animaux */
	private List<Animal> animaux = new ArrayList<Animal>();
	
	/**
	 * Ajouter un animal a la zone du zoo
	 * @param animal a ajouter
	 */
	public void ajouterAnimal(Animal animal) {
		animaux.add(animal);
	}
	

	/**
	 * Afficher les noms des animaux
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux){
			System.out.println(animal.getNom());
		}
	}

	/**
	 * @return le nombre d animaux dans la zone
	 */
	public int compterAnimaux(){
		return animaux.size();
	}

	/**
	 * Calcule la quantite de nourriture necessaire pour cette zone par jour
	 * @return
	 */
	public abstract double calculerKgsNourritureParJour();


	/**
	 * Getter
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}


	/**
	 * Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
}
