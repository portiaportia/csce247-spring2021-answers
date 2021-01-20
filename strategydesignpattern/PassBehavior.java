package strategydesignpattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior{
	Random rand = new Random();
	private String[] passes = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
	
	public String play() {
		return "throws a " + passes[rand.nextInt(passes.length)];
	}
}
