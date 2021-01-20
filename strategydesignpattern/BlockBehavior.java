package strategydesignpattern;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
	Random rand = new Random();
	private String[] blocks = {"kick", "punt", "pass", "catch"};
	
	public String play() {
		return "block a " + blocks[rand.nextInt(blocks.length)];
	}
}
