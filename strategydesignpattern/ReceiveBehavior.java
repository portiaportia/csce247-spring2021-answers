package strategydesignpattern;

import java.util.Random;

/**
 * Holds a Receiving Behavior
 */
public class ReceiveBehavior implements OffenceBehavior {
	Random rand = new Random();
	private String[] passes = {"slant route", "out route", "seem route", "screen pass", "hail mary"};

	/**
	 * 
	 */
	public String play() {
		return "runs a " + passes[rand.nextInt(passes.length)];
	}
}