package ex3;

/**
 * Reprensente un aquarium
 * 
 */
public class Aquarium extends Zone{

	@Override
	public double calculerKgsNourritureParJour() {
		return super.compterAnimaux() * 0.1;
	}

}
