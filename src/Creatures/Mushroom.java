package Creatures;

import java.awt.Image;

public class Mushroom extends Creature{

	@Override
	void coordLoader() {
		super.setPosX(30);
		super.setPosY(100);
	}

	@Override
	void setformFactor() {
		super.setHEIGHT(62);
		super.setWIGHT(32);
	}

	@Override
	Image[][] imgLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	void setImg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
