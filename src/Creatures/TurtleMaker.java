package Creatures;

public class TurtleMaker implements CreatureMaker {
	@Override
	public Creature createCreature() {
		return new Turtle();
	}
	
}
