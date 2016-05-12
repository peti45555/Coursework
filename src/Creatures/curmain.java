package Creatures;

public class curmain {
	public static void main(String[] args) {
		
		CreatureMaker creator = new SingleMarioMaker();
		Creature a = creator.createCreature();
		System.out.println(a.getHEIGHT());
		a.setHEIGHT(20);
		Creature b = creator.createCreature();
		System.out.println(b.getHEIGHT());
		b=null;
		b = creator.createCreature();
		System.out.println(b.getHEIGHT());
	}

}
