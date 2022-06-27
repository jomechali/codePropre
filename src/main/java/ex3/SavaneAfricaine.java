package ex3;

/**
 * Reprensente la zone savane
 */
public class SavaneAfricaine extends Zone{


	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}
}
