package strategydesignpattern;

import java.util.Random;

public class Receiver extends Player {
	private Random rand = new Random();
	
	public Receiver(String name) {
		super(name);
	}
	
	public void setOffenceBehavior() {
		this.offenceBehavior = new ReceiveBehavior();
	}
	
	public void setDefenceBehavior() {
		this.defenceBehavior = null;
	}
}
