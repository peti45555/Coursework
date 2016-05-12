package Creatures;

public class MushroomMaker implements CreatureMaker{

	@Override
	public Creature createCreature() {
		return new Mushroom();
	}
	
}
