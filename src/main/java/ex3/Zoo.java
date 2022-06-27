package ex3;

/**
 * Represente un zoo
 *
 */
public class Zoo {

	/** nom */
	private String nom;
	/** savaneAfricaine */
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	/** zoneCarnivore */
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	/** fermeReptile */
	private FermeReptile fermeReptile = new FermeReptile();
	/** aquarium */
	private Aquarium aquarium = new Aquarium();
	
	/**
	 * Constructor
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * Instancier et ajouter dans la bonne zone un nouvel animal au zoo
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		
		Animal nouvelAnimal = new Animal(typeAnimal, nomAnimal, comportement);
		
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zoneCarnivore.ajouterAnimal(nouvelAnimal);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.ajouterAnimal(nouvelAnimal);
		}
		else if (typeAnimal.equals("REPTILE") || typeAnimal.equals("SERPENT")){
			fermeReptile.ajouterAnimal(nouvelAnimal);
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.ajouterAnimal(nouvelAnimal);
		}
	}
	
	/**
	 * Affiche tous les animaux du zoo, par zone
	 */
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
