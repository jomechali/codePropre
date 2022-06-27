package ex2;

/**
 * Represente un livret A
 *
 */
public class LivretA extends CompteBancaire {

	/** PERCENT */
	private static final int PERCENT = 100;

	/** tauxRemuneration : taux de rémunération */
	private double tauxRemuneration;

	/**
	 * Constructor
	 * 
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		double solde = super.getSolde();
		if (solde - montant > 0) {
			super.setSolde(solde - montant);
		}
	}

	/**
	 * Applique la remuneration annuelle, avec le taux de remuneration
	 */
	public void appliquerRemuAnnuelle() {
		double solde = super.getSolde();
		super.setSolde(solde + solde * tauxRemuneration / PERCENT);
	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
