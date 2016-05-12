package Creatures;

public class SingleMarioMaker implements CreatureMaker{

	private static Mario mario;
	
	public Creature createCreature() {
	
	if(mario==null){
			mario = new Mario();
		}
	
	return mario;
	}
	
}
