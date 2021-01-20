package strategydesignpattern;

import java.util.Random;

public class RunBehavior implements OffenceBehavior {
	Random rand = new Random();
	private String[] runs = {"drive (up the gut)", "draw", "pitch", "reverse"};
	
	public String play() {
		return "runs a " + runs[rand.nextInt(runs.length)];
	}
}
