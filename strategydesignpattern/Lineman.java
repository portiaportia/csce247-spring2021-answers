package strategydesignpattern;

import java.util.Random;

public class Lineman extends Player {
	private Random rand;
	
	public Lineman(String name) {
		super(name);
	}
	
	public void setOffenceBehavior() {
		this.offenceBehavior = new OBlockBehavior();
	}
	
	public void setDefenceBehavior() {
		rand = new Random();
		switch(rand.nextInt(3)) {
		case 0:
			this.defenceBehavior = new BlockBehavior();
			break;
		case 1:
			this.defenceBehavior = new StripBehavior();
			break;
		case 2:
			this.defenceBehavior = new SackBehavior();
			break;
		}
	}
}
