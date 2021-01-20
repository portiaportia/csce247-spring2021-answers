package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player {
	private Random rand;
	
	public QuarterBack(String name) {
		super(name);
	}
	
	public void setOffenceBehavior() {
		rand = new Random();
		if(rand.nextBoolean()){
			this.offenceBehavior = new RunBehavior();
		} else {
			this.offenceBehavior = new PassBehavior();
		}
	}
	
	public void setDefenceBehavior() {
		this.defenceBehavior = null;
	}
}
