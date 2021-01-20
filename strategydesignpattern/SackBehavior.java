package strategydesignpattern;

import java.util.Random;

public class SackBehavior implements DefenceBehavior{
	
	public String play() {
		return "Sack the quarterback";
	}
}
