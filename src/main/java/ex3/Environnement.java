package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represente un environnement du zoo
 */
public enum Environnement {

	AQUARIUM {
		@Override
		public double calculerKgsNourritureParJour() {
			return compterAnimaux() * 0.1;
		}

		@Override
		public boolean accepteAnimal(Animal animal) {
			return animal.getType().equals("POISSON");
		}
	},
	FERME_REPTILE {
		@Override
		public double calculerKgsNourritureParJour() {
			return compterAnimaux() * 10;
		}

		@Override
		public boolean accepteAnimal(Animal animal) {
			return animal.getType().equals("REPTILE") || animal.getType().equals("SERPENT");
		}
	},
	SAVANE_AFRICAINE {
		@Override
		public double calculerKgsNourritureParJour() {
			return compterAnimaux() * 10;
		}

		@Override
		public boolean accepteAnimal(Animal animal) {
			return animal.getType().equals("MAMMIFERE") && animal.getComportement().equals(Comportement.HERBIVORE);
		}
	},
	ZONE_CARNIVORE {
		@Override
		public double calculerKgsNourritureParJour() {
			return compterAnimaux() * 10;
		}

		@Override
		public boolean accepteAnimal(Animal animal) {
			return animal.getType().equals("MAMMIFERE") && animal.getComportement().equals(Comportement.CARNIVORE);
		}
	};
	
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
	 * Determine si l animal peut aller dans cette zone
	 * @param animal
	 * @return true si l animal peut
	 */
	public abstract boolean accepteAnimal(Animal animal);
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
