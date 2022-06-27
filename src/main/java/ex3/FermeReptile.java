package ex3;

/**
 * Reprensente la zone reptile
 */
public class FermeReptile extends Zone {

	public double calculerKgsNourritureParJour() {
		return super.compterAnimaux() * 10;
	}
}
