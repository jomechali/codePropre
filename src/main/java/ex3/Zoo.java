package ex3;

/**
 * Represente un zoo
 *
 */
public class Zoo {

	/** nom */
	private String nom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Instancier et ajouter dans la bonne zone un nouvel animal au zoo
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {

		Animal nouvelAnimal = new Animal(typeAnimal, nomAnimal, Comportement.valueOf(comportement));

		Environnement[] environnements = Environnement.values();
		boolean place = false;
		int index = 0;

		while (index < environnements.length && !place) {
			Environnement currentEnvironnement = environnements[index];
			if (currentEnvironnement.accepteAnimal(nouvelAnimal)) {
				place = true;
				currentEnvironnement.ajouterAnimal(nouvelAnimal);
			}
			index++;
		}
	}

	/**
	 * Affiche tous les animaux du zoo, par zone
	 */
	public void afficherListeAnimaux() {

		Environnement[] environnements = Environnement.values();

		for (Environnement environnement : environnements) {
			environnement.afficherListeAnimaux();
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
