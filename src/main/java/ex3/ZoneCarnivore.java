package ex3;

/**
 * Reprensente la zone carnivore
 */
public class ZoneCarnivore extends Zone{

	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}
}
