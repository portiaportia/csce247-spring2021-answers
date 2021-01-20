package strategydesignpattern;

/**
 * Holds a Generic Football player
 */
public abstract class Player {
	protected String name;
	private boolean defence = false;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * Creates a football player
	 * @param name the name of the player
	 */
	public Player(String name) {
		this.name = name;
		setDefenceBehavior();
		setOffenceBehavior();
	}
	
	public String play() {
		if(defence) {
			if(defenceBehavior == null) return "not playing";
			return defenceBehavior.play();
		} else {
			if(offenceBehavior == null) return "not playing";
			return offenceBehavior.play();
		}
	}
	
	public abstract void setDefenceBehavior();
	
	public abstract void setOffenceBehavior();
	
	public void turnover() {
		this.defence = !this.defence;
	}
}
