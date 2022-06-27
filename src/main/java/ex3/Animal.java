package ex3;

/**
 * Represente un animal
 */
public class Animal {

	private String type;
	private String nom;
	private String comportement;
	/**
	 * Constructor
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Animal(String type, String nom, String comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}
	/**
	 * Getter
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Getter
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	
	
}
